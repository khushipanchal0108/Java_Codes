public class Fixed_stk implements Interface_STK
{

    private int stack[]=new int[5];
    int top;

    public Fixed_stk(int[] stack, int top) {
        this.stack = stack;
        this.top = top;
    }
    @Override
    public void push(int element)
    {
        if(isOverflow())
            System.out.println("Stack is full");

        top++;
        stack[top] = element;
        // stack[++top] = element;

    }

    @Override
    public int pop()
    {
        if(isUnderflow())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        int element=stack[top];
        top=top-1;
        return element;
    }

    @Override
    public void displayStack()
    {
        if(isUnderflow())
        {
            System.out.println("Stack is empty");
        }
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }

    @Override
    public boolean isOverflow()
    {
        if(top==(stack.length-1))
            return true;
        else
            return false;
    }

    @Override
    public boolean isUnderflow() {
        if(top==-1)
            return true;
        else
            return false;
    }
}
