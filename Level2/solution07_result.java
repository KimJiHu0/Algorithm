package Level2;

import java.util.Stack;

public class solution07_result {
	
	public static boolean solution(String s) {
		// Stack ����
		Stack<Character> st = new Stack<Character>();
		
		// s�� ���̸�ŭ �ݺ����� �����ش�.
		for(int i = 0; i < s.length(); i++) {
			// charŸ�� ���� c�� s�� i��° ���߸� ����ش�.
			char c = s.charAt(i);
			// ���࿡ c�� ')'���, 
			if(c == ')') {
				// �� �ȿ��� st�� ���� ����ִٸ�
				if(st.isEmpty()) {
					// ������ )�� �����ϸ� �ùٸ� ��ȣ�� ���ǿ� �������� ���Ͽ�, false�� return�Ѵ�.
					return false;
				}
				// �׷��� �ʴٸ� st���� pop�� ���ش�.
				// st���� �׳� pop�� ���ִ� ������ char c�� ����ִ� ���� ')'�� �ϸ�
				// st�� ����ִ� ���� ( �θ� ������ ���������̴�.
				// �׷� c�� ) ��� �׳� st���� (�� �ϳ� ���൵ ����� ���� ������, pop�� ���ش�.
				st.pop();
			// ���࿡ '('���
			} else {
				// st�� '('�� push�Ѵ�.
				st.push('(');
			}
		}
		// st�� ����ִٸ�
		if(st.isEmpty()) {
			// true�� return
			return true;
		}
		// �׷��� �ʴٸ� false�� return
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

}
