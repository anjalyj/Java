package validator;


import person.Person;

public class countryValidator implements Validators {
    private final String country;

    public countryValidator(String country) {
        this.country = country;
    }

    @Override
    public boolean isValid(Person person) {
        return person.getCountry().equals(country);
    }

    @Override
    public String getValidData(Person person) {
        if(isValid(person))
            return String.valueOf(person.getCountry());
        return  "";
    }


}
