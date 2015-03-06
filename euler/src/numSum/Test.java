package numSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

	/**
	 * 1. 주어진 숫자들을 이용하여 2개의 숫자를 만든다.
	 * 2. 두수를 더하여 최소값이 나오도록한다.
	 * 3. 0은 맨 앞에 올 수 업ㅄ다.
	 * 4. 두수를 만들 수 업는 경우(ex. 한 쪽이 0) -1을 반환
	 * 
	 *	1, 2, 4, 7, 9 → 176
        1, 2, 3, 1, 2, 3 → 246
        1, 2, 3, 4, 5, 6, 7 → 1603
        0, 1, 2, 3, 0, 1, 2, 3, 4 → 11257
        0, 0, 1 → -1
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "1,2,4,7,9";
		String input2 = "1,2,3,1,2,3";
		String input3 = "1,2,3,4,5,6,7";
		String input4 = "0,1,2,3,0,1,2,3,4";
		String input5 = "0,0,1";
		String input6 = "0,0,0,0,3,0,0,1,4";
		
		String[] num1 = input1.split(",");
		String[] num2 = input2.split(",");
		String[] num3 = input3.split(",");
		String[] num4 = input4.split(",");
		String[] num5 = input5.split(",");
		String[] num6 = input6.split(",");
		
		numSum(num1);
		numSum(num2);
		numSum(num3);
		numSum(num4);
		numSum(num5);
		numSum(num6);
		
	}
	
	/**
	 * 
	 * 
	 * 입력된 숫자들의 수를 반으로 쪼개서 두개의 숫자로 만든다.
	 * 작은 숫자부터 앞자리에 넣는다
	 * 만들어진 두수를 더하면 최소값이 된다.
	*/
	public static void numSum(String[] num){

		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int i=0; i<num.length ; i++){
			numList.add(Integer.parseInt(num[i]));
		}
		
		System.out.println(numList);
		
		//quickSort(numList, 0, num.length-1);
		
		Collections.sort(numList);// 정렬
		System.out.print("정렬 : "+numList);
		
		int count = 0;
		count = num.length / 2;// 입력된 개수를 두개로 나누기 위한 수
		ArrayList<Integer> zero = new ArrayList<Integer>();// 0을 담아둘 리스트
		
		int leftNum =0; // 왼쪽 수
		int rightNum =0; // 오른쪽 수
		
		int left = num.length-count; // 왼쪽수의 자리수
		int right = count; // 오른쪽수의 자리수
		
		int i = 0; // numList의 인댁스
		boolean leftTime = true; // 왼쪽수와 오른쪽수에 번갈아 가면서 숫자를 넣어주기 위한 체크값
		while(!numList.isEmpty()){
			if(numList.get(i) == 0){//0이면 zero리스트에 추가하고, 숫자리스트에서 삭제
				zero.add(numList.get(i));
				numList.remove(i);
			}else if(!zero.isEmpty() && (leftNum != 0 && rightNum != 0)){ // zero리스트에 0이 있고, 왼쪽수와 오른쪽수 모두 0이 아닐때
				if(leftTime){
					left--;// 자리수 줄이기
					leftTime = false;// 오른쪽수로 넘기기 위한 체크
					zero.remove(i);// zero 리스트에서 0 하나 빼기
				}else{
					right--;// 자리수 줄이기
					leftTime = true;// 왼쪽수로 넘기기 위한 체크
					zero.remove(i);// zero 리스트에서 0 하나 빼기
				}
			}else if(!numList.isEmpty()){// 숫자 리스트가 비어있지 않다면
				if(leftTime){
					leftNum = leftNum + (numList.get(i) * (int)Math.pow(10, left-1));// 왼쪽수 * 자리수
					left--;// 자리수 줄이기
					leftTime = false;// 오른쪽수로 넘기기 위한 체크
				}else{
					rightNum = rightNum + (numList.get(i) * (int)Math.pow(10, right-1));// 오른쪽수 * 자리수
					right--;// 자리수 줄이기
					leftTime = true;// 왼쪽수로 넘기기 위한 체크

				}
				numList.remove(i);// 숫자 리스트에서 숫자 삭제
			}

		}
		if(leftNum ==0 || rightNum == 0){// 숫자 2개를 만들수 없다면
			System.out.println(" -> " + -1);
		}else{
			System.out.println(" -> " + "leftNum("+leftNum+") + rightNum("+rightNum+") = " +(leftNum+rightNum));
		}
		
		System.out.println();
	}
	
	
	/*public static void quickSort(ArrayList<Integer> list, int left, int right) 
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
	}*/
}
