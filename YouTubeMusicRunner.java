class YouTubeMusicRunner {
public static void main(String[] args) {
System.out.println("i am print string datatype now");
YouTubeMusic y1 = new YouTubeMusic("MusicWorld");

System.out.println("now i am call string,int,boolean value");
YouTubeMusic y2 = new YouTubeMusic("BeatZone", 5000, true);

System.out.println("i am print all datatype now");
YouTubeMusic y3 = new YouTubeMusic("MelodyHub", 12000, false,(short)15, 20000L, 1.25f, 129.99, 'I');
    }
}