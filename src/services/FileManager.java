package services;

import java.io.*;

public class FileManager<T> {
    public File file;
    public FileManager(String fileName) {
        File file = new File(String.valueOf(fileName));
    }
    public void writeToFile(T object) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public T readFromFile () {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (T) objectInputStream.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
