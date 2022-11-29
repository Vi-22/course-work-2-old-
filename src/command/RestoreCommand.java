package command;

import game.Game;

public class RestoreCommand implements Command{
    public Game game;
    private static final String name = "Загрузить игру";

    public RestoreCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.restore();
    }

    @Override
    public String getName() {
        return RestoreCommand.name;
    }
}

