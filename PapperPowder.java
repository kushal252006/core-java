class PapperPowder {
    static void showItem() {
    String itemName = "Pepper Powder";
System.out.println("Item name is: " + itemName);
        displayPrice(120.5);
    }
    static void displayPrice(double price) {
System.out.println("Price of item: " + price);
String supplierName = fetchSupplier();
System.out.println("Supplier returned: " + supplierName);
    }
    static String fetchSupplier() {
String supplier = "FreshSpices Ltd";
return supplier;
    }
}