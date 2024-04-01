package at.htl.lego.solution.searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bsp001 {

    static Random rnd = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        for (int i = 0; i < zahlenliste.length; i++) {
            zahlenliste[i] = rnd.nextInt(maxZahl);
        }
    }

    /**
     * Bubble Sort
     *
     * @param array ... zu sortierendes Array
     */
    static void sortList(int[] array) {
        boolean getauscht = false;
        int i = array.length - 1;

        do {
            getauscht = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int hilf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = hilf;
                    getauscht = true;
                    System.out.printf("tausche %d mit %d / ", array[j + 1], array[j]);
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(array));
        } while (getauscht);

    }

    /**
     * Binär suchen
     *
     * @param array ... sortiertes Zahlenfeld
     * @param zahl  ... Suchwert
     * @return Indexposition des gesuchten Wertes
     * wenn Suchwert nicht gefunden --> -1
     */
    static int binaerSuchen(int[] array, int zahl) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == zahl) {
                return mid;
            } else {
                if (array[mid] > zahl) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



}
