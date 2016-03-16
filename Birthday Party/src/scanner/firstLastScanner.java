package scanner;

import person.Person;

public class firstLastScanner implements Scanner {
    @Override
    public String scan(Person person) {
        return person.getPrefix()+ String.format("%s %s",person.getFirstName(),person.getLastName());
    }
}
