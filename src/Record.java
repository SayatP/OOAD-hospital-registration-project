import java.util.HashMap;
import java.util.UUID;
import java.util.ArrayList;

import static java.lang.System.out;
public class Record {
    private String patientID;
    private HashMap<String, String> patientData;
    private ArrayList<CardRecord> cardrecords = new ArrayList<CardRecord>();

    public Record(Patient p){
        patientID = p.getID();
        patientData = p.getData();
    }

    public String getPatientID(){
        return patientID;
    }

    public void addRecord(Card c, String conclusion){
        out.println("Card record with the given conclusion added: " + conclusion);
        CardRecord cr = new CardRecord(c.getPatient(), c.getDoctor(), c.getDisease(), conclusion);
        cardrecords.add(cr);
    }
}
