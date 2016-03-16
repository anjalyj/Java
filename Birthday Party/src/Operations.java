import java.util.*;

import scanner.Scanner;


import person.Person;
import validator.Validators;



public class Operations {
    private final ArrayList<Validators> validators;
    private Scanner choice;
    private String data;


    public Operations(Scanner choice, String data, ArrayList<Validators> validators) {
        this.choice = choice;
        this.data = data;
        this.validators = validators;
    }

    public String getLabel() throws Exception{
        ProcessData dataObj = new ProcessData(data);
        ArrayList<Person> processedData = dataObj.getProcessedData();
        if(validators.size()==0)
            return getLabelWithoutValidators(processedData);
        return getLabelWithValidators(processedData);
    }

    private String getLabelWithoutValidators(ArrayList<Person> processedData) {
        String result ="",output="";
        for(Person person : processedData){
            result = choice.scan(person);
            if(result.charAt(result.length() - 1)!=' '){
                System.out.println(result);
                output += result;
            }
        }
        return output;
    }

    private String getLabelWithValidators(ArrayList<Person> processedData) {
        String result = "",output="",sample="";
        for(Validators validator : validators)  {
            for(Person person : processedData){
                result =choice.scan(person)+", "+validator.getValidData(person);
                if(result.charAt(result.length() - 1)!=' '){
                    System.out.println(result);
                    output += result+"\n";
                }
            }
        }
        return output;
    }
}


