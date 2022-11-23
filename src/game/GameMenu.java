package game;

import scenario.Paragraph;
import scenario.Scenario;
import services.CommandManager;

public class GameMenu implements CommandManager {
    public GameMenu(Paragraph scenario) {
    }
    @Override
    public void show() {
        System.out.println(Scenario.getCurrentParagraph().getTitle());
        System.out.println();
        System.out.println(Scenario.getCurrentParagraph().getText());
        System.out.println();
        try {
            System.out.println("1. " + Scenario.getCurrentParagraph().getActions().get(0));
            System.out.println("2. " + Scenario.getCurrentParagraph().getActions().get(1));
            System.out.println("3. Сохранить и вернуться в главное меню" );
        }
        catch (NullPointerException e) {
            Game.mainMenu();
        }

        chooseScanner();
    }
    @Override
    public void chooseScanner() {
        int point=readPoint();
        switch (point) {
            case 1,2 -> Game.nextParagraph(point-1);
            case 3 -> Game.save();
            default -> exeptionHandler();
        }
    }
}
