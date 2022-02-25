//Sangeeth Menachery
//Exercise 6.1
//Use array and its values for functions

public class ArrayAssignmentMenachery {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};; 
    String[] arr = {"Hello", "World", "!"};
    public int findNumber(String word) {
        int count = 0;

        for(String x : arr) {
            if(x.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public int findMax() {
        int largest = 0;
        for(int x : array) {
            if(x > largest) {
                largest = x;
            }
        }
        return largest;
    }

    public int findMin() {
        int smallest = 0;
        int[] arr = {0, 1, 2, 3, 4, 5};
        for(int x : arr) {
            if(x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public Double findAvergage() {
        int sum = 0;
        double avg = 0;
        for(int x : array) {
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
       String newArray = "";
       for(int x : array) {
           
       }
       return newArray;
    }


    public static void main(String[] args) {
       System.out.println("Hello");
    }
}
