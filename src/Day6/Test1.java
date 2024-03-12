package Day6;

class Mypoint3 {
	int x;
	int y;

	String getLocation() {
		return "x: " + x + " , y: " + y;
	}
}


	class MyPoint3D extends Mypoint3 {
		int z;
		
		//오버라이딩
		String getLocation() {
			return "x: " + x + " , y: " + y + "z: " + z ;
	}


public class Test1 {
	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}

}
