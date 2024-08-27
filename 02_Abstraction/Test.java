package OOPs_Concept.Abstraction;

public class Test {
public static void main(String[] args) {
// NOTEEEE::: 1.) abstract and interface are two method which try to  achieve  abstraction.
        //  2.) abstract sometimes give complete abstraction or not also 
       //   3.) interface  can achieve  101% abstraction
   
     // once we declare a class as abstract class 
    //then we cant create object of abstract class
    // without object we cant access member or member function
   
//NOTE:  //  Bank bk = new Bank(); // abstract class show error if object crete

     Admin ad = new Admin();// we can create object of admin because it extends bank
     
     // we cant create object for interface class

//NOTE:   MyBank mb = new MyBank() ; // interface class show error if object is create
     SBIread read = new SBIread(); //we can create object of SBIread becasue it implements interface class
      
   
}

}
