package Algorithm020;

public class solution {
	
	// 3 6 9 ����
	
	// 3 6 9 13 16 19 23 26 29 30 31 32 33 34
	
	public static void main(String[] args) {
		
		// 3 6 9�� ����ִ� ������ �˷��ֱ� ���� ����
		int cnt = 0;

		// 100���� �ݺ����� �����ִµ�
		for(int i = 1; i <= 100; i++) {
			// num�̶�� String������ i���� ����ȯ �Ͽ� ����� ������,
			String num = String.valueOf(i);
			// num�� ���̸�ŭ �ݺ����� �����ش�.
			for(int j = 0; j < num.length(); j++) {
				// ���� num�� j������ 3, 6, 9��� 
				if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					// cnt��++���ش�.
					// ���ڸ� ������ �� �� 3 6 9�� ���ԵǾ� �ִٸ� cnt++�� 2�� �ȴ�.
					cnt++;
				}
			}
			// ���� cnt�� 1�̶�� 3 6 9�� �ѹ��ۿ� �ȵ��ٴ� �ǹ̴�.
			if(cnt == 1) {
				// ¦�� ������ְ�, cnt�� 0���� �ʱ�ȭ
				System.out.print("¦("+i+") ");
				cnt = 0;
			// cnt�� 2��� ���� 369�� 2�� ���ٴ� ���̴�.
			} else if(cnt == 2) {
				// ¦¦�� ��� ��
				System.out.print("¦¦(" + i + ") ");
				// cnt �ʱ�ȭ
				cnt = 0;
			// ���� ���� �� �� �������� ���Ѵٸ� �׳� ������ش�.
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

}
