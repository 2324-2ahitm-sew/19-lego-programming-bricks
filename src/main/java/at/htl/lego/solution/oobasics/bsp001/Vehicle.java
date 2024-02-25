package at.htl.lego.solution.oobasics.bsp001;

public abstract class Vehicle {

    // protected wäre möglich, ein direkter Zugriff auf die Attribute ist aber nur innerhalb der Klasse erlaubt.
    // Die Subklassen sollen die getter und setter verwenden.
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //region getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //endregion
}
