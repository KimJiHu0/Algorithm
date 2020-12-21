package Algorithm028;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// 10������ n������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		System.out.print("�������� ������� : ");
		int jinsu = sc.nextInt();
		
		sc.close();
		
		// 10 => A, 11 => B, 12 => C ... 15 => F �� �־��ֱ� ���� char�迭�� ����.
		char[] answer = new char[100];
		// answer�� index�� ǥ�����ֱ� ���� ���� i
		int i = 0;
		
		// num�� 0���� �۾����� while���� ����˴ϴ�.
		while(num > 0) {
			// tmp��� ������ num % jinsu�� ���� ����ְ�,
			int tmp = num % jinsu;
			
			// tmp�� 10~15��� / �� ��ó�� A~F���
			if(tmp >= 10 && tmp <= 15) {
				// answer�� i������ 'A' => 10 + tmp�� 10�̶�� -10�� ���༭ �״�� A�� answer[i]�� ����,
				// tmp�� 11(B)��� 11 - 10�� 1�̰� , 'A'�� 1�� �������� B�� �˴ϴ�.
				answer[i] = (char)('A' + (tmp-10));
			// �׷��� ������
			} else {
				// answer�� i������ tmp�� char������ ��ȯ �� �־��ݴϴ�.
				// '0'�� �ٿ��� ������ int���� String������ ��ȯ���ֱ����� +"" �� �ٿ��ִ� �Ͱ� ���� �ǹ��Դϴ�.
				answer[i] = (char)('0'+tmp);
			}
			// num���� num / jinsu�� ���� �־��ְ� i++���ݴϴ�.
			num /= jinsu;
			i++;
		}
		
		for(; i >= 0; i--) {
			System.out.print(answer[i]);
		}
		
	}

}
