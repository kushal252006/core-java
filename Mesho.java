class Mesho {
    String product;
    byte productCode;
    boolean isReturned;
    int quantity;
    double rating;
    public Mesho(String m1, byte m2, boolean m3, int m4, double m5) {
        product = m1;
        productCode = m2;
        isReturned = m3;
        quantity = m4;
        rating = m5;
    }
    public void displayDetails() {
        System.out.println("Product: " + product);
        System.out.println("Product Code: " + productCode);
        System.out.println("Returned: " + isReturned);
        System.out.println("Quantity: " + quantity);
        System.out.println("Rating: " + rating);
        System.out.println("----------------------");
    }
	}