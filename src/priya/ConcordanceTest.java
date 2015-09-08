package priya;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ConcordanceTest {

    @Test
    public void emptyStringoutputHash() {
        HashMap<String,Integer> hash = new HashMap<>(1);
        hash.put("", new Integer(0));
        assertEquals(hash, Concordance.findIndex(""));
    }

    @Test
    public void oneWordOutputHash() {
        Map<String, Integer> hash = new HashMap<String,Integer>(1);
        hash.put("H", new Integer(0));
        assertEquals(hash, Concordance.findIndex("H"));
    }
    
    @Test
    public void hashOfWordIndexFour() {
        Map<String, Integer> hash = new HashMap<String,Integer>(2);
        hash.put("h", new Integer(4));
        assertEquals(hash, Concordance.findIndex("h"));
    }

    @Test
    public void indiciesOfTwoDifferentWords() {
        Map<String, Integer> hash = new HashMap<String,Integer>(2);
        hash.put("Hi", new Integer(0));
        hash.put("Hi", new Integer(18));
        assertEquals(hash, Concordance.findIndex("Hi"));
    }
}

