import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//Kevin
public class PirexSearchDocTab extends JPanel {
	

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	//private JTabbedPane tabbedPane; //hmmmmmm
	private String name = "Search For Document";
	public PirexSearchDocTab() {
		//JPanel panel = new JPanel();
		//tabbedPane.addTab("Search for Document", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {40, 50, 30, 30, 30, 30, 30, 30};
		gbl_panel.rowHeights = new int[] {30, 34, 30, 170, 30, 170, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gbl_panel);
		
		JLabel lblQuery = new JLabel("Query:");
		GridBagConstraints gbc_lblQuery = new GridBagConstraints();
		gbc_lblQuery.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblQuery.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuery.gridx = 1;
		gbc_lblQuery.gridy = 1;
		this.add(lblQuery, gbc_lblQuery);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.weightx = 50.0;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		this.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setLocation(new Point(1, 1));
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.anchor = GridBagConstraints.NORTH;
		gbc_btnClear.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridwidth = 2;
		gbc_btnClear.gridx = 5;
		gbc_btnClear.gridy = 1;
		this.add(btnClear, gbc_btnClear);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scroll1 = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.weightx = 50.0;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridwidth = 6;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 3;
		this.add(scroll1, gbc_textArea);
		
		JTextArea textArea_1 = new JTextArea();
		JScrollPane scroll2 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.weightx = 50.0;
		gbc_textArea_1.insets = new Insets(0, 0, 0, 5);
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridwidth = 5;
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 5;
		this.add(scroll2, gbc_textArea_1);
		
	}
	public String getName() {
		return name;
	}
	
}
