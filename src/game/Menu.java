package game;

import command.Command;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
    private String head;
    private TreeMap<Integer, Command> bottoms;
    private Scanner scanner = new Scanner(System.in);

    public Menu () {}
    public Menu(TreeMap<Integer, Command> bottoms) {
        setBottoms(bottoms);
    }
    public Menu(String head) {
        setHead(head);
    }
    public Menu(String head, TreeMap<Integer, Command> bottoms) {
        setBottoms(bottoms);
        setHead(head);
    }


    public void show() {
        System.out.println(this.head);
        try {
            bottoms.forEach((integer, bottom) -> System.out.println(integer + ". "
            +bottom.getName()));
            System.out.println("Пожалуйста, введите цифру нужного пункта меню");
            this.activateCommand(scanAnswer());
        }
        catch (NullPointerException e){
            System.out.println("Игра завершена");
            scanner.close();
        }
    }
    public int scanAnswer() {
        int point;
        try {
            point =  scanner.nextInt();
        }
        catch (InputMismatchException e) {
            point=0;
        }
        if (point > this.bottoms.size()||point<=0) exceptionHandler();
        return point;
    }
    public void exceptionHandler() {
        System.out.println("Пожалуйста, выберите нужный пункт меню.");
        scanAnswer();
    }
    public void activateCommand(int command) {
        this.bottoms.get(command).execute();
    }

    public TreeMap<Integer, Command> getBottoms() {
        return bottoms;
    }

    public void setBottoms(TreeMap<Integer, Command> commandMap) {
        this.bottoms = commandMap;
    }



    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
