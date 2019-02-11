package Harjoitus;

import javax.swing.JOptionPane;

/**
 * T‰m‰ on Hotellihuone-luokka, joka on Sviitti-luokan, Perushuone-luokan
 * ja Budjettihuoneluokan yliluokka.
 * 
 * @param varattu Boolean tyyppinen muuttuja joka kertoon onko huone varattu
 * @param hinta Kertoo huoneen hinnan
 * @param huonenumero Kertoo huoneen huonenumeron
 * @param varaustilanne K‰ytet‰‰n toString-metodissa apumuuttujana
 *
 */
public class Hotellihuone
{
	boolean varattu;
	double hinta;
	int huonenumero = 0;
	String varaustilanne;
	
	/**
	 * Hotellihuone-luokan perusmuodostin
	 */
	public Hotellihuone()
	{
	
	}
	
	/**
	 * Hotellihuone-luokan muodostin,
	 * jota kutsutaan aina kun luodaan uusi Hotellihuone-luokan alikuokan olio
	 * @param hinta Hotellihuoneen hinta
	 * @param huonenumero Hotellihuoneen huonenumero
	 */
	
	public Hotellihuone(double hinta, int huonenumero)
	{
		this.hinta = hinta;
		this.huonenumero = huonenumero;
	}
	
	/**
	 * setVaraus-aksessorimetodi,
	 * jolla voidaan asettaa varattu muuttujalle haluttu arvo
	 * @param varattu Kertoo onko huone varattu vai vapaa
	 */
	public void setVaraus(boolean varattu)
	{
		this.varattu = varattu;
	}
	
	/**
	 * setHinta-aksessorimetodi,
	 * jolla voidaan asettaa hinta muuttujalle haluttu arvo
	 * @param hinta Kertoo huoneen hinnan
	 */
	
	public void setHinta(double hinta)
	{
		this.hinta = hinta;
	}
	
	/**
	 * setHuoneNro-aksessorimetodi,
	 * jolla voidaan asettaa huonenumero muuttujalle haluttu arvo
	 * @param huonenumero Kertoo huoneen huonenumeron
	 */
	
	public void setHuoneNro(int huonenumero)
	{
		this.huonenumero = huonenumero;
	}
	
	/**
	 * getVaraus-metodi,
	 * joka tulostaa varattu muuttujan arvon
	 * @return Tulostetaan varattu muuttujan arvo
	 */
	
	public boolean getVaraus()
	{
		return varattu;
	}
	
	/**
	 * getHinta-metodi,
	 * joka tulostaa hinta muuttujan arvon
	 * @return Tulostetaan hinta muuttujan arvo
	 */
	
	public double getHinta()
	{
		return hinta;
	}
	
	/**
	 * getHuoneNro-metodi,
	 * joka tulostaa huonenumero muuttujan arvon
	 * @return Tulostetaan huonenumero muuttujan arvo
	 */
	
	public int getHuoneNro()
	{
		return huonenumero;
	}
	
	/**
	 * toString-metodi,
	 * joka tulostaa huoneen kaikki tiedot
	 */
	
	public String toString()
	{
		if (varattu == true)
		{
			varaustilanne = "varattu";
		}
		else
		{
			varaustilanne = "vapaana";
		}
		return "Huoneen varaustilanne: " + varaustilanne + "\nHuoneen numero: " + this.getHuoneNro() + "\nHuoneen hinta: " + hinta;
		
	}
}