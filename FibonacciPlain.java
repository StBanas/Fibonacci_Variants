package pbc.fibonacci;

import java.util.stream.Stream;

public class FibonacciPlain {

    public int calculateFibonacciPlain(int k) {
        if (k==0) {
            int sum = 0;
        }

        else {
        int sum = 1;
        for (int i = 1; i < k + 1; i++)
            k = k + 1;
        sum = +k;
        return sum;
    }


//        return calculateFibonacciPlain();
//    }
}
