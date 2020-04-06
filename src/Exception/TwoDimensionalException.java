package Exception;
import java.util.Scanner;

public class TwoDimensionalException {
    public static void main(String[] args) {
       String arr[][] = {{"Java", "OOP", "OCA"}, {"Polymorphism","Inheritance"},{"Interface"}};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = scan.nextInt();
        System.out.print("Enter second number : ");
        int second = scan.nextInt();
        try {
            System.out.println(arr[first][second]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Try again ");
        }
    }
}
