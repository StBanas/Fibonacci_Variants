package fibonacci_next;

import java.util.Arrays;

// przyjałem, że liczbę do wyliczenia można otrzymać dzięki dodatkowej klasie (Fibonacci Plain - dto) i obiektowi (w tym przypadku fp),
// z którego można wyabstrahować wartość liczby fibonacciego jako ostatni wyraz tabeli;

public class FibonacciPlain {
    int[] numbers;
    int size;

    public FibonacciPlain(int[] numbers, int size) {
        this.numbers = numbers;
        this.size = size;
    }

    public int getValue(int number) {
        return this.numbers[number];
    }

    public void addValue(int number) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(numbers, 0, newTab, 0, numbers.length);
        newTab[this.size - 1] = number;
        numbers = newTab;
    }

    public int calculateFibonacciPlain(int k) {
        FibonacciPlain fp = new FibonacciPlain(numbers, size);
        if (k == 1) {
            fp.addValue(1);
            System.out.println(fp.size + " " + fp.getValue(0));
            System.out.println("------------------------");
        } else if (k == 2) {
            fp.addValue(1);
            fp.addValue(1);
            System.out.println(fp.size + " " + fp.getValue(1));
            System.out.println("------------------------");
        } else {
            fp.addValue(1);
            fp.addValue(1);

            for (int i = 3; i <= k; i++) {
                fp.addValue((fp.getValue(i - 3)) + (fp.getValue(i - 2)));
            }
        }
        return fp.getValue(fp.size - 1);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] numbers = new int[0];
        FibonacciPlain fp = new FibonacciPlain(numbers, 0);
        int result;
        result = fp.calculateFibonacciPlain(40);
        long stop = System.currentTimeMillis();
        System.out.println("test time  " + (stop - start) + " ms");
        System.out.println("result  = " + result);
    }
}
