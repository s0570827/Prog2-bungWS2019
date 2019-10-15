
public class Hotel {
	//Klassenvariablen
	private String name;
	private String anzahlZimmer;
	private Adress adresseHotel;
	private Guest[] gaesteHotel= new Guest[1000];
	
	
	public boolean addGuest(Guest guest) {
		int numberofGuests = findNumberofGuests();
		return true;
		
	}
	private int findNumberofGuests() {
		return 0;
	}
	//Kontruktor
	public Hotel() {
		
	}
	public Hotel(String name, String anzahlZimmer, Adress adresseHotel, Guest[] gastHotel) {
		this.name = name;
		this.anzahlZimmer = anzahlZimmer;
		this.adresseHotel = adresseHotel;
		this.gaesteHotel = gastHotel;
	}
	//GetterSetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnzahlZimmer() {
		return anzahlZimmer;
	}
	public void setAnzahlZimmer(String anzahlZimmer) {
		this.anzahlZimmer = anzahlZimmer;
	}
	public Adress getAdresseHotel() {
		return adresseHotel;
	}
	public void setAdresseHotel(Adress adresseHotel) {
		this.adresseHotel = adresseHotel;
	}
	public Guest[] getGastHotel() {
		return gaesteHotel;
	}
	public void setGastHotel(Guest[] gastHotel) {
		this.gaesteHotel = gastHotel;
	}
	
}
