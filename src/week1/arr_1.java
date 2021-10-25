package week1;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class arr_1 {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<>();
		int max = 0;

		for (int n : candies) {
			if (n > max) {
				max = n;
			}
		}

		for (int n : candies) {
			if (n + extraCandies >= max) {
				res.add(true);
			} else {
				res.add(false);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
	}

}
