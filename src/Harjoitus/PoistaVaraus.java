package Harjoitus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Harjoitus.HotelliUi.ValintaKuuntelija;

/**
 * PoistaVaraus-luokka, jossa voidaan poistaa huoneen varaus.
 * Tässä luokassa on kaikki varauksen poistamiseen liittyvät käyttöliittymän osat
 *
 */
public class PoistaVaraus extends JFrame
{
	Hotelli hotelli;
	
	private JTextField huoneNro;
	private JLabel otsikko;
	private JButton valitse;
	
	/**
	 * PoistaVaraus-luokan muodostin,
	 * jolle annetaan parametrina HotelliUi-luokasta Hotelli-olio
	 * @param h Hotelli-olio
	 */
	
	public PoistaVaraus(Hotelli h)
	{
		hotelli = h;
		
		huoneNro = new JTextField();
		otsikko = new JLabel("Anna huonenumero vapautettavalle huoneelle");
		valitse = new JButton("Valmis");
		
		huoneNro.setPreferredSize(new Dimension(50, 10));
		
		ValintaKuuntelija valinta = new ValintaKuuntelija();
		valitse.addActionListener(valinta);
		
		this.setLayout(new GridLayout(2,0));
		this.add(otsikko);
		this.add(huoneNro);
		
		this.setLayout(new GridLayout(0,1));
		this.add(valitse);
		
		setTitle("Poista varaus");
		setSize(600, 400);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
	}
	
	/**	 
	 * ValintaKuuntelija-metodi, joka tarkkailee "varauksen poisto" -ikkunaa
	 */
	public class ValintaKuuntelija implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Valmis"))
			{
				int varauksenpoisto = Integer.parseInt(huoneNro.getText());
				hotelli.PoistaVaraus(varauksenpoisto);
			}
		}
		
	}
}
