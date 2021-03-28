package fibonacci_next;

public class FibonacciPlain {
    int[] numbers;
    int size;

    public FibonacciPlain(int[] numbers, int size) {
        this.numbers = numbers;
        this.size = size;
    }
    public int[] calculateFibonacciPlain(int k) {

        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < k+1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
            FibonacciPlain fp = new FibonacciPlain(numbers,size);
            fp.addValue(numbers[i]);
            System.out.println("liczba " + (i + 1) + "-ta wynosi " + numbers[i]);
        }
        return numbers;
    }

    public void addValue(int number) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(numbers, 0, newTab, 0, numbers.length);
        newTab[this.size - 1] = number;
        numbers = newTab;
  }
}
