package services;

import scenario.Paragraph;
import scenario.Scenario;

import java.io.*;

public class SaveManager {
    private static final FileManager <Paragraph> fileManager = new FileManager<>(ConfigurationManager.getProperty("saver.url"));

    public static void saveGame(Paragraph paragraph) {
        fileManager.writeToFile(paragraph);
    }
    public static Paragraph restoreGame() {
        return fileManager.readFromFile();
    }
}
