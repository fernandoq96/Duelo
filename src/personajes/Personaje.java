package personajes;

//import org.hamcrest.core.IsInstanceOf;

import arma.Arma;

public abstract class Personaje {
	private int salud;
	private int pos;
	private Arma arma;

	public Personaje(int salud) {
		this.salud = salud;
		this.pos = 0;
		this.arma = null;
	}

	public void tomarArma(Arma arma) {
		this.arma = arma;
	}
	
	public void moverPosicion(int desplazamiento){
		this.pos += desplazamiento;
	}
	
	/**
	 * Ataca únicamente si puedoAtacar() devuelve true y si el arma tiene balas disponibles.
	 * Caso contrario, se recarga el arma y el personaje atacado no recibe daño.
	 * 
	 * @param atacado Personaje que recibe el daño
	 */
	public void atacar(Personaje atacado) {
		if (this.puedoAtacar(atacado) == true) {
			if(this.arma.restarBala())
				atacado.serAtacado(this.arma.getDaño());
			else
				this.arma.recargar();
		}

	}

	private boolean puedoAtacar(Personaje atacado) {
		if (this.salud <= 0 ||
			this.arma == null || 
			Math.abs(this.pos - atacado.pos) < this.arma.getAlcance() || 
			this.arma.esDisparable() == false)
			return false;		
			
		return true;
	}

	public void serAtacado(int dañoRecibido) {
		if (this.salud > 0) {
			this.salud -= dañoRecibido;
		}
	}

}
