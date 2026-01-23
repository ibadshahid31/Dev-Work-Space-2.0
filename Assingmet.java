import java.util.Scanner; // Import statement correct kar diya
public class Assingmet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object banaya

        System.out.println("ENTER THE INTEGER NUMBER");
        int a = sc.nextInt(); // User se integer input liya

        while (a<0) { // Loop tab tak chalega jab tak a negative hai
            System.out.println("PLEASE ENTER A POSITIVE INTEGER");

            a = sc.nextInt(); // User se fir se input liya
        }
        while (a>0){

            System.out.println("counting down: " + a);
            a--;
        }
    }

}
