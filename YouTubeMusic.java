class YouTubeMusic {
String channelName;
int subscriberCount;
boolean isAdFree;
short playlistNumber;
long totalWatchTime;
float playbackSpeed;
double monthlyCost;
char regionCode;
public YouTubeMusic(String channelName) {
this.channelName = channelName;
System.out.println("compleated");
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
    public YouTubeMusic(String channelName, int subscriberCount, boolean isAdFree) {
        this.channelName=channelName;
        this.subscriberCount = subscriberCount;
        this.isAdFree = isAdFree;
		System.out.println("succefully compleated");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
public YouTubeMusic(String channelName, int subscriberCount, boolean isAdFree,short playlistNumber, long totalWatchTime, 
float playbackSpeed,double monthlyCost, char regionCode) {
this.channelName=channelName;
this.subscriberCount=subscriberCount;
this.isAdFree=isAdFree;
this.playlistNumber = playlistNumber;
this.totalWatchTime = totalWatchTime;
this.playbackSpeed = playbackSpeed;
this.monthlyCost = monthlyCost;
this.regionCode = regionCode;
System.out.println("all value assign is compleated");
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}