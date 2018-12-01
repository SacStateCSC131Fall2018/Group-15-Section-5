import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Point;
import java.awt.Insets;

public class PirexGui {
//Shane Harris Test
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PirexGui window = new PirexGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PirexGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 967, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 5));
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu menu = new JMenu("File");
		
		JMenuItem item = new JMenuItem("Save Query");
		menu.add(item);
		item = new JMenuItem("Load Query");
		menu.add(item);
		item = new JMenuItem("Export");
		menu.add(item);
		item = new JMenuItem("Exit");	
		menu.add(item);
		menuBar.add(menu);
		
		menu = new JMenu("Options");
		item = new JMenuItem("Documents");
		menu.add(item);
		item = new JMenuItem("Sources");
		menu.add(item);
		menuBar.add(menu);
		
		menu = new JMenu("Help");
		item = new JMenuItem("About");
		menu.add(item);
		item = new JMenuItem("Index");
		menu.add(item);
		menuBar.add(menu);
		
		JPanel left = new JPanel();
		frame.getContentPane().add(left, BorderLayout.WEST);
		
		JPanel bottom = new JPanel();
		frame.getContentPane().add(bottom, BorderLayout.SOUTH);
		
		JPanel right = new JPanel();
		frame.getContentPane().add(right, BorderLayout.EAST);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Search for Document", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {40, 50, 30, 30, 30, 30, 30, 30};
		gbl_panel.rowHeights = new int[] {30, 34, 30, 170, 30, 170, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblQuery = new JLabel("Query:");
		GridBagConstraints gbc_lblQuery = new GridBagConstraints();
		gbc_lblQuery.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblQuery.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuery.gridx = 1;
		gbc_lblQuery.gridy = 1;
		panel.add(lblQuery, gbc_lblQuery);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.weightx = 50.0;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
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
		panel.add(btnClear, gbc_btnClear);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.weightx = 50.0;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridwidth = 6;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 3;
		panel.add(textArea, gbc_textArea);
		
		JTextArea textArea_1 = new JTextArea();
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.weightx = 50.0;
		gbc_textArea_1.insets = new Insets(0, 0, 0, 5);
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridwidth = 5;
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 5;
		panel.add(textArea_1, gbc_textArea_1);
		
		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.insets = new Insets(0, 0, 0, 5);
		gbc_scrollBar.anchor = GridBagConstraints.WEST;
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridx = 6;
		gbc_scrollBar.gridy = 5;
		panel.add(scrollBar, gbc_scrollBar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Load Documents", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {20, 19, 355, 41, 56, 173, 23, 56, 0};
		gbl_panel_1.rowHeights = new int[] {0, 30, 30, 32, 30, 30, 40, 40, 40, 120, 50};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblTextFile = new JLabel("Text File:");
		GridBagConstraints gbc_lblTextFile = new GridBagConstraints();
		gbc_lblTextFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTextFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextFile.gridx = 1;
		gbc_lblTextFile.gridy = 0;
		panel_1.add(lblTextFile, gbc_lblTextFile);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.weightx = 50.0;
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 0;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
		gbc_btnBrowse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBrowse.anchor = GridBagConstraints.EAST;
		gbc_btnBrowse.insets = new Insets(0, 0, 5, 5);
		gbc_btnBrowse.gridx = 7;
		gbc_btnBrowse.gridy = 0;
		panel_1.add(btnBrowse, gbc_btnBrowse);
		
		JLabel lblTextFileType = new JLabel("Text File Type:");
		GridBagConstraints gbc_lblTextFileType = new GridBagConstraints();
		gbc_lblTextFileType.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTextFileType.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextFileType.gridx = 1;
		gbc_lblTextFileType.gridy = 2;
		panel_1.add(lblTextFileType, gbc_lblTextFileType);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.weightx = 50.0;
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 6;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 4;
		panel_1.add(lblTitle, gbc_lblTitle);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.weightx = 50.0;
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author:");
		GridBagConstraints gbc_lblAuthor = new GridBagConstraints();
		gbc_lblAuthor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAuthor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor.gridx = 4;
		gbc_lblAuthor.gridy = 4;
		panel_1.add(lblAuthor, gbc_lblAuthor);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.weightx = 50.0;
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.anchor = GridBagConstraints.NORTH;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridwidth = 9;
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 7;
		panel_1.add(separator, gbc_separator);
		
		JButton btnProcess = new JButton("Process");
		GridBagConstraints gbc_btnProcess = new GridBagConstraints();
		gbc_btnProcess.anchor = GridBagConstraints.NORTH;
		gbc_btnProcess.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnProcess.insets = new Insets(0, 0, 5, 5);
		gbc_btnProcess.gridx = 1;
		gbc_btnProcess.gridy = 8;
		panel_1.add(btnProcess, gbc_btnProcess);
		
		JTextArea textArea_2 = new JTextArea();
		GridBagConstraints gbc_textArea_2 = new GridBagConstraints();
		gbc_textArea_2.weightx = 50.0;
		gbc_textArea_2.gridheight = 2;
		gbc_textArea_2.insets = new Insets(0, 0, 0, 5);
		gbc_textArea_2.fill = GridBagConstraints.BOTH;
		gbc_textArea_2.gridwidth = 7;
		gbc_textArea_2.gridx = 1;
		gbc_textArea_2.gridy = 9;
		panel_1.add(textArea_2, gbc_textArea_2);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Summarize Documents", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea_3 = new JTextArea();
		panel_2.add(textArea_3, BorderLayout.CENTER);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		panel_2.add(scrollBar_1, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.SOUTH);
	}
}
