package Day4;  // 객체를 안에서 만들어서 실행시키느냐

//한 페이지에 클래스를 여러개 만들 때는 public class는 한개만 만들 수 있음

class A {
	
	//필드
	private int a;

	//생성자
	public A() {
		System.out.println("A");

	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

public class HasA {
	
	//field
	
	private String name;  //name을 쓸 수 있는 String 클래스에서 갖다쓸게
	private A age; //age를 쓸 수 있는 A 클래스에서 갖다 쓸게
	
	
	//생성자 - 객체 생성될 떄 불러옴
	public HasA() {
		System.out.println("HasA");
		name = "";
		age = new A();
	}
	public void setName(String name) { this.name = name;
	}
	public void setAge(int age) { this.age.setA(age) ;  //this.age = age;
		                          //this.age.a = age;   > a는 A클래스에서 private잖아 그러니까 직접접근이 안되고 setA 통해서 가야지
	}
	public String getName() { return name;
	}
	public int getAge() {return this.age.getA();
	}
	
	
	public static void main(String[] args) {

		HasA has = new HasA();  //객체생성  > 34행으로 가는건가..?
		has.setName("superman");
		has.setAge(500);
		
		System.out.println(has.getName());
		System.out.println(has.getAge());

	}

}
