package org.example;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
  вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
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