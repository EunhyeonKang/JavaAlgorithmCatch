package week1;

// 1184. Distance Between Bus Stops
public class arr_2 {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int front = 0;
		int back = 0;

		if(start > destination) {
			int tmp = start;
			start = destination;
			destination = tmp;
		}
		for (int i=0; i<distance.length; i++) {
			if (start <= i && i < destination) {
				front += distance[i];
			} else {
				back += distance[i];
			}
		}
		return Math.min(front, back);
	}

	public static void main(String[] args) {

	}

}
