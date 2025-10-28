/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_escudero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_stats_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Étape 1 : Créer un tableau de 6 entiers initialisés à 0
        int[] faces = new int[6];

        // Étape 2 : Demander à l’utilisateur combien de lancers
        System.out.print("Combien de lancers de dé voulez-vous simuler ? ");
        int m = sc.nextInt();

        // Étape 3 : Boucle de m itérations, incrémente la face correspondante
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6); // valeurs entre 0 et 5
            faces[tirage]++; // incrémente la case correspondante
        }

        // Étape 4 : Afficher le tableau résultat
        System.out.println("\nRésultats des lancers :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }

        // Étape 5 : Afficher les pourcentages
        System.out.println("\nRésultats en pourcentage :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = (double) faces[i] / m * 100;
            System.out.printf("Face %d : %.2f %%\n", (i + 1), pourcentage);
        }

        sc.close();
    }
    
}
