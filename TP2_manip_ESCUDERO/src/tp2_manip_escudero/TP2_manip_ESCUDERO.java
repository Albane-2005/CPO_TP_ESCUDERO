/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_escudero;

/**
 *
 * @author alban
 */
public class TP2_manip_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; 

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        assiette2.nbCalories += 100;

        System.out.println("\nAprès modification de assiette2 :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nAprès inversion :");
        System.out.println("Assiette 1 calories : " + assiette1.nbCalories);
        System.out.println("Assiette 2 calories : " + assiette2.nbCalories);

        Moussaka[] tabMoussaka = new Moussaka[10];

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(100 + i * 50);
        }

        System.out.println("\nAffichage des calories des Moussakas :");
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + tabMoussaka[i].nbCalories + " calories");
        }

    }
    
}
