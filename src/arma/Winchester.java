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
	
	@Override
	public boolean restarBala() {
		if(this.recargo){
			this.recargo = false;
			return false;
		}
		if (this.cantBalas <= 0)
			return false;
		
		this.cantBalas--;
		return true;
	}
	
	@Override
	public boolean esDisparable()
	{
		return !(this.recargo);
	}

}
