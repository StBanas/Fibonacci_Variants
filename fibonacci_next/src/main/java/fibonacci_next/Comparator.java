//package fibonacci_next;
//
//import java.util.Arrays;
//
//public class Comparator {
//
////    Sprawdzianem dla "wydajności" programu może być jego parametr w postaci czasu realizacji zadania.
////    Można też skontrolować i porównać ilość operacji zapisu i odczytu wartości in/out na stocku (ew. heapie), jednak jest to
////    bardziej złozone; generalnie optymalizacja programu w Java (i nie tylko) powinna obejmować 2 podstawowe aspekty:
////      1. wymagania uzytkownika - z reguły czas;
////      2. możliwości maszyny - przede wszystkim zasoby pamięci,
//
//    public static void main(String[] args) {
//
//        long start1 = System.currentTimeMillis();
//        int result1;
//        FibonacciPlain fp = new FibonacciPlain(null, 0);
//        result1 = fp.calculateFibonacciPlain(11);
//        long stop1 = System.currentTimeMillis();
//        System.out.println("test time 1 " + (stop1 - start1) + " ms");
//        System.out.println("result 1 = " + result1);
//
//
//        long start2 = System.currentTimeMillis();
//        int result2;
//        result2 = calculateFibonacciRecurance(11);
//        long stop2 = System.currentTimeMillis();
//        System.out.println("test time2 " + (System.currentTimeMillis() - start2) + " ms");
//        System.out.println("result 2 = " + result2);
//    }
//
//
//    private static int calculateFibonacciRecurance(int k) {
//        if (k == 1 || k == 2) {
//            return 1;
//        } else {
//            return calculateFibonacciRecurance(k - 1) + calculateFibonacciRecurance(k - 2);
//        }
//    }
//
//    public static class FibonacciPlain {
//        int[] numbers;
//        int size;
//
//        public FibonacciPlain(int[] numbers, int size) {
//            this.numbers = numbers;
//            this.size = size;
//        }
//
//        public int getValue(int number) {
//            return this.numbers[number];
//        }
//
//        public void addValue(int number) {
//            this.size++;
//            int[] newTab = new int[this.size];
//            System.arraycopy(numbers, 0, newTab, 0, numbers.length);
//            newTab[this.size - 1] = number;
//            numbers = newTab;
//        }
//
//        public int calculateFibonacciPlain(int k) {
//            FibonacciPlain fp = new FibonacciPlain(numbers, size);
//            if (k == 1) {
//                fp.addValue(1);
//                System.out.println(fp.size + " " + fp.getValue(0));
//                System.out.println("------------------------");
//            } else if (k == 2) {
//                fp.addValue(1);
//                fp.addValue(1);
//                System.out.println(fp.size + " " + fp.getValue(1));
//                System.out.println("------------------------");
//            } else {
//                fp.addValue(1);
//                fp.addValue(1);
//
//                for (int i = 3; i <= k; i++) {
//                    fp.addValue((fp.getValue(i - 3)) + (fp.getValue(i - 2)));
//                }
//            }
//            System.out.println(fp.size + "   " + Arrays.toString(fp.numbers));
//            return fp.getValue(fp.size - 1);
//        }
//    }
//}
//
//
////TODO: opracować wyliczenie liczby f. metodą podstawiania w tupli i porównać wydajność;
////        long start3 = System.currentTimeMillis();
////        int result3;
////        result3 = caltulateFibonacciTuple(10);
////        long stop3 = System.currentTimeMillis();
////        System.out.println("test time" + (stop3 - start3) + "ms");