
public class ArrayAssignmentMenachery {

    public int findNumber(String word) {
        int count = 0;
        String[] arr = {"Hello", "World", "!"};
        for(String x : arr) {
            if(x.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public int findMax(String word) {
        int largest = 0;
        int[] arr = {0, 1, 2, 3, 4, 5};
        for(int x : arr) {
            if(x > largest) {
                largest = x;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
       
    }
}