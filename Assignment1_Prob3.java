import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter three scores: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
double average = (a + b + c) / 3.0;

        System.out.println(Math.round(average));
        System.out.printf("%.2f%n", average);

        input.close();
    }
}
