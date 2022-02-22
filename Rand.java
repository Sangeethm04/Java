public class Rand {
    public static void main(String[] args) {
        String[] uno = {
            "hola",
            "hola1",
            "hola2",
            "hola3"
        };
        int[] dos = {
            1,
            2,
            3,
            4
        };
        double[] tres = {
            1.1,
            2.2,
            3.3,
            4.4
        };

        for (String vals: uno) {
            System.out.println(vals.toUpperCase());
        }

        for (int valss: dos) {
            int sum = 0;
            sum += valss;

            System.out.println(sum);
        }

        for (double valsss: tres) {
            System.out.println(valsss / 10.0);
        }
    }

}