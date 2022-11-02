package ru.gb.jseminar;

public class Task1 {

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        Task1 task = new Task1();
        String s = "cba";
        int[] index = {3,2,1};
        System.out.println(task.shuffle(s, index));

    }

    public String shuffle(final String s, final int[] index){
        char [] recover = new char[s.length()];
        int tamp = 0;
        for (char i : s.toCharArray()) {
            recover[index[tamp] - 1] = i;
            tamp += 1;
        }
        String str = new String(recover);
        return str;
    }

}
