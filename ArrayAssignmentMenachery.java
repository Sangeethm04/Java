//Sangeeth Menachery
//Exercise 6.1
//Use array and its values for functions


public class ArrayAssignmentMenachery {
    private static int[] array = {
        2,
        2,
        6,
        4,
        1,
        6,
        7,
        8,
        9,
        10
    };;
    public int findNumber(int number) {
        int count = 0;

        for (int x: array) {
            if (x == number) {
                count++;
            }
        }
        return count;
    }

    public int findMax() {
        int largest = 0;
        for (int x: array) {
            if (x > largest) {
                largest = x;
            }
        }
        return largest;
    }

    public int findMin() {
        int smallest = array[0];
        for (int x: array) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public Double findAvergage() {
        int sum = 0;
        double avg = 0;
        for (int x: array) {
            sum += x;
        }
        avg = sum / array.length;
        return avg;
    }

    public void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public String reverse() {
        for (int i = 0; i < array.length / 2; i++) {
            swap(i, array.length - 1 - i);
        }

        String result = "";
        for (int x: array) {
            result += x + ", ";
        }
        return result;
    }

    public void numericOrder() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int x: array) {
            System.out.print(x + " ");
        }
    }

}