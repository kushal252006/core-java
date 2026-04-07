class Lamp {
    static void showLampDetails() {
        String lampType = "LED Lamp";
        System.out.println("Lamp type is: " + lampType);
        displayWattage(12);
    }
    static void displayWattage(int watts) {
        System.out.println("Wattage of lamp: " + watts);
        boolean isEnergySaving = checkEnergySaving();
        System.out.println("Is energy saving: " + isEnergySaving);
    }
    static boolean checkEnergySaving() {
        boolean status = true;
        System.out.println("Energy saving status: " + status);
        return status;
    }
    public static void main(String[] args) {
        showLampDetails();
    }
}