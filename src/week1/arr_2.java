package week1;

public class arr_2 {

	public static void main(String[] args) {
		int[] distance = { 7,10,1,12,11,14,5,0};
		int start = 7, destination = 2;
		System.out.println(distanceBetweenBusStops(distance, start, destination));
	}

	public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int n = distance.length;
		int i = (start+1)%n;
		int sum=distance[start];
		int min = Integer.MAX_VALUE;
		while(i!=start) {
			if(i==destination) {
				min = Math.min(min, sum);
				sum=0;
			}
			sum+=distance[i];
			i = (i+1)%n;
		}
		min = Math.min(min, sum);
		
		return min;
	}
}
