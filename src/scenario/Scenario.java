package scenario;

import services.ConfigurationManager;
import services.SaveManager;

import java.util.List;


public class Scenario{
    private static List<Paragraph> paragraphList;
    private static Paragraph currentParagraph=null;
    static  {
        setParagraphList();
        setCurrentParagraph(null);
    }

    public static Paragraph startScenario() {
        setCurrentParagraph(paragraphList.get(0));
        return currentParagraph;
    }

    public static Paragraph restoreScenario() {
        setCurrentParagraph(SaveManager.restoreGame());
        return currentParagraph;
    }
    public static Paragraph nextParagraph(int number) {
        String paragraphName = Scenario.getCurrentParagraph().getNext().get(number);
        Paragraph next = null;
        for (Paragraph paragraph: paragraphList) {
            if (paragraph.getTitle().equals(paragraphName))
                next = paragraph;
        }
        return next;
    }

    public static List<Paragraph> getParagraphList() {
        return paragraphList;
    }

    private static void setParagraphList() {
        Scenario.paragraphList = ConfigurationManager.getScenarioConfiguration();
    }

    public static Paragraph getCurrentParagraph() {
        return currentParagraph;
    }

    public static void setCurrentParagraph(Paragraph currentParagraph) {
        Scenario.currentParagraph = currentParagraph;
    }
}

