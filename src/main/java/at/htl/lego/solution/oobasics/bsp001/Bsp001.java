package at.htl.lego.solution.oobasics.bsp001;

public class Bsp001 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Truck("Opel", "Blitz", 3000);
        vehicles[1] = new Truck("Steyr", "480", 5000);
        vehicles[2] = new PassengerCar("VW", "Käfer", 4);
        vehicles[3] = new PassengerCar("Volvo", "Sport P1900", 2);

        // Ausgabe der Fahrzeuge mit der toString-Methode
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println();

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) { // instanceof ist ein Operator, der prüft, ob ein Objekt einer bestimmten Klasse angehört
                System.out.println("Truck");
            }
            if (vehicle instanceof PassengerCar) {
                System.out.println("PassengerCar");
            }
        }
    }
}
