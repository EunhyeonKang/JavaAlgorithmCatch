package week1;

public class arr_3 {

	public static void main(String[] args) {
		String boxes = "001011";
		
		for(int x : minOperations(boxes)) {
			System.out.print(x+" ");
		}
	}
	public static int[] minOperations(String boxes) {
		int n = boxes.length();
		int[] answer = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(boxes.charAt(j)-'0'==1) {
					sum += Math.abs(i-j);
				}
			}
			answer[i]=sum;
			sum=0;
		}
		
        return answer;
    }
}
