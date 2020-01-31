public class Prog4 {
    public static void main(String[] args) {
        byte b1;  
        b1 = 15 + 110; // Ok. 125 is in the range -128 and 127 
    
        System.out.println(b1);
        
        b1 = 15 + 210; 
        // System.out.println(b1);
        // // Error. 225 is in the range -128 and 127 
    }
}