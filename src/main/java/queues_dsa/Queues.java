/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queues_dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Panzer
 */
public class Queues {
    public Queue<String> myQueue = new LinkedList<String>();
    public Stack<String> myStack = new Stack<String>();
    
    public Queue<Integer> intQueue = new LinkedList<Integer>();
    public Stack<Integer> intStack = new Stack<Integer>();
    
    //String Operations
    public String enqueueString(String word){
        myQueue.offer(word);
        
        return myQueue.toString();
    }
    public String dequeueString(){
        if (myQueue.isEmpty()) {
            System.out.println("Queue List is empty");
        }
        myQueue.poll();
        
        return myQueue.toString();
    }
    public String reverseStringOrder(){
        while (!myQueue.isEmpty()) {            
            String polledQueue = myQueue.poll();
            myStack.add(polledQueue);
        }
        while (!myStack.isEmpty()) {            
            String removedStack = myStack.pop();
            myQueue.offer(removedStack);
        }
        return myQueue.toString();
    }
    public String palindromeCheck(String word){
        char ch;
        String reverse = "";
        String original = word;
        for (int i = 0; i < word.length(); i++) {
            //Extract each character
            ch = word.charAt(i);
            //Add the characters into the reverse
            reverse = ch + reverse;
        }
        
        if (reverse.equals(original)) {
            System.out.println(reverse + " is equal to " + original);
        }else{
            System.out.println(reverse + " is not equal to " + original);
        }

        return "";
    }
    
    //Integer Operations
    public Queue<Integer> enqueueInteger(int number){
        intQueue.offer(number);
        
        return intQueue;
    }
    public int dequeueInteger(){        
        return intQueue.poll();
    }
    public Queue<Integer> reverseIntOrder(){
        while (!intQueue.isEmpty()) {            
            int queueInt = intQueue.poll();
            intStack.add(queueInt);
        }
        while(!intStack.isEmpty()){
            int stackInt = intStack.pop();
            intQueue.offer(stackInt);
        }
        return intQueue;
    }
}
