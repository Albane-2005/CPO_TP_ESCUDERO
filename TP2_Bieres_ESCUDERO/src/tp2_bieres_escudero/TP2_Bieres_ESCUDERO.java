/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_escudero;

/**
 *
 * @author alban
 */
public class TP2_Bieres_ESCUDERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        deuxBiere.Decapsuler();  
        deuxBiere.Decapsuler();
        
        BouteilleBiere biere3 = new BouteilleBiere("Heineken", 5.0, "Heineken International");
        biere3.lireEtiquette();
        biere3.Decapsuler();
     
        BouteilleBiere biere4 = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");
        biere4.lireEtiquette();
        
        BouteilleBiere biere5 = new BouteilleBiere ("Karmeliet Triple", 8.4, "Bosteels");
        biere5.lireEtiquette();
        biere5.Decapsuler();
        
        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(biere3);
        System.out.println(biere4);
        System.out.println(biere5);

    }
    
}
