package Day6;

class AA {
	private int a; // 10

	public AA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

class BB extends AA
{
	private int b; // 20

	public BB(int a, int b) { // super 호출을 명시적으로 부를 때는 그 값을 넘겨줘야함
		super(a);
		this.b = b;
	}

	public int getB() {
		return b;
	}

}

class CC extends BB {
	private int c; // 30

	public CC(int a, int b, int c) {

		super(a, b);
		this.c = c;

	}

	public int getC() {
		return c;
	}
}

public class SuperExam01 {

	public static void main(String[] ar) {
		CC cc = new CC(10, 20, 30); // 객체를 생성하면서 부모의 필드값을 쓰고싶을 때는 명시적으로 super호출을 써야함

		System.out.println(cc.getA());// 10
		System.out.println(cc.getB());// 20
		System.out.println(cc.getC());// 30
	}
}