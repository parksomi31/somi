package Day5;

import java.util.*;

public class Employee {

	// 필드 (인스턴스 변수)
	private String name; // name 변수
	private int employeeNumber; //사원번호
	private String rank; //직급
	private int workYear; //연차
	private String contractWoker; //계약직여부
	private int overtimePay=0; //초과근무
	private String adminYN; //관리자여부
	private PaySerach pay;
	
	
	//생성자 - 나는 저 값들이 다 들어와야 실행시키고 싶으니까 디폴트생성자가 아니라 넣어줌

	public Employee(String name, int employeeNumber, String rank, int workYear, String contractWoker,
			String adminYN) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.rank = rank;
		this.workYear = workYear;
		this.contractWoker = contractWoker;
		this.adminYN = adminYN;
		

	}

 
	 //메서드
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String isContractWoker() {
		return contractWoker;
	}

	public void setContractWoker(String contractWoker) {
		this.contractWoker = contractWoker;
	}

	public int getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(int overtimePay) {
		this.overtimePay = overtimePay;
	}

	public int getWorkYear() {
		return workYear;
	}

	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}

	public String isAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}

	//메서드
	Scanner sc = new Scanner(System.in) ;
	
	// 시간외 근무수당 변경 함수
	public void changeOvertimeWork () {
		System.out.println("시간외 근무 수당을 몇시간 입력하시겠습니까?");
		setOvertimePay(sc.nextInt());
		System.out.println(overtimePay);
		
	}
	
	
	//급여 조회 함수
	void PaySearch () {
		pay = new PaySerach (rank, workYear,  contractWoker, overtimePay);
		System.out.println("당신의 월급은:" +pay.result() + "원 입니다");
		
		
	}
}
