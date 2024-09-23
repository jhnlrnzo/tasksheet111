import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private int id;
    private int pin;
    private String firstName;
    private String lastName;
    private double balance;

    // Constructor
    public User(int id, int pin, String firstName, String lastName, double balance) {
        this.id = id;
        this.pin = pin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to add balance
    public void cashIn(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully added " + amount + " to your balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Method to transfer balance
    public boolean transfer(User receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            receiver.cashIn(amount);
            System.out.println("Successfully transferred " + amount + " to " + receiver.getFullName());
            return true;
        } else {
            System.out.println("Transfer failed. Insufficient funds or invalid amount.");
            return false;
        }
    }
}

public class BankingSystem {
    private static Map<Integer, User> userDatabase = new HashMap<>();
    private static User loggedUser = null;

    public static void main(String[] args) {
        // Sample users
        userDatabase.put(412435, new User(412435, 7452, "Chris", "Sandoval", 32000));
        userDatabase.put(264863, new User(264863, 1349, "Marc", "Yim", 1000));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Banking App!");
            System.out.print("Enter User ID: ");
            int userId = scanner.nextInt();
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            // User login
            if (login(userId, pin)) {
                System.out.println("Login successful! Welcome, " + loggedUser.getFullName());
                boolean exit = false;

                while (!exit) {
                    System.out.println("\nOptions: ");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Cash-In");
                    System.out.println("3. Money Transfer");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Your balance is: " + loggedUser.getBalance());
                            break;
                        case 2:
                            System.out.print("Enter amount to cash-in: ");
                            double amount = scanner.nextDouble();
                            loggedUser.cashIn(amount);
                            break;
                        case 3:
                            System.out.print("Enter User ID to transfer to: ");
                            int receiverId = scanner.nextInt();
                            System.out.print("Enter amount to transfer: ");
                            double transferAmount = scanner.nextDouble();
                            User receiver = userDatabase.get(receiverId);
                            if (receiver != null) {
                                loggedUser.transfer(receiver, transferAmount);
                            } else {
                                System.out.println("Receiver not found.");
                            }
                            break;
                        case 4:
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid User ID or PIN. Please try again.");
            }
        }
    }

    private static boolean login(int userId, int pin) {
        User user = userDatabase.get(userId);
        if (user != null && user.getPin() == pin) {
            loggedUser = user;
            return true;
        }
        return false;
    }
}

