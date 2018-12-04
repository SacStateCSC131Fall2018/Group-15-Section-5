import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PirexMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PirexMenuBar() {
		super();
		initialize();
	}

	public void initialize() {
		//File - Toolbar button
		JMenu menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		
		//Save Query item - in File
		JMenuItem item = new JMenuItem("Save Query");
		item.setMnemonic(KeyEvent.VK_S);
		menu.add(item);
		
		//Load Query item - in File
		item = new JMenuItem("Load Query");
		item.setMnemonic(KeyEvent.VK_L);
		menu.add(item);
		
		//Export item - in File
		item = new JMenuItem("Export");
		item.setMnemonic(KeyEvent.VK_E);
		menu.add(item);
		
		//Exit item - in File
		item = new JMenuItem("Exit");
		item.setMnemonic(KeyEvent.VK_X);
	    item.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          System.exit(0);
	        }
	    });
		menu.add(item);
		this.add(menu);
		
		//Option - Toolbar button
		menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_O);
		
		//Documents item - in Options
		item = new JMenuItem("Documents");
		item.setMnemonic(KeyEvent.VK_D);
		menu.add(item);
		
		//Sources item - in Options
		item = new JMenuItem("Sources");
		item.setMnemonic(KeyEvent.VK_R);
		menu.add(item);
		this.add(menu);
		
		//Help - Toolbar button
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);
		
		//About item - in Help
		item = new JMenuItem("About");
		item.setMnemonic(KeyEvent.VK_A);
		menu.add(item);
		
		//Index item - in Help
		item = new JMenuItem("Index");
		item.setMnemonic(KeyEvent.VK_I);
		menu.add(item);
		this.add(menu);
	}
	
}
