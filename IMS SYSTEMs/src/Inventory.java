import java.util.ArrayList;
public class Inventory {
    private ArrayList<Item> items;
    public Inventory() {
        items = new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }
    public void updateItem(String itemName, int quantity, double price) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(quantity);
                item.setPrice(price);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items) {
                item.displayDetails();
                System.out.println("-------------------------");
            }
        }
    }
}

