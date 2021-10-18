package ar.edu.undef.fie;

import ar.edu.undef.fie.Armas.MetalBlade;
import ar.edu.undef.fie.Saltos.SaltoCorto;

public class MetalMan extends Personaje {
    public MetalMan() {
        salto = new SaltoCorto();
        arma = new MetalBlade();
    }

    public void mostrar() {
        System.out.println("\033[33mSoy metal man");
    }
}
