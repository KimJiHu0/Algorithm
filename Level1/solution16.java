package Level1;

public class solution16 {
	
	/*
	 * �� ���� ������ �� ���ϱ�
	 * 
	 * [��������]
	 * �� ���� a,b�� �־����� �� a�� b���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * ������� a=3, b=5�ΰ�� 3+4+5 = 12�̹Ƿ� 12�� �����մϴ�.
	 * 
	 * [��������]
	 * a�� b�� ���� ��� �� �� �ƹ� ���� �����ϼ���.
	 * a��b�� -10,000,000�̻� 10,000,000������ �����Դϴ�.
	 * a��b�� ��Ұ���� ���������� �ʽ��ϴ�.
	 */
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		// a : 3 / b : 5
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			// a : 5 / b : 3
			for(int i = a; i >= b; i--) {
				answer += i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

}
