/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_escudero;

import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP2_convertisseurObjet_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Étape 4 — Création d'objets Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        // Quelques conversions pour test
        System.out.println("---- Tests automatiques ----");
        System.out.println("25°C = " + convertisseur1.CelciusVersKelvin(25f) + " K");
        System.out.println("300 K = " + convertisseur1.KelvinVersCelcius(300f) + " °C");
        System.out.println("32°F = " + convertisseur2.FarenheitVersCelcius(32f) + " °C");

        System.out.println(convertisseur1);
        System.out.println(convertisseur2);

        // Étape 5 — Menu interactif
        System.out.println("\n---- Menu de conversion ----");
        System.out.println("1 - Celsius vers Kelvin");
        System.out.println("2 - Kelvin vers Celsius");
        System.out.println("3 - Fahrenheit vers Celsius");
        System.out.println("4 - Celsius vers Fahrenheit");
        System.out.println("5 - Fahrenheit vers Kelvin");
        System.out.println("6 - Kelvin vers Fahrenheit");
        System.out.print("Votre choix : ");

        int choix = sc.nextInt();
        System.out.print("Entrez la température à convertir : ");
        float valeur = sc.nextFloat();

        float resultat = 0f;

        switch (choix) {
            case 1:
                resultat = convertisseur1.CelciusVersKelvin(valeur);
                System.out.println(valeur + " °C = " + resultat + " K");
                break;
            case 2:
                resultat = convertisseur1.KelvinVersCelcius(valeur);
                System.out.println(valeur + " K = " + resultat + " °C");
                break;
            case 3:
                resultat = convertisseur1.FarenheitVersCelcius(valeur);
                System.out.println(valeur + " °F = " + resultat + " °C");
                break;
            case 4:
                resultat = convertisseur1.CelciusVersFarenheit(valeur);
                System.out.println(valeur + " °C = " + resultat + " °F");
                break;
            case 5:
                resultat = convertisseur1.FarenheitVersKelvin(valeur);
                System.out.println(valeur + " °F = " + resultat + " K");
                break;
            case 6:
                resultat = convertisseur1.KelvinVersFarenheit(valeur);
                System.out.println(valeur + " K = " + resultat + " °F");
                break;
            default:
                System.out.println("Choix invalide !");
                break;
        }

        System.out.println("\n" + convertisseur1);
        sc.close();
    }
    
}
