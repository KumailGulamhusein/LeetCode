#class Solution {
    public boolean isValid(String s) {

    Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++ ){
            
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{'){
                myStack.push(c);
            }
            else if (myStack.isEmpty()){
                return false;
            }
            else if (c == ')' && myStack.peek() == '('){
                myStack.pop();
            }
            else if (c == ']' && myStack.peek() == '['){
                myStack.pop();
            }
            else if (c == '}' && myStack.peek() == '{'){
                myStack.pop();
            }
            else {
                return false;
            }
        }
        return myStack.isEmpty();
    }
}