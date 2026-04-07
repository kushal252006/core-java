class Sun {
static void showDetails() {
String itemName = "SolarFlare";
System.out.println("Item Name: " + itemName);
displayValue(99.9);
    }
static void displayValue(double value) {
        System.out.println("Value: " + value);
boolean isAvailable = checkStatus();
System.out.println("Is available: " + isAvailable);
}
    static boolean checkStatus() {
boolean status = true;
System.out.println("Status: " + status);
       return status;
    }
	}