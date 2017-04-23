package arma;

public class Derringer extends Arma {
	private int cantDisparos = 0;
	private static final int DISPAROS_MAX = 8;

	public Derringer() {
		this.cantBalas = 2;
		this.daño = 1;
		this.alcance = 1.5;
	}

	@Override
	public void recargar()
	{
		if(this.cantDisparos < DISPAROS_MAX){
		if(this.cantBalas != this.maxBalas)
			this.cantBalas = this.maxBalas;
		}
	}
	
	@Override
	public boolean restarBala() {
		if (DISPAROS_MAX == cantDisparos) 
			return false;
		if (this.cantBalas <= 0)
			return false;
		
		this.cantBalas--;
		this.cantDisparos++;
		return true;
	}

}
