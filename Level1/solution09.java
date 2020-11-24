package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution09 {

	/*
	 * [��������]
	 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ�
	 * �մϴ�. ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a��
	 * strings�� �����մϴ�.
	 * 
	 * [��������]
	 * strings�� ���� 1 �̻�, 50������ �迭�Դϴ�. strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
	 * strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�. ��� strings�� ������ ���̴� n���� Ů�ϴ�. �ε��� 1�� ���ڰ�
	 * ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
	 * 
	 * [����� ��]
	 * strings : ["sun", "bed", "car"] / n : 1 / return : "car", "bed", "sun"
	 * strings : ["abce", "abcd", "cdx"] / n : 2 / return : "abcd", "abce", "cdx"
	 */

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		String tmp = "";
		
		// strings�� ũ�⸸ŭ for�� �����ش�.
		for(int i = 0; i < strings.length; i++) {
			// ����for�� �����ش�.
			for(int j = i+1; j < strings.length; j++) {
				// ���� i������ j������ �ִ� charAt �߿� i������ ũ�ٸ�
				if(strings[i].charAt(n) > strings[j].charAt(n)) {
					//tmp�� i�����
					tmp = strings[i];
					// i�� j�� ���
					strings[i] = strings[j];
					// j�� tmp�� ����ش�.
					strings[j] = tmp;
				}
			}
		}
		
		// ���� ���� �ϸ� ������ �� �Ǿ������� ������ ������ �ȵǾ��ִ�.
		
		String tmp1 = "";
		
		// �ٽ� ����for���� �����ָ�
		for(int i = 0; i < strings.length; i++) {
			for(int j = i+1; j < strings.length; j++) {
				// i�� j�� ����, compareTo���� j�� 0���� ũ�ٸ� (�������)
				if(strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0) {
					// �Ʒ�ó�� ���Ƽ� ����ش�.
					tmp1 = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp1;
				}
			}
		}
		answer = strings;
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
		System.out.println(Arrays.toString(solution(new String[] { "abce", "abcd", "cdx" }, 2)));
	}

}
