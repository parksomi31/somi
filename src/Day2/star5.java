package Day2;

public class star5 {
	  public static void main(String []args) {
	      for(int i = 1; i <= 5; i+=2) {
	         for(int j = 5; j > i; j-=2) {
	            System.out.print(" ");
	         }
	         for(int j = 0; j < i; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      for(int i = 1; i <= 5; i+=2 ) {
	         for(int j = 0; j < i;j+=2) {
	            System.out.print(" ");
	         }
	         for(int j = 4; j > i; j--) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	   }
}