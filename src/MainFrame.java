import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private JButton btn;
	private Toolbar toolbar;
	private FormPanel formPanel;

	public MainFrame(){
		
		
		
		super("Program");
		
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		btn = new JButton("Button");
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener(){
			public void textEmitted(String text){
				textPanel.appendText(text);
			}
		});
		
		formPanel.setFormListener(new FormListener()
		{
			public void FormEventOccured(FormEvent e){
				String name = e.getName();
				String occupation = e.getOccupation();
				textPanel.appendText(name + "" + occupation + "\n" );
			}
			
		});
		
		
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
		
	}

}
