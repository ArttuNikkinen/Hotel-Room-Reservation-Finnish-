package Harjoitus;

public class Budjettihuone extends Hotellihuone
{
	String huoneNimi_budjetti = "budjettihuone";
	static double hinta = 50;
	static int huonenumero = 100;

	/**
	 * Budjettihuone-luokan muodostin. 
	 * Muodostimessa kutstutaan Hotellihuone-luokan muodostinta,
	 * jonne annetaan parametreina Budjettihuone-luokan hinta ja huonenumero muuttujat.
	 * @param hinta Budjettihuoneen hinta
	 * @param huonenumero Budjettihuoneen huonenumero
	 * 
	 * Lopussa vielä kasvatetaan huonenumeron arvoa yhdellä, 
	 * jotta saadaan seuraavalle huoneelle eri numero
	 * 
	 */
	public Budjettihuone()
	{
		super(hinta, huonenumero);
		super.setVaraus(false);
		huonenumero++;
	}
	/**
	 * Saadaan Budjettihuoneen hintaa kutsuttua
	 * @return hinta kokonaisluku tyyppinen muuttuja joka kuvastaa hintaa
	 */
	public double getHinta()
	{
		return hinta;
	}
	/**
	 * Tarkastetaan huoneen varaustilanne ja tulostetaan huoneen tiedot
	 * @param varattu boolean tyyppinen muuttuja
	 * @return tulostetaan Budjettihuoneen tiedot
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
		return  "Tämän huoneen nimi: " + huoneNimi_budjetti + "\nHuoneen varaustilanne: " + varaustilanne + "\nHuoneen numero: " + this.getHuoneNro() + "\nHuoneen hinta: " + hinta;
	}
}