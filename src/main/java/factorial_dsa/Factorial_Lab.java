
package factorial_dsa;

import java.util.Scanner;

public class Factorial_Lab {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to factorial:");
//        int fac = factorial(sc.nextInt());
        int fac = factorial(10);
        System.out.println(fac);
    }
    
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number *= factorial(number - 1);
    }
}
