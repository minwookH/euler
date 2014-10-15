package dih;

import java.util.Scanner;

public class Solution04 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 14.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 *	P 와 Q 두개의 점이 주어졌을 때 이 두 점의 대칭점(the symmetric point) Q를 구하라 

		입력 
		첫줄에 테스트 케이스의 수 T를 입력받느다. 
		두 번째 줄버터 각 줄마다 각각의 테스트 케이스의 Px Py Qx Qy를 입력 받는다. 입력 받는 모든 값은 정수이다. 
		
		출력 
		각줄에 Qx와 Qy를 출력한다. 
		
		제한
		1 <= T <= 15
		-100 <= x, y <=100
		
		
		입력 예제 #1
		1
		0 0 1 1
		
		출력 예제 #1 
		2 2
		
		입력 예제 #2
		10
		1 1 2 2
		4 3 5 2
		2 4 5 6
		1 2 2 2
		1 1 1 1
		1 2 2 1
		1 8 7 8
		9 1 1 1
		8 4 3 2
		7 8 9 1
		
		출력 예제 #2
		3 3
		6 1
		8 8
		3 2
		1 1
		3 0
		13 8
		-7 1
		-2 0
		11 -6

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numInput = new Scanner(System.in);
		
		int a= numInput.nextInt();
		
		int[][] b = new int[a][4];
		
		for(int i=0;i<a;i++){
			for(int j=0; j<4;j++){
				b[i][j]=numInput.nextInt();
			}
		}
		
		for(int i=0;i<a;i++){
			
			int f1 = b[i][2]-b[i][0];
			int f2 = b[i][3]-b[i][1];
			int ff1 = b[i][2] + f1;
			int ff2 = b[i][3] + f2;
			//System.out.println("!!!!!!!!!!!");
			//System.out.println(f1 + " " + f2);
			//System.out.println();
			System.out.println(ff1 + " " + ff2);
			//System.out.println("!!!!!!!!!!!");
		}
		
	}
}
