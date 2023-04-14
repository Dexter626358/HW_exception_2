package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloat();
        System.out.printf("Вы ввели %f", number);
    }


    static float getFloat() {
        System.out.println("Введите число типа float: ");
        try {
            Scanner scan = new Scanner(System.in);
            float floatNumber = scan.nextFloat();
            return floatNumber;
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение. Попробуйте снова");
            return getFloat();
        }
    }
}