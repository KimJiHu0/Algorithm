package Algorithm007;

import java.util.Scanner;

public class solution {
	
	// �Էµ� ���� �Ҽ����� �Ǻ��Ͻÿ�.
	
	// �Ҽ��� 1�� �� �ڽ����ιۿ� ������ �������� �ʴ� ���� �ǹ��մϴ�.
	
	public static void main(String[] args) {
		
		// ���� �Է� �޽��ϴ�.
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		// ������ ������ �� ++ ���� cnt ������ �����մϴ�.
		int cnt = 0;
		
		// 1���� num���� for���� �����ָ�
		for(int i = 1; i <= num; i ++) {
			// num / i�� �������� 0 �̶��
			if(num % i == 0) {
				// cnt�� ++���ݴϴ�.
				cnt++;
			}
		}
		
		// cnt�� 2���[1���� �Է��� ���ڱ��� ������ �� ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���ٸ�] => �Ҽ�
		if(cnt == 2) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		// �ƴ϶�� �Ҽ�x
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
		
	}

}
