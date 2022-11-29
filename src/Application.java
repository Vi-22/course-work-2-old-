import game.Game;
import services.ConfigurationManager;

public class Application {
    public static void main(String[] args) {
        ConfigurationManager.getScenarioConfiguration();
        Game.run();
    }
}
