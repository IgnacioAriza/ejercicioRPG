


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
		System.out.println(this.nombre + " apu�ala haciendo " + this.nivel*3 + " de da�o.");
		return this.nivel*3;
	}


	public int defender(int da�o){
		System.out.println(this.nombre + " esquiva parcialmente el ataque y solo toma " + (da�o - this.nivel) + " de da�o.");
		return da�o - this.nivel;
	}

}