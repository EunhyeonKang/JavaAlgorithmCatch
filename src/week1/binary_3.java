package week1;

// 34. Find First and Last Position of Element in Sorted Array
public class binary_3 {
    public static int[] searchRange(int[] nums, int target) {
        int max = - 1, min = - 1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] == target) {
                min = mid;
                high = mid - 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.print("min  "+ min);

        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] == target) {
                max = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(", max  "+ max);

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        searchRange(new int[]{5,7,7,7,8,8}, 8);
        searchRange(new int[]{5,7,7,8,9,10}, 8);
        searchRange(new int[]{}, 0);
    }
}
