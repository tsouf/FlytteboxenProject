package Domain;

/**
 * Created by Nikos on 29-May-17.
 */
public class Storage_Box {

    private int id;
    private StorageBox_Type storageBox_type;
    private boolean availability;
    private String gate;

    public Storage_Box(int id, StorageBox_Type storageBox_type, boolean availability, String gate){
        this.id = id;
        this.storageBox_type = storageBox_type;
        this.availability = availability;
        this.gate = gate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public StorageBox_Type getStorageBox_type() {
        return storageBox_type;
    }

    public void setStorageBox_type(StorageBox_Type storageBox_type) {
        this.storageBox_type = storageBox_type;
    }
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }


}
