class Oppo{
    static void showMobileDetails() {
        String modelName = "Oppo Reno";
        System.out.println("Mobile model is: " + modelName);
        displayStorage(128);
    }
    static void displayStorage(int storageGB) {
        System.out.println("Storage capacity (GB): " + storageGB);
        double price = getMobilePrice();
        System.out.println("Mobile price returned: " + price);
    }
    static double getMobilePrice() {
        double mobilePrice = 25999.99;
        System.out.println("Mobile price: " + mobilePrice);
        return mobilePrice;
    }
   }