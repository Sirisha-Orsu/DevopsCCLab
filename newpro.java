public class GreatestNumber {

    public static void main(String[] args) {
        // Declare and initialize three integer variables
        int num1 = 25;
        int num2 = 78;
        int num3 = 42;

        // Use if-else if-else statements to find the greatest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }
}