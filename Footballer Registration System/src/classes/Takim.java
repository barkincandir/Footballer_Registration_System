package classes;

public class Takim extends Transfer {
	private String takimadi;
	private int takimID;
	public Takim(int transferdegeri, int transferyili, String takimadi, int takimID) {
		super(transferdegeri, transferyili);
		this.takimadi = takimadi;
		this.takimID = takimID;
	}
	public String getTakimadi() {
		return takimadi;
	}
	public void setTakimadi(String takimadi) {
		this.takimadi = takimadi;
	}
	public int getTakimID() {
		return takimID;
	}
	public void setTakimID(int takimID) {
		this.takimID = takimID;
	}
	
	
}
