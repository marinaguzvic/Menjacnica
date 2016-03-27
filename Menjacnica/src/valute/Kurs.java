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
		if(valuta1 == null) throw new RuntimeException("Valuta ne sme da bude null!");
		this.valuta1 = valuta1;
	}
	
	public Valuta getValuta2() {
		return valuta2;
	}
	
	public void setValuta2(Valuta valuta2) {
		if(valuta2 == null) throw new RuntimeException("Valuta ne sme da bude null!");
		this.valuta2 = valuta2;
	}
	
	public double getProdajni() {
		return prodajni;
	}
	
	public void setProdajni(double prodajni) {
		if(prodajni <= 0) throw new RuntimeException("Kurs ne sme biti manji od nule!");
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	
	public void setKupovni(double kupovni) {
		if(kupovni <= 0) throw new RuntimeException("Kurs ne sme biti manji od nule!");
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	
	public void setSrednji(double srednji) {
		if(srednji <= 0) throw new RuntimeException("Kurs ne sme biti manji od nule!");
		this.srednji = srednji;
	}

	@Override
	public String toString() {
		return "Kurs [valuta1=" + valuta1 + ", valuta2=" + valuta2 + ", prodajni=" + prodajni + ", kupovni=" + kupovni
				+ ", srednji=" + srednji + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta1 == null) ? 0 : valuta1.hashCode());
		result = prime * result + ((valuta2 == null) ? 0 : valuta2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (valuta1 == null) {
			if (other.valuta1 != null)
				return false;
		} else if (!valuta1.equals(other.valuta1))
			return false;
		if (valuta2 == null) {
			if (other.valuta2 != null)
				return false;
		} else if (!valuta2.equals(other.valuta2))
			return false;
		return true;
	}
	
	
}
