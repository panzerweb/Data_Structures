/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.data_structures;

import java.util.Arrays;
import java.util.Scanner;
import stack_dsa.Stacks;
/**
 *
 * @author Admin
 */
public class Stacks_Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stacks stackOp = new Stacks();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many words to be inputted: ");
        int wordCount = sc.nextInt();
        sc.nextLine();
        System.out.println(wordCount);

        // User enters 3 words
        for (int i = 0; i < wordCount; i++) {
            System.out.print("ENTER WORD: ");
            String inputWord = sc.nextLine();
            stackOp.pushOperation(inputWord);
        }
        
        stackOp.displayStack(); 
        
        while (true) {            
            if (stackOp.emptyStack()) {
                System.out.println("No more elements to undo. Stopping...");
                break;
            }
            System.out.println("Enter 1 to undo | 2 to Stop: ");
            int removeElement = sc.nextInt();

            if (removeElement == 1) {
                System.out.println(stackOp.undoOperation());
            }
            else if (removeElement == 2){
                break;
            }

            stackOp.displayStack();
        }
    }
    
}
