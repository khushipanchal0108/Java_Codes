import java.util.ArrayList;

public class Growable_stk implements Interface_STK {
    private ArrayList<Integer> stack;
    private int top;

    public Growable_stk() {
        this.stack = new ArrayList<>(5); // Initial capacity of 5
        this.top = -1; // Initialize top as -1 to indicate the stack is empty
    }

   @Override
   public void push(int element) {
       // Since top is initially -1, we increment it first to ensure the element is added at index 0 for the first push
       top++;
       // Directly add the element at the position top. No need to check for overflow due to ArrayList's dynamic resizing
       stack.add(top, element);

       System.out.println("Pushed element: " + element + ". Size: " + size());
   }

    @Override
    public int pop() {
        if (isUnderflow())
        {
            System.out.println("Stack is Empty");
            return -1; // Return -1 or another sentinel value to indicate the stack was empty
        } else
        {
            int element = stack.remove(top); // Remove the element at the top
            top--; // Decrement top since we've just removed the top element
            System.out.println("Popped element: " + element + ". Size: " + size());
            return element;
        }
    }

    @Override
    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack.get(i));
        }
    }

    @Override
    public boolean isOverflow() {
        // In case of ArrayList, overflow does not happen as it grows dynamically.
        // This method might not be needed but kept for interface compliance.
        System.out.println("Overflow Not possible in growable stack ");
        return false;
    }

    @Override
    public boolean isUnderflow() {
        if(top==-1)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        return stack.size();// Size is always top + 1 because top starts from -1
    }
}
