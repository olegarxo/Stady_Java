package ru.gb.jseminar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<String> tamp = homework.doIt(a, b, c, d);
        for (String i : tamp) {
            System.out.println(i);
            
        }
    }

    public ArrayList<String> doIt(Integer a, Integer b, Integer c, Integer d){
        ArrayList<String> sumList = new ArrayList<>();
        recurs_d(a, b, sumList);
        recurs_с(a, b, sumList);
        return sumList;
    }
    public void recurs_с(Integer a, Integer b, ArrayList<String> doing ){
        a *= 2;
        if(a == b){
            doing.add("k1");
            return;
        }
        else if(a > b){
            return;
        }
        else{
            doing.add("k1");
            recurs_с(a, b, doing);
            recurs_d(a, b, doing);
        }
        
    }
    public void recurs_d(Integer a, Integer b, ArrayList<String> doing){
        
        a += 2;
    if(a == b){
        doing.add("k2");
        return ;
    }
    else if(a > b){
        return;
    }
    else{
        doing.add("k2");
        recurs_с(a, b, doing);
        recurs_d(a, b, doing);
    }
    }
}
