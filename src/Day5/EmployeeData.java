package Day5;

public class EmployeeData {       //직원 생성 관련 클래스
	
	//필드 - 인스턴스 변수
	   private static Employee EmployeeData[] = new Employee[10];
	   private static int EmployeeNumber[] = new int[10];
	   int num = 0;
	   
	   public void inputEmployee(String name,int employeeNumber,String rank,int workYear,String contractWoker,String adminYN) {
	      EmployeeData[num] = new Employee(name,employeeNumber,rank,workYear,contractWoker,adminYN);
	      EmployeeNumber[num] = employeeNumber;
	      num++;
	   }
	   
	   // 이름이 잘 나오는 지 확인해보려고 작성
	   public void search(int a) {
	      System.out.println(EmployeeData[a].getName());

	      
	   }


	   public Employee getEmployeeData(int a) {
	      return EmployeeData[a];
	   }

	   public void setEmployeeData(Employee[] employeeData) {
	      EmployeeData = employeeData;
	   }

	   public int[] getEmployeeNumber() {
	      return EmployeeNumber;
	   }

	   public void setEmployeeNumber(int[] employeeNumber) {
	      EmployeeNumber = employeeNumber;
	   }

	   public int getNum() {
	      return num;
	   }

	   public void setNum(int num) {
	      this.num = num;
	   }
	   //직급 변경함수
	   public void setEmployeeDataRank(int num,String rank) {
		      EmployeeData[num].setRank(rank);
		   }
	   
	   
	   //계약직 유무 변경
	   public void setContractWorker(int num, String contract) {
		   EmployeeData[num].setContractWoker(contract);
	   }
	   
	   //정보조회 함수
	   public void infoWorker(int num) {
		   System.out.println("당신의 이름은" + EmployeeData[num].getName() + "입니다");
		   System.out.println("당신의 사번은" + EmployeeData[num].getEmployeeNumber() + "입니다");
		   System.out.println("당신의 직급은" + EmployeeData[num].getRank() + "입니다");
		   System.out.println("당신의 연차는" + EmployeeData[num].getWorkYear() + "입니다");
	   }

//	public void setContractWoker(int find, String contractWoker) {
//		// TODO Auto-generated method stub
//		
	}