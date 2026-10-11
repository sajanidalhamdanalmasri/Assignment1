import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter number of days: ");
        int days = input.nextInt();

        int weeks = days / 7;
        int remainingDays = days % 7;
System.out.println(weeks + " weeks and " + remainingDays + " days");

        input.close();
    }
}
