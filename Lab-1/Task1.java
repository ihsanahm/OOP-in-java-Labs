import java.util.Scanner;

public class Qone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        float num3;
        
        System.out.print("Enter the first integer: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        num2 = sc.nextInt();
        
        System.out.print("Enter the float number: ");
        num3 = sc.nextFloat();
        
        System.out.println("First integer number is: " + num1 + ", Second integer number is: " + num2 + ", Float number is: " + num3);
    }
}
