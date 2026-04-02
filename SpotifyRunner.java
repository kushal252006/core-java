class SpotifyRunner {
    public static void main(String[] args) {


        Spotify s1 = new Spotify(false,"bindu", 5, 100);
       s1.show();
		Spotify s2 = new Spotify("kush", 5, false, 200);
       s2.show();
		Spotify s3 = new Spotify(5,"yogi", false, 150);
       s3.show(); 
    }
}