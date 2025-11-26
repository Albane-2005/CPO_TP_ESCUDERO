/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.*;
/**
 *
 * @author alban
 */
public abstract class Personnage implements EtreVivant{
    protected String nom;
    protected int niveauVie;
    
    protected static int nbPersonnages = 0;
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;
    public abstract void attaquer(Personnage cible);
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println("Impossible d'ajouter plus de 5 armes pour " + nom);
        }
    }

    public void equiperArme(String nomRecherche) {
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomRecherche)) {
                armeEnMain = a;
                System.out.println(nom + " s'équipe de : " + a.getNom());
                return;
            }
        }
        System.out.println("Arme " + nomRecherche + " introuvable dans l’inventaire de " + nom);
    }
    
    public abstract int nbArmesDePredilection();

    @Override
    public String toString() {
        String armeTxt = (armeEnMain == null) ? "aucune" : armeEnMain.toString();
        return "Nom : " + nom + ", vie : " + niveauVie + ", arme en main : " + armeTxt;
    }
    
    @Override
    protected void finalize() {
    nbPersonnages--;
    }
    
    
@Override
public void seFatiguer() {
    this.niveauVie -= 10;
}

@Override
public boolean estVivant() {
    return this.niveauVie > 0;
}

@Override
public void estAttaque(int pts) {
    this.niveauVie -= pts;
}
    

}
