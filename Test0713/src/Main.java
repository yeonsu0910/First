/**
 * baekjoon 9461 파도반 수열
 * 파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이.
 * 1,1,1,2,2,3,4,5,7,9 ...
 * 풀이법 : 현재로부터 2번째, 3번째의 값의 합과 같다.
 * ------------------------------------
 * 입력 : 테스트 케이스 개수 T, 각 테스트 케이스마다 N
 * 출력 : 각 테스트 케이스 마다 P(N)
 *  */

import java.util.Scanner;

public class Main {

	public static long padovan(int num) {

		long[] arr = new long[105];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i < num; i++) {

			arr[i] = arr[i - 2] + arr[i - 3];

		}
		return arr[num - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int N = sc.nextInt();

			long res = padovan(N);
			System.out.println(res);
		}

	}

}
