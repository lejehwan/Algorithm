package programmersLevel2;

public class 피보나치수 {

}
 
// 재귀 사용시 시간, 메모리 초과(탑-다운)
//int[] fibo = new int[n+1];        
//if(n<=1){
//    return n;
//}
//if(fibo[n] != 0){
//    return fibo[n];
//}
//else{
//    fibo[n] = solution(n-1) + solution(n-2);
//    return fibo[n] %1234567;
//}  

// 바텀-업 방식으로 해결
class 피보나치수Solution{
	public int solution(int n) {
		int a = 0;
		int b = 1;
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			answer = (a+b)%1234567;
			a = b % 1234567;
			b = answer % 1234567;
		}
		return answer;
	}
}