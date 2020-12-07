package Level1;

import java.util.Arrays;

public class solution40 {

	// �������

	/*
	 * �׿��� ��� ���ε��� ������ ���ܳ��� ��Ҹ� �˷��� ��������� �տ� �־���. �׷��� �� ��������� ���ڷ� ��ȣȭ�Ǿ� �־� ��ġ�� Ȯ���ϱ�
	 * ���ؼ��� ��ȣ�� �ص��ؾ� �Ѵ�. ������ ���� ��ȣ�� �ص��� ����� ������� �޸� �Բ� �߰��ߴ�.
	 * 
	 * ������ �� ���� ���̰� n�� ���簢�� �迭 ���·�, �� ĭ�� ����(" ) �Ǵº�(#") �� ������ �̷���� �ִ�.
	 * ��ü ������ �� ���� ������ ���ļ� ���� �� �ִ�. ���� ���� 1�� ���� 2��� ����. ���� 1 �Ǵ� ���� 2 �� ��� �ϳ��� ���� �κ��� ��ü ���������� ���̴�.
	 * ���� 1�� ���� 2���� ��� ������ �κ��� ��ü ���������� �����̴�.
	 * ���� 1�� ���� 2�� ���� ���� �迭�� ��ȣȭ�Ǿ� �ִ�.
	 * ��ȣȭ�� �迭�� ������ �� �����ٿ��� �� �κ��� 1, ���� �κ��� 0���� ��ȣȭ���� �� ������� �������� �ش��ϴ� ���� �迭�̴�.
	 */
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		// arr1�� arr2�� 2�������� �����ϱ� ���ؼ� �������� ����.
		int map1na = 0;
		int map2na = 0;
		int map1moc = 0;
		int map2moc = 0;
		// map1tmp�� map2tmp��� ������ �������ִµ� ���������� ����� ����.
		String map1tmp = "";
		String map2tmp = "";
		
		// 0���� n��ŭ �ݺ����� �����ִµ�
		for(int i = 0; i < n; i++) {
			// map1moc arr1�� i������ ���, 
			// map2moc arr2�� i������ ����ش�.
			// ������ ������ ����ش� (arr1�� arr2�� �ѹ��� �ϱ� ���� ���ÿ� ����)
			map1moc = arr1[i];
			map2moc = arr2[i];
			// ���߹ݺ����� �����ִµ�,
			for(int j = 0; j < n; j++) {
				// map1na��� ������ map1moc�� �������� ����ְ�, 
				map1na = map1moc % 2;
				// map1moc�� map1moc / 2 �� ���� ����ش�.
				map1moc = map1moc / 2;
				// map1tmp�� map1na�� ��ӿ��� +���ش�.
				map1tmp += map1na;
				
				// map2���� ���Ͱ��� �ݺ����ش�.
				map2na = map2moc % 2;
				map2moc = map2moc / 2;
				map2tmp += map2na;
			}
		}
		
		// map1tmp�� map2tmp�� 2�������� �ٲ� ���� ����ִµ� �̸� reverseString�̶�� �޼ҵ带 �����Ͽ� �������ش�.
		// ������ �Ǹ� ���� ó���� �ִ� n��ŭ�� ���� tmp�� ���� �������� ��ܾ��ϱ� ������ �����ؾ��Ѵ�.
		map1tmp = reverseString(map1tmp);
		map2tmp = reverseString(map2tmp);
		
		// map1�� map2�� �������ش�.
		String[] map1 = new String[n];
		String[] map2 = new String[n];
		
		// cnt�� 0,
		int cnt = 0;
		// idx�� n-1��ŭ => �̴� map1 Ȥ�� map2�� index�� ���� �ǹ��ϱ� ������ -1�� ���ش�.
		int idx = n-1;
		// map1str�� map2str�� �����Ѵ�.
		String map1str = "";
		String map2str = "";
		// map1tmp�� ���̸�ŭ �ݺ����� �����ִµ�, (map2tmp�� ���̰� �����ϴ�.)
		for(int i = 0; i < map1tmp.length(); i++) {
			// map1str�� map2str�� ���� map1tmp, map2tmp�� �ѱ��ھ� �����ִµ�,  
			map1str += map1tmp.charAt(i);
			map2str += map2tmp.charAt(i);
			// cnt�� ++���ش�.
			cnt++;
			// ���� cnt�� n�� �������ٸ�,
			if(cnt == n) {
				// map1�� idx������ map1str�� ����ְ�, 
				map1[idx] = map1str;
				// map2�� idx������ map2str�� ����ش�.
				map2[idx] = map2str;
				// �׸��� idx�� �ڿ������� �����ΰ����ϱ� ������ --�� ���ְ�, 
				idx--;
				// cnt�� 0���� �ʱ�ȭ�Ѵ�.
				cnt = 0;
				// map1str�� map2str�� �ʱ�ȭ ���ش�.
				map1str = "";
				map2str = "";
			}
		}
		
		// �Ǵٽ� map1�� ���̸�ŭ (map2�� ���̴� ������ ���̴�.)
		for(int i = 0; i < map1.length; i++) {
			// map1�� i�����߿� 1�̸� #, 0�̸� ' '(����) , map2�� i���� �� 1�̸� #, 0�̸� ' '(����)���� �ٲ��ش�.
			map1[i] = map1[i].replace('1', '#');
			map1[i] = map1[i].replace('0', ' ');
			map2[i] = map2[i].replace('1', '#');
			map2[i] = map2[i].replace('0', ' ');
		}
		
		//======================================================
		
		// nStr�̶�� ������ �����ϰ�,
		String nStr = "";
		// map1�� ���̸�ŭ �ݺ����� �����ִµ�
		for(int i = 0; i < map1.length; i++) {
			// �� �ȿ� 2�� �ݺ����� �����ش�.
			for(int j = 0; j < map1[i].length(); j++) {
				// ���� map1�� i������ charAt(j)[map2�� ����] �� �� �ϳ��� #�̶�� => map1�� i������ String�ε� �� �� �ȿ� �ѱ��� �ѱ��ڸ� �˻��Ѵ�.
				if(map1[i].charAt(j) == '#' || map2[i].charAt(j) == '#') {
					// nStr�� #�� �־��ְ�. 
					nStr += '#';
				// �װ� �ƴ϶� �����̶��
				} else if(map1[i].charAt(j) == ' ' || map2[i].charAt(j) == ' ') {
					// nSrtr�� ������ �־��ְ�,
					nStr += ' ';
				}
			}
			// answer�� i������ nStr�� �־��� ��,
			answer[i] = nStr;
			// nStr�� ��ĭ���� �ʱ�ȭ�����ִ� ���� �ݺ��Ѵ�.
			nStr = "";
		}
		
		return answer;
	}
	
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {9,20,28,18,11}, new int[] {30,1,21,17,28})));
		System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}

}
