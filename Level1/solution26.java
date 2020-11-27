package Level1;

public class solution27 {

	// �ϻ��� ��

	// ���� ���� x�� �ϻ��� ������ x�ڸ����� ������ x�� �����������մϴ�.
	// ������� 18�� �ڸ��� ���� 1+8 = 9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
	// �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ� solution�� �ϼ��ϼ���

	// [����� ��]
	// arr : 10 / return : true
	// arr ; 12 / return : true
	// arr : 11 / return : false
	// arr : 13 / return : false

	public static boolean solution(int x) {
		boolean answer = true;
		
		// x�� String���� ��ȯ ��
		String str = String.valueOf(x);
		// �ѱ��ھ� ��� nArr�� ����ش�.
		String[] nArr = str.split("");
		
		int sum = 0;
		
		// nArr�� ���̸�ŭ for���� �����ָ�
		for(int i = 0; i < nArr.length; i++) {
			// �̸� ������ sum�� nArr�� i������ int�� ��ȯ �� �����ش�.
			sum += Integer.parseInt(nArr[i]);
			// ���� �޾ƿ� �� x / sum�� �������� 0�̶��
			if(x % sum == 0) {
				// answer�� true
				answer = true;
			} else {
				// �ƴ϶�� answer�� false
				answer = false;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		
	}

}
