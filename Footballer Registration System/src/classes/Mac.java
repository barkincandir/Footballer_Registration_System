package classes;

public class Mac extends istatistik{
	private int macsayisi;

	public Mac(int toplamgol, int toplamasist, Double golreyting, Double asistreyting, int macsayisi) {
		super(toplamgol, toplamasist, golreyting, asistreyting);
		this.macsayisi = macsayisi;
	}

	public int getMacsayisi() {
		return macsayisi;
	}

	public void setMacsayisi(int macsayisi) {
		this.macsayisi = macsayisi;
	}
	


	

}
