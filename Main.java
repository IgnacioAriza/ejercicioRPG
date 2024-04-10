public class Main{

    public static void main(String[] args) {
    Guerrero g1 = new Guerrero(3,0,"Isaac");
    Mago m1 = new Mago(3,0,"Nim");
    Picaro p1 = new Picaro(3,0,"Ruby");

    boolean ko = false;

    while (ko == false){
        g1.puntosDeVida -= g1.defender(m1.atacar());
        System.out.println(g1.nombre + " tiene " + g1.puntosDeVida + " puntos de vida.");
        if (g1.puntosDeVida < 1){
            System.out.println(g1.nombre + " ha quedado inconsiente");
            ko = true;
        }
        m1.puntosDeVida -= m1.defender(g1.atacar());
        System.out.println(m1.nombre + " tiene " + m1.puntosDeVida + " puntos de vida.");
        if (m1.puntosDeVida < 1){
            System.out.println(m1.nombre + " ha quedado inconsiente");
            ko = true;
        }
        if (m1.puntosDeVida < 1 && g1.puntosDeVida < 1){
            System.out.println("¡Es un empate!");
        } else if (m1.puntosDeVida < 1) {
            System.out.println(g1.nombre + " gana!");
        } else if (g1.puntosDeVida < 1) {
            System.out.println(m1.nombre + " gana!");
        }
    }

    ko = false;
    m1.puntosDeVida = m1.nivel*4;

        while (ko == false){
            p1.puntosDeVida -= p1.defender(m1.atacar());
            System.out.println(p1.nombre + " tiene " + p1.puntosDeVida + " puntos de vida.");
            if (p1.puntosDeVida < 1){
                System.out.println(p1.nombre + " ha quedado inconsiente");
                ko = true;
            }
            m1.puntosDeVida -= m1.defender(p1.atacar());
            System.out.println(m1.nombre + " tiene " + m1.puntosDeVida + " puntos de vida.");
            if (m1.puntosDeVida < 1){
                System.out.println(m1.nombre + " ha quedado inconsiente");
                ko = true;
            }
            if (m1.puntosDeVida < 1 && p1.puntosDeVida < 1){
                System.out.println("¡Es un empate!");
            } else if (m1.puntosDeVida < 1) {
                System.out.println(p1.nombre + " gana!");
            } else if (p1.puntosDeVida < 1) {
                System.out.println(m1.nombre + " gana!");
            }
        }

    }
}
