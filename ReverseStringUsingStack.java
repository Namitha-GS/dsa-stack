class Solution {
    
    public String reverse(String s){
       if(s.length() == 0){
           return null;
       }
       Stack<Character> stack = new Stack<>();
       for(int i=0; i<s.length(); i++){
           stack.push(s.charAt(i));
       }
       String res = "";
       while(!stack.empty()){
           res += stack.pop();
       }
       return res;
       
    }

}

/* or */

private static char[] stringrev(char[] str)
{
    if(str.length == 0){
        return null;
    }
    for(int i=0; i<str.length; i++){
        push(str[i]);
    }
    for(int i=0; i<str.length; i++){
        str[i] = pop();
    }
    return str;

}
