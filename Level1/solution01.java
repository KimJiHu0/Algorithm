package Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class solution01 {
	
	/*
	 * [��������]
	 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�.
	 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
	 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	 * 
	 * [��������]
	 * n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
	 * 
	 * [����� ��]
	 * n : 118372
	 * return : 873211
	 */
	
	public static long solution(long n) {
	      long answer = 0;
	      String a = n + "";
	      char[] array = a.toString().toCharArray();
	      char temp = 0;
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array.length; j++) {
	            if (array[i] > array[j]) {
	               temp = array[j];
	               array[j] = array[i];
	               array[i] = temp;      
	            }
	         }
	      }
	      a = new String(array);
	      answer = Integer.parseInt(a);
	      
	      return answer;
	   }
	
	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(solution(n));
	}

}
