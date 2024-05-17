package automation_test;

/**
 * 3.1 Create the class with the name "IfThenElse_Q3"
 * 3.2 Create a method with the name "isTeen" with a boolean return type and one parameter with type int and name "age".
 * 3.3 Write the logic into the "isTeen" method. if the age is less than or equal to 18 then return 'true'
 * else return 'false'.
 * 3.4 Create the main method
 * 3.5 Create the Object and call the 'isTeen' method inside the sout statement.
 * <p>
 * Output
 * 15  - true
 * 25  - false
 */
public class IfThenElse_Q3 {
    public static void main(String[] args) {
        IfThenElse_Q3 obj1 = new IfThenElse_Q3();
        System.out.println("15 - " + obj1.isTeen(15));
        System.out.println("25 - " + obj1.isTeen(25));
    }

    public boolean isTeen(int age) {
        if (age <= 18) {
            return true;
        } else {
            return false;
        }
    }
}
