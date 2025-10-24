/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_escudero;

import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_convertisseur_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();
        System.out.println("Vous avez saisi : " + valeur);

        double kelvin = CelciusVersKelvin(valeur);
        System.out.println(valeur + " degrés Celcius = " + kelvin + " degrés Kelvin");
    }
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

}
