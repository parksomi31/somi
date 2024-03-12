package Day6;

/*
 * 추상클래스는 추상메서드를 하나이상 가지고 있는 클래스
 * 추상클래스는 객체 생성을 할 수는 없고, 상속을 해주는 목적으로 사용
 * 추상메서드는 서브클래스에 강제성을 부여 (오버라이딩을 꼭 해야함)
 * 오버라이딩을 하지 않을 경우에는 서브클래스도 추상클래스화 되어 객체를 생성할 수 없음
 * 
 * ㅇ추상클래스 사용목적
 *  - 상속관계 시 공통된 것은 항상 수퍼클래스에 정의
 *  - 개념적으로는 수퍼에 있어야하지만 기능적으로는 수퍼에 정의할 수 없을 때 사용 (ex. 그리다 > 동그라미,세모,네모)
 * 
 */

abstract class Area { // 추상메서드를 사용한 클래스니까 클래스 앞에도 abstract 붙여줌
	public abstract void draw(); // 추상메서드
	// 일반적인 메서드는 public void draw () {
	// } 이렇게 만들지만 추상메서드는 대괄호를 안쓰고 abstract 붙임

}

class Rect extends Area {

	@Override
	public void draw() { // 부모거를 오버라이드 해옴. 가져오면 대괄호 이용해서 구체화시킬거고, 추상화메서드가 아니니까 abstract는 뺌
		System.out.println("Rect");
	}

}

class Circle extends Area {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Tri extends Area {

	@Override
	public void draw() {
		System.out.println("Tri");
	}

}

public class AbsClassExam01 {

	public static void main(String[] args) {

		Tri tri = new Tri();
		tri.draw();

		Circle circle = new Circle();
		circle.draw();

		Rect rect = new Rect();
		rect.draw();

	}

}
