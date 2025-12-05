/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alban
 */
public class JeuCadenas {
    private int[] combinaisonSecrete;

    public JeuCadenas() {
        combinaisonSecrete = new int[4];
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = (int)(Math.random() * 10);
        }
        System.out.println("DEBUG - Combinaison secrète : " + this);
    }

    public boolean estValide(String s) {
        return s.matches("\\d{4}");
    }

    public String tester(String s) {
        int exact = 0;
        int tropHaut = 0;
        int tropBas = 0;

        for (int i = 0; i < 4; i++) {
            int chiffre = Character.getNumericValue(s.charAt(i));

            if (chiffre == combinaisonSecrete[i]) exact++;
            else if (chiffre > combinaisonSecrete[i]) tropHaut++;
            else tropBas++;
        }

        return exact + " exacts, " + tropHaut + " trop hauts, " + tropBas + " trop bas";
    }

    @Override
    public String toString() {
        return "" + combinaisonSecrete[0] + combinaisonSecrete[1] + combinaisonSecrete[2] + combinaisonSecrete[3];
    }
}
