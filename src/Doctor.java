import java.util.UUID;

public class Doctor {
    private String id;
    private String name;

    public Doctor(String doctorName) {
        name = doctorName;
        id = UUID.randomUUID().toString();
    }

    public String getID() {
        return id;
    }

    public String getName(){
        return name;
    }
}