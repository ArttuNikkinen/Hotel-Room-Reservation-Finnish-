package Harjoitus;

/**
 * Sviitti-luokka, joka on Hotellihuone-luokan aliluokka.
 *
 *@param huoneNimi_sviitti Huoneen nimi
 *@param hinta Huoneen hinta
 *@param huonenumero Huoneen huonenumero
 */

public class Sviitti extends Hotellihuone
{
	String huoneNimi_sviitti = "Sviitti";
	static double hinta = 150;
	static int huonenumero = 300;
	
	/**
	 * Sviitti-luokan muodostin,
	 * jossa kutsutaan Hotellihuone-luokan muodostinta ja annetaan sille
	 * parametreina hinta ja huonenumero.
	 * Tämän jälkeen kasvatetaan huonenumero muuttujan arvoa yhdellä,
	 * joten seuraavat Sviitti-luokan oliot eivät saa samaa huonenumeroa
	 */
	
	public Sviitti()
	{
		super(hinta, huonenumero);
		super.setVaraus(false);
		huonenumero++;
	}
	
	/**
	 * getHinta-aksessorimetodi,
	 * joka tulostaa hinta muuttujan arvon
	 * @return hinta Tulostetaan hinta muuttujan arvo
	 */
	
	public double getHinta()
	{
		return hinta;
	}
	
	/**
	 * toString-metodi,
	 * joka tulostaa huoneen tiedot
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
		return  "Tämän huoneen nimi: " + huoneNimi_sviitti + "\nHuoneen varaustilanne: " + varaustilanne + "\nHuoneen numero: " + this.getHuoneNro() + "\nHuoneen hinta: " + hinta;
	}
	
	
}
