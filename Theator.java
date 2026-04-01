class Theator {

    String movieName;
    int screenNumber;
    boolean is3D;
    double ticketPrice;

    public Theator(){};
	
	
    public Theator(String movieName, int screenNumber, boolean is3D, double ticketPrice) {
        this.movieName = movieName;
        this.screenNumber = screenNumber;
        this.is3D = is3D;
        this.ticketPrice = ticketPrice;
    }

   
    public void show() {
        System.out.println("Movie Name    : " + movieName);
        System.out.println("Screen Number : " + screenNumber);
        System.out.println("3D Available  : " + is3D);
        System.out.println("Ticket Price  : ₹" + ticketPrice);
        System.out.println("::::::::::::::::::::::::::::::::");
    }
}