package basic;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	// 학생 정보 집어넣기
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		st.add(new Student("김철수", "1"));
		
		String n = "";
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("학번을 입력하세요 : ");
			String no = sc.nextLine();
			st.add(new Student(name, no));
			
			System.out.print("더 입력하시겠습니까?(y/n)");
			n = sc.nextLine();
			if(n.equals("n")) {
				break;
			}
		}
		
		String chkName = "";
		while(true) {
			System.out.print("학생 이름을 입력하세요 : ");
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
				System.out.println("학생의 학번은 " + chkNo);
			else
				System.out.println("없는 학생입니다.");
			
			System.out.print("더 입력하시겠습니까?(y/n)");
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

