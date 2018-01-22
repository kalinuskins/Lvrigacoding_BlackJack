/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author oleg
 */
public class Player implements Participant {
   protected Hand hand; // можно вызвать из этого класса, а можно из любого другово подсоединённого класа
    
   public Player(){
       hand = new Hand();
   }
    @Override
    public void giveCard(Card card) {
      System.out.println("Speletajs sanema karti " + card.getFullName());
      hand.addCard(card);
    }

    @Override
    public Card[] getCards() {
        return hand.getCards();
    }

    @Override
    public int getTotalPoints() {
        return hand.countPoints();
    }

    @Override
    public boolean isInGame() {
        System.out.println("tev ir " + getTotalPoints() + " punkti.");
        
        if(getTotalPoints() > 21){
            return false;
        }
        
        return Game.getAnswer("Vel karti (y/n)? ");
    }
    
    public void removeCards(){
        hand.clearCards();
    }
      
}