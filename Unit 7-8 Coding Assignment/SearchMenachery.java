// Sangeeth Menachery
// Exercise 8.1
// Use Search Algorithms

public class SearchMenachery {
    int[] nums = {
        4,
        20,
        30,
        49,
        40,

    };

    public String seqsearch(int findNum) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findNum) {
                return "Location of " + findNum + " is at " + i;
            }
        }
        return "Item not found | -1";
    }

    public void selectionsort() {
        int min;
        for (int i = 0; i < nums.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public int binarySearch(int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchMenachery tests = new SearchMenachery();
        System.out.println(tests.seqsearch(20));
        tests.selectionsort();
        System.out.println("Location is at index: " + tests.binarySearch(49));
    }
}