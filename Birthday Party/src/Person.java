public class Person {
    Gender gender;
    final int age;
    final Name name;
    final Address address;

    public Person(Name name, Gender gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return name.firstName;
    }

    public String getLastName() {
        return name.secondName;
    }

    public String getCity() {
        return address.city;
    }

    public String getState() {
        return address.state;
    }

    public String getCounty() {
        return address.country;
    }

    public String getPrefix() {
        return gender.setPrefix();
    }

}
