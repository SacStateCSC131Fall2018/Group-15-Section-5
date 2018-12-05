
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

public class PirexSummarizeDocTab extends JPanel{
	
	private String name = "Summarize Documents";
	
	public PirexSummarizeDocTab() {
		//JPanel panel_2 = new JPanel();
		//tabbedPane.addTab("Summarize Documents", null, this, null);
		this.setLayout(new BorderLayout(0, 0));		
	
		JTextArea textArea_3 = new JTextArea();
		this.add(textArea_3, BorderLayout.CENTER);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		this.add(scrollBar_1, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		this.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		this.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		this.add(panel_5, BorderLayout.SOUTH);
	}	
	
	public String getName() {
		return name;
	}
}
