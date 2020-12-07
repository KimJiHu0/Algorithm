package Level2;

import java.util.Arrays;

public class solution01 {

	// �ִ񰪰� �ּڰ�

	/*
	 * [��������]
	 * ���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� (�ּҰ�)
	 * (�ִ밪)������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� s�� 1 2 3 4��� 1 4�� �����ϰ�, -1 -2 -3
	 * -4��� -4 -1�� �����ϸ� �˴ϴ�.
	 * 
	 * [��������]
	 * s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.
	 */
	
	public static String solution(String s) {
        String answer = "";
        
        // ������ �������� split
        String[] nArr = s.split(" ");
        
        // min�� max�� �������ش�.(�ƹ����̳� �־��൵ �ȴ�.)
        int min = Integer.parseInt(nArr[0]);
        int max = Integer.parseInt(nArr[0]);
        
        // nArr�� ���̸�ū �ݺ����� �����ִµ�,
        for(int i = 0; i < nArr.length; i++) {
        	// min�� ���ϱ� ���� Math.min �޼ҵ带 ����ߴ�. nArr�� i������ min�� ���Ͽ� �� �������� min�� ���,
        	min = Math.min(Integer.parseInt(nArr[i]), min);
        	// nArr�� i������ max�� ���� ���Ͽ� �� ū ���� max�� ��´�.
        	max = Math.max(Integer.parseInt(nArr[i]), max);
        }
        // answer�̶�� String������ min�� String���� ��ȯ�Ͽ� ���ϰ� ������ ���ϰ� max�� String���� ��ȯ�Ͽ� ���Ͽ� �����Ѵ�.
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-4 -3 -2 -1"));
		System.out.println(solution("-1 -1"));
	}

}
