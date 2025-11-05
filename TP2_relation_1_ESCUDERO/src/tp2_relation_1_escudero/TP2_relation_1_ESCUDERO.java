/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_escudero;

/**
 *
 * @author alban
 */
public class TP2_relation_1_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(une2008);

        reno.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(uneMicra);

        System.out.println("\nDétails des propriétaires :");
        System.out.println(bob);
        System.out.println(reno);

        System.out.println("\nTentative de vol :");
        reno.ajouter_voiture(uneClio); 
    }
}
