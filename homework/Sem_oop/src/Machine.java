import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<Product> list;

    public Machine(List<Product> list){
        this.list = list;
    }

    public Product getProdictName(String name){
        for (Product item:this.list) {
            if(name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Object not found");
    }
}
