/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;

import java.util.Random;



/**
 *
 * @author s1800591
 */
public class Ventti {

    public static void main(String[] args) {
        int[] korttimaara = new int[52];
        String[] maat = {"Pata", "Hertta", "Ruutu", "Risti"};
        String[] arvot = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jätkä", "akka", "kurko", "ässä"};

        // Initialize cards
        for (int i = 0; i < korttimaara.length; i++) {
            korttimaara[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < korttimaara.length; i++) {
            int index = (int) (Math.random() * korttimaara.length);
            int temp = korttimaara[i];
            korttimaara[i] = korttimaara[index];
            korttimaara[index] = temp;
        }

        // Display the all the cards
            for (int i = 0; i < 52; i++) {
                String maa = maat[korttimaara[i] / 13];
                String arvo = arvot[korttimaara[i] % 13];
                System.out.println(arvo + "" + maa);
            }        
        
        System.out.println("Terve tuloa pelaamaan Teemun ja Pinjan eeppistä venttipeliä!");
        System.out.println("Tässä versiossa emäntä voittaa tasapelit ja ässän arvo on 14.");
        
        int pelaajankasi = 0;
        int emannankasi = 0;
        
        //Random random = new Random();
        //pelaajankasi = random.nextInt(korttimaara.size());
            
            
        }
    }

