package scanner;

import person.Person;

public class lastFirstScanner implements Scanner {

    @Override
    public String scan(Person person) {
        return person.getPrefix()+String.format("%s, %s",person.getLastName(),person.getFirstName());

    }
}
