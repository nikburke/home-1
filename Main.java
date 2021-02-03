class Main {
    public static float doTask4(float a, float b,float c,float d ) { 
  return(a * (b + (c / d)));
}

    public static boolean doTask5(int a, int b) { 
    return((a+b>=10)&&(a+b<=20));
}

    public static boolean doTask6(int a) { 
    return(a<=0);
}

public static  String doTask7(String name){
String  result = "Привет, " + name + "!";
return result;
}
public static  boolean doTask8(int a){
return (((a%4==0)&&(a%100 !=0)) || a%400==0);
}



  public static void main(String[] args) {
    int a = 10;
    System.out.println(a); 
    long l=99999;
    System.out.println(l); 
    float f=2.1f;  
    System.out.println(f); 
    double pi = 3.141;  
    System.out.println(pi); 
    byte b = 22;          
    System.out.println(b); 
    char c = 'a'; 
    System.out.println(c); 
    boolean bool = true; 
    System.out.println(bool); 
    System.out.println(doTask4(1,2,3,5));
    System.out.println(doTask5(1,9));
    System.out.println(doTask6(2));
    System.out.println(doTask7("Nikita"));
    System.out.println(doTask8(8));
  }

}