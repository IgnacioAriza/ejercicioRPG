


public class Picaro extends PersonajeBase {

	public Picaro(){

	}

	public Picaro(int nivel, int puntosDeVida, String nombre){
		super(nivel,puntosDeVida,nombre);
		this.nivel = nivel;
		this.nombre = nombre;
		this.puntosDeVida = (this.nivel*5)-1;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}


	public int atacar(){
		System.out.println(this.nombre + " apuñala haciendo " + this.nivel*3 + " de daño.");
		return this.nivel*3;
	}


	public int defender(int daño){
		System.out.println(this.nombre + " esquiva parcialmente el ataque y solo toma " + (daño - this.nivel) + " de daño.");
		return daño - this.nivel;
	}

}