package Harjoitus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Harjoitus.HotelliUi.ValintaKuuntelija;

/**
 * UusiHuone-luokka, jossa on kaikki uuden huoneen luomiseen tarvittavat käyttöliittymän osat
 *
 */
public class UusiHuone extends JFrame
{
	Hotelli hotelli;
	
	private JRadioButton Sviitti;
	private JRadioButton Perus;
	private JRadioButton Budjetti;
	private JButton Valitse;
	private JLabel otsikko;
	
	/**
	 * UusiHuone-luokan muodostin, 
	 * jossa luodaan uusi ikkuna huoneen luomiseselle
	 * @param h Hotelli-olio, joka välitetään muodostimelle HotelliUi-luokasta
	 */
	public UusiHuone(Hotelli h)
	{
		hotelli = h;
		Sviitti = new JRadioButton("Luo uusi sviitti");
		Perus = new JRadioButton("Luo uusi perushuone");
		Budjetti = new JRadioButton("Luo uusi budjettihuone");
		Valitse = new JButton("Valitse");
		otsikko = new JLabel("Valitse uusi huone");
		
		ValintaKuuntelija valinta = new ValintaKuuntelija();
		Sviitti.addActionListener(valinta);
		Perus.addActionListener(valinta);
		Budjetti.addActionListener(valinta);
		Valitse.addActionListener(valinta);
		
		this.setLayout(new FlowLayout());
		this.add(otsikko);
		this.add(Sviitti);
		this.add(Perus);
		this.add(Budjetti);
		
		this.setLayout(new GridLayout(0,1));
		this.add(Valitse);
		
		setTitle("Lisää uusi huone");
		setSize(300,300);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	/**
	 * ValintaKuuntelija, joka tarkkailee uuden huoneen luomiseen vaadittavan ikkunan tapahtumia
	 *
	 */
	public class ValintaKuuntelija implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(Sviitti.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.LisaaSviitti();
				}
			}
			
			if(Perus.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.LisaaPerusHuone();
				}
			}
			
			if(Budjetti.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.LisaaBudjettiHuone();
				}
			}
		}
		
	}
}
