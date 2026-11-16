package fan;

public class Dynamo {
    private String dynamoType;
    private int powerWattage;

    public Dynamo(String dynamoType, int powerWattage) {
        this.dynamoType = dynamoType;
        this.powerWattage = powerWattage;
    }

    public String getDynamoType() {
        return dynamoType;
    }

    public int getPowerWattage() {
        return powerWattage;
    }
}
