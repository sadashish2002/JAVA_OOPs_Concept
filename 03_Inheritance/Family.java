// Multiple Inheritance is not possible in java
// but we can achied it using "interface"
class DadaG{
    String name  = "Indranarayan";
    String surname = "Bhokta";
}
// Father is only single inheritance example
class Father extends DadaG{
    String name = "Saday Kumar";

}
class Mother {
    String name = "Usha Devi"; 
}
// Dada se Father se me is an Multilevel inheritance example
class me extends Father {
    String name = "Sadashish Kumar";
}

// Me and bhai are hierarichal inheritance of Father
class Bhai extends Father{
    String name = "Shivashish Kumar";  
}



public class Family{
public static void main(String[] args) {
    me m = new me();
 System.out.println(m.name);
 System.out.println(m.surname);
}
}


