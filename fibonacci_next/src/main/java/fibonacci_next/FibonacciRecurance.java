package fibonacci_next;

public class FibonacciRecurance {

    private static int calculateFibonacciRecurance(int k) {
        if (k == 1 || k == 2) {
            return 1;
        } else {
            return calculateFibonacciRecurance(k - 1) + calculateFibonacciRecurance(k - 2);
        }
    }
}