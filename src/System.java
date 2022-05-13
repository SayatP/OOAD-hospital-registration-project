
import java.util.Scanner;

import java.util.HashMap;

import static java.lang.System.in;
import static java.lang.System.out;

import java.time.LocalDate;

public class System {
    private Archive archive = new Archive();
    private PatientCatalog patientCatalog = new PatientCatalog();
    private DoctorCatalog doctorCatalog = new DoctorCatalog();
    private CardCatalog cardCatalog = new CardCatalog();
    private Doctor doc = new Doctor("John Doe");

    public System() {
        doctorCatalog.addDoctor(doc);
    }

    public void register(HashMap<String, String> patientData) {
        Patient p = new Patient(patientData);
        Record r = new Record(p);
        archive.addRecord(r);
        patientCatalog.addPatient(p);
    }

    public void openCard(String pID, String disease, String docID) {
        Patient patient = patientCatalog.getPatient(pID);
        Doctor doc = doctorCatalog.getDoctor(docID);
        Card card = new Card(patient, doc, disease);
        cardCatalog.addCard(card);
    }

    public void addCheckup(String cID, String date, String content) {
        LocalDate d = LocalDate.now();
        Checkup ch = new Checkup(d, content);
        Card card = cardCatalog.getCard(cID);
        card.addCheckup(ch);
    }

    public void closeCard(String cID, String conclusion) {

        Card c = cardCatalog.getCard(cID);
        Patient p = c.getPatient();
        Record r = archive.getRecord(p);
        r.addRecord(c, conclusion);
    }

    public static void main(String[] args) {
        System sys = new System();
        Scanner input = new Scanner(in);
        Boolean exit = false;

        while (!exit) {
            out.println("Please enter the action to be executed");
            String action = input.next();

            switch (action) {

                case "exit": {
                    out.println("ending the session");
                    exit = true;
                    break;
                }
                case "register": {

                    HashMap<String, String> data = new HashMap<String, String>();

                    Boolean _break = false;

                    while (!_break) {
                        out.println("please enter the patients data item key or type break");
                        String key = input.next();

                        if (key.equals("break")) {
                            _break = true;
                        } else {

                            out.println("please enter the patients data item value");
                            String value = input.next();

                            data.put(key, value);
                        }

                    }
                    sys.register(data);
                    break;
                }

                case "openCard": {
                    out.println("Please enter the patient id");
                    String pID = input.next();

                    out.println("Please enter the doctor id");
                    String dID = input.next();

                    out.println("Please enter the diseaseName");
                    String disease = input.next();

                    sys.openCard(pID, disease, dID);
                    break;

                }
                case "addCheckup": {
                    out.println("Please enter the card id");
                    String cID = input.next();

                    out.println("Please enter the content");
                    String content = input.next();

                    sys.addCheckup(cID, "date", content);
                    break;

                }

                case "closeCard": {
                    out.println("Please enter the card id");
                    String cID = input.next();

                    out.println("Please enter the conclusion");
                    String conclusion = input.next();

                    sys.closeCard(cID, conclusion);
                    break;

                }
            }

        }
        // int n = input.nextInt();
        // System.out.println("Recursive result: " );
    }
}