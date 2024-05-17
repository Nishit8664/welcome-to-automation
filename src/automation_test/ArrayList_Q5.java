package automation_test;

import java.util.ArrayList;

/**
 * 5.1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 * <p>
 * Output
 * Scrum
 * Java
 * Jira
 * Selenium
 * Cucumber
 * Postman
 * Rest Assured
 */
public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> q5 = new ArrayList<>();
        q5.add("Scrum");
        q5.add("Java");
        q5.add("Jira");
        q5.add("Selenium");
        q5.add("Cucumber");
        q5.add("Postman");
        q5.add("Rest Assured");

        for (String abc : q5) {
            System.out.println(abc);
        }
    }
}
