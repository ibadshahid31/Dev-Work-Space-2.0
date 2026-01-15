import java.util.Scanner;

public class PowerConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter voltage (V): ");
        double voltage = scanner.nextDouble();
        
        System.out.print("Enter current (A): ");
        double current = scanner.nextDouble();
        
        // Calculating watts
        double watts = voltage * current;
        
        // Printing result
        System.out.println("Power Consumption (Watts): " + watts);
    }
}
