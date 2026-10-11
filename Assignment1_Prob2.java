import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
final double TAX_RATE = 0.14;

        System.out.print("Enter unit price: ");
        double price = input.nextDouble();
System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
double subtotal = price * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
System.out.printf("Subtotal = %.2f, Tax = %.2f, Total = %.2f%n", subtotal, tax, total);

        input.close();
    }
}
