package classes;

public class istatistik {
	private int toplamgol;
	private int toplamasist;
	private double golreyting;
	private double asistreyting;
	public istatistik(int toplamgol, int toplamasist, Double golreyting, Double asistreyting) {
		this.toplamgol = toplamgol;
		this.toplamasist = toplamasist;
		this.golreyting = golreyting;
		this.asistreyting = asistreyting;
	}
	public int getToplamgol() {
		return toplamgol;
	}
	public void setToplamgol(int toplamgol) {
		this.toplamgol = toplamgol;
	}
	public int getToplamasist() {
		return toplamasist;
	}
	public void setToplamasist(int toplamasist) {
		this.toplamasist = toplamasist;
	}
	public double getGolreyting() {
		return golreyting;
	}
	public void setGolreyting(double golreyting) {
		this.golreyting = golreyting;
	}
	public double getAsistreyting() {
		return asistreyting;
	}
	public void setAsistreyting(double assistRating) {
		this.asistreyting = assistRating;
	}
	
	
	
	
	

}
