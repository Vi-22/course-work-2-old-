package ru.viktoria.cw.cw2.command;

import ru.viktoria.cw.cw2.game.Game;

public class ExitCommand implements Command{
    public Game game;
    private static final String name = "Выйти из игры";

    public ExitCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exit();
    }

    @Override
    public String getName() {
        return ExitCommand.name;
    }
}
