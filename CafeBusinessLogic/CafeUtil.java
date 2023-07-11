// All methods will be in this file
import java.util.ArrayList;

public class CafeUtil {
    
    // STREAK GOAL
    public int getStreakGoal () {
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i;
        }
        return sum;
    }

    // STREAK GOAL -admin can change # to whatever they want
    public int getStreakGoal (int numWeeks) {
        int sum = 0;
        for(int i=1; i<=numWeeks; i++) {
            sum += i;
        }
        return sum;
    }


    // ORDER TOTAL
    public double getOrderTotal(double[]lineItems) {
        double sum = 0;
        for (int i=0; i<lineItems.length; i++) {
            sum = sum + lineItems[i];
        }
        return sum;
    }


    //DISPLAY MENU
    public void displayMenu(ArrayList<String>menuItems) {
        for ( int i=0; i<menuItems.size(); i++) {
        System.out.println(i + " " + menuItems.get(i));
        }
    }

    //ADD CUSTOMER
    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello," + " " + username);
        System.out.println("There are " + customers.size() + " people ahead of you.");
        // for(int i=0; i<=customers.size(); i++) {
        //     System.out.println(String.format("There are %s people in front of you", (i)));
        // }
        customers.add(username);
        System.out.println(customers);
    }


}