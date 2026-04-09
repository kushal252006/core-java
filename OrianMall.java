class OrianMall{
public static void main(String[]args){

String [] meat=new String[15];
meat[0]="chicken";
meat[2]="mutton";
meat[4]="fish";
meat[6]="prawns";
meat[8]="crab";
meat[10]="sausages";

for(String sec:meat){
System.out.println("meat section items ");
System.out.println(sec);
}

for(int i=0;i<meat.length;i++){
System.out.println("meat item index :"+i);
System.out.println(meat[i]);
}

String [] frozen=new String[15];
frozen[1]="ice cream";
frozen[3]="frozen peas";
frozen[5]="frozen corn";
frozen[7]="frozen pizza";
frozen[9]="frozen fries";

for(String sec:frozen){
System.out.println("frozen section items ");
System.out.println(sec);
}
for(int j=0;j<frozen.length;j++){
System.out.println("frozen item index :"+j);
System.out.println(frozen[j]);
}

String [] pets=new String[10];
pets[0]="dog food";
pets[2]="cat food";
pets[4]="bird seeds";
pets[6]="pet shampoo";

for(String sec:pets){
System.out.println("pet supplies section ");
System.out.println(sec);
}
for(int k=0;k<pets.length;k++){
System.out.println("pet item index :"+k);
System.out.println(pets[k]);
}
String [] hardware=new String[14];
hardware[1]="hammer";
hardware[3]="screwdriver";
hardware[5]="wrench";
hardware[7]="drill";
hardware[9]="pliers";

for(String sec:hardware){
System.out.println("hardware section ");
System.out.println(sec);
}
for(int m=0;m<hardware.length;m++){
System.out.println("hardware item index :"+m);
System.out.println(hardware[m]);
}
String [] baby=new String[13];
baby[0]="diapers";
baby[2]="baby oil";
baby[4]="baby powder";
baby[6]="baby lotion";
baby[8]="feeding bottle";

for(String sec:baby){
System.out.println("baby products section ");
System.out.println(sec);
}
for(int n=0;n<baby.length;n++){
System.out.println("baby item index :"+n);
System.out.println(baby[n]);
}

}
}