import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import java.awt.BorderLayout;

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
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 958, 509);
		layeredPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Search for Documents", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblQuery = new JLabel("Query:");
		lblQuery.setBounds(12, 13, 56, 16);
		panel.add(lblQuery);
		
		textField = new JTextField();
		textField.setBounds(58, 10, 714, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(791, 9, 97, 25);
		panel.add(btnClear);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 68, 876, 170);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 260, 853, 170);
		panel.add(textArea_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(866, 260, 21, 173);
		panel.add(scrollBar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Load Documents", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblTextFile = new JLabel("Text File:");
		lblTextFile.setBounds(12, 13, 56, 16);
		panel_1.add(lblTextFile);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 10, 718, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(820, 9, 97, 25);
		panel_1.add(btnBrowse);
		
		JLabel lblTextFileType = new JLabel("Text File Type:");
		lblTextFileType.setBounds(12, 75, 97, 16);
		panel_1.add(lblTextFileType);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 72, 796, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 143, 56, 16);
		panel_1.add(lblTitle);
		
		textField_3 = new JTextField();
		textField_3.setBounds(67, 140, 409, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(517, 143, 56, 16);
		panel_1.add(lblAuthor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(585, 140, 332, 22);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 194, 905, 2);
		panel_1.add(separator);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(12, 209, 97, 25);
		panel_1.add(btnProcess);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(12, 245, 905, 175);
		panel_1.add(textArea_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Summarize Documents", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(12, 13, 893, 420);
		panel_2.add(textArea_3);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(908, 13, 21, 420);
		panel_2.add(scrollBar_1);
	}
}
