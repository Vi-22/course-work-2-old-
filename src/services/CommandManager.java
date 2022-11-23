package services;

import game.Game;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Filter;

public interface CommandManager {
    void show();
    default void chooseScanner() {}
    default int readPoint() {
        Scanner scanner = new Scanner(System.in);
        int point=0;
        try {
            point =  scanner.nextInt();
        }
        catch (InputMismatchException e) {
            exeptionHandler();
        }
        return point;
    }
    default void exeptionHandler() {
        System.out.println("Пожалуйста, выберите нужный пункт меню.");
        chooseScanner();
    }
}
