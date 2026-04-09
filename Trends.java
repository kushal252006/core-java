class Trends{
public static void main(String[]args){

String [] ethnicWear=new String[13];
ethnicWear[0]="kurta";
ethnicWear[2]="sherwani";
ethnicWear[4]="dhoti";
ethnicWear[6]="lehenga";
ethnicWear[8]="salwar suit";
ethnicWear[10]="dupatta";

String [] westernWear=new String[14];
westernWear[1]="jeans";
westernWear[3]="tshirt";
westernWear[5]="jumpsuit";
westernWear[7]="gown";
westernWear[9]="blazer";

String [] accessories=new String[12];
accessories[0]="scarf";
accessories[2]="belt";
accessories[4]="watch";
accessories[6]="handbag";
accessories[8]="sunglasses";

String [] winter=new String[15];
winter[0]="sweater";
winter[2]="hoodie";
winter[4]="jacket";
winter[6]="coat";

String [] summer=new String[15];
summer[1]="shorts";
summer[3]="tank top";
summer[5]="cotton shirt";
summer[7]="capri";
summer[9]="linen pants";

for(String sec:ethnicWear){
System.out.println("ethnic wear section ");
System.out.println(sec);
}

for(int i=0;i<ethnicWear.length;i++){
System.out.println("ethnic wear item index :"+i);
System.out.println(ethnicWear[i]);
}

System.out.println("2222222222222222222222222222222222222222222222222222");
for(String sec:westernWear){
System.out.println("western wear section ");
System.out.println(sec);
}
for(int j=0;j<westernWear.length;j++){
System.out.println("western wear item index :"+j);
System.out.println(westernWear[j]);
}
System.out.println("2222222222222222222222222222222222222222222222222222");

for(String sec:winter){
System.out.println("winter collection ");
System.out.println(sec);
}
for(int k=0;k<winter.length;k++){
System.out.println("winter item index :"+k);
System.out.println(winter[k]);
}


System.out.println("2222222222222222222222222222222222222222222222222222");
for(String sec:summer){
System.out.println("summer collection ");
System.out.println(sec);
}
for(int m=0;m<summer.length;m++){
System.out.println("summer item index :"+m);
System.out.println(summer[m]);
}
System.out.println("2222222222222222222222222222222222222222222222222222");
for(String sec:accessories){
System.out.println("fashion accessories ");
System.out.println(sec);
}
for(int n=0;n<accessories.length;n++){
System.out.println("accessories item index :"+n);
System.out.println(accessories[n]);
}

}
}