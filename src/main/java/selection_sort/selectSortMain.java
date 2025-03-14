/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection_sort;

/**
 *
 * @author Panzer
 */
public class selectSortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {9,5,7,4};
        
        selectSort(arr);
        
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
    
    public static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int smallestValue = arr[min];
            arr[min] = arr[i];
            arr[i] = smallestValue;
        }
        return arr;
    }
    
}
