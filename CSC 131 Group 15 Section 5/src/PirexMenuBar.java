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
		
		JMenuItem item = new JMenuItem("Save Query");
		menu.add(item);
		item = new JMenuItem("Load Query");
		menu.add(item);
		item = new JMenuItem("Export");
		menu.add(item);
		item = new JMenuItem("Exit");	
		menu.add(item);
		this.add(menu);
		
		menu = new JMenu("Options");
		item = new JMenuItem("Documents");
		menu.add(item);
		item = new JMenuItem("Sources");
		menu.add(item);
		this.add(menu);
		
		menu = new JMenu("Help");
		item = new JMenuItem("About");
		menu.add(item);
		item = new JMenuItem("Index");
		menu.add(item);
		this.add(menu);
	}
	
}
