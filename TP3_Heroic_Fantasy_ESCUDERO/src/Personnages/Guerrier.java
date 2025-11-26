/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;

/**
 *
 * @author alban
 */
public class Guerrier extends Personnage {

    private boolean aCheval;
    public static int nbGuerriers = 0;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire)
            if (a instanceof Epee)
                c++;
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + ", à cheval : " + aCheval;
    }
    
    @Override
protected void finalize() {
    nbGuerriers--;
    super.finalize();
}

@Override
public void attaquer(Personnage cible) {
    cible.estAttaque(30);
}

}
