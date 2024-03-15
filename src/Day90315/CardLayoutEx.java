package Day90315;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;

public class CardLayoutEx extends Frame {
	CardLayout card;
	Panel first_panel, second_panel, thifd_panel;

	public CardLayoutEx() {
		super("CardLayout");

		card = new CardLayout();

		setLayout(card);

		first_panel = new Panel();
		first_panel.add(new Button("1"));
		first_panel.add(new Button("2"));

		second_panel = new Panel();
		second_panel.add(new Button("3"));
		second_panel.add(new Button("4"));

		thifd_panel = new Panel();
		thifd_panel.add(new Button("5"));
		thifd_panel.add(new Button("6"));

		add("1", first_panel);
		add("2", second_panel);
		add("3", thifd_panel);
	}

	public void rotate() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			card.next(this);
		}
	}

	public static void main(String[] args) {
		CardLayoutEx clt = new CardLayoutEx();

		clt.setBounds(200, 200, 200, 100);
		clt.setVisible(true);

		clt.rotate();
	}
}