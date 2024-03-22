package Day100318;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterAddressEx { 
	public static void main(String[] args) 
		throws UnknownHostException {  //throws로 예외를 던져서 처리
			
			//내꺼 확인
			InetAddress iaddr = InetAddress.getLocalHost();
			System.out.printf("호스트 이름: %s %n", iaddr.getHostName());
			System.out.printf("호스트 IP주소: %s %n",  iaddr.getHostAddress());
			
			//java.sun.com 확인
			iaddr = InetAddress.getByName("java.sun.com");
			System.out.printf("호스트 이름: %s %n", iaddr.getHostName());
			System.out.printf("호스트 IP주소: %s %n",  iaddr.getHostAddress());
			
			
			//특정 도메인 확인
			InetAddress sw[] = InetAddress.getAllByName("www.naver.net");
			for (InetAddress temp_sw : sw) {
				System.out.printf("호스트 이름: %s, " , 
						temp_sw.getHostName());
				System.out.printf("호스트 IP주소 : %s %n" , 
						temp_sw.getHostAddress());
			}
		}
	}
