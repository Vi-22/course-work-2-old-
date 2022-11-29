package ru.viktoria.cw.cw2;

import ru.viktoria.cw.cw2.game.Game;
import ru.viktoria.cw.cw2.services.ConfigurationManager;

public class Application {
    public static void main(String[] args) {
        ConfigurationManager.getScenarioConfiguration();
        Game.run();
    }
}
