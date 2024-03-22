/*
/ *  이름 규칙
 *  1. 클래스: 첫글자는 대문자로 작성
    2. 메소드, 변수(상수를 저장하는 메모리공간, 변하는 값x): 소문자 작성
    3. 상수(변하지 않는 값): 전부 대문자
    4. 단어와 단어가 이어질 때 두번째 단어의 첫글자는 대문자로 작성 ex) blackWhite

 <DataType>
  1. 
    문자형 char 2byte
    정수형 byte, short, int, long  뒤로갈수록 큰 타입 int가 기본타입
    실수형 float, double 
  ㅇ casting
    1. 자동형변환 3 + 4.2 (int + double) 즉, 타입이 다르기 떄문에 에러가 남. but 실행시키면 작은형을 큰형으로 변경하여서 실행시키기 때문에(자동형변환) 3.0 + 4.2 로 변환되어 7.2라는 값 도출
    2. 강제형변환 3/4 = 0 (int/int = int로 도출하기 때문) 0.75로 도출하고 싶다면 강제형변환 실행
              (double)3/(double)4 = 0.75 내가 바꾸고 싶은 형으로 앞에 괄호치고 입력해줌 단, 하나만 써도 작은형을 큰형으로 변경하여서 실행시키기 때문에 한번만 써도 됨
  2. Reference Type: 레퍼런스 변수를 사용
   - 배열
   - 객체
   - enum.
 *  
 */

//public class Hello {

  // public static void main(String []args) {   // 프로그램을 시작해주고 끝내줌. 프로그램 전체에서 main은 한개
	    //public: 누구나, 어디서든 접근 가능
	    //static: 하나로 공유하는 목적. 시작하자마자 메모리 생성. 메모리 절약. main은 프로그램 전체에서 하나니까 static 사용. 메모리의 생성시점.........고민......
	    //함수는 받는 것과 주는 것이 의무적으로 일어나야함
	    //void: 안주겠다  void (주는것) main(string []args) (받는 것)
	   
	   // datatype 변수명 ;
	   // 변수명 = 값 ; / =을 하나만 썼을 때는 대입하겠다는 의미, ==을 쓰면 같다 라는 의미
	   // 변수 - 지역변수 local variable : method안에 선언되어지는 변수, 항상 꼭 초기화를 해야한다!!
	   
	 //  int num;
//	   num = 10;
//	   
//	   char ch = 'A'; // "" 문자열
//	   
//	   System.out.println(num); //class이름을 통해서 가는 거는 무조건 static. /system 안에 있는 out안에 있는 printin을 쓰겠다
//	   System.out.println((int)ch);
//	   
//	   Hello hello; //hello는 레퍼런스변수
//	   hello = new Hello(); //객체 생성, 레퍼런스 타입은 new가 꼭필요, 스택영역과 heap영역이 있음. heap영역에 꼭 객체생성 필요
// 
 //  }
//
 
 
 //class위에 올 수 있는 건 패키지(폴더), 임포트(api 가져다 쓰겠다) 2개 밖에 없음

import java.util.*; 

public class Hello {

	public static void main(String []args) {
		   
		   Scanner scanner = new Scanner(System.in);
		   int a = scanner.nextInt();
		   int b = scanner.nextInt();
		   
		   if(a>b) {
			   System.out.println("a가 큽니다");
		   }
			   else {
			   System.out.println("b가 큽니다");
		   }
			   
	   }
		   
}
		   
 