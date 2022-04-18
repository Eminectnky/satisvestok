package frontend;

import java.awt.LayoutManager;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import interfaces.FeInterfaces;

public class UrunEkleFE  extends JDialog implements FeInterfaces {

	public UrunEkleFE() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		
		add(panel);
		setTitle("Ürün Ekleyin");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
	}

	@Override
	public JPanel initPanel() {
		
		
		return null;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
