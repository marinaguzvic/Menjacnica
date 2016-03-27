package interfejsi;

import java.util.Date;

import valute.Kurs;
import valute.Valuta;

public interface MenjacnicaInterfejs {
	void dodajKurs(Kurs kurs, Date dan);
	void izbrisiKurs(Kurs kurs, Date dan);
	Kurs vratiKurs(Valuta valuta1, Valuta valuta2, Date dan);
	
}
