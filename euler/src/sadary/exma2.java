package sadary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class exma2 {

	static HashMap<Integer, HashMap<Integer, Integer>> ladder = new HashMap<Integer, HashMap<Integer,Integer>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputText = "";
		int height;
		int number;
		
		System.out.println("사다리 정보를 입력하세요(x는 입력 완료).");
		while(!inputText.equals("x")){
			inputText = input.nextLine();
			if(inputText.indexOf(" ") < 0){
				System.out.println("'숫자 숫자' 형식으로 입력");
				continue;
			}
			height = Integer.parseInt(inputText.substring(0, inputText.indexOf(" ")));
			number = Integer.parseInt(inputText.substring(inputText.indexOf(" ")+1));
			if(ladder.get(number) == null){
				ladder.put(number, new HashMap<Integer, Integer>());
			}
			if(ladder.get(number+1) == null){
				ladder.put(number+1, new HashMap<Integer, Integer>());
			}
			
			ladder.get(number).put(height, number);
			ladder.get(number+1).put(height, number+1);
		}
		System.out.println(ladder);
		System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요(x는 입력 완료).");
		inputText = "";
		while(!inputText.equals("x")){
			inputText = input.nextLine();
			result(1,Integer.parseInt(inputText));
		}
	}
	
	static Object result(int height, int num){
		System.out.println("시작 - 높이: "+height+" , 번호 : "+num);
		Set<Integer> keySet = ladder.get(num).keySet();
		for(Integer item : keySet){
			System.out.print("keySet  : ");
			System.out.print(item+" , ");
			System.out.println();
		}		
		
		for(Integer item : keySet){
			System.out.println("유무 - 높이 : "+height+" , 키값 : "+item);
			if(height > item){
				System.out.println("최종 : "+height);
				return 0;
			}
		}
		
		if(!ladder.get(num).containsKey(height)){
			height++;
		}else if(ladder.get(num+1) != null && ladder.get(num+1).containsKey(height)){
			num++;
			height++;
		}else if(ladder.get(num-1) != null && ladder.get(num-1).containsKey(height)){
			num--;
			height++;
		}
		return result(height, num);
	}

}
