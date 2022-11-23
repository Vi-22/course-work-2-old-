package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import scenario.Paragraph;

import java.io.*;
import java.util.*;

public class ConfigurationManager {
    public final static String propertiesPathName = "src/resources/application.properties";
    public static String getProperty(String propertyKey) {
        File propertiesFile = new File(propertiesPathName);
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(propertiesFile);
            properties.load(fileInputStream);
            fileInputStream.close();
            return properties.getProperty(propertyKey);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Paragraph> getScenarioConfiguration() {
        try {
            File configFile = new File(getProperty("config.url"));
            ObjectMapper objectMapper = new YAMLMapper();
            List<Paragraph> paragraphList = Arrays.asList(objectMapper.readValue(configFile, Paragraph[].class));
            return paragraphList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
