package ar.edu.undef.fie;

import ar.edu.undef.fie.Armas.Arma;
import ar.edu.undef.fie.Saltos.Salto;

public abstract class Personaje {
    Salto salto;
    Arma arma;

    public void setSalto(Salto salto) {
        this.salto = salto;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    abstract void mostrar();

    public void saltar() {
        salto.saltar();
    }

    public void atacar() {
        arma.atacar();
    }

}
