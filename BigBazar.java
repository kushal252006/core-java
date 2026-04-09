class BigBazar{
public static void main(String[]args){

String [] grains=new String[13];
grains[0]="rice";
grains[2]="wheat";
grains[4]="barley";
grains[6]="oats";
grains[8]="corn";
grains[10]="millets";

for(String sec:grains){
System.out.println("grains section list ");
System.out.println(sec);
}

for(int i=0;i<grains.length;i++){
System.out.println("grains item index :"+i);
System.out.println(grains[i]);
}

String [] sweets=new String[12];
sweets[1]="laddu";
sweets[3]="barfi";
sweets[5]="jalebi";
sweets[7]="rasgulla";
sweets[9]="halwa";

for(String sec:sweets){
System.out.println("sweets section list ");
System.out.println(sec);
}
for(int j=0;j<sweets.length;j++){
System.out.println("sweets item index :"+j);
System.out.println(sweets[j]);
}

String [] bags=new String[9];
bags[0]="school bag";
bags[2]="travel bag";
bags[4]="hand bag";
bags[6]="laptop bag";

for(String sec:bags){
System.out.println("bags section list ");
System.out.println(sec);
}
for(int k=0;k<bags.length;k++){
System.out.println("bags item index :"+k);
System.out.println(bags[k]);
}


String [] watches=new String[10];
watches[1]="digital watch";
watches[3]="analog watch";
watches[5]="smart watch";
watches[7]="sports watch";
watches[9]="luxury watch";

for(String sec:watches){
System.out.println("watches section list ");
System.out.println(sec);
}
for(int m=0;m<watches.length;m++){
System.out.println("watches item index :"+m);
System.out.println(watches[m]);
}
String [] gardening=new String[9];
gardening[0]="plants";
gardening[2]="seeds";
gardening[4]="fertilizer";
gardening[6]="watering can";
gardening[8]="garden tools";

for(String sec:gardening){
System.out.println("gardening section list ");
System.out.println(sec);
}
for(int n=0;n<gardening.length;n++){
System.out.println("gardening item index :"+n);
System.out.println(gardening[n]);
}

}
}