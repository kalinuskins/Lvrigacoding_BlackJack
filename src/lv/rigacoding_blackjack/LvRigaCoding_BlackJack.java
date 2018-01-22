/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding_blackjack;

import Data.Game;

/**
 *
 * @author oleg
 */
public class LvRigaCoding_BlackJack {
   private static Game game;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        game = new Game();
        // старт новой игры будет повторятся с помощью цыкла 'while'
        while(game.startNewGame())
        {
            
        }
    }
    
}
