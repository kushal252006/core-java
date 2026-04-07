class Butter {
static void showDetails() {
String productName = "CreamyButter";
System.out.println("Product Name: " + productName);
displayValue(250.75f);
}
static void displayValue(float weight) {
System.out.println("Weight (grams): " + weight);
String status = checkStatus();
System.out.println("Availability: " + status);
}
static String checkStatus() {
String status = "In Stock";
System.out.println("Status: " + status);
return status;
}
}
