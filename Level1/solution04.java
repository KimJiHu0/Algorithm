package Level1;

import java.util.Arrays;

public class solution04 {
	
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
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		
	}

}
