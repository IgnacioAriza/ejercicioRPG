

public class Guerrero extends PersonajeBase {


	public Guerrero(){

	}

	public Guerrero(int nivel, int puntosDeVida, String nombre){
		super(nivel,puntosDeVida,nombre);
		this.nivel = nivel;
		this.nombre = nombre;
		this.puntosDeVida = this.nivel*8;
	}



	public void finalize() throws Throwable {
		super.finalize();
	}


	public int atacar(){
		System.out.println(this.nombre + " golpea haciendo " + (this.nivel+1) + " de daño.");
		return this.nivel+1;
	}


	public int defender(int dam){
		System.out.println(this.nombre + " solo toma " + (dam-(this.nivel*2)) + " de daño gracias a su armadura." );
		return dam-(this.nivel*2);
	}

}