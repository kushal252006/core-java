class Star {
    static void showDetails() {
        String starName = "Polaris";
        System.out.println("Star Name: " + starName);
        displayValue('A');
}
static void displayValue(char brightnessLevel) {
System.out.println("Brightness Level: " + brightnessLevel);
String status = checkStatus();
		System.out.println("Observation Status: " + status);
    }

    static String checkStatus() {
String status = "Visible";
System.out.println("Status: " + status);
return status;
    }
}