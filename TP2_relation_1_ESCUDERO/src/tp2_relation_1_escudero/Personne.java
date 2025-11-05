/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_escudero;

/**
 *
 * @author alban
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; 
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : la voiture appartient déjà à quelqu’un !");
            return false;
        }
        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " possède déjà 3 voitures !");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        String info = prenom + " " + nom + " possède " + nbVoitures + " voiture(s).";
        for (int i = 0; i < nbVoitures; i++) {
            info += "\n  - " + liste_voitures[i];
        }
        return info;
    }
}
