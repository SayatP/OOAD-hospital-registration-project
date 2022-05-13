import java.util.ArrayList;

import static java.lang.System.out;
public class DoctorCatalog {
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        out.println("doctor with the gived id added: " + doctor.getID());

    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    public Doctor getDoctor(String dID) {
        for (Doctor d : doctors) {
            if (d.getID().equals(dID)) {
                return d;
            }
        }
        return null;
    }
}
