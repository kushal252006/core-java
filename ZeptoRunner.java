class ZeptoRunner{
 public static void main(String[] args) {
        short price = Zepto.getDetail("Milk");
        System.out.println("Price of one item: " + price);
        short total = Zepto.getDetail("Milk", price, (short)5);
        System.out.println("Total amount: " + total);
    }
}