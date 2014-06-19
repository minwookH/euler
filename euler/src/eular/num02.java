package eular;

import java.util.ArrayList;
import java.util.HashSet;

public class num02 {

	/**
	 * @작성일         : 2014. 6. 17.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
  						 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
						 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		System.out.println("start");
		for(int i =0; i<4000000; i++){
			if(i == 0){
				b.add(i+1);
			}else if(i == 1){
				b.add(i+1);
				sum += i+1;
			}else{
				b.add(b.get(i-1)+b.get(i-2));

				if(b.get(i)>4000000){
					break;
				}
				if(b.get(i)%2 == 0){
					sum += b.get(i);
				}
			}
			//System.out.println("index = "+(i-1)+" , value = "+b.get(i-1));
		}
		System.out.println("sum : "+sum);
	}

}
