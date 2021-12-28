package basic;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	// �л� ���� ����ֱ�
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		st.add(new Student("��ö��", "1"));
		
		String n = "";
		while(true) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("�й��� �Է��ϼ��� : ");
			String no = sc.nextLine();
			st.add(new Student(name, no));
			
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(y/n)");
			n = sc.nextLine();
			if(n.equals("n")) {
				break;
			}
		}
		
		String chkName = "";
		while(true) {
			System.out.print("�л� �̸��� �Է��ϼ��� : ");
			chkName = sc.nextLine();
			System.out.println();
			
			boolean isChk = false;
			String chkNo = "";
			for (Student student : st) {
				if(student.name.equals(chkName)) {
					isChk = true;
					chkNo = student.no;
					break;
				}
			}
			
			if(isChk)
				System.out.println("�л��� �й��� " + chkNo);
			else
				System.out.println("���� �л��Դϴ�.");
			
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(y/n)");
			n = sc.nextLine();
			if(n.equals("n")) {
				break;
			}
		}
		
		sc.close();
	}
}

class Student {
	String name;
	String no;
	
	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}
}

