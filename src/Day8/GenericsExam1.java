package Day8;

import java.util.Scanner;

public class GenericsExam1 {

	private int index; 	
	private StudentScoreHasA []stu ;
	
	//생성자
	
	public GenericsExam1() {
		//stu = new StudentScoreHasA[100];
		this(100);
	}
	public GenericsExam1(int num) {
		stu = new StudentScoreHasA[num];
	}
	
	//메서드
	public int getIndex() {
		return index;
	}
	
	public StudentScoreHasA[] getStu() {
		return stu;
	}
		
	public static void main(String[] args) {
		/*
		 * 1. 학생정보입력
		 * 2. 학생정보수정
		 * 3. 학생정보검색
		 * 4. 학생전체출력
		 */
		GenericsExam1 stu = new GenericsExam1();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보수정");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생전체출력");
			System.out.println("5.  종료");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: stu.setStudent(); break;
			case 2: stu.setModify(); break;
			case 3: stu.setSearch(); break;
			case 4: stu.setDisp(); break;
			case 5: System.exit(0);; break;
			}
		
		}while(true); 

	}
	
	private void setModify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("누구의 점수를 수정할까요? ");
		String name = sc.next();
		
		int i=0;
		while(true) {
			if( name.equals(stu[i].getName())) {
				System.out.println("찾았습니다. ");
				
				while(true) {
					System.out.println("1.국어점수수정");
					System.out.println("2.영어점수수정");
					System.out.println("3.수학점수수정");
					System.out.println("4.수정안함");
					
					int n = sc.nextInt();
					switch(n) {
					case 1: stu[i].setKor(sc.nextInt()); break;
					case 2: stu[i].setEng(sc.nextInt()); break;
					case 3: stu[i].setMat(sc.nextInt()); break;
					
					}
					if(n == 4) break; 
				}
				break;
			}
			i++;
		}
		
	}
	private void setSearch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("누구 찾나요? ");
		String name = sc.next();
		
		int i=0;
		while(true) {
			if( name.equals(stu[i].getName())) {
				System.out.println("찾았습니다. ");
				
				System.out.print(stu[i].getName()+"\t");
				System.out.print(stu[i].getKor()+"\t");
				System.out.print(stu[i].getEng()+"\t");
				System.out.print(stu[i].getMat()+"\t");
				System.out.print(stu[i].getTotal()+"\t");
				System.out.println(stu[i].getAvg());
				
				break;
				
			}
			
			i++;
		}
		
	}
	private void setDisp() {
		
		for(StudentScoreHasA s:stu) {
			if(s == null) break;
			System.out.print(s.getName()+"\t");
			System.out.print(s.getKor()+"\t");
			System.out.print(s.getEng()+"\t");
			System.out.print(s.getMat()+"\t");
			System.out.print(s.getTotal()+"\t");
			System.out.println(s.getAvg());
		}
		
	}
	private void setStudent() {
		
		StudentScoreHasA stu = new StudentScoreHasA(); // 학생객체생성
		Scanner sc = new Scanner(System.in);
		
		stu.setName(sc.next());
		stu.setKor(sc.nextInt());
		stu.setEng(sc.nextInt());
		stu.setMat(sc.nextInt());
		stu.getTotal();
		stu.getAvg();
		
		this.stu[index++]=stu;  // 연결
	}
}