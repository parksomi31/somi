package Day5;

import java.util.Scanner;

public class Admin {
	   private Pay pay;
	   private EmployeeData employee;
	   
	   public Admin() {
	      this.pay = new Pay();
	      this.employee = new EmployeeData();
	      
	   }
	   
	   Scanner sc = new Scanner(System.in) ;
	  
	   //직원 생성 메서드
	   public void addEmployee(String name,int employeeNumber,String rank,int workYear,String contractWoker,String adminYN) {
	      employee.inputEmployee(name, employeeNumber, rank, workYear, contractWoker, adminYN);
	   }
	   
	   //직원직급변경 메서드
	   public void ChangeRank() {
		   //변경하고자 하는 사원번호를 입력받아서 인덱스를 찾기
		   System.out.println("직급을 변경할 사원의 사원번호를 입력해주세요");
		   int num = sc.nextInt();
		   int find = 0;
		   for(int i=0; i<10; i++ ) {
			   if(employee.getEmployeeNumber()[i] == num) {
				   find = i;
				   break;
				   
			   }
		   }
		   
		      //찾았으면 랭크를 바꿔주기
		      System.out.println("변경 후 직급을 입력해주세요.");
		      String rank = sc.next();
		      employee.setEmployeeDataRank(find, rank);
		   }
	   
	   
	   
	   
	   
	   		public void ChangeContract() {
		   //변경하고자 하는 사원번호를 입력받아서 인덱스를 찾기
		   System.out.println("계약직 유무를 변경할 직원번호를 입력해주세요");
		   int num = sc.nextInt();
		   int find = 0;
		   for(int i=0; i<10; i++ ) {
			   if(employee.getEmployeeNumber()[i] == num) {
				   find = i ;
				   break;
			   }
		   }
		   
		      //찾았으면 계약직유무를 바꿔주기
		      System.out.println("계약직 유무를 입력하세요. (Y/N)");
		      String contractWoker = sc.next();
		      employee.setContractWorker(find, contractWoker);
		      
		   }
	   //기본급 변경 메서드
	   		public void ChangeBasePay( ) {
	   			System.out.println("변경 후의 기본급을 입력해주세요");
	 		   int num = sc.nextInt();
	   			pay.setBasePay(num);
	   		}
	   		
	   		// 직무급 변경 메서드
	   		public void ChangeRankPay( ) {
	   			System.out.println("변경 후의 직무급을 입력해주세요");
	 		   int num = sc.nextInt();
	   			pay.setRankPay(num);
	   		}
	   		//
	   		public void ChangeOverPay( ) {
	   			System.out.println("변경 후의 시간외 수당을 입력해주세요");
	 		   int num = sc.nextInt();
	   			pay.setOverPay(num);
	   		}
	   		
	   		//계약직 급여 메서드
	   		public void ChangeContractPay () {
	   			System.out.println("변경 후의 계약직 급여를 입력해주세요");
	   		 int num = sc.nextInt();
	   			pay.setContractPay(num);
	   		}

	   public Pay getPay() {
	      return pay;
	   }

	   public void setPay(Pay pay) {
	      this.pay = pay;
	   }

	   public EmployeeData getEmployee() {
	      return employee;
	   }

	   public void setEmployee(EmployeeData employee) {
	      this.employee = employee;
	   }
	   
	   public void search(int a) {
	      employee.search(a);
	   }
	   
	   
	}