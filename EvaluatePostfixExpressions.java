static int postfixEval(String s)
{
    Stack<Integer> stack = new Stack<>();
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            stack.push(s.charAt(i)-'0');
        } else {
           int x = stack.pop();
           int y = stack.pop();
           switch(s.charAt(i)){
               case '+':
                 stack.push(y + x);
                 break;
               case '-':
                 stack.push(y - x);
                 break;
               case '*':
                 stack.push(y * x);
                 break;
               case '/':
                 stack.push(y / x);
           }
        }
    }
    return stack.pop();

}
