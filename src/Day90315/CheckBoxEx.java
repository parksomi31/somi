package Day90315;

import java.awt.*;

public class CheckBoxEx {
	public static void main(String[] args) {
		Frame f = new Frame("ButtonTest");
		Panel p = new Panel();

		Checkbox ck1 = new Checkbox("1", true);
		Checkbox ck2 = new Checkbox("2");
		Checkbox ck3 = new Checkbox("3");

		p.add(ck1);
		p.add(ck2);
		p.add(ck3);

		f.add(p);

		f.setSize(300, 100);
		f.setVisible(true);
	}

}
