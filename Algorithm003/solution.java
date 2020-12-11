package Algorithm003;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// ���� ���� ������ ���� ����Ͻÿ�
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

		// index => ������ ��
		// index�� �� => ������ ���� ��� ���Դ��� �����ϴ� �뵵
		// mode[3] = 5��� ���� 3���̼��ڰ� 5�� �����ߴٶ�� �ǹ�.
		int[] mode = new int[10];
		
		// num���� 1,2,2,3,1,4,2,2,4,3 ����ִ�.
		for(int i = 0; i < 10; i++) {
			mode[num[i]]++;
			// mode�� num[i]������ => 0���� �������� ��
			// mode[1]++ �̴�.
			// �׷� mode�� 1������ ++�� �ȴ�.
			
			// i�� ++�� ��
			// mode[num[i]] => mode[num[1]] => mode[2]++;
			// mode[num[i]] => mode[num[2]] => mode[2]++;
			// mode[num[i]] => mode[num[3]] => mode[3]++;
			// mode[num[i]] => mode[num[4]] => mode[1]++;
			// ....�ݺ�
			// -------------------------------------------
			// mode[1] = 2
			// mode[2] = 4
			// mode[3] = 2
			// mode[4] = 2
		} 
		System.out.println("mode�� �� : " + Arrays.toString(mode));
		
		int modeNum = 0; // �ֺ���� �ǹ�
		int modeCnt = 0; // �ֺ���� ���� Ƚ���� �ǹ�
		// 10�� �ݺ��� ������
		for(int i = 0; i < 10; i++) {
			// ���� modeCnt�� mode[i]�������� �۴ٸ�
			// ���� ó������ �ֺ�� ������ Ƚ���� �ǹ��ϴ� modeCnt�� 0 �̰�, mode�� 0�������� 0�̴�.
			// �׷� if���� ���� �ʰ� for���� �ѹ� �� ����.
			// modeCnt = 0 / mode[1] = 2
			//  modeCnt�� mode[1]���� �۱� ������
			// cnt�� mode[i]������ ����ְ�,
			// modeNum�� 1.
			// mode�� i���� ���� ������ ���� Ƚ���� �ǹ� / mode�� index�� i�� ���ڰ� ����� �ǹ�.
			// 1�̶�� ���ڰ� 2�� ���Դ�.
			// modeNum = 1 / modeCnt = 2
			
			// 0���� ������, 1���� 2 , i�� 2�϶�. ��, mode[2]������ 2��� �� , 2�� 5�� ���Դµ� modeCnt�� �� �۱� ������
			// modeCnt���� mode�� i���� ���� 5�� �ְ� => ���� Ƚ��
			// modeNum�� i�� �ȴ�. => � ����?
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("�ֺ�� : " + modeNum + ", ���� Ƚ�� : " + modeCnt);
	}

}
