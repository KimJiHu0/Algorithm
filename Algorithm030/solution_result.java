package Algorithm030;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		// �� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		// �����ư��鼭 ������ֱ� ���ؼ� boolean����
		boolean check = true;
		
		// 1~�Է¹��� ������ �ݺ��� �����ִµ�
		for(int i = 1; i <= num; i++) {
			
			// i�� num�� �������� (�������� �����ϸ�)
			if(i == num) {
				// i�� ������ְ�
				System.out.print(i);
				// �ݺ��� ����
				break;
			}
			
			// check�� true���
			if(check) {
				// i�� ����ϰ� +�� �ٿ��ش�.
				System.out.print(i+"+");
				// �� �� check�� false�� ����
				check = !check;
			}
			// �� ������ ����� ������ �ȴ�. check�� false�̱� ����
			else {
				// i�� ����ϰ� -�� �ٿ��ش�.
				System.out.print(i+"-");
				// �׸��� check�� �ٽ� true�� ����
				check = !check;
			}
		}
		
	}

}
