/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_queues;

/**
 *
 * @author Panzer
 */
public class Stacks_refresh {

    public static void main(String[] args) {
        Stacks myStack = new Stacks();
        
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        
        System.out.println("Stacks:");
        myStack.show();
        
    }
    public static class Stacks{
        private static class Node{
            private int data;
            private Node pointer;
            private Node(int data){
                this.data = data;
            }
        }
        private Node top;
        
        public boolean isEmpty(){
            return top == null;
        }
        
        public int peek(){
            if(top == null){
                throw new IllegalStateException("Stack is empty");
            }
            return top.data;
        }
        
        public void push(int data){
            Node node = new Node(data);
            node.pointer = top;
            top = node;
        }
        public int remove(){
            if(top == null){
                throw new IllegalStateException("Stack is empty");
            }
            int data = top.data;
            top = top.pointer;
            return data;
        }
        public void show(){
            if(top == null){
                throw new IllegalStateException("Stack is empty");
            }
            Node current = top;
            while(current != null){
                System.out.println(current.data);
                current = current.pointer;
            }
        }
    }
    
}
