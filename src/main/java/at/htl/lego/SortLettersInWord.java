package at.htl.lego;

import java.util.Arrays;

public class SortLettersInWord {

    public static void main(String[] args) {
        String word = "lorem ipsum dolor";
        System.out.println(word+ "  -> "+ sortLettersInWord(word));
    }

    static String sortLettersInWord(String word) {
        String newWord = "";

        // Entferne alle Leerzeichen
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                newWord = newWord + word.charAt(i);
            }
        }
        char[] sortedWord = new char[newWord.length()];
        System.out.println(newWord);

        // Sortiere das Wort
        for (int i = 0; i < newWord.length(); i++) {
            int j = i - 1;
            while (j >= 0 && newWord.charAt(i) < sortedWord[j]) {
                sortedWord[j+1] = sortedWord[j];
                j--;
            }
            j++;
            sortedWord[j] = newWord.charAt(i);
        }

        // Wandle das char-Array in einen String um
        String result = "";
        for (char c : sortedWord) {
            result = result + c;
        }

        return result;
    }

}
