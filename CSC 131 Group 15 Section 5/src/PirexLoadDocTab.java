import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PirexLoadDocTab extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 122954529025849254L;

	private JTextField textField_1, textField_2, textField_3, textField_4;
	
	private String name = "Load Documents";	
	
	public PirexLoadDocTab() {
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {20, 19, 355, 41, 56, 173, 23, 56, 0};
		gbl_panel_1.rowHeights = new int[] {0, 30, 30, 32, 30, 30, 40, 40, 40, 120, 50};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		this.setLayout(gbl_panel_1);
		
		JLabel lblTextFile = new JLabel("Text File:");
		GridBagConstraints gbc_lblTextFile = new GridBagConstraints();
		gbc_lblTextFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTextFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextFile.gridx = 1;
		gbc_lblTextFile.gridy = 0;
		this.add(lblTextFile, gbc_lblTextFile);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.weightx = 50.0;
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 0;
		this.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
		gbc_btnBrowse.anchor = GridBagConstraints.EAST;
		gbc_btnBrowse.insets = new Insets(0, 0, 5, 5);
		gbc_btnBrowse.gridx = 7;
		gbc_btnBrowse.gridy = 0;
		this.add(btnBrowse, gbc_btnBrowse);
		
		JLabel lblTextFileType = new JLabel("Text File Type:");
		GridBagConstraints gbc_lblTextFileType = new GridBagConstraints();
		gbc_lblTextFileType.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTextFileType.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextFileType.gridx = 1;
		gbc_lblTextFileType.gridy = 2;
		this.add(lblTextFileType, gbc_lblTextFileType);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.weightx = 50.0;
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 6;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 2;
		this.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 4;
		this.add(lblTitle, gbc_lblTitle);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.weightx = 50.0;
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		this.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author:");
		GridBagConstraints gbc_lblAuthor = new GridBagConstraints();
		gbc_lblAuthor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAuthor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor.gridx = 4;
		gbc_lblAuthor.gridy = 4;
		this.add(lblAuthor, gbc_lblAuthor);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.weightx = 50.0;
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 4;
		this.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.anchor = GridBagConstraints.NORTH;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridwidth = 9;
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 7;
		this.add(separator, gbc_separator);
		
		JButton btnProcess = new JButton("Process");
		GridBagConstraints gbc_btnProcess = new GridBagConstraints();
		gbc_btnProcess.anchor = GridBagConstraints.NORTH;
		gbc_btnProcess.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnProcess.insets = new Insets(0, 0, 5, 5);
		gbc_btnProcess.gridx = 1;
		gbc_btnProcess.gridy = 8;
		this.add(btnProcess, gbc_btnProcess);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textArea_2 = new GridBagConstraints();
		gbc_textArea_2.weightx = 50.0;
		gbc_textArea_2.gridheight = 2;
		gbc_textArea_2.insets = new Insets(0, 0, 0, 5);
		gbc_textArea_2.fill = GridBagConstraints.BOTH;
		gbc_textArea_2.gridwidth = 7;
		gbc_textArea_2.gridx = 1;
		gbc_textArea_2.gridy = 9;
		this.add(textArea_2, gbc_textArea_2);
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
}
