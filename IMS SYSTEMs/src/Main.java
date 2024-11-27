//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        boolean running = true;
        while (running) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    Item item = new Item(name, quantity, price);
                    inventory.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter item name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    inventory.updateItem(name, quantity, price);
                    break;
                case 3:
                    inventory.displayInventory();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

