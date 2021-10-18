package ar.edu.undef.fie;

import ar.edu.undef.fie.Armas.QuickBoomerang;
import ar.edu.undef.fie.Saltos.SaltoCorto;

public class QuickMan extends Personaje {
    public QuickMan() {
        salto = new SaltoCorto();
        arma = new QuickBoomerang();
    }

    public void mostrar() {
        System.out.println("\033[31mSoy quick man");
    }
}
