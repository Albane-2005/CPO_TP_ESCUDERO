/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_escudero;

import Personnages.*;
import Armes.*;
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

        ArrayList<Arme> inventaire = new ArrayList<>();

        inventaire.add(excalibur);
        inventaire.add(durandal);
        inventaire.add(chene);
        inventaire.add(charme);

        System.out.println("Inventaire des armes :");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println("→ " + inventaire.get(i));
        }
        
        Magicien m1 = new Magicien("Gandalf", 65, true);
        Magicien m2 = new Magicien("Garcimore", 44, false);

        Guerrier g1 = new Guerrier("Conan", 78, false);
        Guerrier g2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> persos = new ArrayList<>();
        persos.add(m1);
        persos.add(m2);
        persos.add(g1);
        persos.add(g2);

        for (Personnage p : persos) {
            System.out.println(p);
        }
        
        Guerrier g = new Guerrier("Aragorn", 90, true) {};
        Magicien m = new Magicien("Merlin", 70, true);

        Baton b1 = new Baton("Chêne", 3, 2);
        Baton b2 = new Baton("Sureau", 7, 3);
        Baton b3 = new Baton("Saule", 4, 5);

        Epee e1 = new Epee("Excalibur", 10, 7);
        Epee e2 = new Epee("Durandal", 8, 3);
        Epee e3 = new Epee("Tyrfing", 6, 4);

        // 39. Ajouter au guerrier : 1 bâton + 2 épées
        g.ajouterArme(b1);
        g.ajouterArme(e1);
        g.ajouterArme(e2);

        // et il choisit la première épée
        g.equiperArme("Excalibur");

        // 40. Ajouter au magicien : 2 bâtons + 1 épée
        m.ajouterArme(b2);
        m.ajouterArme(b3);
        m.ajouterArme(e3);

        // 41. Afficher nombre armes préférées du magicien
        System.out.println("Armes de prédilection de Merlin : " + m.nbArmesDePredilection());

        // 42. Afficher tous les personnages
        System.out.println();
        System.out.println(g);
        System.out.println(m);
        
    Magicien m = new Magicien("Gandalf", 100, false);
    Guerrier g = new Guerrier("Conan", 120, false);

    System.out.println(m);
    System.out.println(g);

    // Affichage du nombre de personnages
    System.out.println("Personnages : " + Personnage.nbPersonnages);
    System.out.println("Magiciens : " + Magicien.nbMagiciens);
    System.out.println("Guerriers : " + Guerrier.nbGuerriers);

    // Fatiguer le guerrier
    g.seFatiguer();

    System.out.println(g);
    if (g.estVivant()) System.out.println("Le guerrier est vivant");

    // Le magicien est attaqué par le guerrier
    g.attaquer(m);

    System.out.println(g);
    System.out.println(m)
    }
    
    public interface EtreVivant {

    void seFatiguer();       // retire 10 pv
    boolean estVivant();     // true si niveauVie > 0
    void estAttaque(int pts); // retire pts à la vie
}
    
}
