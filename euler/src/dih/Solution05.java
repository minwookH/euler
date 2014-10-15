package dih;

import java.util.Scanner;

public class Solution05 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 14.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *자연수 N을 입력 받아 이 수를 뒤집은 값 NR을 구한다. 예를 들어 N=123450이면 NR=54321이 된다.  그 후 N + NR의 값을 출력한다. 
		단, NR을 구할 때 문자열 함수나 배열을 이용하지 않고 정수 연산(+ - * / %)만을 사용한다. 
		
		입력
		첫째 줄에 자연수 N이 주어진다. 
		
		출력
		N + NR의 값을 첫줄에 표시한다. 
		
		예제 입력 #1
		123450 
		
		예제 출력 #1
		177771

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numInput = new Scanner(System.in);
		
		int n = numInput.nextInt();
		
		
		int c = 0;
		int input = n;
		int re=0;
		
		while(input>0){
			int a = input%10;
			System.out.println("a ; "+a);
			if(c ==0 && a ==0){
				input = input/10;
			}else{
				System.out.println("곱 ; "+(int)Math.pow(10, c));
				re = re + ((int)Math.pow(10, c) * a);
				input = input/10;
			}
			c++;
		}
		
		System.out.println("n : "+ n +", re : "+ re+" , 합 : "+(n+re));
	}

}
