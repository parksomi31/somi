package Day90315;

import java.awt.Frame;

public class FrameEx2 extends Frame {
		
		//생성자
		public FrameEx2 () {
			super("Frame Test") ;
			
			setSize(300,300);
			setVisible(true) ;
		}
		public static void main(String[] args) {
			FrameEx2 fe = new FrameEx2();
		}
	}

