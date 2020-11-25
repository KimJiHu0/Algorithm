package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class solution02 { 
	
	/*
	 * [��������]
	 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���.
	 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
	 * 
	 * [��������]
	 * arr�� ���� 1 �̻��� �迭�Դϴ�.
	 * �ε��� i,j�� ���� i != j�̸� arr[i] != arr[j]�Դϴ�.
	 * 
	 * [����� ��]
	 * arr : [4,3,2,1] 
	 * return [4,3,2]
	 * arr : [10]
	 * return : [-1]
	 */
	
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		
		if(arr.length == 1) {
			answer[0] = -1;
		} else {
			answer = new int[arr.length-1];
			for(int i = 0; i < arr.length-1; i++) {
				answer[i] = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String str = input + "";
		
		String[] strs = new String[str.length()];
		int[] arr = new int[str.length()];
		
		strs = str.split("");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}

}
