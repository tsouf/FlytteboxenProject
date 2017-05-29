package Domain;

/**
 * Created by Nikos on 29-May-17.
 */
public class StorageBox_Type {

    private int type;
    private double price;
    private String description;

    public StorageBox_Type(int type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
