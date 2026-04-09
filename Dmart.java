class Dmart{
public static void main(String[]args){

String [] snacks=new String[14];
snacks[0]="chips";
snacks[2]="kurkure";
snacks[4]="namkeen";
snacks[6]="popcorn";
snacks[8]="biscuits";
snacks[10]="nachos";

for(String sec:snacks){
System.out.println("snacks section items ");
System.out.println(sec);
}

for(int i=0;i<snacks.length;i++){
System.out.println("snacks item index :"+i);
System.out.println(snacks[i]);
}

String [] cleaning=new String[14];
cleaning[1]="detergent";
cleaning[3]="floor cleaner";
cleaning[5]="dish wash";
cleaning[7]="bleach";
cleaning[9]="scrub";

for(String sec:cleaning){
System.out.println("cleaning section items ");
System.out.println(sec);
}
for(int j=0;j<cleaning.length;j++){
System.out.println("cleaning item index :"+j);
System.out.println(cleaning[j]);
}


String [] kitchen=new String[12];
kitchen[0]="plate";
kitchen[2]="spoon";
kitchen[4]="knife";
kitchen[6]="pan";

for(String sec:kitchen){
System.out.println("kitchen section items ");
System.out.println(sec);
}
for(int k=0;k<kitchen.length;k++){
System.out.println("kitchen item index :"+k);
System.out.println(kitchen[k]);
}

String [] footwear=new String[10];
footwear[1]="shoes";
footwear[3]="sandals";
footwear[5]="slippers";
footwear[7]="boots";
footwear[9]="sneakers";

for(String sec:footwear){
System.out.println("footwear section items ");
System.out.println(sec);
}
for(int m=0;m<footwear.length;m++){
System.out.println("footwear item index :"+m);
System.out.println(footwear[m]);
}

}
}