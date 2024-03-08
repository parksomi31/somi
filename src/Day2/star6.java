package Day2;
import java.util.Scanner;

public class star6 {
	   public static void main(String[] args) {
	        int typenum;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("홀수를 입력하세요.");
	        typenum = input.nextInt();
	            
	        for(int i=typenum/2, k=0; i>0; i--, k++) {
	            for(int j=0; j<=i-1; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<typenum/2 - (i-1)+k; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=0, k=typenum/2; i<typenum/2 + 1; i++, k--) {
	            for(int j=0; j<i; j++) {
	                System.out.print(" ");   
	            }
	            for(int j=0; j<(typenum/2 + 1)-i+k; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
