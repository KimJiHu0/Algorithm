package Level1;

import java.util.Arrays;

public class solution34 {

	// ������ȣ

	/*
	 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
	 * ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�.
	 * z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
	 * 
	 * ������ �ƹ��� �о �����Դϴ�.
	 * s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
	 * s�� ���̴� 8000�����Դϴ�. n�� 1 �̻�, 25������ �ڿ����Դϴ�.
	 * 
	 * s : "AB" / n : 1 / result : "BC"
	 * s : "z" / n : 1 / result : "a"
	 * s : "a B z" / n : 4 / result : "e F d"
	 */
	
	public static String solution(String s, int n) {
        String answer = "";
        // �޾ƿ� String�� ������� �����ؼ� char�迭�� �ٲ��ش�.
        char[] nArr = s.toCharArray();
        
        // nArr�� ũ�⸸ŭ �ݺ����� �����ִµ�, 
        for(int i = 0; i < nArr.length; i++) {
        	// ���� nArr�� i������ ������ �ƴ϶��
        	if(!String.valueOf(nArr[i]).equals(" ")) {
        		// �� �ȿ��� nArr�� i������ ũ�Ⱑ 65�̻� 90���� �����̰�, nArr�� i���� + n�� ũ�Ⱑ 90���� ũ�ٸ�. ��, �빮�ڶ��
        		if((nArr[i] >= 65 && nArr[i] <= 90) && (nArr[i] + n) > 90) {
        			// tmp������ nArr�� i�������� Z�� �ƽ�Ű�ڵ��� 90���� 1ū ���� ���� ��
        			int tmp = (nArr[i]+n) - 91;
        			// answer�� 65 + tmp�� �� ���� char���·� ���� �� �����ش�.
        			answer += (char)(65+tmp);
        		// ���� nArr�� i������ 97�̻� 122�����̰�, nArr�� i���� + n�� 122���� ũ�ٸ�. ��, �ҹ��ڶ��
        		} else if((nArr[i] >= 97 && nArr[i] <= 122) && (nArr[i] + n) > 122) {
        			// tmp�� nArr�� i���� + n - z�� �ƽ�Ű�ڵ��� 122���� 1ū ���� ���� ��
        			int tmp = (nArr[i]+n) - 123;
        			// answer�� char���·� ������ 97+tmp�� �����ش�.
        			answer += (char)(97+tmp);
        		// ���� ���ǵ鿡 ��ġ���� �ʴ´ٸ�
        		} else {
        			// answer�� nArr�� i�������� n��ŭ ���� ���� char���·� ���� �� �����ش�.
        			answer += (char)(nArr[i]+n);
        		}
        	// �����̶�� ������ü�� �����ش�.
        	} else {
        		answer += " ";
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
		
	}

}
