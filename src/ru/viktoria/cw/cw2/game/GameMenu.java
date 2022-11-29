package ru.viktoria.cw.cw2.game;

import ru.viktoria.cw.cw2.command.FirstActionCommand;
import ru.viktoria.cw.cw2.command.MainMenuCommand;
import ru.viktoria.cw.cw2.command.SecondActionCommand;
import java.util.TreeMap;

public class GameMenu extends Menu {

    public GameMenu() {
        super(new TreeMap<>());
    }
    public void setGameMenu(Game game){
        this.setHead(game.getCurrentParagraph().getText());
        FirstActionCommand firstAction = new FirstActionCommand(game);
        SecondActionCommand secondAction = new SecondActionCommand(game);
        MainMenuCommand mainMenu = new MainMenuCommand(game);
        this.getBottoms().put(1, firstAction);
        this.getBottoms().put(2, secondAction);
        this.getBottoms().put(3, mainMenu);
    }
}
