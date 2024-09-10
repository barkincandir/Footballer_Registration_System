package classes;

import interfaces.FutID;
import interfaces.Observer;

public class Futbolcu extends Mac implements FutID, Observer{
	private int futbolcuid;
	private int yas;
	private String ad;
	private String soyad;
	private String ulke;
	private String pozisyon;
	private Takim takim;
	
	@Override
	public int GetFutbolcuID() {
		return futbolcuid;
	}
	@Override
	public int SetFutbolcuID(int futbolcuid) {
		return futbolcuid;
		
	}
	
	public Futbolcu(int futbolcuid,int yas, String ad,String soyad, String ulke, String pozisyon,int toplamgol,
			int toplamasist, Double golreyting, Double asistreyting, int macsayisi,Takim takim) {
		super(toplamgol, toplamasist, golreyting, asistreyting, macsayisi);
		this.futbolcuid = SetFutbolcuID(futbolcuid);
		this.yas = yas;
		this.ad = ad;
		this.soyad = soyad;
		this.ulke = ulke;
		this.pozisyon = pozisyon;
		this.takim = takim;
	}
	
	public Takim getTakim() {
		return takim;
	}
	public void setTakim(Takim takim) {
		this.takim = takim;
	}
	public int getFutbolcuid() {
		return futbolcuid;
	}
	public void setFutbolcuid(int futbolcuid) {
		this.futbolcuid = futbolcuid;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getUlke() {
		return ulke;
	}
	public void setUlke(String ulke) {
		this.ulke = ulke;
	}
	public String getPozisyon() {
		return pozisyon;
	}
	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}
	 @Override
	    public void update(int goals, int assists, double goalRating, double assistRating) {
	        setToplamgol(getToplamgol() + goals);
	        setToplamasist(getToplamasist() + assists);
	        setGolreyting(goalRating);
	        setAsistreyting(assistRating);
	    }
	public void yazdir() {
		System.out.println("Futbolcu ID: " + getFutbolcuid());
        System.out.println("Adı: " + getAd());
        System.out.println("Soyadı: " + getSoyad());
        System.out.println("Yaşı: " + getYas());
        System.out.println("Ülkesi: " + getUlke());
        System.out.println("Pozisyonu: " + getPozisyon());
        System.out.println("Toplam Gol Sayısı: " + getToplamgol());
        System.out.println("Toplam Asist Sayısı: " + getToplamasist());
        System.out.println("Gol Reytingi: " + getGolreyting());
        System.out.println("Asist Reytingi: " + getAsistreyting());
        System.out.println("Toplam Maç Sayısı: " + getMacsayisi());
        System.out.println("Futbolcunun Takımı: " + getTakim().getTakimadi());
        System.out.println("Transfer Yılı: " + getTakim().getTransferyili());
        System.out.println("Transfer Değeri: " + getTakim().getTransferdegeri());
        System.out.println("-------------------------------------------------------------------------------------------------");
	}
}
