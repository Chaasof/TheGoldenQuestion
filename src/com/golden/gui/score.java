package com.golden.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class score extends JFrame {
	public enum Sport {
	    TENNIS,
	    FOOTBALL,
	    NATATION,
	    RIEN;
	}
	public score() {
        super();
 
        setTitle("JTable basique dans un JScrollPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"Johnathan", "Sykes", Color.red, true, Sport.TENNIS},
                {"Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL},
                {"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
                {"Corinne", "Valance", Color.blue, false, Sport.NATATION},
                {"Emilie", "Schrödinger", Color.magenta, false, Sport.FOOTBALL},
                {"Delphine", "Duke", Color.yellow, false, Sport.TENNIS},
                {"Eric", "Trump", Color.pink, true, Sport.FOOTBALL},
        };
 
        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        pack();
    }
 
    public static void main(String[] args) {
        new score().setVisible(true);
    }
}
