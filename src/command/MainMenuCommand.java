package command;

import game.Game;

public class MainMenuCommand implements Command{
    public Game game;
    private static final String name = "Главное меню";

    public MainMenuCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.mainMenu();
    }

    @Override
    public String getName() {
        return MainMenuCommand.name;
    }
}
