import java.util.Arrays;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Number 1 :");
       int num1 = scanner.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2 = scanner.nextInt();
        int mid = num1 + (num2 - num1) / 2;
        System.out.println(mid);


    }
}
