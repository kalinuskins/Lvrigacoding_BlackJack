/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author oleg
 */
public class Game {
    private Dealer dealer;
    
    private Player player;
    
    private Deck deck;
    
    private static Scanner input = new Scanner(System.in);
    
    public Game(){
        dealer = new Dealer();
        player = new Player();
        deck = new Deck();
    }
    

    
    public static boolean getAnswer(String question){ // позволяет вызывать метод
        System.out.print("Vai uzsakt jaunu speli (y/n)? ");
        
        char value = input.next().charAt(0);
        value = Character.toLowerCase(value);
        
        return value == 'y';
    }
    
    public boolean startNewGame(){
        
        // ниже функция с использованием выбора новой игры
        boolean startNew = getAnswer("Vai uzsakt jaunu speli ? ");
        
        
        
        if(startNew){
            deck = new Deck();
            deck.shuffle();
            
            player.removeCards();
            dealer.removeCards();
            
            player.giveCard(deck.takeCard());
            player.giveCard(deck.takeCard());
            
            dealer.giveCard(deck.takeCard());
            dealer.giveCard(deck.takeCard());
            
            while(player.isInGame()){
                player.giveCard(deck.takeCard());
            }
            
            while(dealer.isInGame()){
                player.giveCard(deck.takeCard()); // возвращает takeCard
            }
            
            getReseults();
        }
        
        return startNew;
    }
        
    
// данная функци будет вызывать надпись об исходе игры
    private void getReseults() {
        int playerPoints = player.getTotalPoints();
        int dealerPoints = dealer.getTotalPoints();
        
        System.out.println("Speletaja punkti: " + playerPoints);
        System.out.println("Dilera punkti: " + dealerPoints);
        
        if(playerPoints > 21 && dealerPoints > 21){
            System.out.println("Nav uzvaretaja.");
        }else if(playerPoints > 21){
            System.out.println("Dileris uzvareja!");
        }else if(dealerPoints > 21){
            System.out.println("Speletajs uzvareja!");
        }else if(playerPoints == dealerPoints){
            System.out.println("Nav uzvaretaja!");
        }else if(playerPoints > dealerPoints){
            System.out.println("Speletajs uzvareja");
        }else {
            System.out.println("Dileris uzvareja");
        }
    }
}
