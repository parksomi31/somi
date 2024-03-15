package Day7;

import static java.lang.System.out;

public class GenericsExam1<T> {
	
	T[] v;
	
	public void set(T[] n) {
		v = n ;
	}
	public void print() {
		for(T s : v)
			out.println(s);
	}
	
	public static void main(String[] args) {  //입력하는 순간 위에 정의되지 않았던 <T>가 String타입으로 모두 바뀌어서 정의됨
		GenericsExam1<String> t = new GenericsExam1<String>();
		
		String[] ss = {"애","아","서"};
		t.set(ss);
		t.print();
	
		/* 나쁜 예시  // 지네릭 타입으로 쓴 건지 알 수 가 없음
		 * GenericsExam1 t1 = new GenericsExam1();
		 * Interger[] s = {1,2,3} ;
		 * t1.set(s);
		 * t1.print()	;	 
		 * 
		 */
	}

}
