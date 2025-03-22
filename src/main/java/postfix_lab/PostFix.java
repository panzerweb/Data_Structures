
package postfix_lab;

public class PostFix {

    public static void main(String[] args) {
        String[] expression = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println("Result:" + evaluatePostFix(expression));

    }
    
    public static int evaluatePostFix(String[] arr){
        Stacks pfStack = new Stacks();
        
        for(String pfValue: arr){
            //If postfix value is a number, then push on the stack
            if(pfValue.matches("-?\\d+")){
                pfStack.push((pfValue));
            }
            // postfix value is an operator, then pop 2 pfValues and evaluate
            else{
                int operand1 = Integer.parseInt(pfStack.pop());
                int operand2 = Integer.parseInt(pfStack.pop());
                
                switch (pfValue) {
                    case "+":
                        pfStack.push(String.valueOf(operand2 + operand1));
                        break;
                    case "-":
                        pfStack.push(String.valueOf(operand2 - operand1));
                        break;
                    case "*":
                        pfStack.push(String.valueOf(operand2 * operand1));
                        break;
                    case "/":
                        pfStack.push(String.valueOf(operand2 / operand1));
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        return Integer.parseInt(pfStack.pop());
    }
    public static class Stacks{
        private static class Node{
            private String data;
            private Node pointer;
            private Node(String data){
                this.data = data;
            }
        }
        private Node top;
        
        public boolean isEmpty(){
            return top == null;
        }
        
        public String peek(){
            if(top == null){
                throw new IllegalStateException("Stack is empty");
            }
            return top.data;
        }
        
        public void push(String data){
            Node node = new Node(data);
            node.pointer = top;
            top = node;
           
        }
        public String pop(){
            if(top == null){
                throw new IllegalStateException("Stack is empty");
            }
            String data = top.data;
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
