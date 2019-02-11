package Harjoitus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HotelliUi extends JFrame
{
	private JLabel otsikko;
	private JRadioButton uusiHuone;
	private JRadioButton poistaHuone;
	private JRadioButton varaaHuone;
	private JRadioButton poistaVaraus;
	private JRadioButton tulostaVapaat;
	private JRadioButton tulostaVaratut;
	private JRadioButton tulostaHuoneet;
	private JButton Valitse;
	/**
	 * HotelliUi-luokan muodostin, m‰‰ritet‰‰n k‰yttˆliittym‰n ulkoasu
	 * @param uusiHuone Valintanappi, josta voidaan valita uuden huoneen luominen
	 * @param poistaHuone Valintanappi, josta voidaan valita huoneen poistaminen
	 * @param varaaHuone Valintanappi, josta voidaan valita huoneen varaaminen
	 * @param poistaVaraus Valintanappi, josta voidaan poistaa huoneen varaus
	 * @param tulostaVapaat Valintanappi, josta voidaan tulostaa kaikki vapaat huoneet
	 * @param tulostaVaratut Valintanappi, josta voidaan tulostaa kaikki varatut huoneet
	 * @param tulostaHuoneet Valintanappi, josta voidaan tulostaa kaikki huoneet
	 * @param otsikko Viesti, jossa kerrotaan mit‰ k‰yttˆliittym‰n ikkunassa voidaan tehd‰
	 * @param Valitse Nappi, josta valitaan jokin valintanapeista
	 * 
	 * Kun muodostinta k‰ytet‰‰n, niin syntyy ensimm‰inen ikkuna ohjelmassa.
	 * T‰m‰ ikkuna toimii p‰‰valikkona, josta kaikki toiminnot voidaan suorittaa.
	 */
	public HotelliUi()
	{
		uusiHuone = new JRadioButton("Lis‰‰ uusi huone");
		poistaHuone = new JRadioButton("Poista huone");
		varaaHuone = new JRadioButton("Tee varaus huoneelle");
		poistaVaraus = new JRadioButton("Poista huoneen varaus");
		tulostaVapaat = new JRadioButton("N‰yt‰ kaikki vapaat huoneet");
		tulostaVaratut = new JRadioButton("N‰yt‰ kaikki varatut huoneet");
		tulostaHuoneet = new JRadioButton("N‰yt‰ kaikki huoneet");
		otsikko = new JLabel("Valitse toiminto");
		Valitse = new JButton("Valitse");
		this.add(otsikko);
		
		ButtonGroup valinnat = new ButtonGroup();
		valinnat.add(uusiHuone);
		valinnat.add(poistaHuone);
		valinnat.add(varaaHuone);
		valinnat.add(poistaVaraus);
		valinnat.add(tulostaVapaat);
		valinnat.add(tulostaVaratut);
		valinnat.add(tulostaHuoneet);
		
		ValintaKuuntelija valinta = new ValintaKuuntelija();
		uusiHuone.addActionListener(valinta);
		poistaHuone.addActionListener(valinta);
		varaaHuone.addActionListener(valinta);
		poistaVaraus.addActionListener(valinta);
		tulostaVapaat.addActionListener(valinta);
		tulostaVaratut.addActionListener(valinta);
		tulostaHuoneet.addActionListener(valinta);
		Valitse.addActionListener(valinta);
		
		this.setLayout(new GridLayout(0,1));
		this.add(uusiHuone);
		this.add(poistaHuone);
		this.add(varaaHuone);
		this.add(poistaVaraus);
		this.add(tulostaVapaat);
		this.add(tulostaVaratut);
		this.add(tulostaHuoneet);
		this.add(Valitse);
		
		setTitle("Huoneiden hallintaj‰rjestelm‰");
		setSize(400, 400);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	/**
	 * Kun suoritetaan ValintaKuuntelija metodi, luodaan uusi Hotelli-olio.
	 * ValintaKuuntelija metodin avulla voidaan k‰yttˆliittym‰‰ k‰yt‰‰ kuten sit‰ kuuluukin.
	 *
	 */
	public class ValintaKuuntelija implements ActionListener
	{
		Hotelli hotelli = new Hotelli();
		public void actionPerformed(ActionEvent e)
		{
			
			if(uusiHuone.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					new UusiHuone(hotelli);
				}
			}
			
			if(poistaHuone.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					new PoistaHuone(hotelli);
				}
			}
			
			if(varaaHuone.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					new VaraaHuone(hotelli);
				}
			}
			
			if(poistaVaraus.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					new PoistaVaraus(hotelli);
				}
			}
			
			if(tulostaVapaat.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.TulostaVapaat();
				}
			}
			
			if(tulostaVaratut.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.TulostaVaratut();
				}
			}
			
			if(tulostaHuoneet.isSelected())
			{
				if(e.getActionCommand().equals("Valitse"))
				{
					hotelli.TulostaHuoneet();
				}
			}
		}
		
	}
}
