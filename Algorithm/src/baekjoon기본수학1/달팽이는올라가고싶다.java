package baekjoon기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(stz.nextToken());
		int b = Integer.parseInt(stz.nextToken());
		int v = Integer.parseInt(stz.nextToken());
		int day = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0) {
			day++;
		}
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
	}
}
