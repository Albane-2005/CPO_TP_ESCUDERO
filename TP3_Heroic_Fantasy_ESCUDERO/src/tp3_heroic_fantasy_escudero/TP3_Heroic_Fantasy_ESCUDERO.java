/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_escudero;

import java.util.ArrayList;

/**
 *
 * @author alban
 */
public class TP3_Heroic_Fantasy_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // 12. Création du tableau dynamique
        ArrayList<Arme> inventaire = new ArrayList<>();

        inventaire.add(excalibur);
        inventaire.add(durandal);
        inventaire.add(chene);
        inventaire.add(charme);

        // 13. Affichage des caractéristiques
        System.out.println("Inventaire des armes :");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println("→ " + inventaire.get(i));
        }
    }
    
}
