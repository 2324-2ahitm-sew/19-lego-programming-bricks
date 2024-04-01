package at.htl.lego.student.sorting.bsp004;

import com.github.javafaker.Faker;

import java.util.Comparator;
import java.util.Locale;

public class Bsp004 {

    private final static int NO_OF_PERSONS = 10;

    public static void main(String[] args) {
        Person[] persons = generatePersons(NO_OF_PERSONS);

        System.out.println("Unsortiert:");
        for (Person person : persons) {
            System.out.println(person);
        }


        System.out.println("\nSortiert nur nach BMI (nicht-stabil):");
        bubbleSort(persons, new BmiComparator());
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI und Name:");
        bubbleSort(persons, new BmiNameComparator());
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI und Größe:");
        bubbleSort(persons, new BmiSizeComparator());
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\nSortiert nach BMI Gewicht:");
        bubbleSort(persons, new BmiWeightComparator());
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    /**
     * Generiert ein Array von Personen mit zufälligen Werten für Name, Größe und Gewicht,
     * innerhalb der gegebenen Grenzen.
     * Verwenden Sie faker.name().firstName() für den Namen,
     * faker.number().numberBetween(min, max) für Größe und Gewicht.
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

    /**
     * Sortiert das Array persons anhand des als Parameter übergebenen Comparators.
     **/
    public static Person[] bubbleSort(Person[] persons, Comparator<Person> comparator) {

        // TODO: Implementieren Sie diese Methode

        return null;
    }
}
