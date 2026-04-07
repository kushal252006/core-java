class KababPowder {
    static void showMixDetails() {
        String mixName = "Kabab Powder";
        System.out.println("Mix name is: " + mixName);
        displaySpiceCount(7);
    }
    static void displaySpiceCount(int count) {
        System.out.println("Number of spices used: " + count);
        boolean isPremium = checkQuality();
        System.out.println("Is premium quality: " + isPremium);
    }
    static boolean checkQuality() {
        boolean quality = true;
        System.out.println("Checking quality: " + quality);
        return quality;
    }
}