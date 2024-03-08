package Day2;
import java.util.Scanner;

public class makestar {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		   String answer;
		   do {
		      System.out.println("1~6번 중 어떤 별을 만들어볼까요? : "); //출력하고자하는 별 번호 입력
		      int star = makestar.inputNum(sc); // 별 종류 입력
		      
		      switch(star) { // 별 종류에 따른 switch문
		         case 1:
		            makestar.star1();  //1번일 때 참조할 함수
		            break;
		         case 2:
		        	 makestar.star2(); //2번일 떄 참조할 함수
		            break;
		         case 3:
		        	 makestar.star3(); //3번일 때 참조할 함수
		            break;
		         case 4:
		            makestar.star4(); //4번일 때 참조할 함수
		            break;
		         case 5:
		        	 makestar.star5(); //5번일 때 참조할 함수
		            break;
		         case 6:  
		            makestar.star6(); //6번일떄 참조할 함수
		            break;
		            
		      }
		      System.out.println("계속하겠습니까? (y/Y) : ");  
		      answer = makestar.inputString(sc);
		   }while(answer.equals("Y")||answer.equals("y"));   //입력 값 일치여부 확인
		      System.out.println("종료되었습니다.");
		   
			}

			public static int inputNum(Scanner sc) {
		      return sc.nextInt();
			}
		      
		    public static String inputString(Scanner sc) {
		          return sc.next();   
		       }


			// 별 출력 함수
			public static void star1() {
				for (int i = 1; i <= 3; i++) {
					for (int j = 1; j <= 3; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			public static void star2() {
				for (int i = 1; i <= 3; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
			}

			public static void star3() {
				for (int i = 0; i < 3; i++) {
					for (int j = 2; j > i; j--) {
						System.out.print(" ");
					}
					for (int k = 0; k < i + 1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			public static void star4() {
				for (int i = 0; i <= 2; i++) {
					for (int j = 0; j < 3 - i; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < 2 * i + 1; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
			}

			public static void star5() {
				for (int i = 1; i <= 5; i += 2) {
					for (int j = 5; j > i; j -= 2) {
						System.out.print(" ");
					}
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = 1; i <= 5; i += 2) {
					for (int j = 0; j < i; j += 2) {
						System.out.print(" ");
					}
					for (int j = 4; j > i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			public static void star6() {
				int typenum;
				Scanner input = new Scanner(System.in);

				System.out.print("홀수를 입력하세요.");
				typenum = input.nextInt();

				for (int i = typenum / 2, k = 0; i > 0; i--, k++) {
					for (int j = 0; j <= i - 1; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < typenum / 2 - (i - 1) + k; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = 0, k = typenum / 2; i < typenum / 2 + 1; i++, k--) {
					for (int j = 0; j < i; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < (typenum / 2 + 1) - i + k; j++) {
						System.out.print("*");
					}
					System.out.println();
		}
	}
}
