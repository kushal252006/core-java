class Bell {

    String brandName;
    int bellId;
    boolean isElectric;
    double price;
    public Bell(String brandName, int bellId, boolean isElectric, double price) {
        this.brandName = brandName;
        this.bellId = bellId;
        this.isElectric = isElectric;
        this.price = price;
    }
    public void set() {
        System.out.println("Brand Name : " + brandName);
        System.out.println("Bell ID: " + bellId);
        System.out.println("Electric: " + isElectric);
        System.out.println("Price: ₹" + price);
        System.out.println("---------000000000000000000---------");
    }
}