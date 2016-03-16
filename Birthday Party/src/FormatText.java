import person.Person;
public class FormatText {
    private final Person person;

    public FormatText(Person person) {
        this.person = person;
    }

    public String getFirstLastFormat(String name) {
        String city = person.getCity()+", "+person.getState();
        String country = person.getCountry();
        return getFormat(name,city,country);
    }

    private String getFormat(String name, String city, String country) {
        String dashes="";
        String namePadding="";
        String countryPadding="";
        String cityPadding="";
        int width = getHighest(name.length(),city.length(),country.length())+2;
        for(int i=0; i<width; i++)
            dashes+="-";
        for(int i=0; i<(width-name.length())-1; i++)
            namePadding+=" ";
        for(int i= 0; i<width-country.length()-1; i++)
            countryPadding+=" ";
        for(int i=0; i<width-city.length()-1; i++)
            cityPadding+=" ";
        String outer = "+"+dashes+"+";
        String nameLine = "| "+name+namePadding+"|";
        String middleLine = "|"+dashes+"|";
        String cityLine = "| "+city+cityPadding+"|";
        String countryLine = "| "+country+countryPadding+"|";
        return outer+"\n"+nameLine+"\n"+middleLine+"\n"+cityLine+"\n"+countryLine+"\n"+outer;
    }

    private int getHighest(int nameLength, int cityLength, int countryLength) {
        return (nameLength > cityLength) ? (nameLength> cityLength ? nameLength : countryLength)
                : (cityLength > countryLength ? cityLength : countryLength);
    }
}
