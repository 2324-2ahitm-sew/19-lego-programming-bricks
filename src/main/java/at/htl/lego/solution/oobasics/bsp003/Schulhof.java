package at.htl.lego.solution.oobasics.bsp003;

public class Schulhof {

    public static void main(String[] args) {

        Schueler eins = new Schueler();
        eins.setName("Jan");
        eins.setAlter(17);
        eins.setSchulstufe(12);

        System.out.printf("Hallo, ich bin %s!", eins.getName());

        System.out.printf("%s, %d, geht in die %d. Schulstufe!"
                , eins.getName()
                , eins.getAlter()
                , eins.getSchulstufe()
        );

        System.out.println();
        System.out.println();

        eins.setHunger(5);
        eins.setIq(3);

        eins.chillen();
        System.out.println("IQ = " + eins.getIq());

        eins.essen();
        System.out.println("Hunger = " + eins.getHunger());

        eins.lernen();
        System.out.println("IQ = " + eins.getIq());

    }
}
