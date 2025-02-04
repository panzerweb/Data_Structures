/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.data_structures;
import java.util.Scanner;
//Packages for laboratory exercises already imported
import linear_search.LinearSearch;
import binary_search.BinarySearch;
import java.util.ArrayList;
/**
 *
 * @author Panzer
 */
public class Data_Structures {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instantiate the packages
        BinarySearch bs = new BinarySearch();
//        LinearSearch ls = new LinearSearch();
        try {
            System.out.print("Add an array length: ");
            int arrayLength = sc.nextInt();
            System.out.print("How much to be multiplied: ");
            int multiplier = sc.nextInt();

            int arr[] = new int[arrayLength];

            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = (i + 1) * multiplier;
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
            System.out.println("Enter a target number");
            int target = sc.nextInt();


            System.out.println("Target: " + target);

            int result = bs.binarySearch(arr, target);
//            int result = ls.linearSearch(arr, target);

            if (result != -1) {
                System.out.println(target + " Element is found at index No. " + result);
            }
            else{
                System.out.println("Element Not Found");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
}
