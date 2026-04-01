 class MirrorResult{
 public static void main(String[] args) {
        Mirror m1 = new Mirror("SaintGobain", 401, true, 5.5f, 'A', 3000.0);
		m1.show();
Mirror m2 = new Mirror("Asahi", 402, false, 4.0f, 'B', 2000.0);
m1.show();	
Mirror m3 = new Mirror("ModiGuard", 403, true, 6.0f, 'A', 3500.0);
m1.show();
		
Mirror m4 = new Mirror("Venus", 404, true, 5.0f, 'A', 2800.0);
		m1.show();
		
Mirror m5 = new Mirror("Cera", 405, false, 3.5f, 'C', 1500.0);
m1.show();
		
        Mirror m6 = new Mirror("Hindware", 406, true, 5.8f, 'B', 3200.0);
		m1.show();
		
        Mirror m7 = new Mirror("Jaquar", 407, false, 4.5f, 'A', 2700.0);
		m1.show();

       
    }
}