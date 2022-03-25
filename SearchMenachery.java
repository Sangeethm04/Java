// Sangeeth Menachery
// Exercise 8.1
// Use Search Algorithms

public class SearchMenachery {
    int[] nums = {
        10,
        20,
        30,
        40
    };

    public String seqsearch(int findNum) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findNum) {
                return "Location of " + findNum + " is at " + i;
            }
        }
        return "Item not found | -1";
    }
    public int binarySearch(int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchMenachery tests = new SearchMenachery();
        System.out.println(tests.seqsearch(20));
        System.out.println(tests.binarySearch(30));
    }
}