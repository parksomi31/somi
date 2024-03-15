package Day90315;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class Exit extends Window {
public void windowClosing(WindowEvent e) {
	System.out.println(0);
}
//public class WindowEventEX extends Frame implements WindowListener {  //프레임이 윈도우..?......
	public class WindowEventEX extends Frame {
}
	public WindowEventEX( ) {
		super("WindowEvent 테스트");
		
		Label exit = new Label("프로그램 종료");
		
		add(exit);
		
		setBounds(300,300,200,200);
		setVisible(true);
		
		//addWindowListener(this);  프레임을 상속받았으니까 참조변수 안통하고 바로 사용가능
		
		addWindowListener(new Exit());
  
	}
public static void main(String[] args) {
	new WindowEventEX() ;
}

	System.exit(0);
}
