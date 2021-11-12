import java.util.Scanner;

public class ���̽�ƽ {

	public static int solution(String name) {
		int answer = 0;
        
        int len = name.length();
        
        //�ִ�� ���� �� �ִ� min���� ������ ���°�
        int min_move = len-1;
        
        for(int i=0; i<len; i++) {
        	answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
        	
        	//�¿�: ���ӵ� A�� ���忡 ���� �ּ� �������� �޶�����
        	int next = i+1;// ���� ���� ��ġ����
        	//�� ������ A��� ��� NEXT++
        	while(next<len && name.charAt(next) == 'A')
        		next++;
        	
        	min_move = Math.min(min_move, i+len-next + i);
        }//for
        
        answer += min_move;
        
        System.out.println(answer);
        return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		solution(s);
	}

}
