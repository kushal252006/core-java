class ZomatosRun{
public static void main(String[] args) {
        float price = Zomato.checkDetails("Pizza");
        System.out.println("Price of one dish: " + price);
        float total = Zomato.checkDetails("Pizza", price, 3f);
        System.out.println("Total amount: " + total);
    }
}