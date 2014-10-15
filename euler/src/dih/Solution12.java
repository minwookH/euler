package dih;

public class Solution12 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 15.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *정수 배열 d가 있다. 
		다음을 만족하는 트리플의 수를 구하라 
		d[i] < d[j] < d[k], i < j < k 
		(이러한 트리플을  distinct ascending triples이라고 한다.)
		
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
		
		Advanced 
		이 문제는 위에서 풀었던 문제와 동일하다. 
		단 아래의 조건이 추가된다. 
		
		배열에 속한 모든 정수값은 최대 두번씩만 나올 수 있다. 
		Time Complexity가 O (N Log N)을 만족하도록 한다. 
		
		Hint 
		1) Instead of counting the number of distinct ascending triples, let's count the number of ascending tuples first.
		
		2) Fenwick tree를 이용한다. 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
