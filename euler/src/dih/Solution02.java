package dih;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution02 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 13.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *	1년에 두번 성장기를 가지는 가상의 나무가 있다. 봄에 맞이하는 첫번째 성장기에는 현재 키의 두배로 자라고, 여름에 맞이하는 두번째 성장기에는 1m를 자란다. 
		봄의 초입기인 지금 나무의 키는 1m이다. N번의 성장기를 거치고 나면 이 가상의 나무의 키는 얼마일까?
		
		입력
		첫째 줄에 테스트 케이스의 수 T를 입력받는다. 다음 줄부터 각 줄마다 성장기 횟수 N을 T만큼 반복해서 입력한다. 
		
		출력
		성장기의 횟수가 지난 다음의 나무의 키를 출력한다. T만큼 반복되며 한줄에 한번씩 출력한다.
		
		예제 입력 #1
		2
		0
		1
		
		예제 출력 #1
		1
		2
		
		예제 입력 #2
		3
		6
		5
		4
		
		예제 출력 #2
		15
		14
		7
		
		예제 입력 #3
		5
		14
		13
		12 
		11 
		15
		
		예제 출력 #3
		255 
		254 
		127 
		126 
		510
	 *
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numInput = new Scanner(System.in);
		
		
		int caseNum = numInput.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		
		for(int i=0; i<caseNum; i++){
			h.add(numInput.nextInt());
		}
		
		for(int k=0;k<h.size();k++){
			int start = 1;
			boolean b = true;
			for(int j=0; j<h.get(k) ; j++){
				if(h.get(k) == 0){
					System.out.println("브레이크");
					break;
				}else if(b){
					start=start*2;
					b = false;
				}else{
					start++;
					b = true;
				}
			}
			System.out.println("길이 : "+ start);
		}
		
	}

}
