package utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import frontend.UrunEkleFE;

public class MenulerCom {
	public static JMenuBar initBar() {
		JMenuBar bar = new JMenuBar ();
		
		JMenu dosyaMenu = new JMenu("Dosya");
		bar.add(dosyaMenu);
		JMenuItem cikisItem = new JMenuItem("Çıkış");
		dosyaMenu.add(cikisItem);
		
		JMenu urunlerMenu = new JMenu("Ürünler");
		bar.add(urunlerMenu);
		JMenuItem urunEkleItem = new JMenuItem("Ürün Ekle");
		urunlerMenu.add(urunEkleItem);
		
		JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
		urunlerMenu.add(kategoriEkleItem);
		urunlerMenu.addSeparator();
		JMenuItem urunDuzenleItem = new JMenuItem("Ürünü Düzenle");
		urunlerMenu.add(urunDuzenleItem);
		JMenuItem kategoriDüzenleItem = new JMenuItem("Kategoriyi Düzenle");
		urunlerMenu.add(kategoriDüzenleItem);
		
		
		urunEkleItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						
						new UrunEkleFE ();
						
					}
					
					
				});
				
			}
			
			
			
			
		});
		
		
		return bar;
	}

}
