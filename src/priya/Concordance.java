package priya;

import java.util.HashMap;

public class Concordance {

    public static void main(String args[]) {
        findIndex("hi how are you?");
    }

    public static String findIndex(String text) {
        HashMap<String, Integer> table = new HashMap<>();
        String[] wordsString = text.split(" ");
        String result = "";
        table.put(wordsString[0], text.indexOf(wordsString[0]));
        return (result + table);
    }
}

