package scenario;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.JacksonYAMLParseException;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import services.ConfigurationManager;

import java.io.IOException;
import java.io.ObjectInputFilter;
import java.lang.module.Configuration;
import java.util.List;
import java.util.Map;


public class Scenario{
    List<Paragraph> paragraphList;
    private Scenario() throws IOException {
       ConfigurationManager.getScenario();
    }
    public List<String> availableActions (Paragraph paragraph) {
        return paragraph.getActions();
    }
    public String nextParagraph (Paragraph paragraph, int action) {
        paragraphList.indexOf(paragraph.getNext().get(action));

            };
    }
    public Paragraph

}
