package Algorithm036;

import java.util.Scanner;

public class solution {
	
	// 2������ ��ȯ�ϱ� ���ver
	
	// �������� STR�� �������ش�.
	static String STR = "";
	
	public static void main(String[] args) {
		
		// ���� �Է��ϴ� ������ �����մϴ�.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// jinSu�Լ��� ȣ���մϴ�.(�Է¹��� �� �Ķ���ͷ� �ѱ�ϴ�.)
		jinSu(num);
		
	}
	
	public static void jinSu(int n) {
		
		// moc�̶�� ������ �Է¹��� n / 2�� ���� ���, 
		int moc = n / 2;
		// na��� ������ �Է¹��� n / 2�� ������ ���� ��´�.
		int na = n % 2;
		
		// �׸��� n�� moc�� �������ְ�,
		n = moc;
		
		// moc�� 0�̶�� �������־���ϱ� ������ Ż�������� �ɾ����.
		// ��¢������ moc�� 0�� �Ǿ Ż�����ǿ� ������ �Ǹ�
		if(moc == 0) {
			// ���������� STR�̶�� ������ na�� String���� ��ȯ �� ����ְ�,
			STR += String.valueOf(na);
			// �Ųٷ� ������ش�.
			for(int i = STR.length()-1; i >= 0; i--) {
				System.out.print(STR.charAt(i));
			}
			return;
		// ���� Ż�������� ���� ���Ѵٸ�
		} else {
			// STR�̶�� ������ na���� String���� ��ȯ �� ����ְ�,
			STR += String.valueOf(na);
			// �ٽ� jinSu��� �Լ��� ȣ���Ѵ�.
			jinSu(n);
		}
	}

}
