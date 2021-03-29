package fibonacci_next;

public class FibonacciRecurance {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int result;
        result = calculateFibonacciRecurance(40);
        long stop2 = System.currentTimeMillis();
        System.out.println("test time " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("result  = " + result);
    }

    private static int calculateFibonacciRecurance(int k) {
        if (k == 1 || k == 2) {
            return 1;
        } else {
            return calculateFibonacciRecurance(k - 1) + calculateFibonacciRecurance(k - 2);
        }
    }
}