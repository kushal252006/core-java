class Earth {
static void showDetails() {
String planetName = "Earth";
System.out.println("Planet Name: " + planetName);
displayValue(12742.0);
}

static void displayValue(double diameter) {
System.out.println("Diameter (km): " + diameter);
String status = checkStatus();
System.out.println("Habitability Status: " + status);
}

static String checkStatus() {
String status = "Habitable";
System.out.println("Status: " + status);
return status;
}
}