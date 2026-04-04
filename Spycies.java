class Spycies{

public Spycies(){
this("teju");
System.out.println("first constructor");
}
public Spycies(String name){
this("GaramMasala","ChikenMasala");
System.out.println("second constructor");
System.out.println("Spycies name:"+name);
}
public Spycies(String items1,String items2){
this(100,200,500);
System.out.println("third constructor");
System.out.println("Spycies  item name:"+items1);
System.out.println("Spycies item name:"+items2);
}
public Spycies(int gram1,int gram2,int gram3 ){
this(10,20,50,100);
System.out.println("fourth constructor");
System.out.println("Spycies  item in gram:"+gram1);
System.out.println("Spycies  item in gram:"+gram2);
System.out.println("Spycies  item in gram:"+gram3);
}
public Spycies(int price1,int price2,int price3,int price4 ){
this('A','B','C','A','B');
System.out.println("fifth constructor");
System.out.println("Spycies  item price1:"+price1);
System.out.println("Spycies  item price2:"+price2);
System.out.println("Spycies  item price3:"+price3);
System.out.println("Spycies  item price4:"+price4);

}
public Spycies(char grade1,char grade2,char grade3,char grade4,char grade5 ){
System.out.println("last constructor");
System.out.println("Spycies  item grade1:"+grade1);
System.out.println("Spycies  item grade2:"+grade2);
System.out.println("Spycies  item grade3:"+grade3);
System.out.println("Spycies  item grade4:"+grade4);
System.out.println("Spycies  item grade5:"+grade5);
}
}



