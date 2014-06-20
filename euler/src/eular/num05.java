package eular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class num05 {

	/**
	 * @작성일         : 2014. 6. 19.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
						 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
		for(int i = 2; i<=20 ; i++){
			int q = 2;
			//System.out.println("!!!q = "+ q + " , i = "+i);
			int j = i;
			while(j>=q){
				if(j%q == 0){
					if(!r.containsKey(q)){
						r.put(q, 1);
					}else{
						int temp = r.get(q);
						System.out.println("temp ; "+temp);
						r.remove(q);
						r.put(q, temp+1);
					}
					//a.add(q);
					j = j/q;
					//System.out.println("%%% 나누기 : "+q);
				}else{
					q++;
					//System.out.println("+++");
				}
				//System.out.println("###q = "+ q + " , j = "+j);
			}
		}
		
		System.out.println(r);
		
		Iterator<Integer> c = a.iterator();
		
		/*while(c.hasNext()){
			num *= c.next();
		}
		
		System.out.println("num = "+num);*/
	}

}
