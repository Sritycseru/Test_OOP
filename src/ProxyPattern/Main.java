package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.processOrder("ProductA", 50);
        warehouse.processOrder("ProductB", 60); // This order will fail due to insufficient inventory

        int availableProductA = warehouse.checkInventory("ProductA");
        System.out.println("Available quantity of ProductA: " + availableProductA);

        int availableProductC = warehouse.checkInventory("ProductC"); // Assuming ProductC doesn't exist
        System.out.println("Available quantity of ProductC: " + availableProductC); // It will print 0

        // You might have further code to test various scenarios and handle potential errors or issues.
    }
}
