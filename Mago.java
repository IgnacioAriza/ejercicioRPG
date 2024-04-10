
public class Mago extends PersonajeBase {

	public Mago(){

	}

	public Mago(int nivel, int puntosDeVida, String nombre){
		super(nivel,puntosDeVida,nombre);
		this.nivel = nivel;
		this.nombre = nombre;
		this.puntosDeVida = this.nivel*4;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int atacar(){
		System.out.println(this.nombre + " lanza una bola de fuego haciendo " + ((this.nivel*3)+2) + " de  daño.");
		return ((this.nivel*3)+2);
	}


	public int defender(int dam){
		System.out.println(this.nombre + " toma " + dam + " de daño.");
		return dam;
	}

}