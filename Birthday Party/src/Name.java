
public class Name {
    final String firstName;
    final String secondName;
    String prefix;

    public Name(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.prefix = "";
    }

    public  String getFirstLast(String separator){
        return this.prefix+" "+this.firstName+separator+this.secondName;
    }


    public String getLastFirst(String separator){
        return this.prefix+" "+this.secondName+separator+" "+this.firstName;
    }
}
