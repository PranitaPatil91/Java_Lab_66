import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactPhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String command;

        System.out.println("=== Welcome to the Contact Phone Book ===");
        System.out.println("Available commands: add, search, list, quit");

        while (true) {
            System.out.print("\nEnter command: ");
            command = sc.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter contact name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();

                    if (phoneBook.containsKey(name)) {
                        System.out.println("Contact already exists. Updating number...");
                    }
                    phoneBook.put(name, number);
                    System.out.println("Contact saved successfully!");
                    break;

                case "search":
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();

                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Phone Number of " + searchName + ": " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case "list":
                    if (phoneBook.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("\n=== All Contacts ===");
                        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                            System.out.println("Name: " + entry.getKey() + " | Phone: " + entry.getValue());
                        }
                    }
                    break;

                case "quit":
                    System.out.println("Exiting Phone Book. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command! Please enter add, search, list, or quit.");
            }
        }
    }
}
