package ru.gb.jseminar;

import java.util.Scanner;
import java.lang.Math;
public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(enter.next());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(enter.next());
        Task4 task4 = new Task4();
        System.out.print(task4.exponentiation(a, b));
    }

    public double exponentiation(int a, int b){
        return  Math.pow(a, b);
    }
}
