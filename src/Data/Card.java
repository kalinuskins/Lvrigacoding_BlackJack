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
public class Card {
    // 2, 3, 4... J, Q, K, A
    private String value;
    // H, S, D, C
    private char suit;
    
    public Card(String value, char suit){
        this.suit = suit;
        this.value = value;
    }
    

        public int getValue(){
        switch(value){
            case "A":
               return 11;
            case "J":
            case "Q":
            case "K":
               return 10;
            default:
               return Integer.valueOf(value);   
        }
    }
        public String getFullName(){
            return suit + value; // piemeram, H10
        }

    public String getValueString() {
        return value;
    }
            
        
}   



