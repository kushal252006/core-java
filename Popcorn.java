class Popcorn {
    static void showDetails() {
String itemName = "ButterPop";
System.out.println("Item Name: " + itemName);
displayValue(50);
}
   static void displayValue(int value) {
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