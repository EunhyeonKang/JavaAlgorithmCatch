package week1;

import java.util.Arrays;

public class search_3 {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
//		int[] arr = {2,2};
//		int target = 3;
//		int[] arr = { 2,1 };
//		int target = 2;
		for (int x : searchRange(arr, target)) {
			System.out.println(x);
		}
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] answer = { -1, -1 };
		if (nums.length == 0)return answer;
		int low = 0;
		int high = nums.length - 1;
		int first, last;
		int mid;
		int cnt = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				first = mid;
				last = mid;
				while (0 < first && nums[first] == nums[first - 1]) {
					first -= 1;
				}
				while (last < high && nums[last] == nums[last + 1]) {
					last += 1;
				}
				answer[0] = first;
				answer[1] = last;
				return answer;
			} else if (nums[mid] <= target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return answer;
	}

}
