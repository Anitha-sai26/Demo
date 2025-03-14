public class While {
    public static void main(String[] args) {
        //while

        int i = 6;        // Initialization
        while (i <= 5)    // Condition
        { 
         System.out.println("While Loop: Count = " + i);
         i++; // Increment
        }

        //do while

        i = 6; // Initialization
        do
        {
        System.out.println("Do-While Loop: Count = " + i);
        i++; // Increment
        } while (i <= 5); // Condition
    }
}
