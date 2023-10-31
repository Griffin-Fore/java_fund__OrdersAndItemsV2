import java.util.ArrayList;
public class Order {
    String name;
    Double total;
    Boolean ready;
    ArrayList<Item> items;
    
    public Order(String name){
        this.name = name;
        this.total = 0.00;
        this.items = new ArrayList<Item>();
    }
}
