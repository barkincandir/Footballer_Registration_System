package classes;

public class FutbolcuBuilder {
    private int futbolcuid;
    private int yas;
    private String ad;
    private String soyad;
    private String ulke;
    private String pozisyon;
    private Takim takim;
    private int toplamgol;
    private int toplamasist;
    private Double golreyting;
    private Double asistreyting;
    private int macsayisi;

    public FutbolcuBuilder() {

    }

    public FutbolcuBuilder setFutbolcuID(int futbolcuid) {
        this.futbolcuid = futbolcuid;
        return this;
    }

    public FutbolcuBuilder setYas(int yas) {
        this.yas = yas;
        return this;
    }

    public FutbolcuBuilder setAd(String ad) {
        this.ad = ad;
        return this;
    }

    public FutbolcuBuilder setSoyad(String soyad) {
        this.soyad = soyad;
        return this;
    }

    public FutbolcuBuilder setUlke(String ulke) {
        this.ulke = ulke;
        return this;
    }

    public FutbolcuBuilder setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
        return this;
    }

    public FutbolcuBuilder setTakim(Takim takim) {
        this.takim = takim;
        return this;
    }

    public FutbolcuBuilder setToplamGol(int toplamgol) {
        this.toplamgol = toplamgol;
        return this;
    }

    public FutbolcuBuilder setToplamAsist(int toplamasist) {
        this.toplamasist = toplamasist;
        return this;
    }

    public FutbolcuBuilder setGolReyting(Double golreyting) {
        this.golreyting = golreyting;
        return this;
    }

    public FutbolcuBuilder setAsistReyting(Double asistreyting) {
        this.asistreyting = asistreyting;
        return this;
    }

    public FutbolcuBuilder setMacSayisi(int macsayisi) {
        this.macsayisi = macsayisi;
        return this;
    }

    public Futbolcu build() {
        return new Futbolcu(futbolcuid, yas, ad, soyad, ulke, pozisyon, toplamgol, toplamasist, golreyting, asistreyting, macsayisi, takim);
    }
}
