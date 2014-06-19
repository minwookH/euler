package sadary;

import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 10;
		int num = 6;
		
		int[][] arr = make(height,num);
		search(arr, height, num);
	}
	
	static String input(){
		Scanner input = new Scanner(System.in);
		System.out.print(">");
		return input.nextLine();
	}
	
	static int[][] make(int height, int num){
		int[][] arr = new int[height][num];
		String inputText = null;
		
		int inputHeight =0;
		int inputNum = 0;
		
		System.out.println("사다리 정보를 입력하세요(x는 입력 완료).");
		
		while(!"x".equals(inputText)){
			//System.out.print(">");
			inputText = input();
			
			if("x".equals(inputText)){
				System.out.println("x");
				break;
			}
			
			if(inputText.indexOf(" ") < 0){
				System.out.println("'숫자 숫자' 형식으로 입력");
				continue;
			}
			inputHeight = Integer.parseInt(inputText.substring(0, inputText.indexOf(" ")))-1;
			inputNum = Integer.parseInt(inputText.substring(inputText.indexOf(" ")+1))-1;
			
			if(inputHeight >= height || inputNum >= num){
				System.out.println("올바른 숫자가 아니다");
			}else if(arr[inputHeight][inputNum] == 1){
				System.out.println("이미 만드어진 다리");
			}else if(inputNum == 0){
				if(arr[inputHeight][inputNum+1] == 1){
					System.out.println("한줄에 연속해서 만들수 없다1");
					continue;
				}
				arr[inputHeight][inputNum] = 1;
			}else if(num == inputNum+1){
				System.out.println("마지막 번호라인에는 만들수 없다");
			}else if(arr[inputHeight][inputNum-1] == 1 || arr[inputHeight][inputNum+1] == 1){
				System.out.println("한줄에 연속해서 만들수 없다2");
			}else{
				arr[inputHeight][inputNum] = 1;
			}
		}
		return arr;
	}
	
	static void search(int[][] arr,int height, int num){
		
		System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요(x는 입력 완료).");
		
		String selectNum = null;
		int intNum = 0;
		while(!"x".equals(selectNum)){
			long startTime = System.currentTimeMillis();
			selectNum = input();
			if("x".equals(selectNum)){
				break;
			}
			intNum = Integer.parseInt(selectNum)-1;
			if(intNum >= num || intNum < 0){
				System.out.println("번호를 잘못 입력하다");
				continue;
			}
			
			int finalHeight=0;
			
			while(finalHeight < height){
				if(intNum==0){
					if(arr[finalHeight][intNum] == 1){
						finalHeight++; intNum++;
					}else{
						finalHeight++;
					}
				}
				else if(arr[finalHeight][intNum] == 1){
					finalHeight++; intNum++;
				}else if(arr[finalHeight][intNum-1] == 1){
					finalHeight++; intNum--;
				}else{
					finalHeight++;
				}
			}
			System.out.println("최종 : "+(intNum+1));
			long estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("took " + estimatedTime + " ms");
		}
	}
}
