//Sangeeth Menachery
//


public class ArrayNames {
    public static void main(String[] args) {
        String[] names = {
            "Sangeeth Menachery",
            "BOBBY Bob",
            "Logan Flumming",
            "Elon Musk"
        };

        for (String name: names) {
            System.out.println(name + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(names[i].indexOf(" ") + 1) + " " + names[i].substring(0, names[i].indexOf(" "));
            System.out.println(names[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 0; i < names.length; i++) {
            if (i == 0)
                System.out.println(names[names.length - 1]);
            else if (i == names.length - 1)
                System.out.println(names[0]);
            else
                System.out.println(names[i]);
        }

    }
}