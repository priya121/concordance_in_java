package priya;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConcordanceTest {

    @Test
    public void countsOne() {
        assertEquals("{hi=[0]}", Concordance.findIndex("hi"));
    }

    @Test
    public void countsOccurrencesOfHow() {
        assertEquals("{how=[4], are=[8], you?=[12], hi,=[0]}", Concordance.findIndex("hi, how are you?"));
    }

    @Test
    public void multipleOccurrencesOfHi() {
        assertEquals("{how=[4], hi=[17], are=[8], you?=[12], hi,=[0]}", Concordance.findIndex("hi, how are you? hi"));
    }
}