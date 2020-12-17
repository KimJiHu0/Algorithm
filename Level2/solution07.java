package Level2;

import java.util.Stack;

public class solution07 {
	
	public static boolean solution(String s) {
		// stack�� ����
		Stack<Character> st = new Stack<Character>();
		
		// s�� ���̸�ŭ �ݺ����� �����ش�.
		for(int i = 0; i < s.length(); i++) {
			// st�� StringŸ���� �� �� 0������ �ִ� ���ڸ� push�Ѵ�.
			st.push(s.charAt(i));
			// ���࿡ st�� 0������ )�� �����Ѵٸ�
			if(st.get(0) == ')') {
				// �׳� false�� return.
				return false;
			}
			
			// ���� ������ �ƴϸ� ��� push�ϰ� �Ǵµ�, st�� ���̰� 2�� �Ѿ�� �Ǹ� if������ ���´�.
			if(st.size() > 1) {
				// st�� ������� ������ �ݺ����� �����ش�.
				while(!st.isEmpty()) {
					// word1�̶�� ������ st���� ���� �������� �� ���� ����ְ�, 
					char word1 = st.pop();
					// word2��� ������ st���� �������� �A ���� ����ش�.
					char word2 = st.pop();
					// word1�� ���� ó������ �� ���̹Ƿ� ) �̰�, �� ������ word2�� (���
					if(word1 == ')' && word2 == '(') {
						// while���� �����.
						// ���� pop�� ���ϴ� ������ ������ word1�� word2�� ���� �� pop�� ����� �����̴�.
						break;
					// �׷��� �ʴٸ�
					} else {
						// ����� ������ �ٽ� �־��ִµ�, ���߿� �A ���� ���� �����ؼ� word2�� ���� push
						st.push(word2);
						st.push(word1);
						// �� �� while���� ����������.
						break;
					}
				}
			}
		}
		// ���� st�� ����ִٸ�,
		if(st.isEmpty()) {
			// true�� return
			return true;
		}
		// �ƴϸ� false�� return�Ѵ�
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}
}
