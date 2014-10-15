package dih;

public class Solution09 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 15.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *알파벳 소문자로만 이루어진 문자열 w가 있다. w의 문자들을 재 조합해서 또다른 문자열 s를 만드는데 s는 w보다 그 크기가 크다. 
(크기가 크다는 것은 사전 편찬 식으로 정렬했을 때 s가 w보다 뒤에 위치하게 된다는 의미이다.)

입력 
첫출에 테스트할 횟수 t를 입력받는다. 
그 다음 줄 부터 문자열 w를 입력받는다. 

출력
각각의 테스트 케이스에 대해서 s를 출력한다. s가 여러개일 경우 그 중 가장 작은 것을 출력한다. 
답이 존재하지 않으면 "no answer"를 출력한다. 

제한 
1 <= t <= 10^5 
1 <= (w의 길이) <= 100 
w는 알파벳 소문자로만 이루어져있으며, 길이가 100을 초과하지 않는다. 

입력 예제 #1
3
ab
bb
hefg

출력 예제 #1
ba
no answer
hegf

입력 예제 #2
15
zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgmw
zyyxwwtrrnmlggfeb
ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlcf
biehzcmjckznhwrfgglverxsezxuqpj
rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmsym
unpzhmbgrrs
jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqpxg
ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjteyjba
dkuashjzsdq
gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfikh
nebsajjbbuifimjpdcqfygeitief
qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvbo
xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcydfb
xqdwkjpkmrvkfnztozzlqtuxzxyxwowf
yewluyxiwiprnajrtkeilolkmqidazhiar

출력 예제 #2
zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgwm no answer ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlfc biehzcmjckznhwrfgglverxsjepquxz rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmyms unpzhmbgrsr jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqxgp ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjtjabey dkuashjzsqd gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfkhi nebsajjbbuifimjpdcqfygeitife qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvob xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcyfbd xqdwkjpkmrvkfnztozzlqtuxzxyxwwfo yewluyxiwiprnajrtkeilolkmqidazhira

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
