package menjacnica;

import java.util.Date;
import java.util.LinkedList;

import valute.Kurs;

public class KurseviNaOdredjeniDan {
	private LinkedList<Kurs> kursevi = new LinkedList<>();
	private Date datum;
	
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	public Date getDatum() {
		return datum;
	}
	
	public void setDatum() {
		this.datum = new Date();
	}
}
