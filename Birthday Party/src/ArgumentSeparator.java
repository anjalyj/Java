import java.lang.*;
public class ArgumentSeparator {
    private final String[] options;
    public String files="";
    public String choices="";
    public String country="";
    public int age;

    public ArgumentSeparator(String[] args) {
        this.options = args;
    }

    public String getFile() {
        processOptions();
        return files;
    }

    public String getChoice() {
        processOptions();
        return choices;
    }

    public String getCountry() {
        processOptions();
        return country;
    }

    public int getAge() {
        processOptions();
        return age;
    }

    private void processOptions() {
        for(int i=0;i<options.length;i++){
            if(options[i].contains("."))
                files = options[i];
            else if(options[i].contains("-"))
                choices = options[i];
            else if(options[i].contains("country"))
                country = options[i+1];
            else if(options[i].contains("age"))
                age = Integer.parseInt(options[i+1]);
        }
    }
}
