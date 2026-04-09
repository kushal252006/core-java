class SmartBazar{
public static void main(String[]args){

String [] bakeryItems=new String[13];
bakeryItems[0]="brown bread";
bakeryItems[2]="cup cake";
bakeryItems[4]="donut";
bakeryItems[6]="croissant";
bakeryItems[8]="rusk";
bakeryItems[10]="pie";

for(String sec:bakeryItems){
System.out.println("bakery items section ");
System.out.println(sec);
}

for(int i=0;i<bakeryItems.length;i++){
System.out.println("bakery item index :"+i);
System.out.println(bakeryItems[i]);
}

String [] beverages=new String[10];
beverages[1]="green tea";
beverages[3]="black coffee";
beverages[5]="energy drink";
beverages[7]="lemon juice";
beverages[9]="cold coffee";

for(String sec:beverages){
System.out.println("beverages section list ");
System.out.println(sec);
}
for(int j=0;j<beverages.length;j++){
System.out.println("beverages item index :"+j);
System.out.println(beverages[j]);
}


String [] mobile=new String[13];
mobile[0]="screen guard";
mobile[2]="phone cover";
mobile[4]="charger cable";
mobile[6]="earbuds";

for(String sec:mobile){
System.out.println("mobile accessories section ");
System.out.println(sec);
}
for(int k=0;k<mobile.length;k++){
System.out.println("mobile item index :"+k);
System.out.println(mobile[k]);
}


String [] fitness=new String[12];
fitness[1]="dumbbells";
fitness[3]="yoga mat";
fitness[5]="skipping rope";
fitness[7]="treadmill";
fitness[9]="exercise bike";

for(String sec:fitness){
System.out.println("fitness section items ");
System.out.println(sec);
}
for(int m=0;m<fitness.length;m++){
System.out.println("fitness item index :"+m);
System.out.println(fitness[m]);
}
String [] office=new String[14];
office[0]="files";
office[2]="stapler";
office[4]="marker";
office[6]="paper clips";
office[8]="calculator";

for(String sec:office){
System.out.println("office supplies section ");
System.out.println(sec);
}
for(int n=0;n<office.length;n++){
System.out.println("office item index :"+n);
System.out.println(office[n]);
}

}
}