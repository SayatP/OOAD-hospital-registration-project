import java.util.UUID;
import java.time.LocalDate;
import java.util.ArrayList;

public class Card {
    private String id;
    private String disease;
    private Doctor doctor;
    private LocalDate openingDate;
    private Patient patient;
    private ArrayList<Checkup> checkups = new ArrayList<Checkup>();

    public Card(Patient p, Doctor d, String diseaseName) {
        disease = diseaseName;
        openingDate = LocalDate.now();
        id = UUID.randomUUID().toString();
        setDoctor(d);
        setPatient(p);
    }

    private void setPatient(Patient p) {
        patient = p;
    }

    private void setDoctor(Doctor d) {
        doctor = d;
    }

    public void addCheckup(Checkup c) {
        checkups.add(c);
    }

    public String getID() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public Patient getPatient(){
        return patient;
    }
}
