package menjacnica;

import java.util.Date;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import valute.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs{
	LinkedList<KurseviNaOdredjeniDan> dani = new LinkedList<>();

	@Override
	public void dodajKurs(Kurs kurs, Date dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void izbrisiKurs(Kurs kurs, Date dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(Valuta valuta1, Valuta valuta2, Date dan) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
