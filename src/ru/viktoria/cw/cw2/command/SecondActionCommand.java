package ru.viktoria.cw.cw2.command;

import ru.viktoria.cw.cw2.game.Game;

public class SecondActionCommand implements Command{
    Game game;

    public SecondActionCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.secondAction();
    }

    @Override
    public String getName() {
        return game.getCurrentParagraph().getActions().get(1);
    }
}
