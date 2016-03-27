package valute;

public class Kurs {
	private Valuta valuta1;
	private Valuta valuta2;
	private double prodajni; //Prodajni valute1 prema valuti2
	private double kupovni; //Kupovni -||-
	private double srednji;
	
	public Valuta getValuta1() {
		return valuta1;
	}
	
	public void setValuta1(Valuta valuta1) {
		this.valuta1 = valuta1;
	}
	
	public Valuta getValuta2() {
		return valuta2;
	}
	
	public void setValuta2(Valuta valuta2) {
		this.valuta2 = valuta2;
	}
	
	public double getProdajni() {
		return prodajni;
	}
	
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	
}
