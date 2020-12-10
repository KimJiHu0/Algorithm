package Level2;

import java.util.Arrays;

public class solution03 {
	
	// ����Ʈ
	
	public static int solution(int[] people, int limit) {
	    int answer = 0;

	    Arrays.sort(people);
	    // => [50,50,70,80]

	    int min = 0;

	    // max�� people.length = [�Ųٷκ��� �ϱ� ����], min�� max���� �۰ų� ����������, max�� --
	    for (int max = people.length - 1; min <= max; max--){
	    	// ���࿡ people�� min���� [peopele�� 0����] + people�� ������������ ������ �� limit���� �۰ų� ���ٸ�
	      if (people[min] + people[max] <= limit) {
	    	  // min�� ++���ݴϴ�.
	    	  min++;
	      }
	      answer++;
	    }

	    return answer;
	}
	
	public static int solution1(int[] people, int limit) {
		
		// �ִ� + �ּ� �� ����Ʈ�� �¿��� �������Ѵ�.
        Arrays.sort(people);
        // => [50,50,70,80]
 
        int answer = 0;
        
        // index�� people�� ����-1. ��, 3
        int index = people.length - 1;
        // 0���� 3���� for���� �����µ� i++
        for(int i = 0; i <= index; i++) {
        	System.out.println("answer�� ++��");
        	// �ϴ� 0������ �ִ� �� �¿��.
        	answer++;
        	// index�� i���� ũ��, i������ index--������ ������ �� limit���� ũ�ٸ�
            while(index > i && people[i] + people[index--] > limit) {
            	System.out.println("index�� ���̾�?" + index);
            	System.out.println("������ñ�");
                answer++;
            }
        }
 
        return answer;
    }
	
	public static int solution2(int[] people, int limit) {
		int answer = 0;
		
		int i = 0;
		int j;
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));
		
		// �����԰� ���� ���ſ� ������� �Ǵ��Ѵ�.
		for(j = people.length-1; i <= j; j--) {
			System.out.println("i�� ���̾� : " + i);
			System.out.println("j�� ���̾�  : " + j);
			// �ּ� + �ִ� ������ 2���� ���� �������Ѻ��� ū ���
			// ���� ū �������� �ο��� ���� 1�뿡 �¿� ������.
			if(people[j] + people[i] > limit) {
				System.out.println(people[j] + " + " + people[i] + "�� limit���� Ŀ");
				answer++;
				System.out.println("ũ�ϱ� answer++������� : " + answer);
			}
			
			// �ּ� + �ִ� ������ 2���� ���� �������Ѻ��� ���ų� ���� ���
			// - �� ���� �� ��Ʈ�� �¿� ������.
			// - �� �������� �����԰� ���� �ο��� �������� ��ƾ��ϱ� ������ i++�� ���ش�.
			else {
				System.out.println(people[j] + " + " + people[i] + "�� limit���� �۰ų� ����");
				answer++;
				System.out.println("�� �� �ѹ��� �¿� �������� : " + answer);
				i++;
				System.out.println("i++���� �� : " + i);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		//System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
		//System.out.println(solution(new int[] {70,80,50}, 100));
		//System.out.println(solution(new int[] {50,50,80,70,40,60}, 100));
		//System.out.println(solution(new int[] {40,40,40}, 100));
		//System.out.println(solution(new int[] {10,20,30,40,50,60,70,80,90}, 100));
		//System.out.println(solution1(new int[] {70, 50, 80, 50}, 100));
		//System.out.println(solution1(new int[] {70,80,50}, 100));
		//System.out.println(solution1(new int[] {50,50,80,70,40,60}, 100));
		//System.out.println(solution1(new int[] {40,40,40}, 100));
		//System.out.println(solution1(new int[] {10,20,30,40,50,60,70,80,90}, 100));
		System.out.println(solution2(new int[] {70, 50, 80, 50}, 100));
		System.out.println(solution2(new int[] {70,80,50}, 100));
		System.out.println(solution2(new int[] {50,50,80,70,40,60}, 100));
		System.out.println(solution2(new int[] {40,40,40}, 100));
		System.out.println(solution2(new int[] {10,20,30,40,50,60,70,80,90}, 100));
	}

}
