// Create an ArrayNames class that contains only a main method.  Create an array of type String containing elements with a first and last name.
// Part 1 - print the array

// Part 2 - print the array after switching the first and last name in each element so it prints last name before space.

// Part 3 - print the array after each element shifts one position circularly to the right.


public class ArrayNames {
    public static void main(String[] args) {
        String[] names = {"Sangeeth Menachery", "BOBBY Bob", "Logan Flumming", "Elon Musk"};
        
        for(String name : names) {
            System.out.println(name);
        }

        for(int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(names[i].indexOf(" ") + 1) + " " + names[i].substring(0, names[i].indexOf(" "));
            System.out.println(names[i]);
        }

        


    }
}
