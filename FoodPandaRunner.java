class FoodPandaRunner{
 public static void main(String[] args) {
        float price = FoodPanda.checkDetails("Biryani");
        System.out.println("Price of one item: " + price);
        float total = FoodPanda.checkDetails("Biryani", price, 2f);
        System.out.println("Total amount: " + total); }
}