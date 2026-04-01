class Rice {
    String variety;
    int riceId;
    boolean isOrganic;
    float weight;
    long price;
    public Rice(String r1, int r2, boolean r3, float r4, long r5) {
        variety = r1;
        riceId = r2;
        isOrganic = r3;
        weight = r4;
        price = r5;
    }
    public void printRice() {
        System.out.println("Variety: " + variety);
        System.out.println("Rice ID: " + riceId);
        System.out.println("Organic: " + isOrganic);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}