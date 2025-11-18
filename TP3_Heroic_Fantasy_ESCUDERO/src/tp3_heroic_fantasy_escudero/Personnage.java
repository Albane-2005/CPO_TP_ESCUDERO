/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_escudero;

/**
 *
 * @author alban
 */
public class Personnage {
    protected String nom;
    protected int niveauVie;
    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    
    public int getNiveauVie() {
        return niveauVie;
    }
    
    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString() {
        return "Nom : " + nom + ", niveau de vie : " + niveauVie;
    }
}
