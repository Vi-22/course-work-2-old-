import game.Game;
import game.MainMenu;
import scenario.Scenario;
import services.ConfigurationManager;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        ConfigurationManager.getScenarioConfiguration();
        Game.run();
    }
}
