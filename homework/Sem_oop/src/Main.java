import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(Arrays.asList(
                new Product("Snickers", 7.3),
                new Product("Milca", 20.6)));
        Machine machine = new Machine(list);
        System.out.println((machine.getProdictName("Snickers").getName()));
    }
}