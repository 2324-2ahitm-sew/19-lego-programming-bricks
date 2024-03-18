package at.htl.lego.student.searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bsp001 {

    static Random rnd = new Random();

    public static void main(String[] args) {
        int suchzahlIndex;
        int suchzahl = 3;
        final int GROESSE_ZAHLENLISTE = 10;
        int[] zahlenliste = new int[GROESSE_ZAHLENLISTE];

        do {
            fillList(zahlenliste, GROESSE_ZAHLENLISTE * 10);
            sortList(zahlenliste);
            suchzahlIndex = binaerSuchen(zahlenliste, suchzahl);
            System.out.print(Arrays.toString(zahlenliste));
            System.out.print(" -> ");
            System.out.printf("Der Wert %d ist %senthalten.%n"
                    , suchzahl
                    , ((suchzahlIndex < 0) ? "nicht " : "")
            );
        } while (suchzahlIndex == -1);
    }

    static void fillList(int[] zahlenliste, int maxZahl) {

    }

    static void sortList(int[] array) {


    }

    /**
     * Binär suchen
     * @param array ... sortiertes Zahlenfeld
     * @param zahl  ... Suchwert
     * @return Indexposition des gesuchten Wertes
     *         wenn Suchwert nicht gefunden --> -1
     */
    static int binaerSuchen(int[] array, int zahl) {

        return -1;
    }


}
