package ar.edu.undef.fie;

import ar.edu.undef.fie.Armas.MetalBlade;
import ar.edu.undef.fie.Armas.QuickBoomerang;
import ar.edu.undef.fie.Saltos.SaltoLargo;

public class Main {

    public static void main(String[] args) {
        Personaje metalMan = new MetalMan();
        Personaje quickMan = new QuickMan();
        Personaje megaMan = new MegaMan();

        megaMan.mostrar();
        megaMan.saltar();
        megaMan.atacar();

        metalMan.mostrar();
        metalMan.saltar();
        metalMan.atacar();

        megaMan.setArma(new MetalBlade());  // obtiene y cambia de arma
        megaMan.mostrar();
        megaMan.saltar();
        megaMan.atacar();
        megaMan.setSalto(new SaltoLargo());  // cambia de salto
        megaMan.saltar();

        quickMan.mostrar();
        quickMan.saltar();
        quickMan.atacar();

        megaMan.setArma(new QuickBoomerang());  // obtiene y cambia de arma
        megaMan.mostrar();
        megaMan.atacar();

    }
}
