abstract class FoodOrder {
    abstract void placeOrder(); // abstract method

    void payment() // concrete method
    {
        System.out.println("Processing payment...");
    }
}

class OnlineOrder extends FoodOrder {

    void placeOrder() {
        System.out.println("Order is placed online.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        FoodOrder order = new OnlineOrder();
        order.placeOrder(); // Hides internal logic
        order.payment();
    }
}

