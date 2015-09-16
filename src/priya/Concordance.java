package priya;

import java.util.ArrayList;
import java.util.HashMap;

public class Concordance {

    public static void main(String args[]) {
    }

    public static HashMap<String, ArrayList<Integer>> splitWords(String text) {
        HashMap<String, ArrayList<Integer>> table = new HashMap<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        for (String substring : text.split(" ")) {
            words.add(substring);

            for (int i = 0; i < words.size(); i++) {
                if (words.get(i) == "hi") {
                    indices.add(text.indexOf(words.get(i), i));
                    table.put(words.get(i), indices);
                }
            }
        }
        return table;
    }
}














