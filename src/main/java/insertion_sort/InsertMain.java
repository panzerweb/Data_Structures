/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertion_sort;

import java.util.Arrays;

/**
 *
 * @author Panzer
 */
public class InsertMain {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        int[] arr = {23,1,10,5,3};
        
        insertSort(arr);
        for (int integer : arr) {
            System.out.print(integer + " ");
        }
        
    }
    public static int insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            System.out.print("Index of I: " + i + ", ");
            System.out.println();
            System.out.print("Index of J: " + j + ", ");
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;    
            }
            arr[j + 1] = temp;      
        }
        return 0;
    }
}
