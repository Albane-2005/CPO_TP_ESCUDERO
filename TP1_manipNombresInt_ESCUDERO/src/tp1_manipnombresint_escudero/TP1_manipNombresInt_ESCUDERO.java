/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_escudero;

import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_manipNombresInt_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier : ");
        int nombre1 = sc.nextInt();  

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = sc.nextInt();  

        System.out.println("Vous avez saisi : ");
        System.out.println("Premier entier : " + nombre1);
        System.out.println("Deuxième entier : " + nombre2);
        
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        if (nombre2 != 0) { 
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;
            System.out.println("Le quotient entier de la division du premier par le second est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("Division par zéro impossible !");
        }
    }
    
}
