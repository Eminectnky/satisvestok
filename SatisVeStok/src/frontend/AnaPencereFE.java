package frontend;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import interfaces.FeInterfaces;
import utilities.MenulerCom;

public class AnaPencereFE  extends JFrame implements FeInterfaces{

	public AnaPencereFE() {
		initPencere ();
	}

	@Override
	public void initPencere() {
		//JTabbedPane tabs = initTabs();
		JMenuBar bar = initBar();
		
		
		//add(tabs);
		setJMenuBar(bar);
		setTitle("Satış ve Stok Programı");
		setSize(600,250);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
	}
	

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel ();
		
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		JMenuBar bar = MenulerCom.initBar();
		
		
		return bar;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
