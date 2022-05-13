import java.util.ArrayList;
import static java.lang.System.out;
public class PatientCatalog {
    private ArrayList<Patient> patients = new ArrayList<Patient>();

    public void addPatient(Patient patient){
        patients.add(patient);
        out.println("patient with the gived id added: " + patient.getID());

    }
    public void removePatient(Patient patient){
        patients.remove(patient);
    }
    public Patient getPatient(String pID){
        for (Patient p: patients){
            if (p.getID().equals(pID)){
                return p;
            }
        }
        return null;
    }
}
