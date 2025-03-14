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
    
    public String searchStack(String word){
        elementStack.search(word);
        
        return elementStack.toString();
    }
    
}
