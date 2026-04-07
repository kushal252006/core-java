class Mango {
    static void showDetails() {
        String itemName = "GoldenFruit";
        System.out.println("Item Name: " + itemName);
        displayValue(120);
    }
    static void displayValue(int value) {
        System.out.println("Value: " + value);
        boolean isAvailable = checkStatus();
        System.out.println("Is available: " + isAvailable);
    }
    static boolean checkStatus() {
        boolean status = false;
        System.out.println("Status: " + status);
        return status;
    }
}