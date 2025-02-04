/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_dsa;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Stacks {
    public Stack<String> elementStack = new Stack<>();

    public String stackOperation(){
        Stack<String> animals = new Stack<>();

        // Add elements to Stack
        animals.push("A");
        animals.push("B");
        animals.push("C");
        
        System.out.println("Elements: " + animals);
        
        System.out.println("Top Element: " + animals.peek());
        
        System.out.println("Is the stack empty: " + animals.empty());
        
        String removedElement = animals.pop();
        
        System.out.println("Remaining Elements: " + animals);
        System.out.println("Removed Elements: " + removedElement);
        System.out.println("====================================");
        
        Object elements[] = animals.toArray();
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Removed: " + animals.pop());
        }
        System.out.println("Remaining Elements: " + animals);
        System.out.println("Is the stack empty: " + animals.empty());


        
        return "Working...";
    }
    
    public String pushOperation(String words){
        elementStack.push(words);
        
        return elementStack.toString();
    }
    
    public String undoOperation(){
        String removedElement = elementStack.pop(); // Remove last element
        return "Elements Removed: " + removedElement;
    }
    
      // Display stack elements
    public void displayStack() {
        System.out.println("Current Stack: " + elementStack);
    }
    public boolean emptyStack(){
        return elementStack.empty();
    }
    
}
