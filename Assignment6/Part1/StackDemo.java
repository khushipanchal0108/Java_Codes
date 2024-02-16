public class StackDemo
{
    public static void main(String[] args)
    {
        int stack[]=new int[5];
        int t=-1;
        /*Fixed_stk fixed_stk=new Fixed_stk(stack,t);
        fixed_stk.push(1);
        fixed_stk.push(2);
        fixed_stk.push(3);
        fixed_stk.displayStack();
        System.out.println("Popped Element "+ fixed_stk.pop());*/

        Growable_stk grow_stk=new Growable_stk();
        grow_stk.push(1);
        grow_stk.size();

        grow_stk.push(2);
        grow_stk.size();

        grow_stk.push(3);
        grow_stk.size();

        grow_stk.push(4);
        grow_stk.size();

        grow_stk.push(5);
        grow_stk.displayStack();
        grow_stk.size();

        grow_stk.pop();
    }
}
