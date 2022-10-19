package ru.gb.jseminar;
import java.util.Scanner;
import java.math.MathContext;
import java.util.Random;
public class Task3 {


    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int i = count();
        System.out.println(i);
    }

    public static int count(){
        int[] array;
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter count number: ");
        Integer tamp = Integer.parseInt(enter.nextLine());
        array = new int[tamp];
        int count_one = 0;
        for(int i = 0; i < tamp; i++){
            array[i] = (int) (Math.random() * 2);
            System.out.print(array[i]);
            if(array[i] == 1){
                count_one++;

            }
        }
        System.out.println(array);
        return count_one;
    }
}
