// Find the largest of 3 numbers
// Code By :- Prof. Shiburaj

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        System.out.print("Enter a number:");
        int b = scanner.nextInt();
        System.out.print("Enter a number:");
        int c = scanner.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is: " + a);
        }else if(b>a && b>c){
            System.out.println("The largest number is: " + b);
        }else{
            System.out.println("The largest number is: " + c);
        }


        scanner.close();
    }
}
