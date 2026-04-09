class Zudio{
public static void main(String[]args){

String [] mensWear=new String[12];
mensWear[0]="shirt";
mensWear[2]="t-shirt";
mensWear[4]="jeans";
mensWear[6]="jacket";
mensWear[8]="shorts";
mensWear[10]="blazer";

for(String sec:mensWear){
System.out.println("mens wear collection ");
System.out.println(sec);
}

for(int i=0;i<mensWear.length;i++){
System.out.println("mens wear item index :"+i);
System.out.println(mensWear[i]);
}

String [] womensWear=new String[13];
womensWear[1]="kurti";
womensWear[3]="top";
womensWear[5]="saree";
womensWear[7]="dress";
womensWear[9]="skirt";

for(String sec:womensWear){
System.out.println("womens wear collection ");
System.out.println(sec);
}
for(int j=0;j<womensWear.length;j++){
System.out.println("womens wear item index :"+j);
System.out.println(womensWear[j]);
}

String [] kidsWear=new String[12];
kidsWear[0]="kids shirt";
kidsWear[2]="kids frock";
kidsWear[4]="kids shorts";
kidsWear[6]="kids jacket";

for(String sec:kidsWear){
System.out.println("kids wear collection ");
System.out.println(sec);
}
for(int k=0;k<kidsWear.length;k++){
System.out.println("kids wear item index :"+k);
System.out.println(kidsWear[k]);
}

String [] footwear=new String[14];
footwear[1]="casual shoes";
footwear[3]="formal shoes";
footwear[5]="sandals";
footwear[7]="flip flops";
footwear[9]="heels";

for(String sec:footwear){
System.out.println("footwear collection ");
System.out.println(sec);
}
for(int m=0;m<footwear.length;m++){
System.out.println("footwear item index :"+m);
System.out.println(footwear[m]);
}

String [] accessories=new String[];
accessories[0]="belt";
accessories[2]="cap";
accessories[4]="watch";
accessories[6]="sunglasses";
accessories[8]="wallet";

for(String sec:accessories){
System.out.println("accessories collection ");
System.out.println(sec);
}
for(int n=0;n<accessories.length;n++){
System.out.println("accessories item index :"+n);
System.out.println(accessories[n]);
}

}
}