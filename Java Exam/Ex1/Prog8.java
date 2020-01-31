public class Prog8 {
    public static void main(String[] args) {
        byte b1 = 10; 
        byte b2 = +5; 
<<<<<<< HEAD
        // b1 = +b2; // A compile-time error. 
  
=======
        b1 = (byte) +b2; // A compile-time error. 
  System.out.println(b15);
>>>>>>> 31c371d80a907804c83e9534c4b52051a6e6d2e8
        //To fix the error, add casting.

        b1 = (byte) +b2; // Ok 
        System.out.println(b1);
    }   
}