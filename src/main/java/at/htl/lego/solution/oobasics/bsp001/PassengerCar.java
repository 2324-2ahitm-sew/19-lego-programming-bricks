package at.htl.lego.solution.oobasics.bsp001;

public class PassengerCar extends Vehicle {

    private int maxPassengers;


    public PassengerCar(String brand, String model, int maxPassengers) {
        super(brand, model);
        this.maxPassengers = maxPassengers;
    }

    //region getter and setter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%s %s (%d Seats)", getBrand(), getModel(), maxPassengers);
    }
}
