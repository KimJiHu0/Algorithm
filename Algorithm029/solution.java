package Algorithm029;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// ����
	
	// 1~8���� ���ʴ�� �ԷµǸ� ascending
	// 8~1���� ���ʴ�� �ԷµǸ� descending
	// �� �� �ƴϸ� mixed ���
	
	public static void main(String[] args) {

		// ���ڸ� �Է��ϴ� �κ� [�迭�� ����־���.]
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		// 8���� �޾ƿ;��ؼ� int�迭 8size�� ������ش�.
		int[] arr = new int[8];
		// �Է��� �� ��� ���⿡.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// ascending������ �Ǻ��ϱ� ���� ������
		int ascCheck = 1;
		int ascCnt = 0;
		
		
		// descending������ �Ǻ��ϱ� ���� ������
		int descCheck = 8;
		int descCnt = 0;
		
		// ���� 1���� �����ϸ�
		if(arr[0] == 1) {
			for(int i = 0; i < arr.length; i++) {
				// arr[i]������ ascCheck�� �����ִµ� ���ٸ�
				if(arr[i] == ascCheck) {
					// ascCheck�� ascCnt�� ++���ش�.
					ascCheck++;
					ascCnt++;
				}
			}
			// ���࿡ ascCnt�� 8�̶��
			if(ascCnt == 8) {
				System.out.println("ascending");
			}
			
		// 8���� �����ϸ�
		} else if(arr[0] == 8) {
			for(int i = 0; i < arr.length; i++) {
				// arr[i]�� descCheck�� ���ٸ�
				if(arr[i] == descCheck) {
					// descCheck�� descCnt�� ++���ش�.
					descCheck--;
					descCnt++;
				}
			}
			// descCnt�� 8�̶��
			if(descCnt == 8) {
				System.out.println("descending");
			}
		// �� �� �ƴϸ�
		} else {
			System.out.println("mixed");
		}
		
		
	}

}
