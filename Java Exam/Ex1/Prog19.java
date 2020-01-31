public class Prog19 {
    public static void main(String[] args) {
        test(101L); 
        test(new Long(101L));
      }
      public static void test(Long lObject) {
        System.out.println("Long=" + lObject);
      }
    
      public static void test(Object obj) {
        System.out.println("Object=" + obj);
      }
}