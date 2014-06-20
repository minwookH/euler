package eular;

import java.util.ArrayList;

public class num03 {

	/**
	 * @작성일         : 2014. 6. 17.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
						 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
						 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 600851475143L;
		boolean a = true;
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		int i = 2;
		while(n>=i){
			if(n%i == 0){
				c.add(i);
				n = n/i;
			}else{
				i++;
			}
		}
		System.out.println("c : "+c);
		System.out.println("i = "+i+" , n = "+n);
	}

}
