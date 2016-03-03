public class Person {
    Gender gender;
    final int age;
    final Name name;
    final Address address;

    public Person(Name name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setPrefix(){
        if(getGender().toString().equals("MALE"))
            name.prefix = "Mr";
        else
            name.prefix = "Ms";
    }

    public String getFirstNameFirst(){
        String separator = " ";
        return name.getFirstLast(separator);
    }

    public String getFirstNameLast(){
        String separator = ",";
        return name.getLastFirst(separator);
    }

    public String selectFormat(String format){
        setPrefix();
        switch (format){
            case "firstLast" :
                return getFirstNameFirst();
            case "lastFirst" :
                return getFirstNameLast();
            default:
                return getFirstNameFirst();
        }
    }

}
