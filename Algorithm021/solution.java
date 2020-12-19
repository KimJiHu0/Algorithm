package Algorithm021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution {

	// �ߺ��� �� �����ϱ�

	public static void solution01(int[] inputArr) {
		// 1. Set�� �ߺ��� ���� ������ Set�� Ȱ���Ѵ�.
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < inputArr.length; i++) {
			set.add(inputArr[i]);
		}
		System.out.println(set);
	}

	public static void solution02(int[] inputArr) {
		
		// booleanŸ���� check �迭�� �����մϴ�.
		boolean[] check = new boolean[101];
		
		// inputArr�� ���̸�ŭ �ݺ����� �����鼭
		for(int i = 0; i < inputArr.length; i++) {
			// check�� inputArr[i]������ ���� �ش��ϴ� index�� true��� ���� �ֽ��ϴ�.
			// �迭�� ó�� ������ �� false�� ������ ������ true�� �ٲ��ֱ⸸�ϸ� �˴ϴ�.
			// �׷��� �� ��쿡�� 
			// inputArr[0] = 1
			// inputArr[1] = 2
			// inputArr[2] = 3
			// inputArr[3] = 1
			// inputArr[4] = 2
			// inputArr[5] = 2
			// inputArr[6] = 3
			// inputArr[7] = 4
			// inputArr[8] = 5
			// inputArr[9] = 5
			// inputArr[10] = 6
			// inputArr[11] = 6
			// �߿��� inputArr[0]������ �ش��ϴ� �� 1�� check[1] ������ true�� �˴ϴ�.
			// inputArr[1] = 2�̰�, check[2] = true,
			// inputArr[2] = 3�̰�, check[3] = true, ... ������ �Ѿ�ԵǸ�
			// check = [false, true, true, true, true, true, true, false ....] ������ 101���� ������ �˴ϴ�.
			check[inputArr[i]] = true;
		}
		
		//check�� ���̸�ŭ �ݺ����� ���鼭
		for(int i = 0; i < check.length; i++) {
			// check[i]������ true��� i�� ������ָ� �˴ϴ�.
			if(check[i] == true) {
				System.out.print(i+ " ");
			}
		}
		
	}

	public static void main(String[] args) {

		//solution01(new int[] {1,2,3,1,2,2,3,4,5,5});
		solution02(new int[] {1,2,3,1,2,2,3,4,5,5,6,6,15});

	}

}
