package Algorithm008;

public class Factorial {
	
	public static void main(String[] args) {
		
		// num�� x���丮���� ���ϱ� ���� ����
		int num = 5;
		// answer�� ����� ����� ����
		int answer = 1;

		// 0���� num���� i�� ++���ָ鼭 �ݺ��� �����ش�.
		// 5 ���丮����
		// 5-1 * 5-2 * 5-3 * 5-4 �� ���̴�.
		for(int i = 0; i < num; i++) {
			// answer�� x���丮�� �� num - i�� ��� �����ش�.
			// �׷��ԵǸ� answer = answer * 5 - 1
			// answer = answer * 5 - 2
			// answer = answer * 5 - 3
			// answer = answer * 5 - 4
			// �� �� ���� �ȴ�.
			answer *= num-i;
		}
		System.out.println(answer);
	}
}
