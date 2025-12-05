/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alban
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CadenasGUI extends JFrame {
private JTextField txtCombinaison;
private JButton btnTester, btnNouvellePartie;
private JTextArea zoneResultats;
private JeuCadenas jeu;


public CadenasGUI() {
super("Jeu Cadenas - MasterMind simplifié");
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new BorderLayout());


jeu = new JeuCadenas();


JPanel panneauHaut = new JPanel();
panneauHaut.add(new JLabel("Votre essai :"));
txtCombinaison = new JTextField(10);
panneauHaut.add(txtCombinaison);


btnTester = new JButton("Tester");
panneauHaut.add(btnTester);


btnNouvellePartie = new JButton("Nouvelle partie");
panneauHaut.add(btnNouvellePartie);


add(panneauHaut, BorderLayout.NORTH);


zoneResultats = new JTextArea();
zoneResultats.setEditable(false);
JScrollPane scroll = new JScrollPane(zoneResultats);
add(scroll, BorderLayout.CENTER);


btnTester.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
String essai = txtCombinaison.getText();
if (!jeu.estValide(essai)) {
JOptionPane.showMessageDialog(null, "Entrez 4 chiffres !");
return;
}
String resultat = jeu.tester(essai);
zoneResultats.append("Essai: " + essai + " -> " + resultat + "\n");
}
});


btnNouvellePartie.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
jeu = new JeuCadenas();
zoneResultats.setText("");
JOptionPane.showMessageDialog(null, "Nouvelle partie lancée !");
}
});


setVisible(true);
}


public static void main(String[] args) {
new CadenasGUI();
}
}
