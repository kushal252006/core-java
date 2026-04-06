class BazaarNowRun{
 public static void main(String[] args) {

        double price = BazaarNow.setInfo("Pizza");
        System.out.println("Price of one item: " + price);
        double total = BazaarNow.setInfo("Pizza", price, 2);
        System.out.println("Total bill: " + total);
    }
}