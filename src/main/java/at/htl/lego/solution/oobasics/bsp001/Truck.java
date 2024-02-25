package at.htl.lego.solution.oobasics.bsp001;

public class Truck extends Vehicle {

    private int maxPayload;

    public Truck(String brand, String model, int maxPayload) {
        super(brand, model);
        this.maxPayload = maxPayload;
    }

    //region getter aand setter
    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%s %s (max. %d kg Nutzlast)", getBrand(), getModel(), maxPayload);
    }
}
