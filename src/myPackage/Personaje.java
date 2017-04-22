package myPackage;

import org.hamcrest.core.IsInstanceOf;

import arma.Arma;
import arma.Winchester;

public abstract class Personaje {
	private int salud;
	private int pos = 0;
	private Arma arma = null;

	public Personaje(int salud) {
		this.salud = salud;
	}

	public void tomarArma(Arma arma) {
		this.arma = arma;
	}

	public void atacar(Personaje atacado) {

		if (this.puedoAtacar(atacado) == true) {
			atacado.serAtacado();

		}

	}

	private boolean puedoAtacar(Personaje atacado) {
		if (this.arma == null || Math.abs(this.pos - atacado.pos) < this.arma.getAlcance())
			return false;
		else if(this.arma)
			return !(this.arma.get
			
			
		return true;
	}

	public void serAtacado() {

	}

}
