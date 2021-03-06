import person.Person;

public class LabelOperator {
    final Person person;

    public LabelOperator(Person person) {
        this.person = person;
    }

    public String getFirstNameFirst() {
        return person.getPrefix() + person.getFirstName() + " " + person.getLastName();
    }

    public String getFirstNameLast() {
        return person.getPrefix() + person.getLastName() + ", " + person.getFirstName();
    }

    public String getFirstNameFirstWithCountry() {
        return getFirstNameFirst() + ", " + person.getCountry();
    }

    public String getFirstNameLastWithCountry() {
        return getFirstNameLast() + ", " + person.getCountry();
    }

    public String getFirstNameFirstWithSpecificCountry(String country) {
        return person.getCountry().equals(country) ? getFirstNameFirstWithCountry() : "";
    }

    public String getFirstNameLastWithSpecificCountry(String country) {
        return person.getCountry().equals(country) ? getFirstNameLastWithCountry() : "";
    }

    public String getFirsttNameFirstIfLegal(int age,String country) {
        return (person.getAge() >=age && person.getCountry().equals(country))
                ?  getFirstNameFirstWithSpecificCountry(country) + ", " + person.getAge()
                : "";
    }

    public String getFirstNameLastIfLegal(int age,String country) {
        return (person.getAge() >=age && person.getCountry().equals(country))
                ?  getFirstNameLastWithSpecificCountry(country) + ", " + person.getAge()
                : "";
    }

    public String getFormattedTextInFirstlast() {
        FormatText format= new FormatText(person);
        String nameToFormat = getFirstNameFirst();
        return format.getFirstLastFormat(nameToFormat);
    }
}
