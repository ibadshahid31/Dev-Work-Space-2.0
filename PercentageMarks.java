import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        
        System.out.print("Enter maximum marks: ");
        double maxMarks = scanner.nextDouble();
        
        // Calculating percentage
        double percentage = (obtainedMarks / maxMarks) * 100;
        
        // Printing result
        System.out.println("Percentage: " + percentage + "%");
    }
}
