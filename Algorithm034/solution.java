package Algorithm034;

public class solution {
	
	// �Ǻ���ġ ���ver
	
	public static void main(String[] args) {
		// �޾ƿ� �� ��
		int num = 6;
		
		// 1���� num���� �ݺ��� ���鼭
		for(int i = 1; i <= num; i++) {
			// fibo��� �Լ��� ȣ���Ѵ�.
			System.out.print(fibo(i) + " ");
		}
	}
	
	public static int fibo(int n) {
		
		// ó���� 1�� ������
		// �Ʒ��� if���� ���� �Ǿ�
		// 1 
		// ������ 2�� ������ else�� �Ǿ�
		// fibo(2-1) + fibo(2-2) => 1 1
		// 3�� ������ �Ǹ� fibo(3-1) + fibo(3-2)��� 1 => 1 1 3
		// 4�� ������ �Ǹ� fibo(4-1) + fibo(4-2)
		// 5�� ������ �Ǹ� fibo(5-1) + fibo(5-2)
		// 6�� ������ �Ǹ� fibo(6-1) + fibo(6-2)
		if(n <= 1) {
			return n;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}

}
