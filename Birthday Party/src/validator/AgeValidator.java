package validator;

import person.Person;

public class AgeValidator implements Validators{
    private final int age;

    public AgeValidator(int age) {
        this.age = age;
    }

    @Override
    public boolean isValid(Person person) {
        return person.getAge()>=age;
    }

    @Override
    public String getValidData(Person person) {
        if(isValid(person))
            return String.valueOf(person.getAge());
        return  "";
    }
}
