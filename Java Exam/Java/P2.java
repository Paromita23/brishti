public class P2 {
    public void show(Object ob) {
<<<<<<< HEAD
        if (ob==2) {
=======
        if (ob.equals("ABC")) {
>>>>>>> 31c371d80a907804c83e9534c4b52051a6e6d2e8
            System.out.println("Correct A AND D");
        } else {
            System.out.println("Error B AND C");
        }
    }
    public static void main(String[] args) {
        // String s="ABC";
        int a = 2;
        P2 obj=new P2();
        // obj.show(s);
        obj.show(a);
    }
}