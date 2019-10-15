
public class Starter {
	public static void main (String[] args) {
		Guest matt = new Guest ("Matt");
		Guest anna = new Guest ("Anna");
		
		Adress adress = new Adress("Hausstraße",22,15135,"Berlin","Deutschland");
		
		matt.setprivatAdresseGast(adress);
		anna.setprivatAdresseGast(adress);
		
		System.out.println(matt.getprivatAdresseGast().getHausnummer());
	}
}
