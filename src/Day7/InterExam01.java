package Day7;

public class InterExam01 {
	
	private int a;

	public void dispInter() {
		new AAA() { //익명 클래스 즉, 자신 이름이 없으니까 조상이름이나 클래스 이름을 씀, 클래스의 선언과 생성을 동시에하고 단 한번만 사용
			public void disp() {  
				System.out.println(a);
			}
		};
	}
	public static void main(String[] args) {
		InterExam01 inter = new InterExam01();
		inter.dispInter();
	}
}
	