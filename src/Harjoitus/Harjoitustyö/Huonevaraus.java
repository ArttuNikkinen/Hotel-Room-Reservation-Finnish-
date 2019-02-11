/*package Harjoitus;
import java.util.*;


T‰m‰ on ensimm‰isen versioni p‰‰ohjelmametodi, jossa ei ole k‰yttˆliittym‰‰

public class Huonevaraus
{
	static Hotelli hotelli = new Hotelli();
	
		public static void main(String[] args)
		{
			char valinta;
			int a = 0;
			Scanner sc = new Scanner(System.in);
			
			while (a == 0)
			{
				System.out.println("\n1. Lis‰‰ uusi huone \n2. Poista huone \n3. Tee varaus \n4. Poista varaus \n5. Tulosta vapaat huoneet \n6. Tulosta varatut huoneet \n7. Tulosta kaikki huoneet\n8. Lopeta");
				valinta = sc.next().charAt(0);
				
				switch(valinta)
				{
					case '1':	System.out.println("1. Lis‰‰ uusi sviitti \n2. Lis‰‰ uusi perushuone \n3. Lis‰‰ uusi budjettihuone");
								int huoneLisays = sc.nextInt();
								
								if(huoneLisays == 1)
								{
									LisaaSviitti();
								}
								
								else if (huoneLisays == 2)
								{
									LisaaPerus();
								}
								
								else if (huoneLisays == 3)
								{
									LisaaBudjetti();
								}
								else
								{
									System.out.println("Et valinnut oikein. Palataan alkuun");
								}
								break;
								
					case '2': 	System.out.println("Anna poistettavan huoneen huonenumero");
								int poistettava = sc.nextInt();
								PoistaHuone(poistettava);
								break;
								
					case '3': 	System.out.println("Anna varattavan huoneen huonenumero");
								int varattava = sc.nextInt();
								VaraaHuone(varattava);
								break;
								
					case '4': 	System.out.println("Anna vapautettavan huoneen huonenumero");
								int vapautettava = sc.nextInt();
								VapautaHuone(vapautettava);
								break;
								
					case '5': 	TulostaVapaat();
								break;
								
					case '6':	TulostaVaratut();
								break;
								
					case '7': 	TulostaHuoneet();
								break;
								
					case '8':	System.out.println("Lopetit");
								a++;
								break;
				}
			}
		}
	
	public static void LisaaSviitti()
	{
		hotelli.LisaaSviitti();
	}
	
	public static void LisaaPerus()
	{
		hotelli.LisaaPerusHuone();
	}
	
	public static void LisaaBudjetti()
	{
		hotelli.LisaaBudjettiHuone();
	}
	
	public static void PoistaHuone(int poistettava)
	{
		hotelli.PoistaHuone(poistettava);
	}
	
	public static void VaraaHuone(int varattava)
	{
		hotelli.LisaaVaraus(varattava);
	}
	
	public static void VapautaHuone(int vapautettava)
	{
		hotelli.PoistaVaraus(vapautettava);
	}
	
	public static void TulostaVapaat()
	{
		hotelli.TulostaVapaat();
	}
	
	public static void TulostaVaratut()
	{
		hotelli.TulostaVaratut();
	}
	
	public static void TulostaHuoneet()
	{
		hotelli.TulostaHuoneet();
	}
	
}*/