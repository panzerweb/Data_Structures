/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linear_search;

/**
 *
 * @author Panzer
 */
public class LinearSearch {
    //My Best time for Linear Search = 1 minute 43 seconds
    //Create Method for linearSearch(arr[], target)
    public int linearSearch(int arr[], int target){
        int i = 0;
        while (i <=  arr.length) {            
            i++;
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    //Default return statement: return -1
}

