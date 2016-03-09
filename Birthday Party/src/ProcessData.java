import java.util.ArrayList;

public class ProcessData {
    private final String data;

    public ProcessData(String data) {
        this.data = data;
    }

    public ArrayList getProcessedData() {
        ArrayList<Person> guestsList = new ArrayList<>();
        String[] lines = splitByLines(data);
        for(String line : lines) {
            Person guest = getGuest(line);
            guestsList.add(guest);
        }
        return guestsList;
    }

    private Person getGuest(String line) {
        String splitBy = ",";
        String[] guests = line.split(splitBy);
        Name name = new Name(guests[0], guests[1]);
        Address address = new Address(guests[4], guests[5], guests[6]);
        Gender gender = guests[2].equals("Male") ? Gender.Male : Gender.Female;
        return new Person(name, gender, Integer.parseInt(guests[3]), address);
    }

    private String[] splitByLines(String data) {
        return data.split("\n");
    }
}
