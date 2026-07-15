import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;
        // char[] arr = new char[s.length()];
        // int top = 0;
        // int i;
        // int extra_closing_brackets = 0;
        // for (i = 0; i<s.length();i++){
        // if(top==0 && (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) ==
        // ')')){
        // extra_closing_brackets++;
        // }
        // if(top>0 && s.charAt(i) == '}' && i>0){
        // if(top>0 && arr[top-1] == '{'){
        // top--;
        // }
        // else return false;
        // }
        // if(top>0 && s.charAt(i) == ']' && i>0){
        // if(arr[top-1] == '['){
        // top--;
        // } else return false;
        // }
        // if(top>0 && s.charAt(i) == ')' && i>0){
        // if(arr[top-1] == '('){
        // top--;
        // } else return false;
        // }

        // if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
        // arr[top] = s.charAt(i);
        // top++;
        // }}
        // if(top==0 && extra_closing_brackets==0) return true;
        // return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            }

            else if (stack.isEmpty() || s.charAt(i) != stack.pop())
                return false;
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}