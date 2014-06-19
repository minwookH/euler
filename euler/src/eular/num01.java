package eular;

import java.util.HashSet;
import java.util.Set;

public class num01 {

	/**
	 * @작성일         : 2014. 6. 17.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
	 *					 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=5;
		int sum=0;
		HashSet<Integer> c = new HashSet<Integer>();
		
		for(int i=1 ; i<1000 ; i++){
			if(i%a == 0 || i%b == 0){
				if(!c.contains(i)){
					c.add(i);
					sum += i;
				}
			}
		}
		System.out.println("sum : " + sum);
	}

}
