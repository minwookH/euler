package eular;

import java.util.ArrayList;

public class num10 {

	/**
	 * @작성일         : 2014. 6. 27.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
                         이백만(2,000,000) 이하 소수의 합은 얼마입니까?
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int sum = 0;
		prime.add(2); 
		
		for (int i = 2; ; i++) {
			for (int j = 0; prime.size() > j; j++) {
				if (i % prime.get(j) == 0) break; // 소수가 아닌 경우 pass
				
				if (j + 1 == prime.size()){ // 소수일 때
					prime.add(i);
					sum = sum+i;
				}	
			}
			if(i == 2000000){
				System.out.println(sum+2);
				break;
			}
		}
	}

}
