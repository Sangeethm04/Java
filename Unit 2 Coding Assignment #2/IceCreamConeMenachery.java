public class IceCreamConeMenachery {
    public static void main(String[] args) {
        String test = "  ONETWOTHREEFOURFIVESSAASD  ";
        String smalls = test.trim();
        String half = smalls.substring((smalls.length()/4) , (smalls.length() - smalls.length()/4));
        System.out.println(half);
    }
}
