package Harjoitus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Harjoitus.HotelliUi.ValintaKuuntelija;

/**
 * Tämä on PoistaHuone-luokka, jossa on käyttöliittymän huoneen poistamiseen liittyvät tiedot.
 *
 */

public class PoistaHuone extends JFrame
{
	Hotelli hotelli;
	
	private JTextField huoneNro;
	private JButton valitse;
	private JLabel otsikko;
	
	/**
	 * PoistaHuone-luokan muodostin, jolle välitetään HotelliUi-luokasta Hotelli-olio
	 * @param h Hotelli-olio
	 */
	
	public PoistaHuone(Hotelli h)
	{
		hotelli = h;
		
		huoneNro = new JTextField();
		valitse = new JButton("Valmis");
		otsikko = new JLabel("Anna poistettavan huoneen huonenumero");
		
		huoneNro.setPreferredSize(new Dimension(50, 10));
		
		ValintaKuuntelija valinta = new ValintaKuuntelija();
		valitse.addActionListener(valinta);
		
		this.setLayout(new GridLayout(2,0));
		this.add(otsikko);
		this.add(huoneNro);
		
		this.setLayout(new GridLayout(0,1));
		this.add(valitse);
		
		setTitle("Poista huone");
		setSize(600, 300);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	/**
	 * ValintaKuuntelija-metodi, joka tarkkailee "huoneen poisto" -ikkunaa
	 *
	 */
	
	public class ValintaKuuntelija implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input = huoneNro.getText();
			int poistettava = Integer.parseInt(input);
			if(e.getActionCommand().equals("Valmis"))
			{
				hotelli.PoistaHuone(poistettava);
			}
		}
		
	}
}
	
