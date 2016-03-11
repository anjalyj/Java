import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Operations {
    private Integer age;
    private String choice;
    private String data;
    private String country;

//    public Operations(String choice, String data) {
//        this.choice = choice;
//        this.data = data;
//    }

    public Operations(String choice, String data,String country){
        this.choice = choice;
        this.data = data;
        this.country = country;
    }

    public Operations(String choice, String data,String country,Integer age) {
        this.choice = choice;
        this.data = data;
        this.country = country;
        this.age = age;
    }

    public String getLabel() throws Exception{
        String result,output="";
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
        String ans="";
        LabelOperator op = new LabelOperator((Person) content);
        HashMap<String,String> choices = new HashMap<>();
        choices.put("-firstLast",op.getFirstNameFirst());
        choices.put("-lastFirst",op.getFirstNameLast());
        choices.put("-firstLastWithCountry",op.getFirstNameFirstWithCountry());
        choices.put("-lastFirstWithCountry",op.getFirstNameLastWithCountry());
        choices.put("-firstLastWithSpecificCountry",op.getFirstNameFirstWithSpecificCountry(country));
        choices.put("-lastFirstWithSpecificCountry",op.getFirstNameLastWithSpecificCountry(country));
        choices.put("-firstLastLegal",op.getFirsttNameFirstIfLegal(age,country));
        choices.put("-lastFirstLegal",op.getFirstNameLastIfLegal(age,country));
        for (Map.Entry me : choices.entrySet()) {
            if(me.getKey().equals(choice))
                ans = choices.get(me.getKey());
        }
        return ans;
    }

}


