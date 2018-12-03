import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		JMenu menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem item = new JMenuItem("Save Query");
		item.setMnemonic(KeyEvent.VK_S);
		menu.add(item);
		item = new JMenuItem("Load Query");
		item.setMnemonic(KeyEvent.VK_L);
		menu.add(item);
		item = new JMenuItem("Export");
		item.setMnemonic(KeyEvent.VK_E);
		menu.add(item);
		item = new JMenuItem("Exit");
		item.setMnemonic(KeyEvent.VK_X);
		menu.add(item);
		this.add(menu);
		
		menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_O);
		item = new JMenuItem("Documents");
		item.setMnemonic(KeyEvent.VK_D);
		menu.add(item);
		item = new JMenuItem("Sources");
		item.setMnemonic(KeyEvent.VK_R);
		menu.add(item);
		this.add(menu);
		
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);
		item = new JMenuItem("About");
		item.setMnemonic(KeyEvent.VK_A);
		menu.add(item);
		item = new JMenuItem("Index");
		item.setMnemonic(KeyEvent.VK_I);
		menu.add(item);
		this.add(menu);
	}
	
}
