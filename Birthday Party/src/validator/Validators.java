package validator;

import person.Person;

public interface Validators {
    boolean isValid(Person person);
    String getValidData(Person person);
}
