class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && isMatching(stack.peek(),s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    boolean isMatching(char a, char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }    
}