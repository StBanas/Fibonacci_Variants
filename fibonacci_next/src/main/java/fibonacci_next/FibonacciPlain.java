//package fibonacci_next;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//// przyjałem, że liczbę do wyliczenia można otrzymać dzięki dodatkowej klasie (dto) i obiektowi (w tym przypadku fp),
//// z którego można wyabstrahować wartość pierwszego przekazywanego parametru;
//public class FibonacciPlain {
//    int[] numbers;
//    int size;
//
//    public FibonacciPlain(int[] numbers, int size) {
//        this.numbers = numbers;
//        this.size = size;
//    }
//
//    public int calculateFibonacciPlain(int k) {
//        if (k == 1) {
//            numbers[0] = 1;
//        } else if (k == 2) {
//            numbers[1] = 1;
//        } else {
//            for (int i = 2; i < k + 1; i++) {
//                numbers[i] = numbers[i - 1] + numbers[i - 2];
//                FibonacciPlain fp = new FibonacciPlain(numbers, size);
//                fp.addValue(numbers[i]);
//                System.out.println("liczba " + (i + 1) + "-ta wynosi " + numbers[i]);
//            }
//        }
////        TODO:
//        //wyabstrahować ostatnią wartość z tablicy - max() wymaga Optional
//        return Arrays.stream(numbers).hashCode();
//    }
//
//    public void addValue(int number) {
//        this.size++;
//        int[] newTab = new int[this.size];
//        System.arraycopy(numbers, 0, newTab, 0, numbers.length);
//        newTab[this.size - 1] = number;
//        numbers = newTab;
//    }
//
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
//}
