package fibonacci_next;

public class Comparator {
//    Sprawdzianem dla "wartosci" programu może być jego parametr w postaci czasu realizacji zadania.

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        int result1;
        FibonacciPlain fb = new FibonacciPlain();
        result1 = fb.calculateFibonacciPlain(11);
        long stop1 = System.currentTimeMillis();
        System.out.println("test time 1 " + (stop1 - start1) + " ms");
        System.out.println("result 1 = " + result1);


        long start2 = System.currentTimeMillis();
        int result2;
        result2 = calculateFibonacciRecurance(11);
        long stop2 = System.currentTimeMillis();
        System.out.println("test time2 " + (System.currentTimeMillis() - start2) + " ms");
        System.out.println("result 2 = " + result2);


//        long start3 = System.currentTimeMillis();
//        int result3;
//        result3 = caltulateFibonacciTuple(10);
//        long stop3 = System.currentTimeMillis();
//        System.out.println("test time" + (stop3 - start3) + "ms");
    }


//    private static int calculateFibonacciPlain(int i) {
//        int[] numbers = new int[100];
//        int size;
//        if (i == 1) {
//            numbers[0] = 1;
//        } else if (i == 2) {
//            numbers[1] = 1;
//        } else if (i==3) {
//            numbers[2] = 2;
//        }
//        else
//        {
//            numbers[i]=+numbers[i-1];
//            for (int k = 3; k < i+1; k++) {
//                numbers[i] = numbers[k - 1] + numbers[k - 2];
//            }
//        }
//        return numbers[i];
//    }

    public static class FibonacciPlain {
        int[] numbers;
        int size;

        public  FibonacciPlain() { //
//            this.numbers = numbers;
//            this.size = size;
    }
    public  FibonacciPlain(int[] numbers) {
            this.numbers = numbers;
            this.size = size;
    }
    public int calculateFibonacciPlain(int k) {

            FibonacciPlain fp = new FibonacciPlain();  //numbers,size
                int sum =0;
                numbers[0] = 1;
                numbers[1] = 1;
//                numbers[2] = 2;
                for (int i = 2; i < k+1; i++) {
                    numbers[i] = numbers[i - 1] + numbers[i - 2];
                    sum = numbers[i - 1] + numbers[i - 2];

                fp.addValue(numbers[i]);
            System.out.println("liczba " + (i + 1) + "-ta wynosi " + numbers[i]);
        }
        return sum;
    }

    public void addValue(int number) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(numbers, 0, newTab, 0, numbers.length);
        newTab[this.size - 1] = number;
        numbers = newTab;
    }
}

    private static int calculateFibonacciRecurance(int k) {
        if (k == 1 || k == 2) {
            return 1;
        } else {
            return calculateFibonacciRecurance(k - 1) + calculateFibonacciRecurance(k - 2);
        }
    }
}

//}
//Optymalizacja programu w Java (i nie tylko) powinna obejmować  podstawowe aspekty:
//1. wymagania uzytkownika
//
// 2. możliwości maszyny
//
//        zasady czystego kodu