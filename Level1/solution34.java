package Level1;

public class solution35 {

	// ����

	/*
	 * ���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ���
	 * �ϼ����ּ���.
	 * 
	 * �̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)
	 * 
	 * a : [ 1,2,3,4 ] / b : [ -3, -1, 0, 1 ] / result : 3
	 */
	
	public static int solution(int[]a, int[] b) {
		int answer = 0;
		
		for(int i = 0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));
		System.out.println(solution(new int[] {-1,0,1}, new int[] {1,0,-1}));
	}

}
