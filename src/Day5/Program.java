package Day5;

import java.util.*;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean a = true;

		while (a == true) {

			System.out.println("모드를 입력해주세요 (1. 관리자모드 / 2. 사용자모드 / 3. 종료)");
			int mode = sc.nextInt();

			Admin admin = new Admin();
			EmployeeData employeedata = new EmployeeData();
			PaySerach paysearch = new PaySerach();
			Employee employee = new Employee();

			if (mode == 1) {
				System.out.println("원하는 기능을 입력해주세요 (1.직원추가 / 2. 직급변경 / 3. 계약직 유무변경 / 4.급여 변경 / 5. 종료");
				int function = sc.nextInt();

				switch (function) {
				case 1:
					System.out.println("추가하고자하는 직원의 이름을 입력해주세요: ");
					String name = sc.next();
					System.out.println("추가하고자하는 직원의 사번을 입력해주세요: ");
					int employeeNumber = sc.nextInt();
					System.out.println("추가하고자하는 직원의 직급을 입력해주세요: ");
					String rank = sc.next();
					System.out.println("추가하고자하는 직원의 연차를 입력해주세요: ");
					int workYear = sc.nextInt();
					System.out.println("추가하고자하는 직원의 계약직 여부를 입력해주세요(Y/N): ");
					String contractWoker = sc.next();
					System.out.println("추가하고자하는 직원의 관리직 여부를 입력해주세요(Y/N): ");
					String adminYN = sc.next();

					admin.addEmployee(name, employeeNumber, rank, workYear, contractWoker, adminYN);
					break;

					
				case 2:
					admin.ChangeRank();
					break;

				case 3:
					admin.ChangeContract();
					break;

				case 4:
					System.out.println("변경하고자 할 급여를 입력하세요 (1. 기본급 / 2. 직무급 / 3. 시간외수당 / 4. 계약직급여 / 5.종료");
					int pay = sc.nextInt();

					switch (pay) {
					case 1:
						admin.ChangeBasePay();
						break;
					case 2:
						admin.ChangeRankPay();
						break;
					case 3:
						admin.ChangeOverPay();
						break;
					case 4:
						admin.ChangeContractPay();
						break;
					case 5:
						System.out.println("프로그램을 종료합니다");
						a = false;
						break;

					}
				case 5:
					System.out.println("프로그램을 종료합니다");
					break;
				}

			} else if (mode == 2) {
				System.out.println("원하는 기능을 입력하세요 (1. 정보조회 / 2. 급여조회 / 3. 시간외수당 입력 / 4. 종료)");
				int function = sc.nextInt();

				switch (function) {
				
				case 1:
					System.out.println("사번을 입력해주세요");
					int num = sc.nextInt();
					int find = 0;
					for (int i = 0; i < 10; i++) {
						if (employeedata.getEmployeeNumber()[i] == num) {
							find = i;
							break;
						}
					}
					employeedata.infoWorker(find);

				case 2:
					System.out.println("사번을 입력해주세요");
					int num2 = sc.nextInt();
					int find2 = 0;
					for (int i = 0; i < 10; i++) {
						if (employeedata.getEmployeeNumber()[i] == num2) {
							find2 = i;
							break;

						}
					}
					employeedata.getEmployeeData(find2).PaySearch();

				case 3:
					System.out.println("사번을 입력해주세요");
					int num3 = sc.nextInt();
					int find3 = 0;
					for (int i = 0; i < 19; i++) {
						
						if (employeedata.getEmployeeNumber()[i] == num3) {
							find3 = i;
							break;
						}
					}
					employeedata.getEmployeeData(find3).changeOvertimeWork();
					
				}
			}
		}
	}

//	private static int nextInt() {
//		// TODO Auto-generated method stub
//		return 0;
	}
