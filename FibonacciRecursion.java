package pbc.fibonacci;

public class FibonacciRecursion {

    public static void main(String[] args) {
        int result;
        result = calculateFibonacciRecursion(20);
        System.out.println(result);
    }

    public static int calculateFibonacciRecursion(int n) {
        for (int i = 0; i < n; i++)
            if (i == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
        return (calculateFibonacciRecursion(n - 1) + calculateFibonacciRecursion(n - 2));
    }
}