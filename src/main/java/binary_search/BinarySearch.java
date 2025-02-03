/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_search;

import java.util.Arrays;

/**
 *
 * @author Panzer
 */
public class BinarySearch {
    //My Best time so far: Binary Search = 2 minutes 53 seconds
    //Create Method for binarySearch(arr[], target)
    public int binarySearch(int arr[], int target){
        int lowestValue = 0;
        int highestValue = arr.length - 1;

        while(lowestValue <= highestValue){
            int middleValue = lowestValue + (highestValue - lowestValue) / 2;
            System.out.println(" Middle Indexes: " + middleValue);
            
            if (arr[middleValue] < target) {
                lowestValue = middleValue + 1;
            }
            else if(arr[middleValue] > target){
                highestValue = middleValue - 1;
            }
            else{
                return middleValue;
            }
        }
        return -1;
    }

    //Default return statement: return -1
}
