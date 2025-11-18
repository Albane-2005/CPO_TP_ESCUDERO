/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_escudero;

/**
 *
 * @author alban
 */
public class Arme {
    private String nom;
    private int niveauAttaque; 

    public Arme(String nom, int niveauAttaque) {
        if (niveauAttaque > 100) {
            this.niveauAttaque = 100;
        } else {
            this.niveauAttaque = niveauAttaque;
        }
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme : " + nom + " (niveau d’attaque : " + niveauAttaque + ")";
    }
}
