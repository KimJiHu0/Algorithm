package Level1;

public class solution29_01 {
		// �Ҽ�ã��

		// 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
		//�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.(1�� �Ҽ��� �ƴմϴ�.)

		public static int solution(int n) {
			int answer = 0;
			
			// ������ 1�� �Ҽ��� ġ�� �ʱ� ������ 2���� �����ϸ� �ȴ�.
			for(int i = 2; i <= n; i++) {
				// boolean ������ �����ϰ�,
				boolean check = true;
				// j�� 2���� jxj�� i���� �۰ų� ����������, j++���ش�.
				for(int j = 2; j*j <= i; j++) {
					// ���� i / j �� �������� 0�̶�� 
					if(i % j == 0) {
						// check�� false���ְ�
						check = false;
						// break���ش�.
						break;
					}
				}
				// ���� check�� true���
				if(check) {
					// answer++���ش�.
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
