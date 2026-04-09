class MegaMart{
public static void main(String[]args){

String [] bakery=new String[12];
bakery[0]="bread";
bakery[2]="cake";
bakery[4]="biscuit";
bakery[6]="bun";
bakery[8]="cookies";
bakery[10]="muffin";

for(String sec:bakery){
System.out.println("bakery section items ");
System.out.println(sec);
}

for(int i=0;i<bakery.length;i++){
System.out.println("bakery item index :"+i);
System.out.println(bakery[i]);
}
System.out.println("44444444444444444444444444444444444444444444444444444");

String [] dairy=new String[12];
dairy[1]="milk";
dairy[3]="curd";
dairy[5]="butter";
dairy[7]="cheese";
dairy[9]="paneer";

for(String sec:dairy){
System.out.println("dairy section items ");
System.out.println(sec);
}
for(int j=0;j<dairy.length;j++){
System.out.println("dairy item index :"+j);
System.out.println(dairy[j]);
}

System.out.println("44444444444444444444444444444444444444444444444444444");

String [] beverages=new String[8];
beverages[0]="tea";
beverages[2]="coffee";
beverages[4]="juice";
beverages[6]="soft drink";

for(String sec:beverages){
System.out.println("beverages section items ");
System.out.println(sec);
}
for(int k=0;k<beverages.length;k++){
System.out.println("beverages item index :"+k);
System.out.println(beverages[k]);
}
System.out.println("44444444444444444444444444444444444444444444444444444");

String [] cosmetics=new String[10];
cosmetics[1]="soap";
cosmetics[3]="shampoo";
cosmetics[5]="face wash";
cosmetics[7]="cream";
cosmetics[9]="lotion";

for(String sec:cosmetics){
System.out.println("cosmetics section items ");
System.out.println(sec);
}
for(int m=0;m<cosmetics.length;m++){
System.out.println("cosmetics item index :"+m);
System.out.println(cosmetics[m]);
}
System.out.println("44444444444444444444444444444444444444444444444444444");

String [] toys=new String[11];
toys[0]="car";
toys[2]="doll";
toys[4]="ball";
toys[6]="puzzle";
toys[8]="blocks";

for(String sec:toys){
System.out.println("toys section items ");
System.out.println(sec);
}
for(int n=0;n<toys.length;n++){
System.out.println("toys item index :"+n);
System.out.println(toys[n]);
}

}
}