/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;

//importteja
import java.util.ArrayList;

/**
 *
 * @author s1800591
 */
public class Ventti {

    private static final int DECK_SIZE = 52;

    public static void main(String args[]) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }

        ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();

        while (deck.size() > 0) {
            int index = (int) (Math.random() * deck.size());
            shuffledDeck.add(deck.remove(index));
        }

        System.out.println(shuffledDeck.toString());
    }
}
