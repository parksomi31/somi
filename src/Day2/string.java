// 문자열은 값을 바꿀 수 없다!!
package Day2;

public class string {
	public static void main(string[] args) {
		
		String str1 = new String("Superman")
		String str2 = new String("Superman")
		
		if(str1 == str2) :   //문자열끼리 비교할 때는 값을 비교하는게 아니라 주소를 비교하는 것 즉, 값은 다르다고 나올 것
			System.out.println("Same");
	}else

	{
		System.out.println("Diff");
	}

	if(str1.equals(str2))
	{ // 문자열의 값끼리 비교할때
		System.out.println("Same");
	}else
	{
		System.out.println("Diff");
	}
}
