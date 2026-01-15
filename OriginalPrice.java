import java.util.Scanner;

public class OriginalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter discounted selling price: ");
        double discountedPrice = scanner.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();
        
        // Calculating original price
        double originalPrice = discountedPrice / (1 - discount / 100);
        
        // Printing result
        System.out.println("Original Selling Price: " + originalPrice);
    }
}
