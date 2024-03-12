package Day6;

/*
 * is~a 관계: 상속관계
 * extends: 상속 표현
 *  객체끼리는 단일상속만 허용한다. *다중상속이 안됨
 *  (java 중 인터페이스라는 애는 다중상속이 되긴 함)
 *  
 *  public class IsAExam01 extends Object {
 *  *extends object가 생략되어있다.
 *  
 */

/*
 * 오버라이딩 (다형성)
 * -부모의 메소드와 '똑같은 형태' (오버로딩은 변수개수나 타입이 다르자나)로 제공
 * -부모의 내용을 수정해서 가공해서 제공하고자 할 경우에 사용
 * -동적바이딩할떄꼭필요
 * 
 * 
 */

class A {
	public void disp() {
		System.out.println("A....");
	}
}

public class IsAExam01 extends A { //object는 무조건 상속됨
	 // (extends Object)
   
//   public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
   
   //오버라이딩 - Object에 있는 toString 을 안쓰고 싶을 때 같은 형태로 작성하면 부모꺼를 무시함
//   public String toString() {
//        return "Superman";
//    }
   
   public String toString() {  //toString이라는 메서드가 해쉬코드를 호출하는 데
        return super.toString() +"Superman";  //위 주석처럼 부모꺼를 무시하기로 했어도 필요하게 된 경우에는 super를 통해서 부모꺼를 불러서 씀
    }
   
   
   public static void main(String[] args) {
      
      IsAExam01 isa = new IsAExam01();
      
      System.out.println(isa);   // 객체를 출력해봄
	  System.out.println(isa.toString()); // 윗줄과 같은 의미임. (참조형변수.tostring) 은 항상 생략되어 있던 것(tostring은 object에 속해있는것) - println메서드의 기능
      //레퍼런스변수."toString()"이 생략되어있음. 상속받은 Object에 있는 !!
      //내가 object를 상속받았으니까, 내(isa)가 된거임. 그러니까 나를 통해서 toString을 이용할 수 있음
      //내가 상속받았으니까 자식변수명.부모메서드 이렇게 호출 가능
      //단, 아무리 부모꺼라고 하더라도 private 멤버에는 바로 접근할 수 없음. 게터세터로 접근하면되지!
	  
  
   }

}


