
public class Adress {
	//Klassenvariablen
	private String strasse;
	private int hausnummer;
	private int postleitzahl;
	private String stadt;
	private String land;
	
	//Konstruktor
	public Adress(String strasse, int hausnummer, int postleitzahl, String stadt, String land) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.postleitzahl = postleitzahl;
		this.stadt = stadt;
		this.land = land;
	}
	//GetterSetter
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}

}
