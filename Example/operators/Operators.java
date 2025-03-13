

public class Operators
{
    public static void main(String[] args) {
        // Arithmetic Operators (+, -, *, /, %)
        int price = 30;
        int quantity = 3;
        int subtotal = price * quantity;  // Multiplication operator (*)
        double taxRate = 0.08;  
        double taxAmount = subtotal * taxRate;  // Calculate tax
        float discount = 5.00f;
        byte numberOfGuest=3;
        char paymentMethod='c';
        long orderId=103567889L;
        double totalBill = subtotal + taxAmount - discount;  // Addition and subtraction
        
        // Relational Operators (>, <, >=, <=, ==, !=)
        boolean eligibleForDiscount = subtotal > 30;  // Check if order is above $30
 
        // Logical Operators (&&, ||, !)
        boolean paymentCompleted = true;
        boolean isValidOrder = (subtotal > 0) && paymentCompleted; // Order is valid if subtotal > 0 and payment is done
 
        //Ternary operator
        String eligibleChecking =(subtotal>30)?"eligible for discount":"not eligible";

        //unary operator
        quantity++;
        subtotal = price * quantity;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Eligible for Discount: " + eligibleForDiscount);
        System.out.println("Order Valid: " + isValidOrder);
        System.out.println("payment method:"+paymentMethod);
        System.out.println("Number of guests :"+numberOfGuest);
        System.out.println("Order id is :"+orderId);
        System.out.println("Eligiblechecking:"+eligibleChecking);
    }
}
