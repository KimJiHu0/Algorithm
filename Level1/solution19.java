package Level1;

public class solution19 {
	
	/*
	 * ����� ��
	 * 
	 * [��������]
	 * ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * 
	 * [����� ��]
	 * n : 12 / return : 28
	 * n : 5 / return : 6
	 */
	
	public static int solution(int n) {
		int answer = 0;
		
		// �޾ƿ� ���� n��ŭ for���� ���鼭
		for(int i = 1; i <= n; i++) {
			// ���� n%1�� �������� 0�� ��(������ ������ ��)
			if(n%i == 0) {
				// answer�� n ������ i�� ���� �����ش�.
				answer += n/i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(5));
	}

}
