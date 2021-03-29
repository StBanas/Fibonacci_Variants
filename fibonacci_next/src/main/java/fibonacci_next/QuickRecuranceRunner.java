package fibonacci_next;

public class QuickRecuranceRunner {
    public static void main(String[] args) {
        int sum = 0;
        int n = 11;
        for (int i = 1; i < n; i++) {

            sum = run(n);
        }System.out.println(sum);

    }

    public static int run(int k) {
        if (k == 1) {
            return 1;
        } else if (k == 2) {
            return 1;
        } else {
            return run(k - 1) + run(k - 2);

        }
    }
}
