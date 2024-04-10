
public class PersonajeBase implements Personaje {

	public int nivel;
	public String nombre;
	public int puntosDeVida;

	public PersonajeBase(){

	}

	public PersonajeBase(int nivel, int puntosDeVida, String nombre) {
	}

	public void finalize() throws Throwable {

	}

	public int defender(int dam){
		return 0;
	}

	public int atacar(){
		return 0;
	}

}