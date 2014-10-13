package dih;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution01 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 13.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *	N개의 정수가 주어졌을 때 그 차가 K인 정수 쌍의 수를 구하시오 

		입력
		첫째 줄에 N, K를 입력받는다. (스페이스로 구분) 
		두번째 줄부터 N개의 정수를 입력받는다. 단, 모든 정수는 그 값이 서로 달라야 한다. (스페이스로 구분)
		
		출력 
		차가 K인 정수 쌍의 수를 출력한다. 
		
		제한 
		N <= 10^5
		0 < K < 10^9 
		각 정수는 0보다 크고 2^31 - 1 보다 작다. 
		
		예제 입력 #1
		5 2 
		1 5 3 4 2 
		
		예제 출력 #1
		3
		
		예제 입력 #2
		10 1 
		363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 
		
		예제 출력 #2
		0 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numInput = new Scanner(System.in);
		
		boolean aa = true;
		
		int num = 0;
		int cha = 0;
		
		while(aa){
			num = numInput.nextInt();
			cha = numInput.nextInt();
			
			System.out.println(num + " , " + cha);
			
			if(num > (int)Math.pow(10, 5)){
				System.out.println("N은 10^5 이하로 입력하세요.");
			}else if(cha <= 0 || cha >= (int)Math.pow(10, 9)){
				System.out.println("K는 0 < K < 10^9  사이의 수로 입력하세요.");
			}else{
				aa = false;
			}
		}
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<num ; i++){
			int input = numInput.nextInt();
			if(!a.contains(input)){
				a.add(input);
			}
		}
		
		Collections.sort(a);
		Collections.reverse(a);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
		int fin=0;
		
		while(a.size() > 1){
			
			for(int j = 1; j<a.size() ; j++){
				if(a.get(0) - a.get(j) == cha){
					System.out.println("두수 : "+a.get(0) +" , "+ a.get(j));
					fin++;
				}
			}
			a.remove(0);
		}
		System.out.println("결과 : "+fin);
		
		
		
		/*Iterator<Integer> i = a.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}*/

	}

}
