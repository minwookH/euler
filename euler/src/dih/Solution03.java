package dih;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution03 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 14.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 *	정우성은 장난감을 매우 좋아하는 아들을 위해 장난감을 사러 마트에 갔다. 
		여러 장난감이 있었는데 주어진 예산에서 가장 많은 갯수의 장난감을 사는 것이 목표이다.
		주어진 예산 K원과 장난감들의 가격을 입력 받아 가장 많은 갯수의 장난감을 살 수 있는 조합을 구해 그 갯수를 출력하는 프로그램을 작성하라.
		
		입력 
		첫줄에 두개의 정수 N과  K을 입력받는다(스페이스로 구분). N은 마트에서 팔고 있는 장난감의 수이고 K는 예산이다.
		두번째 줄에는 N개 장난감의 가격을 입력 받는다(스페이스로 구분. 자연수)
		
		출력 
		아들을 위해 살 수 있는 최대한의 장난감 수를 출력한다. 
		
		제한
		1 <= N <= 10^5
		1 <= K <= 10^9
		1 <= 장난감 가격 <= 10^9
		단, 장난감은 하나씩만 구매할 수 있다. 
		
		입력 예제 #1
		6 50 
		1 12 5 111 1000 10 
		
		출력 예제 #1 
		4
		
		예제 설명 #1 
		장난감 수를 최대로 하려면 1, 12, 5, 10원짜리를 사야하며 4개가 된다. 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numInput = new Scanner(System.in);
		
		int N=numInput.nextInt();
		int K=numInput.nextInt();
		
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++){
			C.add(numInput.nextInt());
		}
		
		Collections.sort(C);
		
		boolean b = true;
		
		int f=0;
		
		while(b){
			K=K-C.get(0);
			f++;
			C.remove(0);
			if(K < C.get(0)){
				b = false;
			}
		}
		System.out.println("개수 : " +f);
	}

}
