class Channel {

    String channelName;
    int channelNumber;
    boolean isHD;
    double subscriptionCost;
    public Channel(String channelName, int channelNumber, boolean isHD, double subscriptionCost) {
        this.channelName = channelName;
        this.channelNumber = channelNumber;
        this.isHD = isHD;
        this.subscriptionCost = subscriptionCost;
    }
    public void add() {
        System.out.println("Channel Name   : " + channelName);
        System.out.println("Channel Number : " + channelNumber);
        System.out.println("HD Available   : " + isHD);
        System.out.println("Cost: ₹" + subscriptionCost);
        System.out.println("--------22222222222222-----------");
    }
	}