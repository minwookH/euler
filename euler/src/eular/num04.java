package eular;

public class num04 {

	/**
	 * @작성일         : 2014. 6. 19.
	 * @작성자         : HeoMinWook
	 * @Method 설명    : 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
						 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
						 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int a1=0, b1=0;
		int[] in = new int[6];
		boolean t = true;
		
		for(int i = 100; i<1000 ; i++){
			for(int j = 100; j<1000 ; j++){
				if(Integer.toString(i*j).length() == 5){
					int q = i*j;
					in[0] = q/10000;
					q = q % 10000;
					in[1] = q/1000;
					q = q % 1000;
					in[2] = q/100;
					q = q % 100;
					in[3] = q/10;
					q = q % 10;
					in[4] = q/1;
				}else{
					t = false;
					int q = i*j;
					in[0] = q/100000;
					q = q % 100000;
					in[1] = q/10000;
					q = q % 10000;
					in[2] = q/1000;
					q = q % 1000;
					in[3] = q/100;
					q = q % 100;
					in[4] = q/10;
					q = q % 10;
					in[5] = q/1;
				}
				
				if(t){
					if(in[0]==in[4] && in[1]==in[3] && num < i*j){
						num = i*j;
					}
				}else{
					if(in[0]==in[5] && in[1]==in[4] && in[2]==in[3] && num < i*j){
						num = i*j;
					}
				}
			}
		}
		
		System.out.println(" num = "+num+" , i="+a1+" j="+b1);
	}
	
	/*public class Problem4_2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x=999;
			int y=999;
			int firstNum=0;
			int lastNum=0;
			int temp=0;
			int palindrome=0;
			
			
			
			for (int i=x;i>=x*0.5;i--){
				for(int j=y;j>=y*0.5;j--){
					temp=i*j;
					if(palind(temp)&&temp>palindrome){
						firstNum=i;
						lastNum=j;
						palindrome=temp;
						
					}
						
				}
			}
			System.out.println(firstNum+"x"+lastNum+"="+palindrome);

		}

		private static boolean palind(int temp) {
			// TODO Auto-generated method stub
			String source = Integer.toString(temp);
			String reverse = "";
			int length = source.length();
			
			for(int i=length;i>0;i--){
				reverse+=source.charAt(i-1);
			}
				
			return source.equals(reverse);
		}

	}*/

}
