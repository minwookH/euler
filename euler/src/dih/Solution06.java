package dih;

import java.util.Scanner;

public class Solution06 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 14.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 *[A1][A2]....[An]으로 이루어진 배열이 있다. 이 배열에서 다음의 조건을 만족하는 요소 Ai가 있는지 검사하는 프로그램을 작성하시오
		1. Ai의 왼쪽에 있는 요소들의 합과 오른쪽에 있는 요소들의 합이 동일하다. 
		2. 왼쪽이나 오른쪽에 요소가 없다면 (A1이거나 An이라면) 합은 0으로 간주한다. 
		
		즉 [A1] + [A2].... [Ai-1] = [Ai+1] + [Ai+2] + [An] 
		
		입력 
		첫 번째 줄에 테스트 케이스의 수를 입력한다. 
		각 테스트 케이스에서 첫번째 줄은 배열의 크기 N을 그 다음 줄은 스페이스로 구분한 배열의 요소들을 입력받는다. 
		
		출력 
		각각의 테스트 케이스에 대해서 Ai가 존재하면 YES를 그렇지 않으면 No를 출력한다. 
		
		입력 예제 #1 
		2
		3
		1 2 3
		4
		1 2 3 3
		
		출력 예제 #1
		NO
		YES
		
		예제 설명 #1 
		첫번째 케이스에서는 만족하는 것을 찾을 수 없다. 
		두번째 케이스에서는 A[1] + A[2] = A[4]이다. 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numInput = new Scanner(System.in);
		
		int test = numInput.nextInt();
		
		for(int k=0; k<test ; k++){
			int n = numInput.nextInt();
			
			int sum=0;
			int succes =0; 
			int [] v = new int[n];
			
			for(int i =0; i<n;i++){
				v[i] = numInput.nextInt();
				sum= sum + v[i];
			}
			int lsum = 0;
			for(int j=1; j<v.length-1 ; j++){
				lsum = lsum + v[j-1];
				if(lsum == sum-v[j]-lsum){
					succes++;
				}
			}
			
			if(succes>0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
		
	}

}
