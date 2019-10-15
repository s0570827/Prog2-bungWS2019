import java.util.Date;

public class Reservations {
	//Klassenvariablen
	private Date datumAnreise;
	private Date datumAbreise;
	private int anzahlPersonen;
	private String zimmerArt;
	
	//Konstruktor
	public Reservations(Date datumAnreise, Date datumAbreise, int anzahlPersonen, String zimmerArt) {
		this.datumAnreise = datumAnreise;
		this.datumAbreise = datumAbreise;
		this.anzahlPersonen = anzahlPersonen;
		this.zimmerArt = zimmerArt;
	}
	//GetterSetter
	public Date getDatumAnreise() {
		return datumAnreise;
	}
	public void setDatumAnreise(Date datumAnreise) {
		this.datumAnreise = datumAnreise;
	}
	public Date getDatumAbreise() {
		return datumAbreise;
	}
	public void setDatumAbreise(Date datumAbreise) {
		this.datumAbreise = datumAbreise;
	}
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}
	public String getZimmerArt() {
		return zimmerArt;
	}
	public void setZimmerArt(String zimmerArt) {
		this.zimmerArt = zimmerArt;
	}
}
