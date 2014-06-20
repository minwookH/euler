package eular;

import java.util.ArrayList;

public class num07 {

	/**
	 * @작성일         : 2014. 6. 20.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 * 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
       이 때 10,001번째의 소수를 구하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		prime.add(2); 
		
		for (int i = 2; ; i++) {
			for (int j = 0; prime.size() > j; j++) {
				if (i % prime.get(j) == 0) break; // 소수가 아닌 경우 pass
				
				if (j + 1 == prime.size()) // 소수일 때
					prime.add(i);
			}
			if(prime.size() == 10001){
				System.out.println(prime.get(10000));
				break;
			}
		}
	}

}
