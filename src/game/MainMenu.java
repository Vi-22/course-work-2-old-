package game;

import services.CommandManager;

public class MainMenu implements CommandManager {
    @Override
    public void show() {
        System.out.println("Главное меню:");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        System.out.println("Пожалуйста, введите цифру нужного пункта меню");
        chooseScanner();
    }
    @Override
    public void chooseScanner() {
        switch(readPoint()) {
        case 1 -> Game.newGame();
        case 2 -> Game.previousGame();
        case 3 -> Game.exitGame();
        default -> exeptionHandler();
        }
    }
}
