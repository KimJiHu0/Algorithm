package Level1;

import java.util.Arrays;

public class solution01 {
	
	/*
	 * ���� ������������ ��ġ�ϱ�
	 * 
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
	      
		  String[] nArr = String.valueOf(n).split("");
		  Arrays.sort(nArr);
		  
		  String nStr = "";
		  for(int i = nArr.length-1; i >= 0; i--) {
			  nStr += nArr[i];
		  }
		  answer = Integer.parseInt(nStr);
		  
	      return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

}
