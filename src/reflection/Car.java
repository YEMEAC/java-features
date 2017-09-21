package reflection;

/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 */

public final class Car extends Vehicle implements Item {

    private String fuelSource;
    public int numWheels;

    public Car(String fuelSource, int numWheels) {
        fuelSource = fuelSource;
        this.numWheels = numWheels;
    }

    public Car(){
    }

    public String getFuelSource() {
        return fuelSource;
    }

    public void setFuelSource(String fuelSource) {
        fuelSource = fuelSource;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public String sound() {
        return "BRUN BRUN BRUN";
    }

    @Override
    public String showAllPropertiesValues() {
        return this.id + this.getName() + this.fuelSource + this.numWheels +"";
    }
}
