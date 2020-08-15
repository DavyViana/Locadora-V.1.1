package filme;

public class Serie {
	public String Nome;
	public String Temp;
	public String Ep;
	
	public String getNome() {
		return this.Nome;
	}
	public String getTemp() {
		return this.Temp;
	}
	public String getEp() {
		return this.Ep;
	}
	public Serie(String Nome, String Temp, String Ep) {
		this.Nome = Nome;
		this.Temp = Temp;
		this.Ep = Ep;	
		}
}