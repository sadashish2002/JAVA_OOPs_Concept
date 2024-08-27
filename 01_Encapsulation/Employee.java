package OOPs_Concept.Encapsulation;


  public class Employee{
    // static int empId =2;
      private  int empId =2;
     private int ph = 0;
     private String name;
     public int basicSal = 20000; 
    public  int incentive = 200;
    void countSalaries(){
      System.out.println(basicSal+incentive);
  }

    // parameterized constructor
     Employee(String empName,int phoneNo){
        ph=phoneNo;
        name =empName;
     }
// NOTE: once u define parametrix constructor then
        // default constructor will not exist by java 

        // So if we want default constructor or simple constructor then
        // we have to manually define default constructor
       
      //Simple constructor
        Employee(){
         ph =2222;
         name ="Vaishnavi";
      }

    
    // getter is used to access private element of a class to outside of class
    
    public int getph(){
       return ph;
    }

  public  String getName(){
        return name;
    }

    //setter is use to update the values of  manually default constructor 
    // which is corresponding for private data member of class
    
    void setPh(int ph){
      this.ph = ph;
    }
    void setName(String name){
      this.name =name;
    }
 }