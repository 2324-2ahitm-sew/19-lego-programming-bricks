package at.htl.lego.student.sorting.bsp005;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static at.htl.lego.student.sorting.bsp005.Bsp005.bubbleSort;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Bsp005Test {

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
    void sortPersonsByBmiDescending() {

        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiComparator(), false);

        Arrays.stream(sortedPersons).forEach(System.out::println);
        System.out.println();

        assertThat(sortedPersons).containsExactly(
                marit,
                julika,
                eric,
                diana,
                alice,
                frieda,
                jonah,
                kalle,
                antonia,
                falk
        );
    }

    @Order(1010)
    @Test
    void sortPersonsByBmiAndNameDescending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiNameComparator(), false);

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).containsExactly(
                marit,
                julika,
                eric,
                frieda,
                diana,
                alice,
                jonah,
                kalle,
                antonia,
                falk
        );
    }

    @Order(1020)
    @Test
    void sortPersonsByBmiAndSizeDescending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiSizeComparator(), false);

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).containsExactly(
                marit,
                julika,
                eric,
                alice,
                diana,
                frieda,
                jonah,
                kalle,
                antonia,
                falk
        );
    }

    @Order(1030)
    @Test
    void sortPersonsByBmiAndWeightDescending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiWeightComparator(), false);

        Arrays.stream(sortedPersons).forEach(System.out::println);

        assertThat(sortedPersons).containsExactly(
                marit,
                julika,
                eric,
                alice,
                diana,
                frieda,
                jonah,
                kalle,
                antonia,
                falk
        );
    }

    @Order(1040)
    @Test
    void sortPersonsByBmiAscending() {

        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiComparator(), true);

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

    @Order(1050)
    @Test
    void sortPersonsByBmiAndNameAscending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiNameComparator(), true);

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

    @Order(1060)
    @Test
    void sortPersonsByBmiAndSizeAscending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiSizeComparator(), true);

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

    @Order(1070)
    @Test
    void sortPersonsByBmiAndWeightAscending() {
        Arrays.stream(unsortedPersons).forEach(System.out::println);
        System.out.println();

        var sortedPersons = bubbleSort(unsortedPersons, new BmiWeightComparator(), true);

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



    @Order(1080)
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