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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

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
		
		JPanel header = new JPanel();
		header.setLayout(new BorderLayout(0, 0));
		
		PirexMenuBar menuBar = new PirexMenuBar();
		header.add(menuBar, BorderLayout.NORTH);
		
		try { 
			 Image image = ImageIO.read(new File("res/PX2.png")); 
			 frame.setIconImage(new ImageIcon(image).getImage()); 
		 } catch (IOException e) {
			 e.printStackTrace(); 
		}
		 
		frame.getContentPane().add(header, BorderLayout.NORTH);
		
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
		
		JPanel panel= new PirexSearchDocTab();
		tabbedPane.add(panel);
		
		JPanel panel_1 = new PirexLoadDocTab();
		tabbedPane.add(panel_1);		
		
		JPanel panel_2 = new PirexSummarizeDocTab();
		tabbedPane.addTab("Summarize Documents", null, panel_2, null);

	}
}
