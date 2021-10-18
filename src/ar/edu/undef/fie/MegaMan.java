package ar.edu.undef.fie;

import ar.edu.undef.fie.Armas.MegaBuster;
import ar.edu.undef.fie.Saltos.SaltoCorto;

public class MegaMan extends Personaje {
    public MegaMan() {
        salto = new SaltoCorto();
        arma = new MegaBuster();
    }

    public void mostrar() {
        System.out.println("\033[34mSoy megaman");
    }
}
