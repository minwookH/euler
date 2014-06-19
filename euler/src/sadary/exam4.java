package sadary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class exam4 {

	static HashMap<Integer, ArrayList<Integer>> ladder = new HashMap<Integer, ArrayList<Integer>>();
	static int finish =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputText = "";
		int height;
		int number;
		
		System.out.println("사다리 정보를 입력하세요(x는 입력 완료).");
		while(!inputText.equals("x")){
			inputText = input.nextLine();
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
			ladder.get(number+1).add(height);
		}
		System.out.println(ladder);
		System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요(x는 입력 완료).");
		inputText = "";
		long startTime;
		long estimatedTime;
		while(!inputText.equals("x")){
			inputText = input.nextLine();
			if("x".equals(inputText)){
				break;
			}
			startTime = System.currentTimeMillis();
			result(1,Integer.parseInt(inputText));
			estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("took " + estimatedTime + " ms");
		}
	}
	
	static Object result(int height, int num){
		if(finish < height){
			System.out.println("결과 : "+num);
			return 0;
		}
		if(ladder.get(num).indexOf(height) < 0){
			height++;
		}else if(ladder.get(num+1) != null && ladder.get(num+1).indexOf(height) > -1){
			num++;
			height++;
		}else if(ladder.get(num-1) != null && ladder.get(num-1).indexOf(height) > -1){
			num--;
			height++;
		}
		return result(height, num);
	}

}
