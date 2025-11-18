/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_escudero;

/**
 *
 * @author alban
 */
public class Baton extends Arme {
    private int age; 

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Bâton : " + getNom() +
               " (Attaque : " + getNiveauAttaque() +
               ", Âge : " + age + ")";
    }
}
