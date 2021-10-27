package week1;
//1769. Minimum Number of Operations to Move All Balls to Each Box

public class arr_3 {
    public static int[] minOperations(String boxes) {
        int k = boxes.length();
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            // move to i box
            int moves = 0;
            for (int j = 0; j < k; j++) {
                int distance = Math.abs(i - j);
                moves += distance * (boxes.charAt(j) - '0');
            }
            res[i] = moves;
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i : minOperations("110")) {
            System.out.print(i + ",");
        }
    }
}
