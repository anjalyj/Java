
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
}
