package Algorithm032;

public class solution {
	
	// ���۰� ���� �� ���ver
	
	public static void main(String[] args) {
		
		// ���� ��
		int first = 1;
		// ������ ��
		int second = 3;
		
		// sum�̶�� �Լ��� ���ۺ���, ������ ������ ��Ƽ� ������.
		System.out.println(sum(first, second));
	}
	
	// ����, ������ ������ a, b�� �޾ƿ´�.
	public static int sum(int a, int b) {
		// ���� ������ ���� ������ ������ ���� ���������ٸ�
		if(a == b) {
			// b�� return�ϰ� �ȴ�.
			return b;
		}
		// �ƴ϶�� a + sum(a+1, b) �� �����Ͽ� ���۰��� ������ �ٽ� �־ �Լ��� ��ȣ�� �Ѵ�..
		return a + sum(a+1, b);
		// 1, 3�� ���Դٸ�
		// 1 + sum(2, 3)
		//		2 + sum(3, 3)
		//			start�� end�� �����Ͽ� b�� return�ؼ� 3
		// 1 + 2 + 3�� �ȴ�.
	}

}
