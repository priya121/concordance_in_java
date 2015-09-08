package priya;

import java.util.HashMap;

public class Concordance {

    public static HashMap<String, Integer> findIndex(String input) {
        String text = new String("Hi, how are you, Hi?");
        HashMap table = new HashMap();
        for (int i = 0; i <= (text.length() - input.length()); i++) {
                if (text.regionMatches(i, input, 0, input.length())) {
                    table.put(text.substring(i, i + input.length()), text.indexOf(input));
                    table.put(text.substring(i++, i + input.length()), text.indexOf(input));
                }
            }
        return table;
    }
}

