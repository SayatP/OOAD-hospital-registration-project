import java.util.UUID;
import java.time.LocalDate;
import java.util.ArrayList;

public class CardRecord {
    private String doctorID;
    private String doctorName;
    private String disease;
    private String conclusion;
    private long duration;

    public CardRecord(Patient p, Doctor d, String diseaseName, String c) {
        disease = diseaseName;
        doctorID = d.getID();
        doctorName = d.getName();
        conclusion = c;
    }

    private void setDuration(long d){
        duration = d;
    }
}