package at.htl.lego.solution.collections.Bsp001;

import java.util.LinkedList;
import java.util.List;

public class ListMgr {

    List<String> list;

    public ListMgr() {
        // You should use the Singleton pattern here
        list = new LinkedList<>();
    }

    /**
     * adds one element to the list
     * @param text the element to add
     */
    public void create(String text) {
        list.add(text);
    }

    /**
     * adds all elements to the list
     * @param texts the elements to add
     */
    public void create(String... texts) {
        list.addAll(List.of(texts));
    }

    /**
     * reads one element from the list
     * @param index the index of the element to read
     * @return the element at the given index, or null if the index is out of bounds
     */
    public String read(int index) {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    /**
     * replaces one element in the list
     * @param index the index of the element to replace
     * @param text the new element
     * @return true if the element was replaced, false otherwise
     */
    public boolean update(int index, String text) {
        int size = list.size();
        if (size <= index) {
            return false;
        } else {
            list.set(index, text);
            return true;
        }
    }

    /**
     * deletes one element from the list
     *
     * @param text the element to delete
     * @return true if the element was deleted, false otherwise
     */
    public boolean delete(String text) {
        return list.remove(text);
    }

    /**
     * deletes one element from the list at the given index
     * @param index the index of the element to delete
     * @return true if the element was deleted, false otherwise
     */
    public boolean delete(int index) {
        int size = list.size();
        if (size <= index) {
            return false;
        } else {
            list.remove(index);
            return true;
        }
    }

    /**
     * deletes all elements from the list between indexFrom and indexTo
     *
     * @param indexFrom the index of the first element to delete
     * @param indexTo the index of the last element to delete
     * @return true if the elements were deleted, false otherwise
     */
    public boolean delete(int indexFrom, int indexTo) {
        int size = list.size();
        if (size <= indexTo) {
            return false;
        }
        for (int i = indexFrom; i <= indexTo; i++) {
            list.remove(indexFrom);
        }
        return true;
    }





    public static void main(String[] args) {

        ListMgr personen = new ListMgr();

        System.out.println("Hinzufügen von 10 Personen");
        personen.create("Anna","Berta", "Cäsar", "Dora", "Emil", "Fridolin", "Gustav", "Heinrich", "Ida", "Julius");
        System.out.println(personen.list);

        System.out.println("\nHinzufügen von 1 Person");
        personen.create("Konrad");
        System.out.println(personen.list);

        System.out.println("\nLesen von index 25");
        if (personen.read(25) == null) {
            System.out.println("An der Stelle 25 gibt es keinen Eintrag zum Lesen");
        }

        System.out.println("\nLesen von index 5");
        System.out.println(personen.read(5));

        System.out.println("\nUpdate von index 25");
        if (!personen.update(25, "Xaver")) {
            System.out.println("An der Stelle 25 gibt es keinen Eintrag zum Updaten");
        }

        System.out.println("\nUpdate von index 5");
        personen.update(5, "Friedrich");
        System.out.println(personen.list);

        System.out.println("\nLöschen von Friedrich");
        personen.delete("Friedrich");
        System.out.println(personen.list);

        System.out.println("\nLöschen von index 2-5");
        personen.delete(2, 5);
        System.out.println(personen.list);

        System.out.println("\nLöschen von index 25-27");
        if (!personen.delete(25, 27)) {
            System.out.println("Die Liste hat nicht so viele Einträge zum Löschen");
        }
        System.out.println(personen.list);

        System.out.println("\nLöschen von index 4 - 7");
        if (!personen.delete(4, 7)) {
            System.out.println("Die Liste hat nicht so viele Einträge zum Löschen");
        }
        System.out.println(personen.list);

    }
}
