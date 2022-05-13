import java.util.ArrayList;

public class Archive {
    private ArrayList<Record> records = new ArrayList<Record>();

    public void addRecord(Record r){
        records.add(r);
    }

    public Record getRecord(Patient p){
        for (Record r: records){
            if (r.getPatientID() == p.getID()){
                return r;
            }
        }
        return null;
    }
}
