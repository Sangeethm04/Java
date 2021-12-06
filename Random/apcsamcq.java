public class apcsamcq {
   public static void main(String[] args) {
    Integer original = new Integer(8);

    Integer first = new Integer(original.intValue() * 2);
    
    Integer second = new Integer(original.intValue() + 2);
    
       
    
    System.out.println(first.intValue() + " " + second.intValue());
}
}