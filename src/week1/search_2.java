package week1;

import java.util.Arrays;

public class search_2 {

	public static void main(String[] args) {
		int[] arr = { 1, 10, 3, 10, 2 };
		int m = 3;
		int k = 1;
		System.out.println(minDays(arr, m, k));
	}
	 public static int minDays(int[] bloomDay, int m, int k) {
	        if(m * k > bloomDay.length) return -1;	// 꽃다발 불가능
	        
	        int maxDays = 0;
	        for(int i=0;i<bloomDay.length;i++){
	            maxDays = Math.max(maxDays,bloomDay[i]);
	        }
	        
	        int low = 0; 
	        int high = maxDays; 
	        
	        int minDays = Integer.MAX_VALUE;
	        
	        while(low <= high){
	            int mid = (low + high)/2;
	            if(isPossible(bloomDay,mid,m,k)){
	                high = mid - 1; 
	                minDays = Math.min(minDays,mid);            
	            }else{
	                low = mid + 1;
	            }
	        }        
	        return minDays;
	    }   
	    static boolean isPossible(int[] bloomDays,int d,int m,int k){    
	        int count = 0;
	        int nbq = 0;       
	        for(int i=0;i<bloomDays.length;i++){
	            if(bloomDays[i] <= d)
	                count++;
	            else{
	            	//인접조건
	                if(count >= k){
	                    nbq += count/k;
	                }
	                count = 0;
	            }
	        }
	        nbq += count/k;
	        return nbq >= m;
	    }
}
