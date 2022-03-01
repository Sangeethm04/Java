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
        String result = "";
        for(int i = array.length - 1; i >= 0; i--) {
            result += array[i] + ", ";
        }
        return result;
    }

    public void numericOrder() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {
        ArrayAssignmentMenachery a = new ArrayAssignmentMenachery();
        System.out.println(a.findNumber("Hello"));
        System.out.println(a.findMax());
        System.out.println(a.findMin());
        System.out.println(a.findAvergage());
        a.swap(0, 1);
        System.out.println(a.reverse());
        a.numericOrder();
       System.out.println("Hello");
    }
}
