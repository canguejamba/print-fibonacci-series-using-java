package numbers_theory;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of number : ");
        int a = 0;
        int b = 1;
        int number = scanner.nextInt();
        System.out.println("Fibonacci Series : ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int index = number; index >= 3;  index--){
            int c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
        }
    }
}

//enter the value of number :
//  5
// Fibonacci Series
//output-: 0 1 1 2 3