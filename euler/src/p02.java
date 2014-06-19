import java.util.ArrayList;
import java.util.Arrays;


public class p02 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 2. 26.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> list = new ArrayList<Long>();
		Long sum=null;
		
		if(list.size() == 0){
			list.add((long) 1);
		}
		if(list.size() == 1){
			list.add((long) 2);
			sum = list.get(1);
		}
		if(list.size() >= 2){
			for(int i = 2;;i++){
				list.add(list.get(i-2)+list.get(i-1));
				
				if(list.size()%2 == 0){
					//System.out.println("i는 "+i+" , 값 = " + list.get(i));
					sum = sum + list.get(i);
				}
				
				if(i==4000000){
					break;
				}
			}
		}
		//System.out.println(list.toString());
		System.out.println("sum = "+sum);
	}

}
