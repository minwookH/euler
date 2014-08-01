import java.util.HashMap;
import java.util.Map;


public class p01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int value = 1000;
		int sum_result=0;
		
		for(int i = 1 ; i<=(value-1) / 3 ; i++){
			sum_result =  sum_result+3*i;
		}
		for(int i = 1 ; i<=(value-1) / 5 ; i++){
			sum_result =  (5*i/3 == 0) ? 0 : sum_result+5*i;
		}
		System.out.println("sum result = "+sum_result);*/
		
		Map<String, String> a = new HashMap<String, String>();
		
		a.put("name", "aaa");
		cc(a);
		System.out.println(a.get("name"));
	}
	
	public static void cc(Map<String, String> a){
		a.put("name", "bbb");
	}
}
