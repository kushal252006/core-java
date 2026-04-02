class WynkMusicRunner {
    public static void main(String[] args) {
        WynkMusic w1 = new WynkMusic("Rahul");
        w1.showDetails();
        WynkMusic w2 = new WynkMusic("Sneha", 50, true);
        w2.showDetails();
        WynkMusic w3 = new WynkMusic("Vikram", 120, false, 5000L, 1500.75, 'H');
        w3.showDetails();
    }
}