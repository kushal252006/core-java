class Spotify {

    String userName;
    int playlistCount;
    boolean isPremium;
    int songs;
	

   public Spotify(boolean isPremium,String userName, int playlistCount,  int songs) {
   this.isPremium=isPremium;
        this.userName=userName;
		this.playlistCount=playlistCount;
        this.songs = songs;
    }

    public Spotify(String userName, int playlistCount, boolean isPremium, int songs) {
        this.userName=userName;
		this.playlistCount=playlistCount;
		this.isPremium=isPremium;
        this.songs = songs;
    }
	public Spotify(int playlistCount,String userName, boolean isPremium, int songs) {
	this.playlistCount=playlistCount;
        this.userName=userName;
		this.isPremium=isPremium;
        this.songs = songs;
    }
	 public void show() {
        System.out.println("user Name: " + userName);
        System.out.println("playlistCount: " + playlistCount);
        System.out.println("it isPremium: " + isPremium);
        System.out.println("songs: " + songs);
        System.out.println("--------------------------");
    }

}