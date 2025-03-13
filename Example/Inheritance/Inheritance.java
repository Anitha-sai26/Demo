
// Parent class (Base class)
class Order {
    int orderId;
    String customerName;

    // Constructor
    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // Common method for placing an order
    void placeOrder() {
        System.out.println("Order placed by " + customerName + " with Order ID: " + orderId);
    }
}

// Child class
class DineInOrder extends Order {
    public DineInOrder(int orderId, String customerName) {
        super(orderId, customerName); // Calling parent class constructor
    }

    void serveOrder() {
        System.out.println("Order " + orderId + " is being served at the restaurant.");
    }
}

// child class
class TakeawayOrder extends Order {
    public TakeawayOrder(int orderId, String customerName) {
        super(orderId, customerName);
    }

    void packOrder() {
        System.out.println("Order " + orderId + " is packed for takeaway.");
    }
}

// Child class
class OnlineOrder extends Order {
    String deliveryAddress;

    public OnlineOrder(int orderId, String customerName, String deliveryAddress) {
        super(orderId, customerName);
        this.deliveryAddress = deliveryAddress;
    }

    void deliverOrder() {
        System.out.println("Order " + orderId + " is out for delivery to: " + deliveryAddress);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        DineInOrder a = new DineInOrder(101, "Anitha");
        a.placeOrder();
        a.serveOrder();

        TakeawayOrder b = new TakeawayOrder(102, "laks");
        b.placeOrder();
        b.packOrder();

        OnlineOrder c = new OnlineOrder(103, "sai", "123 Main Street");
        c.placeOrder();
        c.deliverOrder();
    }
}
