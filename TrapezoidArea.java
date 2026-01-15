import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter length of first parallel side: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter length of second parallel side: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter height of trapezoid: ");
        double h = scanner.nextDouble();
        
        // Calculating area
        double area = h * (a + b) / 2;
        
        // Printing result
        System.out.println("Area of Trapezoid: " + area);
    }
}
