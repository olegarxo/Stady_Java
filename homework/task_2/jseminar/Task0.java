package ru.gb.jseminar;

import java.util.logging.Logger;

public class Task0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        Task0 task = new Task0();

        Logger log = Logger.getLogger(Task0.class.getName());
        log.info(task.findJewelsInStones("aB", "aaaAbbbB"));

    }

    public String findJewelsInStones(String jewels, String stones) {
        String result = "";
        int count = 0;

        for (char jaw: jewels.toCharArray()){
            result += jaw;
            for (char stone: stones.toCharArray()){
                if (jaw == stone){

                    count ++;
                }
            }
            result += count;
            count = 0;

        }
        return result;
    }

}
