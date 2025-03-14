/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.data_structures;

import java.util.LinkedList;
import queues_dsa.Queues;
import queues_dsa.Queues;

/**
 *
 * @author Panzer
 */
public class Queues_Main {

   
    public static void main(String[] args) {
        Queues thisQueue = new Queues();
        
        //String Operations
        System.out.println(thisQueue.enqueueString("Romeo Selwyn"));
        System.out.println(thisQueue.enqueueString("Villar"));
        
        //Reverse Elements
        System.out.println("Reverse Order: " + thisQueue.reverseStringOrder());
        
        //Check string if Palindrome
        System.out.println(thisQueue.palindromeCheck("Romeo"));
        
       //Integer Operations
        System.out.println(thisQueue.enqueueInteger(1));
        System.out.println(thisQueue.enqueueInteger(2));
        System.out.println(thisQueue.enqueueInteger(3));
        System.out.println(thisQueue.enqueueInteger(4));
        
        System.out.println("Reverse Order: " + thisQueue.reverseIntOrder());
        


    }
    
}
