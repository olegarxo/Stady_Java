package ru.gb.jseminar;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) { 
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = enter.next();
        LocalDateTime ldt = LocalDateTime.now();
        Integer time = ldt.getHour();
        if (time >= 5 && time < 12){
            System.out.println("Доброе утро," + name);
        }
        else if (time >= 12 && time < 18){
            System.out.println("Доброе день," + name);
        }
        else if (time >= 18 && time < 23){
            System.out.println("Доброе вечер," + name);
        }
        else if (time >= 23 && time < 5){
            System.out.println("Доброе ночь, " + name);
        }
    }

}
