package Algorithm010;

public class solution {
	
	// �Էµ� �� N��ŭ N�� ���� ����ϱ�
	// [EX] 4�� 4�� 4�� ���·� 16���� ���
	
	public static void main(String[] args) {
		
		// �Է¹��� ��
		int num = 5;
		// count�� ���ֱ� ���� ����
		int cnt = 0;
		
		// �Էµ� ���ڰ� 4��� . 4�� 4�� ũ�� ��, 4*4 ���� ����ؾ��ϴϱ� 1���� num*num����
		for(int i = 1; i <= num*num; i++) {
			// 1�� ����Ҷ����� cnt ����
			cnt++;
			// i�� ������ְ�, 
			System.out.printf("%3d", i);
			// cnt�� num�̶� ���ٸ� ( 4�� ����ϰ� num�� �����ϸ� �ٹٲ� ���ֱ� ���� )
			if(cnt == num) {
				// cnt �ʱ�ȭ���ְ�
				cnt = 0;
				// �ٹٲ�
				System.out.println();
			}
		}
		
	}

}
