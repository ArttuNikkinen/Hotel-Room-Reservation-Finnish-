package Harjoitus;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Harjoitus.HotelliUi.ValintaKuuntelija;

/**
 * VaraaHuone-luokka, jossa on kaikki huoneen varaamiseen tarvittavat käyttöliittymän osat
 *
 */
public class VaraaHuone extends JFrame
{
	Hotelli hotelli;
	
	private JTextField huoneNro;
	private JLabel otsikko;
	private JButton valitse;
	
	/**
	 * VaraaHuone-muodostin,
	 * jolle välitetään HotelliUi-luokasta Hotelli-olio
	 * @param h Hotelli-luokan olio
	 */
	
	public VaraaHuone(Hotelli h)
	{
		hotelli = h;
		
		huoneNro = new JTextField();
		otsikko = new JLabel("Anna varattavan huoneen huonenumero");
		valitse = new JButton("Valmis");
		
		huoneNro.setPreferredSize(new Dimension(50, 10));
		
		ValintaKuuntelija valinta = new ValintaKuuntelija();
		valitse.addActionListener(valinta);
		
		this.setLayout(new GridLayout(2,0));
		this.add(otsikko);
		this.add(huoneNro);
		
		this.setLayout(new GridLayout(0,1));
		this.add(valitse);
		
		setTitle("Varaa huone");
		setSize(600, 300);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * ValintaKuuntelija, joka tarkkailee huoneen varaamiseen tarvittavan ikkunan tapahtumia
	 *
	 */
	
	public class ValintaKuuntelija implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int varattava = Integer.parseInt(huoneNro.getText());
			if(e.getActionCommand().equals("Valmis"))
			{
				hotelli.LisaaVaraus(varattava);
			}
		}
		
	}
}
