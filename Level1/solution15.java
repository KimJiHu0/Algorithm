package Level1;

public class solution15 {
	
	/*
	 * ��� ���� ��������
	 * 
	 * [���� ����]
	 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solutuion�� �ϼ��ϼ���.
	 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	 * 
	 * [���ѻ���]
	 * s�� ���̰� 1�̻�, 100���� String�Դϴ�.
	 * 
	 * [����� ��]
	 * s : "abcde" / return : "c"
	 * s : "qwer" / return : "we"
	 */
	
	public static String solution(String s) {
		String answer = "";
		
		// �޾ƿ� String s�� ���̰� Ȧ���� ��
		if(s.length() % 2 != 0) {
			// String�迭 str�� ""�� �������� split���� ���� �־��� ��
			String[] str = s.split("");
			// answer�� str�迭�� s�� ���� ������ 2�� ���� ������ ����ش�.
			answer = str[s.length()/2];
			
		// �޾ƿ� String s�� ���̰� ¦���� ��
		} else {
			// String str�� ""�� �������� �ڸ� ���� ����� ��
			String[] str = s.split("");
			// answer�� str�迭�� s���� ������ 2���� -1�� �������� �־��ְ�, 
			answer += str[s.length()/2 - 1];
			// str�� str�迭�� s���� ������ 2�� ���� �������� �־��ش�.
			answer += str[s.length()/2];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcde")); // => 5
		System.out.println(solution("qwer")); // => 4
		System.out.println(solution("asdfgh")); // => 6
	}

}
