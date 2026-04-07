class JeeraPower {
    static void displayCompany() {
        String companyTitle = "JeeraTech";
        System.out.println("Company title is: " + companyTitle);
        showOwnerDetails(101);
    }
    static void showOwnerDetails(int ownerId) {
        System.out.println("Owner ID is: " + ownerId);
        String ownerName = fetchOwnerName();
        System.out.println("Owner name returned: " + ownerName);
    }
    static String fetchOwnerName() {
        String owner = "Arjun";
        System.out.println("Actual owner name: " + owner);
        return owner;
    }
    }