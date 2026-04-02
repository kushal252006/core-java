class WynkMusic {

    String accountName;
    int downloads;
    boolean hasPremium;
    long listeningMinutes;
    double dataUsed;
    char quality;

    public WynkMusic(String accountName) {
        this.accountName = accountName;
    }

    public WynkMusic(String accountName, int downloads, boolean hasPremium) {
        this.accountName=accountName;
        this.downloads = downloads;
        this.hasPremium = hasPremium;
    }

    public WynkMusic(String accountName, int downloads, boolean hasPremium, long listeningMinutes, double dataUsed, char quality) {
        this.accountName=accountName;
		this.hasPremium=hasPremium;
        this.listeningMinutes = listeningMinutes;
        this.dataUsed = dataUsed;
        this.quality = quality;
    }
    public void showDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Downloads: " + downloads);
        System.out.println("Premium User: " + hasPremium);
        System.out.println("Listening Minutes: " + listeningMinutes);
        System.out.println("Data Used (MB): " + dataUsed);
        System.out.println("Audio Quality: " + quality);
        System.out.println("--------------------------");
    }
}
