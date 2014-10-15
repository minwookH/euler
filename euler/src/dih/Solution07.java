package dih;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution07 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 15.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *정수 배열 d가 있다. 
		다음을 만족하는 트리플의 수를 구하라 
		d[i] < d[j] < d[k], i < j < k 
		
		입력
		첫째 줄에 배열의 크기 N을 입력바는다. 
		두번째 줄에는 N개의 정수를 입력받는다. (스페이스로 구분) 
		
		출력 
		문제의 조건을 만족하는 트리플의 수를 출력한다. 
		
		제한 
		N <= 10^5
		배열에 속한 모든 정수값은 0보다 크고 2^16 - 1 보다 작다. 
		
		예제 입력 #1
		6 
		1 1 2 2 3 4
		
		예제 출력 #1
		4 
		
		예제 설명 #1 
		조건을 만족하는 트리플은 다음과 갔다. 
		(1,2,3) 
		(1,2,4) 
		(1,3,4) 
		(2,3,4) 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numInput = new Scanner(System.in);
		//int [] v = {1,1,2,2,3,4};
		int [] v = {4,2,8,3,1,8,6,1};
		
		
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
		
		for(int i : v){
			System.out.println("! ; "+i);
			a.add(v[i]);
			b.add(v[i]);
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
