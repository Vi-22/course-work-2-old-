package command;

import game.Game;

public class CreateNewCommand implements Command{
    public Game game;
    private static final String name = "Новая игра";

    @Override
    public String getName() {
        return CreateNewCommand.name;
    }

    public CreateNewCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.createNew();
    }
}
