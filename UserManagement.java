// Importing the PrintStream class for printing the output
import java.io.PrintStream;

// Class to load the native library and declare native methods
public class UserManagement {
    // Private static field to store the PrintStream object for printing output
    private static PrintStream out = System.out;

    // public method to print a string to the console
    public static void print(String k) {
        out.println(k);
    }

    // Static block to load the native library
    static {
        System.loadLibrary("UserManagement");
    }

    // Native method to add a user
    public native void addUser(String phNo, String name);

    // Native method to display all users
    public native void displayUsers();

    // Native method to remove a user
    public native void removeUser(String phNo);

    // Native method to add an order for a user
    public native void addOrderForUser(String phNo, int otp, String serviceName);

    // Native method to display orders for a user
    public native void displayOrdersForUser(String phNo);

    // Native method to remove an order from a user
    public native void removeOrderFromUser(String phNo, int index);

    // Native method to modify the OTP of an order
    public native void modifyOrderOtp(String phNo, int orderID, int newOTP);

    // Native method to modify the service name of an order
    public native void modifyOrderServiceName(String phNo, int orderID, String serviceName);

    // Native method to display all orders
    public native void displayAllOrders();

    // Native method to search for a user by phone number
    public native void searchByPhNo(String phNo);

    // Native method to load orders from a file
    public native void loadOrdersFromFile();
}