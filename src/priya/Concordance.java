package priya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Concordance {

    public static void main(String args[]) {
        findIndex("hi how are you?");
    }

    public static String findIndex(String text) {
        HashMap<String, List<Integer>> table = new HashMap<>();
        String[] wordsString = text.split(" ");
        String result = "";
        for (int i = 0; i < wordsString.length; i++) {
            List<Integer> indexValues = new ArrayList<>();
            indexValues.add(text.indexOf(wordsString[i], i));
            table.put(wordsString[i], indexValues);
        }
        return (result + table);
    }
}

