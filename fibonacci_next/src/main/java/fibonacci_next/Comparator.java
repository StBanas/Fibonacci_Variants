package fibonacci_next;

public class Comparator {

//    Sprawdzianem dla "wydajności" programu może być jego parametr w postaci czasu realizacji zadania.
//    Można też skontrolować i porównać ilość operacji zapisu i odczytu wartości in/out na stocku (ew. heapie), jednak jest to
//    bardziej złozone; generalnie optymalizacja programu w Java (i nie tylko) powinna obejmować  podstawowe aspekty:
//      1. wymagania uzytkownika - z reguły czas;
//
//      2. możliwości maszyny - przede wszystkim zasoby pamięci;
//
//      3.  zasady czystego kodu

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        int result1;
        FibonacciPlain fp = new FibonacciPlain(null, 0);
        result1 = fp.calculateFibonacciPlain(11);
        long stop1 = System.currentTimeMillis();
        System.out.println("test time 1 " + (stop1 - start1) + " ms");
        System.out.println("result 1 = " + result1);


        long start2 = System.currentTimeMillis();
        int result2;
        result2 = calculateFibonacciRecurance(11);
        long stop2 = System.currentTimeMillis();
        System.out.println("test time2 " + (System.currentTimeMillis() - start2) + " ms");
        System.out.println("result 2 = " + result2);
    }
//TODO:
// Wykorzystać plugin analizujący wydajność "jmh" -java microbenchmark; (jmh-core i jmh - generator należy dodać do pml lub gradle};

//TODO
// Obsłużyć nullPointerException w kodzie poniżej:


//    public static class FibonacciPlain {
//        int[] numbers;
//        int size;
//
//        public FibonacciPlain(int[] numbers, int size) { //
//            this.numbers = numbers;
//            this.size = size;
//
//        }
//
//        public int calculateFibonacciPlain(int k) {
//
//            FibonacciPlain fp = new FibonacciPlain(null, 0);  //
//            int sum = 0;
//            numbers[0] = 1;
//            numbers[1] = 1;
//            for (int i = 2; i < k + 1; i++) {
//                numbers[i] = numbers[i - 1] + numbers[i - 2];
//
//                fp.addValue(numbers[i]);
//
//                System.out.println("liczba " + (i + 1) + " wynosi " + numbers[i]);
//            }
//            return numbers[k];
//        }
//
//        public void addValue(int number) {
//            this.size++;
//            int[] newTab = new int[this.size];
//            System.arraycopy(numbers, 0, newTab, 0, numbers.length);
//            newTab[this.size - 1] = number;
//            numbers = newTab;
//        }
//    }

    private static int calculateFibonacciRecurance(int k) {
        if (k == 1 || k == 2) {
            return 1;
        } else {
            return calculateFibonacciRecurance(k - 1) + calculateFibonacciRecurance(k - 2);
        }
    }
}

//TODO: opracować wyliczenie liczby f. metodą podstawiania w tupli i porównać wydajność;
//        long start3 = System.currentTimeMillis();
//        int result3;
//        result3 = caltulateFibonacciTuple(10);
//        long stop3 = System.currentTimeMillis();
//        System.out.println("test time" + (stop3 - start3) + "ms");