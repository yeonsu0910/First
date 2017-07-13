/**
 * baekjoon 9461 �ĵ��� ����
 * �ĵ��� ���� P(N)�� ������ �ִ� ���ﰢ���� ���� ����.
 * 1,1,1,2,2,3,4,5,7,9 ...
 * Ǯ�̹� : ����κ��� 2��°, 3��°�� ���� �հ� ����.
 * ------------------------------------
 * �Է� : �׽�Ʈ ���̽� ���� T, �� �׽�Ʈ ���̽����� N
 * ��� : �� �׽�Ʈ ���̽� ���� P(N)
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
