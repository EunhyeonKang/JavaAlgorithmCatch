package week1;

import java.util.ArrayList;

public class search_1 {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4 };
		int k = 2;
		System.out.println(findKthPositive(arr, k));
	}

	public static int findKthPositive(int[] arr, int k) {
		int n = arr.length;
		ArrayList<Integer> tmp = new ArrayList<>();
		
		for(int i=1;;i++) {
			if(BS(0, n - 1, i, arr))continue;
			tmp.add(i);
			if(tmp.size()==k)break;
		}
		return tmp.get(k-1);
	}

	private static boolean BS(int start, int end, int key, int[] arr) {
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}
