package game;

import scenario.Paragraph;
import scenario.Scenario;
import services.SaveManager;

public class Game {
    private Paragraph currentParagraph;

    public Game() {}

    public static void run(){
        Game game = new Game();
        MainMenu mainMenu = new MainMenu();
        mainMenu.setStandartMainMenu(game);
        mainMenu.show();

    }
    public void mainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setExtendMainMenu(this);
        mainMenu.show();
    }
    public void gameMenu() {
    GameMenu gameMenu = new GameMenu();
    gameMenu.setGameMenu(this);
    gameMenu.show();
    }
    public void createNew(){
        this.currentParagraph = Scenario.startScenario();
        gameMenu();
    }
    public void restore(){
        this.currentParagraph = SaveManager.restoreGame();
        gameMenu();
    }
    public void exit(){
        System.exit(0);
    }
    public void save(){
        SaveManager.saveGame(this.currentParagraph);
        MainMenu mainMenu = new MainMenu();
        mainMenu.setStandartMainMenu(this);
        mainMenu.show();
    }
    public void firstAction() {
        this.currentParagraph = (Scenario.nextParagraph(this.currentParagraph, 0));
        gameMenu();
    }
    public void secondAction() {
        this.currentParagraph = (Scenario.nextParagraph(this.currentParagraph,1));
        gameMenu();
    }

    public Paragraph getCurrentParagraph() {
        return currentParagraph;
    }

    public void setCurrentParagraph(Paragraph currentParagraph) {
        this.currentParagraph = currentParagraph;
    }
}
