package numSum;

import java.util.ArrayList;

public class Test {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 8. 1.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "1,2,4,7,9";
		String input2 = "1,2,3,1,2,3";
		String input3 = "1,2,3,4,5,6,7";
		String input4 = "0,1,2,3,0,1,2,3,4";
		String input5 = "0,0,1";
		
		int count = 0;
		
		String[] num = input4.split(",");
		
		int[] intNum = new int[num.length];
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<num.length ; i++){
			a.add(Integer.parseInt(num[i]));
			intNum[i] = Integer.parseInt(num[i]);
		}
		/*
		for(int i=0; i<num.length ; i++){
			System.out.println(num[i]);
		}
		System.out.println("----------------");
		for(int i=0; i<num.length ; i++){
			System.out.println(intNum[i]);
		}*/
		quickSort(a, 0, num.length-1);
		
		System.out.println(a);
		
		count = num.length / 2;
			
		ArrayList<Integer> zero = new ArrayList<Integer>();
		
		double leftNum =0;
		double rightNum =0;
		
		int left = num.length-count;
		System.out.println("num : "+num.length+" , count : "+ count);
		int right = count;
		int zeroCount=0;
		
		int i = 0;
		
		boolean leftTime = true;
		while(left > 0){
			
			if(a.get(i) == 0){
				zero.add(a.get(i));
				a.remove(i);
			}else{
				if(leftTime){
					System.out.println("왼쪽 수 : "+left);
					System.out.println("자리 수 : "+Math.pow(10, left-1));
					leftNum = leftNum + (a.get(i)*Math.pow(10, left-1));
					left--;
					leftTime = false;
				}else{
					System.out.println("오른쪽 수 : "+right);
					System.out.println("자리 수 : "+Math.pow(10, right-1));
					rightNum = rightNum + (a.get(i)*Math.pow(10, right-1));
					right--;
					leftTime = true;
				}
			}
			
			if(zero.size() == num.length-1){
				System.out.println(-1);
				break;
			}
		}
		
		System.out.println("left : "+leftNum+" , right : "+rightNum+" sum = "+(leftNum+rightNum));
		
	}
	
	static void quickSort(int[] list, int left, int right) 
	{
		int pivot, i, j, temp;

		if (left < right) 
		{
			i = left;
			j = right;
			pivot = list[left];

			while (i < j) 
			{
				while (list[j] > pivot)
					j--;
				while (i < j && list[i] <= pivot)
					i++;

				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
			
			list[left] = list[j];
			list[j] = pivot;

			quickSort(list, left, j - 1);
			quickSort(list, j + 1, right);
		}
	}
	
	static void quickSort(ArrayList<Integer> list, int left, int right) 
	{
		int pivot, i, j, temp;

		if (left < right) 
		{
			i = left;
			j = right;
			pivot = list.get(left);

			while (i < j) 
			{
				while (list.get(j) > pivot)
					j--;
				while (i < j && list.get(i) <= pivot)
					i++;

				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
			list.set(left, list.get(j));
			list.set(j, pivot);

			quickSort(list, left, j - 1);
			quickSort(list, j + 1, right);
		}
	}
}
