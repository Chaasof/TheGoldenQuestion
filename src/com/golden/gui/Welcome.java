package com.golden.gui;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.crypto.Data;

public class Welcome extends JFrame{
	private JFrame fenetre;
	private JPanel plateau;
	private JPanel score;
	private JPanel action;
	private JMenuBar barre;
	 public static final String DATE_FORMAT_NOW = "dd-MM-yyyy HH:mm:ss";

	public Welcome()
	{
		fenetre = new JFrame();
		fenetre.setSize(600,600);
		fenetre.setTitle("The Golden Question" );
		
		fenetre.setResizable(false);
		fenetre.setLayout(new BorderLayout());
		fenetre.setVisible(true);

		
		JButton nouveauButton = new JButton("Nouvelle partie" );
		JButton quitterButton = new JButton("Quitter" );
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(nouveauButton);
		buttonPanel.add(quitterButton);

		//system time 		 
		String timeStamp = new SimpleDateFormat(DATE_FORMAT_NOW).format(Calendar.getInstance().getTime());
		JLabel dat = new JLabel(timeStamp);
		
		score = new JPanel();
		score.add(new JLabel("Score : blablablabla" ));
		score.add(dat);
		fenetre.add(score,BorderLayout.EAST);
		fenetre.add(buttonPanel,BorderLayout.SOUTH);
		score.setBorder(BorderFactory.createLineBorder(Color.black));
		action.setBorder(BorderFactory.createLineBorder(Color.black));
		plateau = new JPanel();

		//plateau.setLayout(new GridLayout(10, 10));
		fenetre.add(plateau, BorderLayout.CENTER);
	}
    public static void main(String[] args) {
        new Welcome().setVisible(true);
    }

	/*public static void main(String[] args) {

		//JFrame
		JFrame frame = new JFrame ("Bienvenue");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Dimension screen = java.awt.Toolkit.getDefaultToolkit().getScreenSize();		
		frame.setLocation((screen.width - frame.getSize().width)/2,(screen.height - frame.getSize().height)/2);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());


		JButton b1 = new JButton( "Press Me" );
		JButton b2 = new JButton( "Don't press Me" );
		JLabel text1 = new JLabel("Sofien");
		JLabel text2 = new JLabel("Chedy");

		//Dimension des Jpanels
		Dimension hp, mp;
		hp = new Dimension(new Dimension ((int)frame.getContentPane().getSize().getWidth()/6, (int)frame.getContentPane().getSize().getHeight()/6));
		mp = new Dimension(new Dimension ((int)frame.getContentPane().getSize().getWidth()/6*5, (int)frame.getContentPane().getSize().getHeight()/6*5));

		//HRessourcesPanel
		JPanel rpanel = new JPanel();
		rpanel.setPreferredSize(hp);
		rpanel.add(text1);
		rpanel.add(b1);
		frame.getContentPane().add(rpanel, BorderLayout.WEST);


		//MPanel
		JPanel mpanel =new JPanel();
		mpanel.setPreferredSize(mp);
		mpanel.add(text2);
		mpanel.add(b2);
		frame.getContentPane().add(mpanel, BorderLayout.EAST);
 frame.setVisible(true);

 addWindowListener(new WindowAdapter() {
	  	public void windowClosing(WindowEvent e) {
		   System.exit(0);
	  	} //windowClosing
	} );


	}

	private static void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub

	}*/

}