package arma;

public abstract class Arma {

	protected int cantBalas;
	protected int maxBalas;
	protected int daño;
	protected double alcance;

	// public Arma(int maxBalas, int da�o, double alcance) {
	// this.maxBalas = maxBalas;
	// this.da�o = da�o;
	// this.alcance = alcance;
	// }

	public void recargar() {
		if (cantBalas != maxBalas)
			this.cantBalas = maxBalas;
	}

	public boolean restarBala() {
		if (this.cantBalas <= 0)
			return false;
		
		this.cantBalas--;
		return true;
	}

	public double getAlcance() {
		return this.alcance;
	}
	
	public int getDaño(){
		return this.daño;
	}
	
	public boolean esDisparable(){
		return true;
	}
}
