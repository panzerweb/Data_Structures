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
public class Stacks_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stacks stackOp = new Stacks();
        Scanner sc = new Scanner(System.in);
        
        while (true) {           
            System.out.println("Input 1 to Enter System");
            int systemStart = sc.nextInt();
            
            if (systemStart == 1) {
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
                    System.out.println("Enter 1 to undo | 2 to Stop | 3 to Search: ");
                    int removeElement = sc.nextInt();

                    if (removeElement == 1) {
                        System.out.println(stackOp.undoOperation());
                    }
                    else if (removeElement == 2){
                        stackOp.displayStack();
                        break;
                    }
                    else if (removeElement == 3){
                        System.out.print("Search from Stack: ");
                        String target = sc.nextLine();
                        stackOp.searchStack(target);
                        System.out.println("Element Searched: " + target);
                    }

                    stackOp.displayStack();
                }
            }
            else{
                break;
            }
      
        }
    }
    
}
