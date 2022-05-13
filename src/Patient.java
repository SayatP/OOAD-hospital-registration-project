import java.util.HashMap;
import java.util.UUID;

import static java.lang.System.out;
public class Patient {
    private String id;
    private HashMap<String, String> data;

    public Patient(HashMap<String, String> patientData) {
        
        patientData.entrySet().forEach(entry -> {
            out.println(entry.getKey() + ": " + entry.getValue());
        });

        data = patientData;
        id = UUID.randomUUID().toString();
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public String getID() {
        return id;
    }
}
