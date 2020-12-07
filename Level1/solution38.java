package Level1;

import java.util.ArrayList;

public class solution39 {

	// ��Ʈ����
	
	// �׽�Ʈ���̽� 4,5,6,7,15,16,20,21,22 ����

	/*
	 * īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. ��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ���
	 * �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�. �� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���.
	 * ��Ʈ ������ ���� ��� ������ �Ʒ��� ����.
	 * 
	 * ��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�. �� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�. ������ �Բ� Single(S),
	 * Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3
	 * )���� ���ȴ�. �ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2���
	 * �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�. ��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)��
	 * ������ 2�谡 �ȴ�. (���� 4�� ����) ��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*)
	 * ������ 4�谡 �ȴ�. (���� 4�� ����) ��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������
	 * -2�谡 �ȴ�. (���� 5�� ����) Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�. ��Ÿ��(*),
	 * ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�. 0~10�� ������ ���� S, D, T, *, #��
	 * ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.
	 * 
	 * ����|���ʽ�|[�ɼ�]���� �̷���� ���ڿ� 3��Ʈ. ��) 1S2D*3T
	 * 
	 * ������ 0���� 10 ������ �����̴�. ���ʽ��� S, D, T �� �ϳ��̴�. �ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
	 * 
	 * ����		dartResult		answer	                	����
     * 1		1S2D*3T	    	 37	 				 1��1�� * 2 + 2��2�� * 2 + 3��3��
	 * 2		1D2S#10S		  9					 1��2�� + 2��1�� * (-1) + 10��1��
	 * 3	    1D2S0T			  3					 1��2�� + 2��1�� + 0��3��
	 * 4		1S*2T*3S		 23					 1��1�� * 2 * 2 + 2��3�� * 2 + 3��1��
	 * 5		1D#2S*3S		 5					 1��2�� * (-1) * 2 + 2��1�� * 2 + 3��1��
	 * 6		1T2D3D#			-4					 1��3�� + 2��2�� + 3��2�� * (-1)
	 * 7		1D2S3T*			59					 1��2�� + 2��1�� * 2 + 3��3�� * 2
	 */
	
	public static int solution(String dartResult) {
		int answer = 0;
		
		ArrayList<String> list = new ArrayList<String>();
		
		String nStr = "";
		int cnt = 0;
		
		for(int i = 0; i < dartResult.length(); i++) {
			// dartResult���� �ѱ��ھ� �����ͼ� ���ǹ��� ���µ� �ƽ�Ű�ڵ� �����Ͽ� 48~57 �̸� (0~9) count�� ++���ָ鼭, nStr�̶�� String������ �ش� ���� �����ش�.
			if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
				cnt++;
				nStr += dartResult.charAt(i);
			// �װԾƴ϶� S,D,T�� ������
			} else {
				if(cnt > 0) {
					list.add(nStr);
					nStr = "";
					cnt = 0;
				}
				list.add(dartResult.charAt(i)+"");
			}
		}
		
		System.out.println(list);
		
		
		int count = 0;
		
		// ���� for�� ������ ���� ����غ���!
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("S")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 1);
				count++;
			} else if(list.get(i).equals("D")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 2);
				count++;
			} else if(list.get(i).equals("T")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 3);
				count++;
			} else if(list.get(i).equals("#")) {
				if(count == 1) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				} else if(count == 2) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				} else {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				}
			} else if(list.get(i).equals("*")) {
				if(count == 1) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += (Integer.parseInt(list.get(i-2))) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					}
				} else if(count == 2) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					} 
					
					if(list.get(i-3).equals("S")) {
						answer -= Integer.parseInt(list.get(i-4));
						answer += (Integer.parseInt(list.get(i-4))) * 2;
					} else if(list.get(i-3).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
					} else if(list.get(i-3).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
					}
					
					if(list.get(i-4).equals("S")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Integer.parseInt(list.get(i-5))*-1);
							answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Integer.parseInt(list.get(i-5)) * 2;
							answer += Integer.parseInt(list.get(i-5)) * 4;
						}
					} else if(list.get(i-4).equals("D")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
						}
					} else if(list.get(i-4).equals("T")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
						}
					}
					
				} else if(count == 3) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += (Integer.parseInt(list.get(i-2))) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					} 
					
					if(list.get(i-3).equals("S")) {
						answer -= Integer.parseInt(list.get(i-4));
						answer += (Integer.parseInt(list.get(i-4))) * 2;
					} else if(list.get(i-3).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
					} else if(list.get(i-3).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
					}
					
					if(list.get(i-4).equals("S")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Integer.parseInt(list.get(i-5))*-1);
							answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Integer.parseInt(list.get(i-5)) * 2;
							answer += Integer.parseInt(list.get(i-5)) * 4;
						}
					} else if(list.get(i-4).equals("D")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
						}
					} else if(list.get(i-4).equals("T")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
						}
					}
				}
			}
		}
		return answer;
	}
			
	
	public static void main(String[] args) {
		//System.out.println(solution("1S2D*3T")); // =>37
		//System.out.println(solution("1D2S#10S")); // => 9
		//System.out.println(solution("1D2S0T")); // => 3
		//System.out.println(solution("1S*2T*3S")); // => 23
		//System.out.println(solution("1D#2S*3S")); // => 5
		//System.out.println(solution("1T2D3D#")); // => -4
		//System.out.println(solution("1D2S3T*")); // => 59
		//System.out.println(solution("10D10T*10S"));
		//System.out.println(solution("10T#10T*10S"));
		//System.out.println(solution("10T#10T#10S#"));
		//System.out.println(solution("9D10T*10S"));
		//System.out.println(solution("10T#10T#10S#"));
		//System.out.println(solution("1T#1T#1S#"));
		//System.out.println(solution("1T#1T#10S#"));
		//System.out.println(solution("1T1T1S*"));
		//System.out.println(solution("1T1T1S"));
		//System.out.println(solution("0T1T1S"));
		//System.out.println(solution("0T#9T0S*"));
		System.out.println(solution("10T#10S*10D"));
	}

}
