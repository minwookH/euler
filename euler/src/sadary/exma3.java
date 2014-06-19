package sadary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class exma3 {

	static HashMap<Integer, ArrayList<Integer>> ladderLeft = new HashMap<Integer, ArrayList<Integer>>();
	static int finishNum =0;
	static int finishHeight =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputText = "";
		int height;
		int number;
		
		System.out.println("사다리 정보를 입력하세요(x는 입력 완료).");
		while(!inputText.equals("x")){
			
			try {
				FileInputStream fis = new FileInputStream("src/sadary/input.txt");
				Scanner s = new Scanner(fis);
				
				//while(s.hasNext()){
				while(!"x".equals(inputText)){
					inputText = input.nextLine();
					//inputText = s.nextLine();
					if("x".equals(inputText)){
						System.out.println("x");
						break;
					}
					if(inputText.indexOf(" ") < 0){
						System.out.println("'숫자 숫자' 형식으로 입력");
						continue;
					}
					height = Integer.parseInt(inputText.substring(0, inputText.indexOf(" ")));
					number = Integer.parseInt(inputText.substring(inputText.indexOf(" ")+1));
					System.out.println(height+" "+number);
					if(finishHeight < height){
						finishHeight = height;
					}
					if(finishNum < number){
						finishNum = number;
					}
					if(ladderLeft.get(number) == null){
						ladderLeft.put(number, new ArrayList<Integer>());
					}
					ladderLeft.get(number).add(height);
				}
				finishNum++;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*inputText = input.nextLine();
			if("x".equals(inputText)){
				System.out.println("x");
				break;
			}
			if(inputText.indexOf(" ") < 0){
				System.out.println("'숫자 숫자' 형식으로 입력");
				continue;
			}
			height = Integer.parseInt(inputText.substring(0, inputText.indexOf(" ")));
			number = Integer.parseInt(inputText.substring(inputText.indexOf(" ")+1));
			
			if(finish < height){
				finish = height;
			}
			if(ladder.get(number) == null){
				ladder.put(number, new ArrayList<Integer>());
			}
			if(ladder.get(number+1) == null){
				ladder.put(number+1, new ArrayList<Integer>());
			}
			
			ladder.get(number).add(height);
			ladder.get(number+1).add(height);*/
		}
		System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요(x는 입력 완료).");
		inputText = "";
		long startTime;
		long estimatedTime;
		while(!inputText.equals("x")){
			
			
			try {
				FileInputStream fis = new FileInputStream("src/sadary/result.txt");
				Scanner s = new Scanner(fis);
				startTime = System.currentTimeMillis();
				while(s.hasNext()){
					inputText = s.nextLine();
					if("x".equals(inputText)){
						System.out.println(inputText);
						break;
					}
					//startTime = System.currentTimeMillis();
					System.out.println(inputText);
					result(1,Integer.parseInt(inputText));
					//estimatedTime = System.currentTimeMillis() - startTime;
					//System.out.println("took " + estimatedTime + " ms");
				}
				estimatedTime = System.currentTimeMillis() - startTime;
				System.out.println("took " + estimatedTime + " ms");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			/*inputText = input.nextLine();
			if("x".equals(inputText)){
				break;
			}
			startTime = System.currentTimeMillis();
			result(1,Integer.parseInt(inputText));
			estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("took " + estimatedTime + " ms");*/
		}
	}
	
	static Object result(int height, int num){
		//System.out.println("height : "+height+" , num : "+num);
		if(finishHeight < height){
			System.out.println("result : "+num);
			return 0;
		}
		
		if(ladderLeft.get(num) != null && ladderLeft.get(num).indexOf(height) > -1 && finishNum >= num){
			//System.out.println("일");
			num++;
			height++;
		}else if(ladderLeft.get(num-1) != null && ladderLeft.get(num-1).indexOf(height) > -1 && finishNum >= num){
			//System.out.println("이");
			num--;
			height++;
		}else{
			//System.out.println("삼");
			height++;
		}
		return result(height, num);
	}

}
