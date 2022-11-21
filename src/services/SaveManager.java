package services;

import scenario.Paragraph;

import java.io.*;

public class SaveManager {
    private static final FileManager <String> fileManager = new FileManager<>(ConfigurationManager.getProperty("saver.url"));

    public static void saveGame(Paragraph paragraph) {
        String currentParagraph = paragraph.getTitle();
        fileManager.writeToFile(currentParagraph);
    }
    public static String restoreGame() {
        return fileManager.readFromFile();
    }
}
