class VishalMart{
public static void main(String[]args){

String [] groceries=new String[16];
groceries[0]="oil";
groceries[1]="wheat";
groceries[2]="sugar";
groceries[4]="dal";
groceries[5]="rice";
groceries[6]="coffee powder";
groceries[7]="tea powder";
groceries[8]="spices";
groceries[9]="flor";
groceries[10]="seeds";
groceries[11]="dry fruits";
groceries[12]="jamun powder";
groceries[13]="dry chilli";
groceries[14]="fortune";
groceries[15]="ashirvad";

for(String sec:groceries){
System.out.println("groceries section ");
System.out.println(sec);
}

for(int i=0;i<groceries.length;i++){
System.out.println("groceries section item name :"+i);
System.out.println(groceries[i]);
}
System.out.println("1111111111111111111111111111111111111");
String [] furnitures=new String[14];
furnitures[0]="table";
furnitures[5]="window screen";
furnitures[10]="chair";
furnitures[13]="blanket";

for(String sec:furnitures){
System.out.println("furniture section ");
System.out.println(sec);
}
for(int j=0;j<furnitures.length;j++){
System.out.println("furniture section item name :"+j);
System.out.println(furnitures[j]);
}
System.out.println("1111111111111111111111111111111111111");
String [] clothes=new String[12];
clothes[1]="shirt";
clothes[3]="pant";
clothes[5]="tshirt";
clothes[7]="jeans";
clothes[9]="jacket";

for(String sec:clothes){
System.out.println("clothes section ");
System.out.println(sec);
}
for(int m=0;m<clothes.length;m++){
System.out.println("clothes section item name :"+m);
System.out.println(clothes[m]);
}
System.out.println("1111111111111111111111111111111111111");
String [] electronics=new String[10];
electronics[0]="tv";
electronics[2]="mobile";
electronics[4]="laptop";
electronics[6]="fan";
electronics[8]="fridge";

for(String sec:electronics){
System.out.println("electronics section ");
System.out.println(sec);
}
for(int k=0;k<electronics.length;k++){
System.out.println("electronics section item name :"+k);
System.out.println(electronics[k]);
}
}
}


