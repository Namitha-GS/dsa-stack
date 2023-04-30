static boolean ispar(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if((s.charAt(i) == ']' && top != '[') ||
                    (s.charAt(i) == ')' && top != '(') ||
                    (s.charAt(i) == '}' && top != '{')) {
                        return false;
                }
            }
            
        }
        return stack.empty();
    }

/* or */

static boolean isBalanced(char[] str)
{
   for(int i=0; i<str.length; i++){
       if(str[i] == '(' || str[i] == '{' || str[i] == '['){
           push(str[i]);
       }
       else{
           if(isStackEmpty()){
               return false;
           }
           char top = pop();
           if((str[i] == ']' && top != '[') || 
              (str[i] == ')' && top != '(') ||
              (str[i] == '}' && top != '{')){
                  return false;
            }
       }
   } 
   return isStackEmpty();
    
}
