package fan;

public abstract class AbstractFan implements PowerControl {
    private String brand;
    private int size;
    private Dynamo dynamo;

    public AbstractFan(String brand, int size, Dynamo dynamo) {
        this.brand = brand;
        this.size = size;
        this.dynamo = dynamo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Dynamo getDynamo() {
        return dynamo;
    }

    public void setDynamo(Dynamo dynamo) {
        this.dynamo = dynamo;
    }

    public abstract void displayFanCategory();
}
