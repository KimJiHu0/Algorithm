package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exam04 {
	
	/*
	 * [��������]
	 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	 * �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * [����� ��]
	 * participant : ["leo", "kiki", "eden"]
	 * completion : ["eden", "kiki"]
	 * return : ["leo"]
	 */
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> list = new ArrayList<String>(Arrays.asList(participant));
        
        for(int i = 0; i < participant.length; i++) {
        	for(int j = 0; j < completion.length; j++) {
        		if(participant[i]==completion[j]) {
        			list.remove(participant[i]);
        			System.out.println(list);
        		}
        	}
        }
        
        Object[] a = list.toArray();
        answer = (String)a[0];
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
		
	}

}
