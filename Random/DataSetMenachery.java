import java.util.*;

public class DataSetMenachery {
    int[] array;
    int sum = 0;
    public DataSetMenachery(int[] array) {
        this.array = array;
    }

    public int getSum() {
        if (array.length == 0) {
            return 0;
        } else {
            sum += array[0];
            array = Arrays.copyOfRange(array, 1, array.length);
            getSum();
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {
            2,
            -6,
            3,
            8,
            14,
            0
        };
        DataSetMenachery test = new DataSetMenachery(arr);
        System.out.println("Sum of 1st test case: " + test.getSum());

        int[] arr2 = {
            25,
            -63,
            323,
            84,
            145,
            5
        };
        DataSetMenachery test2 = new DataSetMenachery(arr2);
        System.out.println("Sum of 2nd test case: " + test2.getSum());

        int[] arr3 = {
            0
        };
        DataSetMenachery test3 = new DataSetMenachery(arr3);
        System.out.println("Sum of 3rd test case: " + test3.getSum());

    }
}