package Day8;

import Day4.Name;
import Day4.StudentScoreHasA;
import Day4.Subject;

public class StudentScoreHasA {
	
	//필드 - 객체 선언
	private Name name;
	private Subject kor;
	private Subject mat;
	private Subject eng;
	
	private int total;
	private float avg;
	
	// 생성자
	   
	public StudentScoreHasA() {
		name = new Name();
	    kor = new Subject();
	    eng = new Subject();
	    mat = new Subject();
	   }
	
//	public StudentScoreHasA(Name name, Subject kor, Subject mat, Subject eng) {
//		this.name = name;
//		this.kor = kor;
//		this.mat = mat;
//		this.eng = eng;
//	}
//
	
	public String getName() {
		return this.name.getName();
	}

	public void setName(String name) {
		this.name.setName(name);
	}

	public int getKor() {
		return this.kor.getSubject();
	}

	public void setKor(int kor) {
		this.kor.setSubject(kor);;
	}
	
	public int getMat() {
		return this.mat.getSubject();
	}

	public void setMat(int mat) {
		this.mat.setSubject(mat);
	}
	
	public int getEng() {
		return this.eng.getSubject();
	}

	public void setEng(int eng) {
		this.eng.setSubject(eng);
	}

	public int getTotal() {
		return total = eng.getSubject()+kor.getSubject()+mat.getSubject();
	}
	

	

	public float getAvg() {
		return avg = total/3.f;  //내꺼니까 객체가 필요없어서 바로 불러와서 쓰면됨
	}

	public static void main(String []args) {
		
		StudentScoreHasA stu = new StudentScoreHasA(); //stu 객체 생성
		stu.setName("superman");   //
		stu.setKor(90);
		stu.setMat(100);
		stu.setEng(80);
		
		System.out.println(stu.getName());
		System.out.println(stu.getKor());
		System.out.println(stu.getMat());
		System.out.println(stu.getEng());
		System.out.println(stu.getTotal());
		System.out.println(stu.getAvg());
	}


}