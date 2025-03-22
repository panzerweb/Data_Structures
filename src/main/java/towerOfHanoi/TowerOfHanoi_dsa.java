
package towerOfHanoi;

import java.util.Scanner;

public class TowerOfHanoi_dsa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of inputs: ");
        int n = sc.nextInt();
        TowerOfHanoi(n, 'A', 'B', 'C');
    }
    public static void TowerOfHanoi(int n, char beg, char aux, char end){
        if(n == 1){
            System.out.println("(Base case) Move Rod " + n + " from Rod " + beg + " to Rod " + end);
            return;
        }
        else{
            TowerOfHanoi(n-1, beg, end, aux);
            System.out.println("(Larger Disks than Rod 1) Move Rod " + n + " from Rod " + beg + " to Rod " + end);
            TowerOfHanoi(n-1, aux, beg, end);
        }
    }
}
