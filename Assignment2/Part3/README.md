This Java application is crafted to facilitate the conversion between an array and an ArrayList, incorporating the following components:

InputClass:
This class is designed to capture an array of integers from the user. It instructs the user to specify the quantity of elements in the array followed by the elements themselves. The method getArrayFromUser() then returns the array as entered by the user.

MainClass:
Functioning as the program's starting point, the MainClass retrieves an array from the user via the InputClass. It then employs methods from the ConversionClass to transform the array into an ArrayList and subsequently revert the ArrayList back into an array. The outcomes of these transformations are displayed to the user.

ConversionClass:
Houses static methods for the conversion processes: arrayToArrayList() for transforming an array into an ArrayList, and arrayListToArray() for converting an ArrayList back into an array.

Program Execution:
To run the application:

Compile all the Java files (MainClass.java, InputClass.java, and ConversionClass.java).
Execute the MainClass, which manages the entire conversion operation.
