package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution17 {
	
	/*
	 * ���� ���ڴ� �Ⱦ�
	 * 
	 * [��������]
	 * ��� arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�.
	 * �̋�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�.
	 * ��, ���ŵ� �� ���� ������ ��ȯ�� ������ �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
	 * ������� arr [1,1,3,3,0,1,1] �̸� [1,3,0,1]�� return�ؾ��մϴ�,
	 * arr�� [4,4,4,3,3] �̸� [4,3]�� return�ؾ��մϴ�.
	 */
	
	public static ArrayList<Integer> solution(int[] arr) {
		
		// ���� �迭 ����
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		// arr�� ���̸�ŭ for�� �����ָ�,
		for(int i = 0; i < arr.length-1; i++) {
			// ���� arr�� i������ arr�� i+1������ ���ٸ�
			if(arr[i] == arr[i+1]) {
				// arr�� i������ -1�� �ٲ��ش�.
				arr[i] = -1;
			}
		}
		// �����
		// [-1,1,-3,3,0,-1,1] / [-4, -4, 4, -3, 3]
		
		// �ٽ� arr�� ���̸�ŭ for���� �����ָ鼭, 
		for(int i = 0; i < arr.length; i++) {
			// ���� arr�� i������ -1�� �ƴ϶��
			if(arr[i] != -1) {
				// array�� arr�� i������ add���ش�.
				array.add(arr[i]);
			}
		}
		// �����
		// [1,3,0,1] / [4,3]
		
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,3,3,0,1,1}));
		System.out.println(solution(new int[] {4,4,4,3,3}));
	}

}
