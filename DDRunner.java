class DDRunner{
 public static void main(String[] args) {
int price = Doordash.orderDetails("Pizza");
System.out.println("Price of one item: " + price);
int total = Doordash.orderDetails("Pizza", price, 4);
    System.out.println("Total bill: " + total);
	
    }
}