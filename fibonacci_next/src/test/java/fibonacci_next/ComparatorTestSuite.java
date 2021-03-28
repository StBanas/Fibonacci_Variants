package fibonacci_next;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ComparatorTestSuite {

    @Test
    public void schouldTheResultBeAcurate(){
        FibonacciPlain fp = new FibonacciPlain(null, 0);
        fp.calculateFibonacciPlain(10);
        Assertions.assertEquals(11, fp.numbers);

    }

}
