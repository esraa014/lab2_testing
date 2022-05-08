import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class lab2Test  {
    @Test
    public void evenOrOddTest()

    {
        lab2 lab2 = new lab2();
        assertEquals("even",lab2.evenOrOdd(8));
        assertEquals("odd",lab2.evenOrOdd(9));
    }
    int[] array = new int[] {450, 8, 20, 55, 300, 3};

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = lab2.getMaxValue(emptyArray);
        int minValue = lab2.getMinValue(emptyArray);
    }
    @Test
    public void shouldBeMaxValue() {
        int maxValue = lab2.getMaxValue(array);
        assert(maxValue == 450);
    }

    @Test
    public void shouldBeMinValue() {
        int minValue = lab2.getMinValue(array);
        assert(minValue == 3);
    }


}