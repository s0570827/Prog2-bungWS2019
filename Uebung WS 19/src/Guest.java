
public class Guest {
	//Klassenvariablen
	private String vorname;
	private String nachname;
	private int alter;
	private int guestID;
	private Adress privatAdresseGast;
	private Adress businessAdresseGast;
	private Reservations reservationenGast;
	//Konstruktor
	public Guest(String vorname, String nachname, int alter, int guestID, Adress privatAdresseGast,
			Reservations reservationenGast, Adress businessAdresseGast) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.guestID = guestID;
		this.businessAdresseGast=businessAdresseGast;
		this.reservationenGast = reservationenGast;
		this.privatAdresseGast = privatAdresseGast;
	}

	public Guest(String vorname) {
		this.vorname = vorname;
	}
	//GetterSetter
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public int getGuestID() {
		return guestID;
	}
	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}
	public Adress getprivatAdresseGast() {
		return privatAdresseGast;
	}
	public void setprivatAdresseGast(Adress privatAdresseGast) {
		this.privatAdresseGast = privatAdresseGast;
	}
	public Reservations getReservationenGast() {
		return reservationenGast;
	}
	public void setReservationenGast(Reservations reservationenGast) {
		this.reservationenGast = reservationenGast;
	}

	public Adress getBusinessAdresseGast() {
		return businessAdresseGast;
	}

	public void setBusinessAdresseGast(Adress businessAdresseGast) {
		this.businessAdresseGast = businessAdresseGast;
	}
}
