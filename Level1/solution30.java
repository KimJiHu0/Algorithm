package Level1;

public class solution31 {

	// ���� ������ �Ǻ�

	/*
	 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
	 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	 */

	public static long solution(long n) {
		long answer = 0;

		// ���࿡ �Է¹��� �� 121�� 2����1��(11) ������ 1�� �������� 0�� �ƴ϶�� => �������� �ƴϴ�.
		if (Math.pow(n, 0.5) % 1 != 0) {
			// return -1;
			return -1;
		// �������̶��
		} else {
			// answer�� �Է¹��� ���� �������� ���� ���� +1�� ���� ������ ���ش�.
			return answer = (long) Math.pow(Math.pow(n, 0.5) + 1, 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(121)); // => 11
		System.out.println(solution(3)); // => -1
	}

}
