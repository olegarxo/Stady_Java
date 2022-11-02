package ru.gb.jseminar;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, А умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к А прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Homework homework = new Homework();
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter a: ");
        Integer a = Integer.parseInt(enter.next());
        System.out.print("Enter b: ");
        Integer b = Integer.parseInt(enter.next());
        System.out.print("Enter с: ");
        Integer c = Integer.parseInt(enter.next());
        System.out.print("Enter в: ");
        Integer d = Integer.parseInt(enter.next());
        ArrayList[] tamp = homework.doIt(a, b, c, d);
        for (ArrayList<String> i : tamp) {
            for (String j : i) {
            System.out.println(j);
            }
            System.out.println("______________");
        }
    }

    public ArrayList[] doIt(Integer a, Integer b, Integer c, Integer d){
        ArrayList<String> sumList = new ArrayList<>();
        String sum_string = new String();
        ArrayList<String> ansver = recurs_d(a, b, sum_string, sumList);
        ArrayList<String> ansver_two =  recurs_с(a, b, sum_string, sumList);
        ArrayList[] ansver_all = {ansver, ansver_two};
        return ansver_all;
    }
    public ArrayList<String>  recurs_с(Integer a, Integer b, String doing, ArrayList<String> list ){
        a *= 2;
        if(a == b){
            doing += "k1";
            return list.add(doing);
        }
        else if(a > b){
            return 0;
        }
        else{
            doing += "k1";
            recurs_с(a, b, doing, list);
            recurs_d(a, b, doing, list);
        }
        
    }
    public ArrayList<String>  recurs_d(Integer a, Integer b, String doing, ArrayList<String> list){
        
    a += 2;
    if(a == b){
        doing += "k2";
        return list.add(doing);
    }
    else if(a > b){
        return 0;
    }
    else{
        doing += k2;
        recurs_с(a, b, doing, ist);
        recurs_d(a, b, doing, list);
    }
    }
}
