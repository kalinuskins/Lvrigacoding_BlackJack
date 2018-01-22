/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author oleg
 */
public class Dealer extends Player {
    public Dealer(){
        super(); // обратится в вышестоящему классу class Player
    }
    //выводит название полученой карты, но не добавляет в руку
    @Override
    public void giveCard(Card card){
        System.out.println("Dileris sanema karti ");
        hand.addCard(card);// добавляет карту в руку диллера
    }
    
    @Override
    public boolean isInGame(){
        int max = ThreadLocalRandom.current().nextInt(17, 20);
        
        return hand.countPoints() < max;
    }
}
