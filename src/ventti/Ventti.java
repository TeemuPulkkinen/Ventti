/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author s1800591
 */
public class Ventti {

    public static void main(String[] args) {

        int[] korttimaara = new int[52];
        Integer[] arvot = new Integer[]{2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14};

        // Initialize cards
        /*for (int i = 0; i < korttimaara.length; i++) {
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
                int arvo = arvot[korttimaara[i] % 13];
                System.out.println(arvo);
            }        
         */
        System.out.println("Terve tuloa pelaamaan Teemun ja Pinjan eeppistä venttipeliä!");
        System.out.println("Tässä versiossa emäntä voittaa tasapelit ja ässän arvo on 14.");

        int pelaajanKasi = 0;
        int emannanKasi = 0;
        String luettu;
        List<Integer> l = Arrays.asList(arvot);

        Collections.shuffle(l);

        Random rand = new Random();
        int element = l.get(rand.nextInt(l.size()));

        //int element = l.get(1);
        pelaajanKasi += element;

        System.out.println("Ensimmäinen korttisi on " + element + ".");
        System.out.println("Kätesi summa on yhteensä " + pelaajanKasi + ". Haluatko vetää uuden kortin? (joo/ei)");
        Scanner lukija = new Scanner(System.in);
        luettu = lukija.nextLine();

        while (luettu.equalsIgnoreCase("kyllä")) {
            element = l.get(rand.nextInt(l.size()));
            System.out.println("Vedetty kortti on " + element + ".");
            pelaajanKasi += element;
            System.out.println("Kätesi summa on yhteensä " + pelaajanKasi + ". Haluatko vetää uuden kortin? (joo/ei)");
            lukija.nextLine();
        }
        if (pelaajanKasi < 21) {
            System.out.println("Loppukäsi on " + pelaajanKasi);
        }
        if (pelaajanKasi > 21) {
            System.out.println("Hävisit!");
        }
        if (pelaajanKasi == 21) {
            System.out.println("Ventti!");
        }

    }

}
