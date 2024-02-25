package at.htl.lego.solution.oobasics.bsp002;

public class Bsp002 {

    private static final String CSV_LINE = "Donald;Duck";

    public static void main(String[] args) {
        Character donald = parseCsv(CSV_LINE);

        System.out.println(donald);

    }

    static Character parseCsv(String csvLine) {
        String[] elements = csvLine.split(";");
        Character character = new Character();
        character.setFirstName(elements[0]);
        character.setLastName(elements[1]);
        return character;
    }

}
