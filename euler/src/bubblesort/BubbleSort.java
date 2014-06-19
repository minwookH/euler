package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {31,7,5,24,9,1,6,4,66};
		String order = "DESC"; // ASC:오름차순 , DESC:내림차순
		int count = arr.length;
		int temp = 0;
		for(int i = 1 ; i < count ; i++){
			for(int j = 0 ; j < count-i ; j++){
				if(order.equals("DESC") ? arr[j] < arr[j+1] : arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
	/*static int[] sort(int arr[], String order){
		int count = arr.length;
		int temp = 0;
		for(int i = 1 ; i < count ; i++){
			for(int j = 0 ; j < count-i ; j++){
				if(order.equals("DESC") ? arr[j] < arr[j+1] : arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}*/
