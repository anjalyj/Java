import java.util.ArrayList;
import java.util.Iterator;


public class Operations {
    private String choice;
    private String fileName;
    private String country;

    public Operations(String choice, String fileName) {
        this(choice,fileName,null);
    }

    public Operations(String choice, String fileName,String country) {
        this.choice = choice;
        this.fileName = fileName;
        this.country = country;
    }

    public String getLabel() throws Exception{
        ReadFile readObj = new ReadFile(fileName);
        String result,output="";
        String data = readObj.readContent();
        ProcessData dataObj = new ProcessData(data);
        ArrayList processedData = dataObj.getProcessedData();
        Iterator iterator = processedData.iterator();
        while (iterator.hasNext()) {
            result = checkFlag(iterator.next(), choice);
            if(!result.equals("")){
                System.out.println(result);
                output += result+"\n";
            }
        }
        return output;
    }

    public String checkFlag(Object content, String choice) {
        LabelOperator op = new LabelOperator((Person) content);
        switch (choice) {
            case "-firstLast":
                return op.getFirstNameFirst();
            case "-lastFirst":
                return op.getFirstNameLast();
            case "-firstLastWithCountry":
                return op.getFirstNameFirstWithCountry();
            case "-lastFirstWithCountry":
                return op.getFirstNameLastWithCountry();
            case "-firstLastWithSpecificCountry":
                return op.getFirstNameFirstWithSpecificCountry(country);
            case "-lastFirstWithSpecificCountry":
                return op.getFirstNameLastWithSpecificCountry(country);
            case "-firstLastLegal" :
                return op.getFitstNameFistIfLegal(country);
            case "-lastFirstLegal" :
                return op.getFitstNameLastIfLegal(country);
            default:
                return op.getFirstNameFirst();
        }
    }

//    public Person getPerson(ArrayList processedData) {
//    }
}


