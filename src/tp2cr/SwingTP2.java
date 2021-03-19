/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2cr;
import java.awt.*;
import javax.swing.*;

public class SwingTP2 extends JFrame {
    private final JTextField TNote1;
    private final JTextField TNote2;
    final JLabel LRes;

    public SwingTP2() {
        TNote1=new JTextField(8);
        TNote2=new JTextField(8);
        LRes=new JLabel("Resultat=");
        JLabel L1=new JLabel("Note1");
        JLabel L2=new JLabel("Note2");
        JButton BTsomme = new JButton("Somme");
        JPanel P1=new JPanel();
        P1.setLayout(new GridLayout(2,2));
        P1.add(L1);P1.add(TNote1);
        P1.add(L2);P1.add(TNote2);
        JPanel P2=new JPanel();
        P2.setLayout(new BoxLayout(P2,BoxLayout.Y_AXIS));
        P2.setBorder(BorderFactory.createTitledBorder("Calculer somme"));
        P2.add(P1);
        P2.add(LRes);
        P2.add(BTsomme);
        getContentPane().add(P2);
        setTitle("TP1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
     EcouteurBouton EB = new EcouteurBouton(this);
       BTsomme.addActionListener(EB);

    }
    
    public JTextField getTNote1() {
        return TNote1;
    }

    public JTextField getTNote2() {
        return TNote2;
    }
    public JLabel getLRes() {
        return LRes;
    }
    
}

