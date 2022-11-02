package ru.gb.jseminar;
import java.util.ArrayList;
import netscape.javascript.JSObject;
public class Homework {

    // Дана строка sql-запроса "select * from students".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    //
    // 1) Данные для фильтрации подаются в метод двумя массивами paramName и paramValue.
    // 2) Данные для фильтрации подаются в метод строкой в формате json.
    public static void main(String[] args) {
        Homework hom = new Homework();
        String sql_start = "select * from students WHERE ";
        String[] paramName = {"City","castle","rivers"};
        String[] paramValue = {"5","2","3"};
        String[] itog = hom.updateQueryByArrays(sql_start, paramName, paramValue);
        for (String string : itog) {
            System.out.println(string);
        }
    }

    public String[] updateQueryByArrays(String q, String[] paramName, String[] paramValue){
        
        int count = 0;
        ArrayList<String> ready_comand = new ArrayList<>();
        StringBuilder q_SB = new StringBuilder(q);
        for (String string : paramName) {
            q_SB.append(q);
            q_SB.append(paramName);
            q_SB.append(" = ");
            q_SB.append(paramValue);
            ready_comand.add(q + string + " = " + paramValue[count]);
            count += 1;
        }

        return ready_comand.toArray(String[]::new);
    }

    public String updateQueryByJson(String q){
        
        return "";
    } 
}
