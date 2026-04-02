class GaanaMusic {

    String listenerName;
    double subscriptionFee;
    char planType;
    long totalStreams;
    float rating;
 public GaanaMusic(String listenerName, double subscriptionFee, char planType,long totalStreams,float rating) {
        this.listenerName=listenerName;
		this.subscriptionFee=subscriptionFee;
		this.planType=planType;
		this.totalStreams = totalStreams;
		this.rating = rating;	
		System.out.println("successfully printed");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    
    public GaanaMusic(String listenerName, double subscriptionFee, char planType) {
        this.listenerName=listenerName;
        this.subscriptionFee = subscriptionFee;
        this.planType = planType;
		System.out.println("successfully printed");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public GaanaMusic(String listenerName, float rating,long totalStreams, double subscriptionFee, char planType) {
        this.listenerName=listenerName;
this.rating = rating;		
        this.totalStreams = totalStreams;
		this.subscriptionFee=subscriptionFee;
		this.planType=planType;
		System.out.println("successfully printed");
    }
}