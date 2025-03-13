class Restaurant {
    // Global (Instance) Variable: Unique
    int orderId;
    String customerName;
    int a = 10;

    // Static Variable: Common for all orders
    static String restaurantName = "spicy hut";

    // Constructor to initialize order details
    public Restaurant(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    void calculateBill(int quantity, int price) {

        int totalBill = quantity * price;// Local Variable: Only accessible inside this method
        
        // Printing the order details
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Bill: $" + totalBill);

    }

}
public class Variables {
    public static void main(String[] args) {

        Restaurant order1 = new Restaurant(101, "Ani");
        order1.calculateBill(2, 30);
        order1.calculateBill(3,40);
        Restaurant order2 = new Restaurant(102, "laks");
        order2.calculateBill(3, 40);
        

    }
}
