/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_escudero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_guessMyNumber_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // --- Étape 1 : Test du générateur ---
        System.out.println("Quelques nombres aléatoires :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
        }

        System.out.println("\n=== Bienvenue dans le jeu 'Guess My Number' ===");

        // --- Étape 4 : Choix du niveau de difficulté ---
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (0 à 50)");
        System.out.println("2) Normal (0 à 100)");
        System.out.println("3) Difficile (0 à 500)");
        int difficulte = sc.nextInt();

        int max = 100;       // Valeur max par défaut
        int essaisMax = 999; // Par défaut, essais illimités

        switch (difficulte) {
            case 1:
                max = 50;
                essaisMax = 10;
                break;
            case 2:
                max = 100;
                essaisMax = 10;
                break;
            case 3:
                max = 500;
                essaisMax = 12;
                break;
            default:
                System.out.println("Niveau inconnu, mode normal activé.");
        }

        // --- Étape 2 : Génération du nombre à deviner ---
        int nombreMystere = generateurAleat.nextInt(max + 1);
        int tentative;
        int compteur = 0;
        boolean gagne = false;

        System.out.println("J'ai choisi un nombre entre 0 et " + max + ". À vous de deviner !");

        // --- Étape 3 : Boucle de jeu ---
        while (!gagne && compteur < essaisMax) {
            System.out.print("Entrez votre nombre : ");
            tentative = sc.nextInt();
            compteur++;

            if (tentative < 0 || tentative > max) {
                System.out.println("⚠️ Nombre hors de l'intervalle !");
                continue;
            }

            int ecart = Math.abs(tentative - nombreMystere);

            if (tentative < nombreMystere) {
                if (ecart > max / 2)
                    System.out.println("Vraiment trop petit !");
                else if (ecart > 10)
                    System.out.println("Trop petit !");
                else
                    System.out.println("Un peu trop petit !");
            } else if (tentative > nombreMystere) {
                if (ecart > max / 2)
                    System.out.println("Vraiment trop grand !");
                else if (ecart > 10)
                    System.out.println("Trop grand !");
                else
                    System.out.println("Un peu trop grand !");
            } else {
                gagne = true;
                System.out.println("🎉 Bravo ! Vous avez trouvé le nombre mystère " + nombreMystere + " !");
                System.out.println("Nombre de tentatives : " + compteur);
            }

            if (compteur == essaisMax && !gagne) {
                System.out.println("❌ Vous avez atteint le nombre maximum d'essais !");
                System.out.println("Le nombre mystère était : " + nombreMystere);
            }
        }

        System.out.println("\nFin du jeu. Merci d'avoir joué !");
    }
    
}
