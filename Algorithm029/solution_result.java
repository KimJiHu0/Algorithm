package Algorithm029;

import java.util.Scanner;

public class solution_result {

	// ����

	// ������������ ������������ �Ǻ��ϴ� �޼ҵ�
	public static void distinc(int[] input) {
		
		// ������������ �����ϴ� ����
		boolean aflag = true;
		
		// input�� 0������ 1�� �ƴϸ�
		if(input[0] != 1) {
			// ���������� �ƴϱ� ������ false�� �ش�.
			aflag = false;
		}
		// input�� 0������ �̹� �˻��߱� ������ 1�������� ������-1 �������� �ݺ����� ����
		for(int i = 1; i < input.length-1; i++) {
			// input�� i���� - input i+1������ -1�� �ƴϸ�, ��, 1 2 3 4 ���� �ƴ϶��
			if(input[i]-input[i+1] != -1) {
				// aflag�� false�� �ٷ� for���� ������.
				aflag = false;
				break;
			}
		}
		
		// ������������ �����ϴ� ������ ����
		boolean bflag = true;
		
		// ���� 0������ 8�� �ƴϸ� ���������� �ƴ϶� false
		if(input[0] != 8) {
			bflag = false;
		}
		// �Ȱ��� 1�������� ������-1�������� �ݺ����� ����
		for(int i = 1; i < input.length-1; i++) {
			// i���� - i+1������ 1�� �ƴϸ�. ��, 8 7 6 5.. ���� �ƴϸ�
			if(input[i]-input[i+1] != 1) {
				// ���������� �ƴ϶� false
				bflag = false;
				// �ٷ� �ݺ��� Ż��
				break;
			}
		}
		// aflag�� true��
		if(aflag) {
			// ascending ���
			System.out.println("ascending");
		}
		// bflag�� true��
		else if(bflag) {
			// descending ���
			System.out.println("descending");
		}
		// �� �� �ƴϸ�
		else {
			// mixed ���
			System.out.println("mixed");
		}
	}

	public static void main(String[] args) {
		// ���ڸ� �Է��ϴ� �κ� [�迭�� ����־���.]
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		// 8���� �޾ƿ;��ؼ� int�迭 8size�� ������ش�.
		int[] arr = new int[8];
		// �Է��� �� ��� ���⿡.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		distinc(arr);
	}

}
