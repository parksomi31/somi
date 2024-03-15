package Day7;

/*
 * ㅇ inner class
 *  - outer class의 멤버를 내것처럼 사용할 수 있게 해주는 클래스
 *  - 특정목적을 가진 경우에 사용(outer class의 맞는 목적)
 *  - event처리 시 주로 사용함.
 *  
 *  1) member inner class
 *  2) static inner class
 *  3) local inner class
 *  4) anonymous inner class
 * 
 * outer class
 * inner class
 * 
 */

public class InnerClassExam01 {

	private int a;
	private static int b;

	public void dispTest() {
	class Test { // inner클래스는 outer클래스에 종속된 것 처럼 사용

		public void disp() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	Test test = new Test();
	test.disp();
	}
		public static void main(String[] args) {
			
////			InnerClassExam01 inner = new InnerClassExam01();
////			InnerClassExam01.Test test = inner.new Test(); 
//			
//			InnerClassExam01.Test test = new InnerClassExam01().new Test();
//			// 위의 2줄을 한줄로 한번에
//			test.disp();

			InnerClassExam01 inner = new InnerClassExam01();
			inner.dispTest();
			
	
		}
	}

