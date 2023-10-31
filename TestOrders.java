public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("mocha",5.50);
        Item item2 = new Item("latte", 4.50);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino",3.50);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1);
        System.out.println(order1.total);
        
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.items.get(0).name);
        System.out.println(order2.total);

        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.items.get(0).name);
        System.out.println(order3.total);

        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println(order4.items.get(0).name);
        System.out.println(order4.total);

        order1.ready = true;
        System.out.println(order1.ready);

        order3.items.add(item2);
        order3.items.add(item2);
        order3.total += (2 * item2.price);
        System.out.println(order3.items.get(2).name);
        System.out.println(order3.total);

        order2.ready = true;
        System.out.println(order2.ready);
    }
}
