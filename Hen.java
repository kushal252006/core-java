class Hen {
    static void showHenDetails() {
String breed = "Leghorn";
System.out.println("Hen breed: " + breed);
displayEggCount(6);
}

    static void displayEggCount(int eggsLaid) {
System.out.println("Number of eggs laid: " + eggsLaid);
boolean isHealthy = checkHealth();
        System.out.println("Is the hen healthy: " + isHealthy);
}

    static boolean checkHealth() {
boolean healthStatus = true;
System.out.println("Health status: " + healthStatus);
return healthStatus;
}
}