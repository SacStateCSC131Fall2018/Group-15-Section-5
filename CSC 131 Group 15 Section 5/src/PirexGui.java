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
		
		PirexMenuBar menuBar = new PirexMenuBar();
		//menuBar.initialize();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		
		// Old code for menu bar.
		/*
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
		*/
		
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
		
		//Old code for Document Search Tab
		/*JPanel panel = new JPanel();
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
		panel.add(scrollBar, gbc_scrollBar);*/
		
		JPanel panel= new PirexSearchDocTab();
		tabbedPane.add(panel);
		
		JPanel panel_1 = new PirexLoadDocTab();
		tabbedPane.add(panel_1);		
		
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
