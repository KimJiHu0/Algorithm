package Level1;

import java.util.HashMap;

public class solution04_1 {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // HashMap ����!
        HashMap<String, Integer> hm = new HashMap<>();
        
        // [ ��⿡ ������ ������ ]
        // player�� participant �ȿ� �ִ� �� �ϳ��ϳ��� ����
        // ex ] player : "leo", "kiki", "eden" / player : "marina", "josipa", "nikola", "vinko", "filipa" / player : "mislav", "stanko", "mislav", "ana"
        for (String player : participant) {
        	// getOrDefault : ã�� Ű�� �����ϸ� ã�� Ű�� ���� ��ȯ�ϰ�, ������ �⺻���� ��ȯ�Ѵ�.
        	// hm�� put�� ���ִµ� hm�� player�� �ִٸ� 0�� ��ȯ�ϰ� ���ٸ� 1�� ��ȯ�Ѵ�.
        	// ���� hm���� ���� ���� ������ {"leo" : 1, "kiki" : 1, "eden" : 1} ������ ������ ���̴�.
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        System.out.println("participant�� ������ map�� ���� ����� : " + hm);
        
        // [ ������ ������ ]
        // player�� completion�� �� �ϳ��� ����
        // ex ] player : "eden", "kiki" / player : "josipa", "filipa", "marina", "nikola" / player : "stanko", "ana", "mislav"
        for (String player : completion) {
        	// hm�� put�� ���ִµ� player�� hm�� �����Ѵٸ� �װ��� value���� -1���ش�.
        	hm.put(player, hm.get(player) - 1);
        }
        System.out.println("completion�� ������ map�� ���� ����� : " + hm);

        
        // hm�� ����ִ� key���鸸ŭ for��������
        for (String key : hm.keySet()) {
        	// hm value���� 0�� �ƴѾָ� = �������� ���� ����
            if (hm.get(key) != 0){
            	// answer�� key�� ����ش�.
                answer = key;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println("���� : " + solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println("���� : " + solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println("���� : " + solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
		
	}

}
