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
public interface Participant {
    void giveCard(Card card); // даёт карту игроку в интерфейсе
    
    Card [] getCards(); // вызывает карты
    
    int getTotalPoints();
    
    boolean isInGame();
}
