package priya;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ConcordanceTest {

    @Test
    public void emptyStringoutputHash() {
        HashMap<String,Integer> hash = new HashMap<>(1);
        assertEquals(hash, Concordance.findIndex(""));
    }

    @Test
    public void oneWordOutputHash() {
        Map<String, ArrayList<Integer>> hash = new HashMap<>(1);
        ArrayList<Integer> array = new ArrayList<Integer>(0);
        array.add(0);
        array.add(18);
        hash.put("H", array);
        assertEquals(hash, Concordance.findIndex("H"));
    }
    
    @Test
    public void hashOfWordIndexFour() {
        Map<String, ArrayList<Integer>> hash = new HashMap<>(2);
        ArrayList<Integer> array = new ArrayList<Integer>(0);
        array.add(4);
        array.add(8);
        hash.put("h", array);
        assertEquals(hash, Concordance.findIndex("h"));
    }

    @Ignore @Test
    public void indiciesOfTwoDifferentWords() {
        Map<String, ArrayList<Integer>> hash = new HashMap<>(2);
        ArrayList<Integer> array = new ArrayList<Integer>(0);
        array.add(9);
        hash.put("a", array);
        assertEquals(hash, Concordance.findIndex("a"));
    }
}