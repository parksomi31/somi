package Day6;

//상속받는 클래스가 2개이면 생성자는 총 3번 호출되는 것
// 내꺼, 바로 위에 꺼, 그 위에 꺼


/* super, super()
 * 
 * 
 * 1. super
 *  - 부모의 멤버를 사용하고자 할 떄 사용
 *  - 오버라이딩 된 멤버를 사용할 때 부모를 명시적으로 적용하기 위해서 (얘를 사용안하면 숨겨져있는 this.이 사용됨)
 * 2. super()
 *  - 부모의 생성자를 호출
 *  - 항상 sub class의 생성자 첫번째 라인에 항상 존재하며, 명시적으로 사용이 가능하나 위치는 변경할 수 없음.
 *    (즉, 아들 class에서 다른 작업 후 부모의 생성자를 호출하는 것은 불가) 
 * 
 */

class A {

	public A() {
		// super(); - super는 부모의 멤버를 접근할때 쓰는거고, super() 는 생성자호출
		System.out.println("Super class");
	}
}

public class IsAExam2 {
	public IsAExam2() {
//부모의 생성자를 호출
//super(); 항상 생성자가 불러지는 첫번째 라인에 존재
		System.out.println("Sub class");
	}

	public static void main(String[] args) {
		IsAExam2 isa = new IsAExam2();
	}
}
