package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import scenario.Paragraph;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ConfigurationManager {

    public static void getScenario() throws IOException {
    File file = new File("C:\\Users\\v.sukhenko\\IdeaProjects" +
            "\\course-work-2\\src\\resources\\scenario.yml");
    ObjectMapper objectMapper = new YAMLMapper();
    List<Paragraph> paragraphList = Arrays.asList(objectMapper.readValue(file, Paragraph[].class));
    }
}
