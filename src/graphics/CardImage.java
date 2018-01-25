/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import Data.Card;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author oleg
 */
public class CardImage extends JPanel {
    
    public CardImage(Card card){
        String cardName = card.getFullName() + ".png";
        
        this.setIcon(new ImageIcon(
                getClass().getResource("/images/"+cardName)
        ));
    }
}
