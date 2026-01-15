import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();
        
        // Calculating semi-perimeter
        double s = (a + b + c) / 2;
        
        // Using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        // Printing result
        System.out.println("Area of the triangle: " + area);
    }
}
