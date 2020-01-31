public class Prog7 {
    public static void main(String[] args) {
        byte b1 = 10; 
<<<<<<< HEAD
        byte b2 = 5; 
        b1 = b2; 
        System.out.println(b1); // Ok. byte to byte assignment 
=======
        byte b2 = +5; 
        b1 = b2;  // Ok. byte to byte assignment 
        System.out.println(b1);
        System.out.println(b2);
>>>>>>> 31c371d80a907804c83e9534c4b52051a6e6d2e8
    }       
}