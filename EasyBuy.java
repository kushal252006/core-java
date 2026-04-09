class EasyBuy{
public static void main(String[]args){

String [] cosmetics=new String[15];
cosmetics[0]="face cream";
cosmetics[2]="lipstick";
cosmetics[4]="eyeliner";
cosmetics[6]="foundation";
cosmetics[10]="perfume";

for(String sec:cosmetics){
System.out.println("cosmetics section items ");
System.out.println(sec);
}

for(int i=0;i<cosmetics.length;i++){
System.out.println("cosmetics item index :"+i);
System.out.println(cosmetics[i]);
}
System.out.println("3333333333333333333333333333333333333333333333");

String [] medicines=new String[11];
medicines[1]="paracetamol";
medicines[3]="cough syrup";
medicines[5]="antibiotic";
medicines[7]="pain relief gel";
medicines[9]="vitamin tablets";

for(String sec:medicines){
System.out.println("medical section items ");
System.out.println(sec);
}
for(int j=0;j<medicines.length;j++){
System.out.println("medical item index :"+j);
System.out.println(medicines[j]);
}
System.out.println("3333333333333333333333333333333333333333333333");

String [] electrical=new String[9];
electrical[0]="bulb";
electrical[2]="switch";
electrical[4]="wire";
electrical[6]="extension board";

for(String sec:electrical){
System.out.println("electrical section items ");
System.out.println(sec);
}
for(int k=0;k<electrical.length;k++){
System.out.println("electrical item index :"+k);
System.out.println(electrical[k]);
}

System.out.println("3333333333333333333333333333333333333333333333");

String [] travel=new String[10];
travel[1]="suitcase";
travel[3]="backpack";
travel[5]="travel pillow";
travel[7]="water bottle";
travel[9]="neck pouch";

for(String sec:travel){
System.out.println("travel section items ");
System.out.println(sec);
}
for(int m=0;m<travel.length;m++){
System.out.println("travel item index :"+m);
System.out.println(travel[m]);
}
System.out.println("3333333333333333333333333333333333333333333333");
String [] music=new String[9];
music[0]="guitar";
music[2]="keyboard";
music[4]="drums";
music[6]="microphone";
music[8]="speaker";

for(String sec:music){
System.out.println("music section items ");
System.out.println(sec);
}
for(int n=0;n<music.length;n++){
System.out.println("music item index :"+n);
System.out.println(music[n]);
}

}
}