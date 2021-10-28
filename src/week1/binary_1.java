package week1;
// 1539. Kth Missing Positive Number
public class binary_1 {
    public static int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int cnt;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            cnt = arr[mid] - (mid + 1);

            if (cnt < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //cnt = arr[left] - (left + 1);
        // arr[left] + (k- cnt) = k + left + 1
        return left + k;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
        System.out.println(findKthPositive(new int[]{2,3}, 1));
        System.out.println(findKthPositive(new int[]{1,2,3,4}, 2));

    }
}
