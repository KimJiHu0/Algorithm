package Algorithm002;

import java.util.Scanner;

public class Fibonachi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���°���� ����ұ��?");
		int num = sc.nextInt();
		
		// num��ŭ�� ���� int �迭�� �����ȴ�.
		int[]arr = new int [num];
		
		// �⺻������ ù��° ���� �ι�° ���� 1�̱� ������ �̸� �־��ش�.
		arr[0] = 1;
		arr[1] = 1;
		
		// 1, 1
		
		// arr�� i�����̱� ������ 2�������� �������������� �ݺ����� ���鼭
		for(int i = 2; i < arr.length; i++) {
			// arr�� i������ arr�� i-1���� + arr�� i-2���� ���� arr��i������ �����ش�.
			// ex ] arr[2] = arr[2-1] + arr[2-2]
			// arr[2] = 1 + 1 �̶� arr�� 2������ 2
			
			// arr[3] = arr[3-1] + arr[3-2]
			// arr[3] = 2 + 1 => 3
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		// �� �� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
