package menjacnica;

import java.util.Date;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import valute.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs{
	LinkedList<KurseviNaOdredjeniDan> dani = new LinkedList<>();
	
	private KurseviNaOdredjeniDan nadjiDan(Date dan){
		for (KurseviNaOdredjeniDan kurseviNaOdredjeniDan : dani) {
			if(uporediDatume(kurseviNaOdredjeniDan.getDatum(),dan)){
				return kurseviNaOdredjeniDan;
			}
		}
		return null;
	}
	@Override
	public void dodajKurs(Kurs kurs, Date dan) {
		nadjiDan(dan).getKursevi().add(kurs);
	}

	@Override
	public void izbrisiKurs(Kurs kurs, Date dan) {
		nadjiDan(dan).getKursevi().remove(kurs);
		
	}

	@Override
	public LinkedList<Kurs> vratiKurs(Valuta valuta, Date dan) {
		LinkedList<Kurs> kurseviZaValutu = new LinkedList<>();
		for (Kurs kurs : nadjiDan(dan).getKursevi()) {
			if(kurs.getValuta1().equals(valuta) || kurs.getValuta2().equals(valuta)) kurseviZaValutu.add(kurs);
		}
		return kurseviZaValutu;
	}
	
	private boolean uporediDatume(Date datum1, Date datum2){
		if(datum1.getYear() == datum2.getYear() &&
				datum1.getMonth() == datum2.getMonth() &&
				datum1.getDate() == datum2.getDate()) return true;
		return false;
	}
	
	
}
