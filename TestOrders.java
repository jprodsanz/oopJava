public class TestOrders {
    public static void main(String[] args) {
        
        String generalGreeting = "Welcome to Cafe Java, where cafe is our specialization";

    // Coffee Menu
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 3.25;

        Items item2 = new Items();
        item2.name = "oatMilkLatte";
        item2.price = 4.95;

        Items item3 = new Items();
        item3.name = "soyMilkLatte";
        item3.price = 5.65;

        Items item4 = new Items();
        item4.name = "cappuccino";
        item4.price = 6.65;

        // Order variables

        Order order1 = new Order();
        order1.name= "Hi, Tom Brady";

        Order order2 = new Order();
        order2.name= "Hi, Elon Musk";
        
        Order order3 = new Order();
        order3.name= "Hi, Dua Lipa";
        
        Order order4 = new Order();
        order4.name= "Hi, Drake";

    // Add item1 to order2's item list and increment the order's total.
        order2.total = order2.total + item1.price;

    // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.total = order3.total + item4.price; 
    // order4 added a latte. Update accordingly.
        order1.total = order1.total + item2.price;

    // Tom Brady's order is now ready. Update his status.
        order1.ready = true; 

    // Drake ordered more drinks - 2 lattes. Update his order as well.
        order4.total = order4.total + (item2.price *2);
    // Elon's order is now ready. Update his status.
        order2.ready = true; 
    
    // Application Simulations
    // Use this example code to test various orders' updates

    System.out.println(generalGreeting);
    
    System.out.printf("Name: %s\n Total: %s \n Status: %s \n", order1.name, order1.total, order1.ready);
    
    System.out.printf("Name: %s \n Total: %s\n Status: %s \n", order2.name, order2.total, order2.ready);

    System.out.printf("Name: %s \n Total: %s\n Status: %s\n", order3.name, order3.total, order3.ready);

    System.out.printf("Name: %s \n Total: %s\n Status: %s\n", order4.name, order4.total, order4.ready);
    }
    
}
