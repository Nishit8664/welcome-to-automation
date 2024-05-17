package automation_test;

/**
 * 4.1 Create the class with the name "ForLoop_Q4"
 * 4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
 * 4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
 * 4.4	Create the main method
 * 4.5 Create the Object and call the 'printMyName' method into the main method.
 * <p>
 * Output
 * howManyTime = 10 it will print your name 10 times
 * howManyTime = 15 it will print your name 15 times
 */
public class ForLoop_Q4 {
    public static void main(String[] args) {
        ForLoop_Q4 obj1 = new ForLoop_Q4();
        obj1.printMyName("Nishit Chitaliya", 10);
        System.out.println("--------------------------------------------");
        obj1.printMyName("Nishit Chitaliya", 15);
    }

    public void printMyName(String name, int howManyTime) {
        for (int i = 0; i < howManyTime; i++) {
            System.out.println(name);
        }
    }
}
