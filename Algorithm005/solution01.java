package Algorithm005;

public class solution01 {
	
	public static void main(String[] args) {
		
		// �빮�ڴ� �ҹ���, �ҹ��ڴ� �빮�ڷ� ����ϱ� => �� �ڵ�
		
		String word = "helloWorlD";
		
		// String���� word�� char����� �����Ͽ� �ѱ��ھ� �迭�� ����ش�.
		// char�迭�� ���ڴ� �Ҵ��ϰ� �ִ� 10���� ���� �ֱ� ������ �ƽ�Ű�ڵ�� ������ �ֱⰡ ����.
		char[] nArr = word.toCharArray();
		
		// �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� ������ ���� ����� str ������ �����Ѵ�.
		String str = "";
		// nArr�� ũ�⸸ŭ �ݺ����� �����ָ鼭
		for(int i = 0; i < nArr.length; i++) {
			// ���࿡ nArr�� i������ 65~90 �̶��. ��, A~Z ���
			// char ���� �Ҵ��ϰ� �ִ� 10���� ���� �ִµ� A�� 65 Z�� 90�̴�. �� ���̿� �ִ� ������ ��� �빮�ڴ�.
			if(nArr[i] >= 'A' && nArr[i] <= 'Z') {
				// str�̶�� ������ nArr�� i������ �ҹ��ڷ� �ٲ� ��, char ���̱� ������ String ������ ����ȯ �Ͽ� �־��ش�.
				str += String.valueOf(nArr[i]).toLowerCase();
			// �׷����ʰ� nArr�� i���� ���� 97~122�̸�. ��, a~z ���. �� ���̿� �ִ� ������ ���� �ҹ��ڴ�.
			} else if(nArr[i] >= 'a' && nArr[i] <= 'z'){
				// sdtr�� nArr��i������ �빮�ڷ� �����Ͽ� �־��ְ�.
				str += String.valueOf(nArr[i]).toUpperCase();
			// Ȥ�ø� ������ ������ �� �����Ƿ�, nArr�� i������ �����̶��,
			} else if(nArr[i] == ' ') {
				// str�� ������ �־��ش�.
				str += " ";
			}
		}
		System.out.println(str);
		
	}

}
