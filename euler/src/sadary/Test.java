package sadary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

 public static void main(String[] args) {
  Ladder ladder = new Ladder();
  
  boolean isExit = true;
  Scanner numberInput = new Scanner(System.in);
  int height = 0;
  int line = 0;
  
  System.out.println("사다리 정보를 입력하세요 (x는 입력 완료).");
  while(isExit){
	  
	try {
		FileInputStream fis = new FileInputStream("src/sadary/input.txt");
		Scanner s = new Scanner(fis);
		while(s.hasNext()){
		   if (s.hasNext("x")) {
		    isExit = false;
		    System.out.println("최대 높이 : " + ladder.getMaxHeight());
		    System.out.println(ladder.getLadderMap());
		    break;
		   } else {
		    height = s.nextInt();
		    line = s.nextInt();
		    
		    ladder.setLadderInfo(height, line);
		   }
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
  
  
  isExit = false;
  Scanner startNum = new Scanner(System.in);
  line = 0;
  int result = 0;
  System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요 (x는 입력 완료).");
  while(!isExit){
   
   if (startNum.hasNext("x")) {
    isExit = true;
    System.out.println(":::::::::: THE END ::::::::::");
    break;
   } else {
    line = startNum.nextInt();
    
    result = ladder.getResult(line);
   }
   System.out.println("result : " + result);
  }

 }

}
