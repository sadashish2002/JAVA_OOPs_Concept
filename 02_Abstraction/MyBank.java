package OOPs_Concept.Abstraction;

// We can achieved 101% abstraction using interface
//Interface is a blueprint of exact software

interface MyBank {

    // Abstract methods do not specify a body,it gives error

            /* 
            void  write(){

            } 
            */
    void write();
    void read();

    // we can only declare method and that's y it hide the implementation detail
}

// some engineer or person will implement the blueprint(interface)

class SBIread implements MyBank{
 // The type SBIread must implement 
   //the inherited abstract method MyBank.write()
    @Override
    public void write() {
      System.out.println("I can write as a SBIread");
        
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        
    }
  
   
}

