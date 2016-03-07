import java.util.ArrayList;
import java.util.Iterator;


public class Operations {
    private final String choice;
    private final String fileName;

    public Operations(String choice, String fileName) {
        this.choice = choice;
        this.fileName = fileName;
    }

    public void getLabel() {
        ReadFile readObj = new ReadFile(fileName);
        String result;
        ArrayList data = readObj.readCsv();
        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            result = checkFlag(iterator.next(), choice);
            System.out.println(result);
        }
    }

    public String checkFlag(Object content, String choice) {
        LabelOperator op = new LabelOperator((Person) content);
        switch (choice) {
            case "-firstLast":
                return op.getFirstNameFirst();
            case "-lastfirst":
                return op.getFirstNameLast();
            case "-firstLastWithCountry":
                return op.getFirstNameFirstWithCountry();
            case "-lastFirstWithCountry":
                return op.getFirstNameLastWithCountry();
            default:
                return op.getFirstNameFirst();
        }
    }

}


