import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter original selling price: ");
        double originalPrice = scanner.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();
        
        // Calculating discounted price
        double discountedPrice = originalPrice - (originalPrice * discount / 100);
        
        // Printing result
        System.out.println("Discounted Selling Price: " + discountedPrice);
    }
}
