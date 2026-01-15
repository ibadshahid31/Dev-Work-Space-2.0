import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// IT WAS A THRILL TO MAKE THIS
        // Taking input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Checking even or odd
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}

