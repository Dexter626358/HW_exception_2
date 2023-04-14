package org.example;

public class task2 {
    //Задание 2
    public static void main(String[] args) {
        task2();
    }
    static void task2() {
        try {
            int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
