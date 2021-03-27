package pbc.fibonacci;

public class Comparator {
//    Sprawdzianem dla "wartosci" programu może być jego parametr w postaci czasu realizacji zadania.

    public static void main(String[] args) {


        long start1 = System.currentTimeMillis();
            int result1;
            result1 = caltulateFibonacciPlain(10);
        long stop1 = System.currentTimeMillis();
        System.out.println("test time" + (stop1-start1) +"ms");


        long start2 = System.currentTimeMillis();
        int result2;
        result1 = calculateFibonacciRecrence(10);
        long stop2 = System.currentTimeMillis();
        System.out.println("test time" + (stop2-start2) +"ms");


        long start3 = System.currentTimeMillis();
        int result3;
        result3 = caltulateFibonacciTuple(10);
        long stop3 = System.currentTimeMillis();
        System.out.println("test time" + (stop3-start3) +"ms");

//Optymalizacja programu w Java (i nie tylko) powinna obejmować  podstawowe aspekty:
//1. wymagania uzytkownika
//
// 2. możliwości maszyny
//
//        zasady czystego kodu