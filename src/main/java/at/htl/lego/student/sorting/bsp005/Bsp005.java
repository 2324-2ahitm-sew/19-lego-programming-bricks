package at.htl.lego.student.sorting.bsp005;

import com.github.javafaker.Faker;

import java.util.Comparator;
import java.util.Locale;

public class Bsp005 {

    private final static int NO_OF_PERSONS = 10;

    public static void main(String[] args) {
        Person[] persons = generatePersons(NO_OF_PERSONS);

        System.out.println("Unsortiert:");
        for (Person person : persons) {
            System.out.println(person);
        }


        System.out.println("\nSortiert nur nach BMI (nicht-stabil):");
        bubbleSort(persons, new BmiComparator(), false);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI und Name:");
        bubbleSort(persons, new BmiNameComparator(), false);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI und Größe:");
        bubbleSort(persons, new BmiSizeComparator(), false);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI Gewicht:");
        bubbleSort(persons, new BmiWeightComparator(), false);
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    /**
     * Generiert ein Array von Personen mit zufälligen Werten für Name, Größe und Gewicht,
     * innerhalb der gegebenen Grenzen.
     **/
    public static Person[] generatePersons(int noOfPersons) {

        final int WEIGHT_MIN = 60;
        final int WEIGHT_MAX = 130;
        final int SIZE_MIN = 160;
        final int SIZE_MAX = 210;

        Faker faker = new Faker(Locale.forLanguageTag("de-AT"));

        // TODO: Implementieren Sie diese Methode

        return null;
    }



    public static Person[] bubbleSort(Person[] persons, Comparator<Person> comparator, boolean ascending) {

        // TODO: Implementieren Sie diese Methode

        return null;
    }
}
