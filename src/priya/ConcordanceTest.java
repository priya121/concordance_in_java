package priya;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class ConcordanceTest {
    @Test
    public void countsOne() {
        HashMap<String, ArrayList<Integer>> result = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        index.add(0);
        result.put("hi",index);
        assertEquals(result, Concordance.splitWords("hi"));
    }

    @Test
    public void countsWordTwice() {
        HashMap<String, ArrayList<Integer>> result = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        index.add(0);
        index.add(3);
        result.put("hi",index);
        Assert.assertEquals(result, Concordance.splitWords("hi hi"));
    }

    @Test
    public void countsOccurrencesOfHow() {
        // assertEquals("{how=[4], are=[8], you?=[12], hi,=[0]}", Concordance.splitWords("hi, how are you?"));
    }

    @Test
    public void multipleOccurrencesOfHi() {
        // assertEquals("{how=[4], hi=[17], are=[8], you=[12], hi,=[0]}", Concordance.splitWords("hi how are you hi"));
    }

}