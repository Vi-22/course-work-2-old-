package game;

import scenario.Scenario;
import services.SaveManager;

public class Game {
    public static void run(){
        mainMenu();
    }
    public static void mainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
    }
    public static void gameMenu() {
        GameMenu gameMenu = new GameMenu(Scenario.getCurrentParagraph());
        gameMenu.show();
    }
    public static void newGame(){
        Scenario.startScenario();
        gameMenu();
    }
    public static void previousGame(){
        Scenario.restoreScenario();
        gameMenu();
    }
    public static void exitGame(){
        System.exit(0);
    }
    public static void save(){
        SaveManager.saveGame(Scenario.getCurrentParagraph());
        Game.mainMenu();
    }
    public static void nextParagraph(int action){
    Scenario.setCurrentParagraph(Scenario.nextParagraph(action));;
    GameMenu gameMenu = new GameMenu(Scenario.getCurrentParagraph());
    gameMenu.show();
    }
}
