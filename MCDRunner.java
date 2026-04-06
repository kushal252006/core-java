 class MCDRunner{
 public static void main(String[] args) {
        int price = McDonalds.orderDetails("Burger");
        System.out.println("Price of one item: " + price);
        int total = McDonalds.orderDetails("Burger", price, 3);
        System.out.println("Total bill: " + total);
    }
}