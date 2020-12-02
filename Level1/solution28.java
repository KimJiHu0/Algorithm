package Level1;

import java.util.ArrayList;
import java.util.List;

public class solution29 {

	// �Ҽ�ã��

	// 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
	//�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.(1�� �Ҽ��� �ƴմϴ�.)

	public static int solution(int n) {
		int answer = 0;

		List<Boolean> list = new ArrayList<Boolean>();
		// 0�� 1�� �Ҽ��� �ƴϹǷ� false
		list.add(false);
		list.add(false);

		// 2���� �Է¹��� ���ڱ��� �ݺ����� ������
		for (int i = 2; i <= n; i++) {
			// 2�������� �������������� true�� �ִ´�.
			list.add(i, true);
		}

		// 2���� i*i�� n���� �۰ų� Ŭ������ i++���ָ� �ݺ����� ���µ�
		for (int i = 2; (i * i) <= n; i++) {
			// ���� list�� i������ �ִٸ�
			if (list.get(i)) {
				// �ٽ� for���� �����ִµ�, j�� i*i���� j�� n���� �۰ų� ���������� j = j + i ��ŭ ����.
				for (int j = i * i; j <= n; j += i) {
					// j������ false�� ����
					list.set(j, false);
				}
			}
		}
		// 0���� list�� �����ŭ for�� ������
		for (int i = 0; i < list.size(); i++) {
			// i������ true����
			if (list.get(i) == true) {
				// answer�� ���ڸ� �����ش�.
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

}
