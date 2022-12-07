public class IncludeFileToJsp {
	Servlet s = new Servlet();
	String getNamePlayer;
	String getEtatPlayer;

	public void set_Name() {
		getNamePlayer = s.get_nname();
	}
	public void set_Etat() {
		getEtatPlayer = s.get_etatPlayer();
	}
	public String get_Name() {
		return this.getNamePlayer;
	}
	public String get_Etat() {
		return this.getEtatPlayer;
	}
}