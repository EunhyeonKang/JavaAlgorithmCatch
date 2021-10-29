package week1;

//1482. Minimum Number of Days to Make m Bouquets
public class binary_2 {
    public static int minDays(int[] bloomDay, int m, int k) {
        int minFlower = m * k;
        if (bloomDay.length < minFlower) {
            return -1;
        }
        int max = 0;
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        int low = 1, high = max;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int flower = 0, bouq = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    flower++;
                    if (flower == k) {
                        bouq++;
                        flower = 0;
                    }
                } else {
                    flower = 0;
                }
            }
            if (bouq < m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1)); //3
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 2)); //-1
        System.out.println(minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));//12
        System.out.println(minDays(new int[]{1,10,2,9,3,8,4,7,5,6}, 4, 2)); //9
    }
}
