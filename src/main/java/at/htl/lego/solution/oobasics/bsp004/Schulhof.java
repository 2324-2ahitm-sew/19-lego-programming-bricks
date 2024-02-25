package at.htl.lego.solution.oobasics.bsp004;

public class Schulhof {

    public static void main(String[] args) {

        Schueler eins = new Schueler("Jan", 17, 12);
        Schueler zwei = new Schueler("MrBizeps", 22, 10);
        Schueler drei = new Schueler("Doerte", 15, 9);

        System.out.printf("%s, %d Jahre, geht in die %d. Klasse!%n"
                , eins.getName()
                , eins.getAlter()
                , eins.getSchulstufe()
        );
        System.out.printf("%s, %d Jahre, geht in die %d. Klasse!%n"
                , zwei.getName()
                , zwei.getAlter()
                , zwei.getSchulstufe()
        );
        System.out.printf("%s, %d Jahre, geht in die %d. Klasse!%n"
                , drei.getName()
                , drei.getAlter()
                , drei.getSchulstufe()
        );
    }
}
