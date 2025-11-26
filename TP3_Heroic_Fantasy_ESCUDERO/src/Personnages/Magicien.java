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
public class Magicien extends Personnage {

    private boolean confirme;
    public static int nbMagiciens = 0;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire)
            if (a instanceof Baton)
                c++;
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + ", magicien confirmé : " + confirme;
    }
    
    @Override
protected void finalize() {
    nbMagiciens--;
    super.finalize();
}

@Override
public void attaquer(Personnage cible) {
    cible.estAttaque(20);
}

}
