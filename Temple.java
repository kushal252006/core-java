class Temple {
    String templeName;
    int templeId;
    boolean isOpen;
    double entryFee;
public Temple(){};
    public Temple(String templeName, int templeId, boolean isOpen, double entryFee) {
        this.templeName = templeName;
        this.templeId = templeId;
        this.isOpen = isOpen;
        this.entryFee = entryFee;
    }
    public void show() {
        System.out.println("Temple Name : " + templeName);
        System.out.println("Temple ID   : " + templeId);
        System.out.println("Open        : " + isOpen);
        System.out.println("Entry Fee   : ₹" + entryFee);
        System.out.println("---------------------------");
    }
}