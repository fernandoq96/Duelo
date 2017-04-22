package arma;

public class Winchester extends Arma {

	boolean recargo = false;

	public Winchester() {
		this.cantBalas = 2;
		this.daño = 3;
		this.alcance = 4;
	}

	@Override
	public void recargar() {
		if (cantBalas != maxBalas){
			this.cantBalas = maxBalas;
			this.recargo = true;
		}
	}
	
	public boolean disparable()
	{
		return !(this.recargo);
	}

}
