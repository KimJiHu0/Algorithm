package Algorithm004;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		// 2���� �� ����� array
		int[] bin = new int[100];
		
		// bin array�� index�� ī���� �ϱ� ���� ����
		int i = 0;
		
		// ���� 0���� Ŭ������ while��
		while(num > 0) {
			bin[i] = num % 2;
			num = num / 2;
			i++;
		}
		i--;
		
		for(; i>=0; i--) {
			System.out.print(bin[i] + " ");
		}
		
	}

}
