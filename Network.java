class Network {
    static void showNetworkDetails() {
String networkName = "FastNet";
System.out.println("Network name: " + networkName);
displayBandwidth(100);
}

static void displayBandwidth(int mbps) {
System.out.println("Bandwidth (Mbps): " + mbps);
boolean isActive = checkNetworkStatus();
System.out.println("Is network active: " + isActive);
}
static boolean checkNetworkStatus() {
boolean status = true;
System.out.println("Network status: " + status);
return status;
}
}