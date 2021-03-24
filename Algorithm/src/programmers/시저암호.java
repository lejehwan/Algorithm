package programmers;

public class 시저암호 {

}

class 시저암호Solution{
	public String solution(String s, int n) {
        String answer = "";        
        char ch;
        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                answer += ch+n>'Z'?(char)(ch+n-26):(char)(ch+n); 
            }
            else if(ch>='a' && ch<='z'){
                answer += ch+n>'z'?(char)(ch+n-26):(char)(ch+n);
            }
            else
                answer += (char)ch;
        }
        return answer;
    }
}