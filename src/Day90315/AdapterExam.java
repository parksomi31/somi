package Day90315;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//key 는 멤버이너로
//window는 anoymous로
	
public  class AdapterExam extends Frame implements ActionListener {
		
		Panel p1, p2, p3;
		
		TextField tf;
		TextArea ta;
		
		Button b1, b2;
		
		public AdapterExam(){

			super("Adapter");
			
			p1=new Panel(); //텍스트 필드를 포함하는 패널
			p2=new Panel(); //텍스트 영역을 포함하는 패널
			p3=new Panel(); //버튼을 포함하는 패널

			tf=new TextField(35); //컬럼이 35개인 TextFiled 객체생성
			ta=new TextArea(10,35); //10개의 행과 35개의 컬럼을 가진 TextArea 객체생성
			
			b1=new Button("Clear"); 
			b2=new Button("Exit");
			
			p1.add(tf);
			p2.add(ta);
			p3.add(b1);
			p3.add(b2);

			add("North",p1); //NORTH위치에 P1패널추가
			add("Center",p2);   //CENTER위치에 P2패널추가
			add("South",p3);  //SORTH위치에 P3패널추가
			
			setBounds(300,200,300,300); //프레임의 위치와 크기설정
			setVisible(true); //프레임을 화면에 표시하는 메서드
			b1.addActionListener(this); 
			b2.addActionListener(this);
		
			tf.addKeyListener(new KeyAdapter() {
		        public void keyTyped(KeyEvent e) {
		            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
		                ta.append(tf.getText() + "\n");
		                tf.setText("");
		            }
		        }
		    });

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
				} );
		}
		
		public void actionPerformed(ActionEvent e) {
	        String str = e.getActionCommand();
	        if (str.equals("Clear")) {
	            ta.setText("");
	            tf.setText("");
	            tf.requestFocus();
	        } else if (str.equals("Exit")) {
	            System.exit(0);
	        }
	    }

	    public static void main(String[] args) {
	        new AdapterExam();
	    }
}

//	    class KeyEventHandler extends KeyAdapter {
//	        public void keyTyped(KeyEvent e) {
//	            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
//	                ta.append(tf.getText() + "\n");
//	                tf.setText("");
//	            }
//	        }
//	    }
//	}
//	class WindowEventHandler extends WindowAdapter{
//		public void windowClosing(WindowEvent e){
//			System.exit(0);
//		}
//	}