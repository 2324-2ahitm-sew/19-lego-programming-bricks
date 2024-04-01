package at.htl.lego.student.sorting.bsp004;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static at.htl.lego.student.sorting.bsp004.Bsp004.bubbleSort;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Bsp004Test {

    final Person julika = new Person("Julika", 188, 125);
    final Person kalle = new Person("Kalle", 194, 85);
    final Person marit = new Person("Marit", 163, 110);
    final Person alice = new Person("Alice", 182, 87);
    final Person diana = new Person("Diana", 170, 76);
    final Person frieda = new Person("Frieda", 162, 69);
    final Person antonia = new Person("Antonia", 209, 75);
    final Person jonah = new Person("Jonah", 161, 63);
    final Person falk = new Person("Falk", 205, 72);
    final Person eric = new Person("Eric", 176, 89);
    final Person[] unsortedPersons = new Person[] {
            julika,
            kalle,
            marit,
            frieda,
            diana,
            alice,
            antonia,
            jonah,
            falk,
            eric
    };

    @Order(1000)
    @Test
    void sortPersonsByBmi() {

        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiComparator());

        Arrays.stream(sortedPersons).forEach(System.out::println);
        System.out.println();

        assertThat(sortedPersons).isSortedAccordingTo(new BmiComparator());

        assertThat(sortedPersons).containsExactly(
                falk,
                antonia,
                kalle,
                jonah,
                frieda,
                diana,
                alice,
                eric,
                julika,
                marit
        );
    }

    @Order(1010)
    @Test
    void sortPersonsByBmiAndName() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiNameComparator());

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).isSortedAccordingTo(new BmiNameComparator());

        assertThat(sortedPersons).containsExactly(
                falk,
                antonia,
                kalle,
                jonah,
                alice,
                diana,
                frieda,
                eric,
                julika,
                marit
        );
    }

    @Order(1020)
    @Test
    void sortPersonsByBmiAndSize() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiSizeComparator());

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).isSortedAccordingTo(new BmiSizeComparator());

        assertThat(sortedPersons).containsExactly(
                falk,
                antonia,
                kalle,
                jonah,
                frieda,
                diana,
                alice,
                eric,
                julika,
                marit
        );
    }

    @Order(1030)
    @Test
    void sortPersonsByBmiAndWeight() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiWeightComparator());

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).isSortedAccordingTo(new BmiWeightComparator());

        assertThat(sortedPersons).containsExactly(
                falk,
                antonia,
                kalle,
                jonah,
                frieda,
                diana,
                alice,
                eric,
                julika,
                marit
        );
    }



    @Order(1040)
    @Test
    void checkCorrectRange() {
        assertThat(Person.bmiRanges(15.9)).isEqualTo("starkes Untergewicht");
        assertThat(Person.bmiRanges(16.9)).isEqualTo("mäßiges Untergewicht");
        assertThat(Person.bmiRanges(18.4)).isEqualTo("leichtes Untergewicht");
        assertThat(Person.bmiRanges(24.9)).isEqualTo("Normalgewicht");
        assertThat(Person.bmiRanges(29.9)).isEqualTo("Präadipositas");
        assertThat(Person.bmiRanges(34.9)).isEqualTo("Adipositas Grad I");
        assertThat(Person.bmiRanges(39.9)).isEqualTo("Adipositas Grad II");
        assertThat(Person.bmiRanges(40.1)).isEqualTo("Adipositas Grad III");
    }

}