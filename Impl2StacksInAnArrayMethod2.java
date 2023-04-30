static int size = 6;
static int[] stack = new int[size];
static int top1 = -1;
static int top2 = size;


static void push1(int val)
{
    if(top1 == top2-1){
        return;
    }
    else{
        stack[++top1] = val;
    }
    
}

static void push2(int val)
{
    if(top2 == top1+1){
        return;
    }
    else{
        stack[--top2] = val;
    }
    
}

static int pop1()
{
   if(top1 == -1){
       return -1;
   }
   return stack[top1--];
    
}

static int pop2()
{
    if(top2 == size){
        return -1;
    }
    return stack[top2++];
}
