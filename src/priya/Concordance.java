package priya;

import java.util.ArrayList;
import java.util.HashMap;

public class Concordance {

    public static void main(String args[]) {
    }

    public static HashMap<String, ArrayList<Integer>> findIndex(String input) {
        String text = new String("Hi, how hare you, Hi?");
        HashMap<String, ArrayList<Integer>> table = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<Integer>(0);

        int i = text.indexOf(input);
            while (i >= 0) {
                array.add(i);
                table.put(text.substring(i, i + input.length()), array);
                i = text.indexOf(input, i + 1);
            }
        return table;
    }
}

