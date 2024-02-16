**Java Stack Project**
This project shows how to create stack structures in Java. It has versions for stacks that have a set size and stacks that can grow, along with examples on how to use interfaces.

**Interfaces**
**Interface_STK**
Lists the actions for a stack, like adding, removing, showing the stack, checking if it's full, and checking if it's empty. Both the Fixed_stk and Growable_stk classes use this interface to make sure they can do these stack actions.

**Interface1**
A basic interface with two methods, method1 and method2, to show how interfaces work in Java. This isn't about stacks but helps understand interfaces better.

**Classes**
**Student**
This class is about a student, with a unique PRN, name, and grades. It's a simple model for showing how things can work.

**Fixed_stk**
Follows the Interface_STK to make a stack that doesn't change size. It stores items in an array and has ways to add, remove, and show items. It also checks if the stack is too full or empty, based on its set size.

**Growable_stk**
This also uses Interface_STK but makes a stack that can get bigger using ArrayList. It shows how a stack can adjust its size to fit more items and avoid being too full. It does similar things as Fixed_stk but with the flexibility of changing size.

**Interface_implementation**
Shows how to use the methods from Interface1. It gives simple ways to do method1 and method2, like writing messages.

**InterfaceDemo**
A class to show how Interface_implementation works. It makes an instance of Interface_implementation and uses its methods to demonstrate interface methods in action.

**StackDemo**
The main class for showing how stacks work. It has examples for using both the Fixed_stk and Growable_stk, like adding and removing items and showing the stack. It displays using stacks with a set size and stacks that can grow in Java programs.
