package fibonacci_next;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

// przyjałem, że liczbę do wyliczenia można otrzymać dzięki dodatkowej klasie (dto) i obiektowi (w tym przypadku fp),
// z którego można wyabstrahować wartość pierwszego przekazywanego parametru;

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
        fp.addValue(1);
        fp.addValue(1);
        System.out.println(fp.size);
        System.out.println("------------------------");
        if (k == 1 || k == 2) {
            System.out.println(fp.size + "   " + Arrays.toString(fp.numbers));System.out.println("------------------------");System.out.println(fp.size);
            return Arrays.stream(numbers).sum();
        } else {
            for (int i = 3; i < k; i++) {
                int p1 = fp.getValue(size);
                System.out.println(p1);

                int p2 = fp.getValue(size);
                System.out.println(p2);

                fp.addValue( p1 + p2 );
                    System.out.println("liczba " + (i + 1) + "-ta wynosi " + fp.getValue(p1+p2));

            }
        }
// TODO:
// wyabstrahować ostatnią wartość z tablicy - max() wymaga Optional

        return Arrays.stream(numbers).sum();
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof FibonacciPlain)) return false;
//        FibonacciPlain that = (FibonacciPlain) o;
//        return size == that.size && Arrays.equals(numbers, that.numbers);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(size);
//        result = 31 * result + Arrays.hashCode(numbers);
//        return result;
//    }

    public static void main(String[] args) {
        int[] numbers = new int[0];
        FibonacciPlain fp = new FibonacciPlain(numbers,0);
        int result;
        result = fp.calculateFibonacciPlain(10);
        System.out.println(result);
    }
}
