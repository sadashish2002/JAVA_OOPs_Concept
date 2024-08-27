package OOPs_Concept.Abstraction;

public abstract class Bank {
    String name;

   /*void readData(){
        System.out.println("I can read data");
    }
     */
    //Abstract methods do not specify a body
    abstract void readData();
    abstract void writeData();
}

//The type Admin must implement the inherited abstract method Bank.readData()
//The type Admin must implement the inherited abstract method Bank.writeData()
class Admin extends Bank{
   void readData(){

   }

   void writeData(){

   }
}


class Marketing extends Bank{

    @Override
    void readData() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void writeData() {
        // TODO Auto-generated method stub
        
    }
   
}
