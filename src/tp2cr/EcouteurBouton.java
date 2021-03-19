/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2cr;


import java.awt.event.*;

/**
 *
 * @author GHAITH
 */
public class EcouteurBouton implements ActionListener{
private final SwingTP2 SW1;
    public EcouteurBouton(SwingTP2 SW1) {
        this.SW1 = SW1;
    }
@Override
    public void actionPerformed(ActionEvent evt){
       
       float x,y,s=0;
    x=Float.parseFloat(SW1.getTNote1().getText());
    y=Float.parseFloat(SW1.getTNote2().getText());
    s=x+y;
   SW1.LRes.setText("Resultat="+Float.toString(s));
   

    }
    }


    
 
