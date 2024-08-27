import java.util.*;
//Java 8 supports default methods where interfaces can provide a default implementation of methods.
// And a class can implement two or more interfaces. 

//Interface1 
interface  DadaG{
    //default method using default keyword
    default void property1(){
        System.out.println("Total DadaG property is 29 crores");
    }
}

//Interface 2 
interface Papa{
    //default method using default keyword
   default void property2(){
    System.out.println("Total papa property is 10 crore");
   }
}



class Multiple_Inheritance implements DadaG,Papa {
//In case both the implemented interfaces contain default methods with the same method signature, 
//the implementing class should explicitly specify 
//which default method is to be used in some method excluding the main() of implementing class 
//using super keyword, or it should override the default method in the implementing class/

  /*
     @Override
    public void property() {
        // TODO Auto-generated method stub
        DadaG.super.property();

        Papa.super.property();
    } 

    public void showDadaGproperty(){
        DadaG.super.property();
    }

    public void PapaProperty(){
        Papa.super.property();
    }
   */

// if default method name is different in interfacew 1 and interface 2
// then we can write below mthod for only executing the property() of DaDaG 
    public void showDadaGproperty(){
        DadaG.super.property1();
    }
// then we can write below mthod for only executing the property() of PapaG

    public void PapaProperty(){
        Papa.super.property2();
    }

    
    public static void main(String[] args) {
        Multiple_Inheritance mi = new Multiple_Inheritance();
       // mi.property();
        System.out.println("Now show to prperty of dada and papa");
         mi.showDadaGproperty();
        mi.PapaProperty();
    }
}
