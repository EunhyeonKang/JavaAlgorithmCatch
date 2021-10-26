package week1;

import java.util.ArrayList;
import java.util.List;

public class arr_1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		kidsWithCandies(arr, extraCandies);
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int maxChild = 0;
		for (int x : candies)
			maxChild = Math.max(maxChild, x);
		for (int x : candies) {
			if (x + extraCandies >= maxChild)
				result.add(true);
			else
				result.add(false);
		}
		return result;
	}

}
