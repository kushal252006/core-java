class PocketFM {

    String profileName;
    byte episodeCount;
    boolean isSubscribed;
    int likes;
    long totalListeningTime;
    float speed;
    double subscriptionAmount;

public PocketFM(){};
   
    public PocketFM(String profileName) {
        this.profileName = profileName;
    }

    
    public PocketFM(String profileName, byte episodeCount, boolean isSubscribed) {
        this.profileName=profileName;
        this.episodeCount = episodeCount;
        this.isSubscribed = isSubscribed;
    }

    public PocketFM(String profileName, byte episodeCount, boolean isSubscribed,
                    int likes, long totalListeningTime, float speed, double subscriptionAmount) {
        this.profileName=profileName;
		this.episodeCount=episodeCount;
		this.isSubscribed=isSubscribed;
        this.likes = likes;
        this.totalListeningTime = totalListeningTime;
        this.speed = speed;
        this.subscriptionAmount = subscriptionAmount;
    }
    public void showInfo() {
        System.out.println("Profile Name: " + profileName);
        System.out.println("Episode Count: " + episodeCount);
        System.out.println("Subscribed: " + isSubscribed);
        System.out.println("Likes: " + likes);
        System.out.println("Total Listening Time: " + totalListeningTime);
        System.out.println("Playback Speed: " + speed);
        System.out.println("Subscription Amount: " + subscriptionAmount);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}