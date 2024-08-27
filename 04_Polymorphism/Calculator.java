// 1. Polymorphisms are of two types
  // a.) Compile time polymorphism
    // CTP or Method Overloading is perform in same class
    // Method name will be same for two or methods
    // Return type can be change
    // No. of Parameter can be change
    // Data Type of Parameters of method should change
    // logic inside method should same 
class Features{
    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static int  add(int a,int b,int c,int d){
        // System.out.println(a+b+c);
        int z = a+b+c+d;
        return z;
    }

    public static void add(double a,double b){
        System.out.println(a+b);
    }
}
  // b.) Run time polymorphism
        //RTP or Method Overridding is perform in different class.
        //Method name should be same but use in different class
        // Return type should be same
       // No. of Parameter should be change.
      // Data type of parameter of method should be same.
// NOTE: Logic inside method should change or override
     

class Dadag{
    public static void show(){
        System.out.println("Mere data bude ho gye haoi");
    }
}

class Papa{
    public static void show(){
        System.out.println("Mere papa mere liye hero hain");
    }
}
public class Calculator {

    public static void main(String[] args) {
      
      // Method overloadiing 
        Features.add(24,34);
        Features.add(24,34,11);
        Features.add(2.5,3.4);
       
        System.out.println(Features.add(1,2,3,4));
    
        // Method overriding 

        Dadag da = new Dadag();
        Papa pa = new Papa();
        da.show();
        pa.show();
    
    }
    
}
