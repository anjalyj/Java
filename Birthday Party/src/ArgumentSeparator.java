import scanner.Scanner;
import scanner.firstLastScanner;
import scanner.lastFirstScanner;
import validator.AgeValidator;
import validator.Validators;
import validator.countryValidator;

import javax.xml.validation.Validator;
import java.lang.*;
import java.util.ArrayList;

public class ArgumentSeparator {
    private final String[] options;
    public String files="";
    public String choices="";
    public String country="";
    public int age;
    ArrayList<Validators> validators = new ArrayList<>();

    public ArgumentSeparator(String[] args) {
        this.options = args;
    }

    public String getFile() {
        processOptions();
        return files;
    }

    public Scanner getChoice() {
        processOptions();
        if(choices.equals("-firstLast"))
            return new firstLastScanner();
        return new lastFirstScanner();
    }

//    public String getCountry() {
//        processOptions();
//        return country;
//    }
//
//    public int getAge() {
//        processOptions();
//        return age;
//    }
    public ArrayList<Validators> getValidators(){
        return validators;
    }

    private void processOptions() {
        for(int i=0;i<options.length;i++){
            if(options[i].contains("."))
                files = options[i];
            else if(options[i].contains("-"))
                choices = options[i];
            else if(options[i].contains("country"))
                validators.add(new countryValidator(options[i+1]));
//                country = options[i+1];
            else if(options[i].contains("age"))
                validators.add(new AgeValidator(Integer.parseInt(options[i+1])));
//                age = Integer.parseInt(options[i+1]);
        }
    }
}
