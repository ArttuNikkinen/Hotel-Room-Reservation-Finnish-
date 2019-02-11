package Harjoitus;

/**
 * Tämä on Perushuone-luokka, joka on Hotellihuone-luokan aliluokka
 * 
 *@param huoneNimi_perus Kertoo huoneen nimen
 *@param hinta Kertoo huoneen hinnan
 *@param huonenumero Kertoo huoneen hinnan
 */
public class Perushuone extends Hotellihuone
{
	String huoneNimi_perus = "perushuone";
	static double hinta = 100;
	static int huonenumero = 200;
	
	/**
	 * Tämä on Perushuone-luokan muodostin,
	 * jossa kutsutaan Hotellihuone-luokan muodostinta
	 * ja annetaan sille paremetreina hinta ja huonenumero.
	 * Tämän jälkeen nostetaan huonenumeroa yhdellä,
	 * jotta uudet perushuoneet saavat eri huonenumeron
	 */
	
	public Perushuone()
	{
		super(hinta, huonenumero);
		super.setVaraus(false);
		huonenumero++;
	}
	
	/**
	 * getHinta-aksessorimetodi,
	 * jossa tulostetaan hinta muuttujan arvo
	 * @return hinta Tulostetaan hinta muuttujan arvo
	 */
	
	public double getHinta()
	{
		return hinta;
	}
	
	/**
	 * toString-metodi,
	 * jossa tulostetaan huoneen tiedot
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
		return  "Tämän huoneen nimi: " + huoneNimi_perus + "\nHuoneen varaustilanne: " + varaustilanne + "\nHuoneen numero: " + this.getHuoneNro() + "\nHuoneen hinta: " + hinta;
	}
	
}