import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

	private JButton addButton;
	private JButton deleteButton;
	private StringListener textListener;

	public Toolbar() {

		deleteButton = new JButton("Delete");
		addButton = new JButton("Add");
		
		addButton.addActionListener(this);
		deleteButton.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(addButton);
		add(deleteButton);
	}

	public void setStringListener(StringListener listener) {
		this.textListener = listener;

	}
	
//tego nie rozumiem
	
	public void actionPerformed(ActionEvent e) {

		JButton clicked = (JButton)e.getSource();
		if (clicked == addButton) {
			if (textListener != null) {
				textListener.textEmitted("ADDBUTTON");
			}
		} else if (clicked == deleteButton) {
			if (textListener != null) {
				textListener.textEmitted("DeleteButton");

			}
		}

	}

}
