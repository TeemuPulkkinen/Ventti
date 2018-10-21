/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author s1800591
 */
public class Ventti {

    public static void main(String[] args) {
        // luodaan pakka
        int[] korttimaara = new int[52];
        Integer[] arvot = new Integer[]{2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14};
        final JFXPanel fxPanel = new JFXPanel();
        //peli käynnistyy
        System.out.println("Terve tuloa pelaamaan Teemun ja Pinjan eeppistä venttipeliä!");
        System.out.println("Tässä versiossa emäntä voittaa tasapelit ja ässän arvo on 14.");
        String bip = "Bio_UnitMetre_-_03_-_SciFi.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();

        //luodaan käsimuuttujat
        int pelaajanKasi = 0;
        int pelaajanKortit = 0;
        int emannanKasi = 0;
        //pelaajan vastauksen lukemista varten
        String luettu;
        List<Integer> l = Arrays.asList(arvot);
        //sekoitetaan korttipakka
        Collections.shuffle(l);
        //nostetaan ensimmäinen pelaajan kortti
        Random rand = new Random();
        int element = l.get(rand.nextInt(l.size()));
        pelaajanKortit += 1;

        //lisätään pelaajan ensimmäinen kortti käteen
        pelaajanKasi += element;

        System.out.println("Ensimmäinen korttisi on " + element + ".");
        System.out.println("Kätesi summa on yhteensä " + pelaajanKasi + ". Haluatko vetää uuden kortin? (joo/ei)");
        Scanner lukija = new Scanner(System.in);
        luettu = lukija.nextLine();
        //pelaaja kertoo haluaako ottaa lisää kortteja
        while (luettu.equalsIgnoreCase("joo")) {
            element = l.get(rand.nextInt(l.size()));
            System.out.println("Vedetty kortti on " + element + ".");
            pelaajanKasi += element;
            pelaajanKortit += 1;
            System.out.println("Olet nostanut " + pelaajanKortit + " korttia.");
            System.out.println("Kätesi summa on yhteensä " + pelaajanKasi + ". Haluatko vetää uuden kortin? (joo/ei)");
            luettu = lukija.nextLine();
            
        }
        //määrittely sille onko pelaaja vielä pelissä. Jos on, niin on emännän vuoro. Muuten pelaaja häviää.
        if (pelaajanKasi <= 21) {
            System.out.println("Loppukäsi on " + pelaajanKasi);
            System.out.println("Nyt on emännän vuoro.");
            while (emannanKasi < 20) {

                element = l.get(rand.nextInt(l.size()));
                System.out.println("Emännän kortti on " + element + ".");
                emannanKasi += element;
                System.out.println("Emäntä nostaa uuden kortin.");
                System.out.println("Emännän käden summa on " + emannanKasi + ".");
            }

        }

        if (pelaajanKasi > 21) {
            System.out.println("Hävisit!");
        } else if (emannanKasi >= pelaajanKasi && emannanKasi <= 21) {
            System.out.println("Emäntä voitti!");
            //mikäli pelaajan käsi on pienempi tai yhtäsuuri kuin 21 tai kädessä on 5 korttia niin hän voittaa
        } else if (pelaajanKasi <= 21 || pelaajanKortit == 5) {
            System.out.println("Voitit!");
        }
    }  
}
