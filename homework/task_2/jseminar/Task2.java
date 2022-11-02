package ru.gb.jseminar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Logger;

//"C:\\Users\\Smirnov_ON\\Desktop\\stadyJava\\homework\\JSeminar_2\\src\\main\\java\\ru\\gb\\jseminar\\sda.txt"
public class Task2 {

    //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
    //Требуется перехватить все возможные ошибки и вывести их в логгер.
    //
    //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
    public static void main(String[] args) {
        Logger log = Logger.getGlobal();
        Task2 task = new Task2();
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter number(byte): ");
        String number = enter.next();
        byte[] number_byte = number.getBytes();
        try {
            log.info(task.findJewelsInStones(number));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

    public String findJewelsInStones(String jewels) throws FileNotFoundException{
        String exeption = "";
        try{
            PrintStream ps = new PrintStream("result.txt");
            ps.print(jewels.getBytes());
            System.out.println("Reade");
        }catch(Exception ex){
            exeption = ex.toString();
            
        }
        return exeption;
    }

}
