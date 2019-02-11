package Harjoitus;
import java.util.*;

import java.awt.*;

import javax.swing.JOptionPane;
/**
 * Hotelli-luokka, jossa on l�hes kaikki ohjelmassa k�ytetyt metodit
 * 
 * @param poistolaskuri Pidet��n kirjaa montako huonetta poistetaan ja k�ytet��n t�t� apumuuttujana
 * @param varattulaskuri Lasketaan apumuuttujalla montako huonetta on varattuna
 * @param poistavarauslaskuri Lasketaan apumuuttujalla montako huonetta on poistettu
 * @param varauslaskuri Lasketaan apumuuttujalla montako huonetta on saatu varattua
 *
 */
public class Hotelli
{
	ArrayList<Hotellihuone> huoneet;
	int tulostuslaskuri = 0;
	int poistolaskuri = 0;
	int varattulaskuri = 0;
	int poistavarauslaskuri = 0;
	int varauslaskuri = 0;
	
	/**
	 * Hotelli-luokan muodostin,
	 * jossa luodaan uusi ArrayList taulukko,
	 * johon tallennetaan Hotellihuone-olioita
	 */
	public Hotelli()
	{
		huoneet = new ArrayList<Hotellihuone>();
	}
	
	/**
	 * LisaaBudjettioHuone-metodi,
	 * joka lis�� ArrayList taulukkoon uuden Budjettihuone-olion
	 */
	public void LisaaBudjettiHuone()
	{
		Hotellihuone b = new Budjettihuone();
		huoneet.add(b);
		JOptionPane.showMessageDialog(null, "Budjettihuone lis�tty!" + "\n" + b.toString());
	}
	
	/**
	 * LisaaPerusHuone-metodi,
	 * joka lis�� ArrayList taulukkoon uuden Perushuone-olion
	 */
	
	public void LisaaPerusHuone()
	{	
		Hotellihuone p = new Perushuone();
		huoneet.add(p);
		JOptionPane.showMessageDialog(null, "Perushuone lis�tty!" + "\n" + p.toString());
		//System.out.println("Lis��m�si huone: " + "\n" + p.toString());
	}
	
	/**
	 * LisaaSviitti-metodi,
	 * joka lis�� ArrayList taulukkoon uuden Sviitti-olion
	 */
	
	public void LisaaSviitti()
	{
		Hotellihuone s = new Sviitti();
		huoneet.add(s);
		JOptionPane.showMessageDialog(null, "Sviitti lis�tty!"+ "\n" + s.toString());
		//System.out.println("Lis��m�si huone: " + "\n" + s.toString());
	}
	
	/**
	 * PoistaHuone-metodi,
	 * joka poistaa ArrayList taulukosta Hotellihuone-olion
	 * annetun huonenumeron perusteella
	 * @param poistettava Poistettavan Hotellihuone-olion huonenumero
	 */
	
	public void PoistaHuone(int poistettava)
	{
		
		for (Hotellihuone h : huoneet)
		{
			if(poistettava == h.getHuoneNro())
			{
				JOptionPane.showMessageDialog(null, "Huoneen poistaminen onnistui!\nPoistetun huoneen tiedot: " + "\n" + h.toString());
				huoneet.remove(h);
				poistolaskuri++;
			}
		}
			if(poistolaskuri == 0)
			{
				JOptionPane.showMessageDialog(null, "Annetulla huonenumerolla ei l�ytynyt huoneita");
				
			}
		poistolaskuri = 0;
	}
	
	/**
	 * LisaaVaraus-metodi,
	 * joka asettaa ArrayList taulukossa olevan Hotellihuone-olion
	 * varattu muuttujaan arvon true.
	 * Varattava olio etsit��n huonenumeron avulla
	 * 
	 * @param varattava Varattavan Hotellihuone-olion huonenumero
	 */
	
	public void LisaaVaraus(int varattava)
	{
		for (Hotellihuone h : huoneet)
		{
			if (varattava == h.getHuoneNro())
			{
				h.setVaraus(true);
				varauslaskuri++;
				JOptionPane.showMessageDialog(null, "Huone varattiin onnistuneesti!\nHuoneen tiedot:" + "\n" + h.toString());
			}
		}
			if(varauslaskuri == 0)
			{
				JOptionPane.showMessageDialog(null, "Hakemaasi huonetta ei l�ytynyt");
			}
		varauslaskuri = 0;
	}
	
	/**
	 * PoistaVaraus-metodi,
	 * joka poistaa ArrayList taulukosta Hotellihuone-olion varaus,
	 * jonka huonenumero on annettu
	 * 
	 * @param varauksenpoisto Hotellihuone-olion huonenumero
	 */
	
	public void PoistaVaraus(int varauksenpoisto)
	{
		for (Hotellihuone h : huoneet)
		{
			if (varauksenpoisto == h.getHuoneNro())
			{
				h.setVaraus(false);
				poistavarauslaskuri++;
				JOptionPane.showMessageDialog(null, "Huoneen vapauttaminen onnistui!\nVapautetun huoneen tiedot:" + "\n" + h.toString());
			}

		}
			if(poistavarauslaskuri == 0)
			{
				JOptionPane.showMessageDialog(null, "Hakemaasi huonetta ei l�ytynyt");
			}
		poistavarauslaskuri = 0;
	}
	
	/**
	 * TulostaHuoneet-metodi,
	 * joka tulostaa kaikki huoneet ArrayList taulukosta
	 */
	
	public void TulostaHuoneet()
	{
		String tieto ="\n";
		for (Hotellihuone h : huoneet)
		{
			tieto = tieto + "\n" + h.toString() + "\n";
		}
		if(tieto == "\n")
		{
			JOptionPane.showMessageDialog(null, "Huoneita ei ole!");
		}
		JOptionPane.showMessageDialog(null,tieto);
	}
	
	/**
	 * TulostaVaratut-metodi,
	 * joka tulostaa kaikki Hotellihuone-oliot,
	 * joiden varattu muuttuja on true
	 */
	
	public void TulostaVaratut()
	{
		String tieto = "\n";
		for (Hotellihuone h : huoneet)
		{
			if (h.getVaraus() == true)
			{
				tieto = tieto + "\n" + h.toString() + "\n";
			}

		}
			if (tieto == "\n")
			{
				JOptionPane.showMessageDialog(null, "Varattuja huoneita ei l�ytynyt");
			}
			JOptionPane.showMessageDialog(null, tieto);
	}
	
	/**
	 * TulostaVapaat-metodi,
	 * joka tulostaa kaikki Hotellihuone-oliot ArrayList taulukosta,
	 * joiden varattu muuttuja on false
	 */
	
	public void TulostaVapaat()
	{
		String tieto = "\n";
		for (Hotellihuone h : huoneet)
		{
			if(h.getVaraus() == false)
			{
				tieto = tieto + "\n" + h.toString() + "\n";
			}
			if (tieto == "\n")
			{
				JOptionPane.showMessageDialog(null, "Vapaita huoneita ei l�ytynyt");
			}
		} 
		JOptionPane.showMessageDialog(null, tieto);
	}
}