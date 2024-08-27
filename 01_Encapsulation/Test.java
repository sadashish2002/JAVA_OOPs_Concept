package OOPs_Concept.Encapsulation;
import OOPs_Concept.MyClass;



public class Test {
    public static void main(String[] args) {
     /*
         // create object
        Employee engineer = new Employee(); 

        System.out.println(engineer.basicSal);
        System.out.println(engineer.incentive);
       // System.out.println(engineer.empId);// private element of class cant accessible outside 
       MyClass  myObj = new MyClass();
       myObj.print();

// access class element withour object creation
        //    System.out.println(Employee.empId);  //error
        // making variable to static i.e : static int empid
    

 // to access private member of employee class
         System.out.println(engineer.getph());
         System.out.println(engineer.getName());

      */

       // Parameterized constructor 
      Employee engineer =  new Employee("Sadashish",21);
      System.out.println(engineer.getph());
      System.out.println(engineer.getName());

      // default constructor ecample
      Employee engineer2 = new Employee();
      System.out.println(engineer2.getph());
      System.out.println(engineer2.getName());


      engineer2.setName("Shyam");
      engineer2.setPh(9523503);

      System.out.println(engineer2.getph());
      System.out.println(engineer2.getName());

    }
}
