
package infix_to_postfix;

public class InfixToPostfix {

    public static void main(String[] args) {
        // TODO code application logic OUT  
        //A * B – (C + D ) + E
        String[] expression = {"a", "+", "b", "*", "(", "c", "^", "d", "-", "e", ")", "^", "(", "f", "+", "g", "*", "h", ")", "-", "i"};
        System.out.println("Result of Infix to Postix: "+ InfixToPostfix(expression));
        
    }
    
    public static String InfixToPostfix(String[] arr){
        Stacks ipStack = new Stacks();
        StringBuilder postFix = new StringBuilder();

        try {
            //Initialize and add '(' to stack
            ipStack.push("(");

            //Increase array size by 1 to add ")" at the end of expression
            String[] expression = new String[arr.length + 1];
            System.arraycopy(arr, 0, expression, 0, arr.length);
            expression[arr.length] = ")";

            for (String scannedSymbol : expression) {
                if(scannedSymbol.matches("^[a-zA-Z]*$")){
                    postFix.append(scannedSymbol);
                }
                else if(scannedSymbol.equals("(")){
                    ipStack.push(scannedSymbol);
                }
                else if(scannedSymbol.equals(")")){
                    while(!ipStack.isEmpty() && !ipStack.peek().equals("(")){
                        postFix.append(ipStack.pop());
                    }
                     if (!ipStack.isEmpty()) ipStack.pop();
                }
                else {
                    while(!ipStack.isEmpty() && (OperatorPrecedence(ipStack.peek())) > OperatorPrecedence(scannedSymbol)
                                            || (OperatorPrecedence(ipStack.peek())) == OperatorPrecedence(scannedSymbol) && !scannedSymbol.equals("^")){
                        postFix.append(ipStack.pop());
                    }
                    ipStack.push(scannedSymbol);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return postFix.toString();
    }
    
    public static int OperatorPrecedence(String operator){
        if(operator == "^"){
            return 3;
        }
        else if(operator == "*" || operator == "/"){
            return 2;
        }
        else if(operator == "-" || operator == "+"){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    //Linked-list based Stack
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
