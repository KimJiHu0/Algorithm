package Level1;

public class solution13 {
	
	/*
	 * ���ڿ��� ������ �ٲٱ�
	 * 
	 * [��������]
	 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ� solution�� �ϼ��Ͻÿ�.
	 * 
	 * [��������]
	 * s�� ���̴� 1�̻� 5�����Դϴ�.
	 * s�� �Ǿտ��� ��ȣ�� �� �� �ֽ��ϴ�.
	 * s�� ��ȣ�� ���ڷθ� �̷���� �ֽ��ϴ�.
	 * s�� "0"���� �������� �ʽ��ϴ�.
	 * 
	 * [����� ��]
	 * str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
	 * str�� ��ȣ�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �Էµȴ� ���� �����ϴ�.
	 */
	
	public static int solution(String s) {
		int answer = 0;
		
		// String���� int�� ����ȯ ���ִ� Integer.parseInt();�� ����ϸ� �ȴ�.
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("-1234"));
		System.out.println(solution("1234"));
	}

}
