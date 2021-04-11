package programmersLevel2;

public class N개의최소공배수 {
	public static void main(String[] args) {
		NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
	}
}

class NLCM{
	// 최소공배수
	public long nlcm(int[] num) {
		long answer = 1;
		for (int i = 0; i < num.length; i++) {
			long g = gcd(num[i],answer);
			answer = num[i] * answer / g;
		}
		return answer;
	}
	// 최대공약수
	long gcd(long a, long b) {
		while (b != 0) {
			long temp = a%b;
			a = b;
			b = temp;			
		}
		return a;
	}
}