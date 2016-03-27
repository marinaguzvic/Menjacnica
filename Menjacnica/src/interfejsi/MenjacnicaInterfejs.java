package interfejsi;

import java.util.Date;
import java.util.LinkedList;

import valute.Kurs;
import valute.Valuta;

public interface MenjacnicaInterfejs {
	void dodajKurs(Kurs kurs, Date dan);
	void izbrisiKurs(Kurs kurs, Date dan);
	LinkedList<Kurs> vratiKurs(Valuta valuta, Date dan);
	
}
