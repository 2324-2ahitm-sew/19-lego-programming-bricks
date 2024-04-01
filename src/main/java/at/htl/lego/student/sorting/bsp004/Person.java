package at.htl.lego.student.sorting.bsp004;

public class Person {

    private String name;
    private int sizeInCm;
    private int weightInKg;

    public Person() {
    }

    public Person(String name, int sizeInCm, int weightInKg) {
        this.name = name;
        this.sizeInCm = sizeInCm;
        this.weightInKg = weightInKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double bmi() {

        // TODO: Implementieren Sie die Berechnung des BMI (Body Mass Index)

        return -1.0;
    }

    public static String bmiRanges(double bmi) {

        // TODO: Implementieren Sie die Ausgabe der BMI-Kategorien

        return "n/a";
    }

    @Override
    public String toString() {
        return String.format("%s (%d cm, %d kg) -> BMI: %.1f", name, sizeInCm, weightInKg, bmi());
    }

}
