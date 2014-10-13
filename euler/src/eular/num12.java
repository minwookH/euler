package eular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class num12 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 7. 10.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 * 1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
		예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
		이런 식으로 삼각수를 구해 나가면 다음과 같습니다.
		
		1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
		이 삼각수들의 약수를 구해봅시다.
		
		 1: 1
		 3: 1, 3
		 6: 1, 2, 3, 6
		10: 1, 2, 5, 10
		15: 1, 3, 5, 15
		21: 1, 3, 7, 21
		28: 1, 2, 4, 7, 14, 28
		위에서 보듯이, 5개 이상의 약수를 갖는 첫번째 삼각수는 28입니다.
		
		그러면 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tryangleNum;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
		HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
		long startTime;
		long estimatedTime;
		startTime = System.currentTimeMillis();
		
		/*for(int o=1; ;o++){
			tryangleNum = 0;
			for(int p=1;p<=o ; p++){
				tryangleNum = tryangleNum + p;
			}
			
			for(int i = 1 ; i <= tryangleNum ; i++){
				if((tryangleNum % i) == 0){
					//prime.add(i);
					c.put(i, i);
				}
			}
			
			if(c.size() >= 500){
				System.out.println("aaa = "+o+" , 삼각수 = "+tryangleNum+" , 사이즈 = "+c.size());
				break;
			}else{

			}
			
		}*/
		tryangleNum = 0;
		for(int i=1; ;i++){
			tryangleNum = tryangleNum + i;
			int nnum=0;
			
			for(int n=1;n<=tryangleNum;n++){
				if(tryangleNum%n==0){
					nnum++;
				}
			}
			System.out.println("삼각수 : "+tryangleNum+" , 개수 : "+nnum);
			if(nnum >= 500){
				System.out.println("답 "+tryangleNum);
				break;
			}
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("took " + estimatedTime + " ms");
	}
}
