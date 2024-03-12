package Day6;

/*
 * is~a 관계: 상속관계
 * extends: 상속 표현
 * 객체끼리는 단일상속만 허용한다

 * 
 * 
 * ㅇ오버라이딩 (다형성)
 * -부모의 메서드와 똑같은 형태로 제공 #오버로딩은 달라야함 
 * -동적바이딩할떄꼭필요
 */



public class IsaExam1 extends Object {     //object는 무조건 상속됨
	
  public String toString() {
//      return getClass().getName() + "@" + Integer.toHexString(hashCode());
//  }
 
 //Object에 있는 toString 을 안쓰고 싶을 때 같은 형태로 작성하면 부모꺼를 무시함
// public String toString() {
//      return "Superman";
//  }
 
 public String toString() {
      return super.toString() +"Superman";
  }
 
	
	public static void main(String[] args) {
		
		IsaExam1 isa = new IsaExam1();
		
		System.out.println(isa);   // 객체를 출력해봄
		System.out.println(isa.toString()); // 윗줄과 같은 의미임. (참조형변수.tostring) 은 항상 생략되어 있던 것(tostring은 object에 속해있는것)
	}

}
