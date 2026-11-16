package fan;

public class DeskFan extends AbstractFan{
    private boolean canSwing;

    public DeskFan(String brand, int size, Dynamo dynamo, boolean canSwing) {
        super(brand, size, dynamo);
        this.canSwing = canSwing;
    }

    @Override
    public String turnOnPower() {
        return "Kipas meja bertipe dinamo " + getDynamo().getDynamoType() + " berputar dengan daya " + getDynamo().getPowerWattage() + " Watt";
    }

    @Override
    public void displayFanCategory() {
        System.out.println("Kategori: Kipas Meja");
        System.out.println("Merk: " + getBrand());
        System.out.println("Ukuran: " + getSize() + " cm");
        System.out.println("Spek Dinamo: " + getDynamo().getDynamoType() + " " + getDynamo().getPowerWattage() + "W");
        System.out.println("Fitur Swing: " + (canSwing ? "Bisa noleh kiri kanan" : "Diam"));
    }
}
