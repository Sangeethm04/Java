package Chapt5;
public class PasswordGenerator {
    private int numofnum;
    private String prefix;
    private static int counts = 0;

    public PasswordGenerator(int numofnum, String prefix) {
        this.numofnum = numofnum;
        this.prefix = prefix;
    }

    public PasswordGenerator(int numofnum) {
        this.numofnum = numofnum;
        prefix = "A";
    }
    public int pwCount() {
        return counts;
    }
    public String pwGen() {
        int numbers;
        String result = prefix + ".";
        for (int i = 0; i < numofnum; i++) {
            numbers = (int)(Math.random() * 10);
            result += numbers;
        }
        counts++;
        return result;
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());

        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());

        System.out.println(pw1.pwCount());
    }
}