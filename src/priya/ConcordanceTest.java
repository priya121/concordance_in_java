package priya;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConcordanceTest {

    @Test
    public void countsOne(){
        assertEquals(Concordance.findIndex("hi"), "{hi=0}");
    }
}