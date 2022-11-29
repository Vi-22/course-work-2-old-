package command;

import game.Game;

public class FirstActionCommand implements Command{
    Game game;
    public FirstActionCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.firstAction();
    }

    @Override
    public String getName() {
        return game.getCurrentParagraph().getActions().get(0);
    }
}
