package Day4;  // 객체를 밖에서 만들어서 실행시키느냐 

class AA {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

class BB {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

class CC {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

public class HasA2 {
	
	//필드 > 객체 선언
	private AA aa;
	private BB bb;
	private CC cc;
	
	//생성자
	
	//메서드
	void setAA(AA aa) {
		this.aa = aa; // 외부에서 가져오는 거
		bb = new BB(); // 내안에서 직접만든거
		cc = new CC();
	}
	
	public static void main(String []args) {
		
	   	 HasA2 hasa2 = new HasA2();  //객체생성 = 생성자 실행되면서 객체 등록
	      AA a = new AA(); //객체 생성
	      
	      hasa2.setAA(a);
	      //hasa2.aa = a;
	   }
	
}
