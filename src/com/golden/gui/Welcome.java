package com.golden.gui;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Welcome {


	public static void main(String[] args) {
 
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
		
	}
 
}