package com.golden.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bienvenue extends JFrame {

	public Bienvenue() throws FileNotFoundException, FontFormatException,
			IOException {

		this.setSize(600, 600);
		this.setTitle("The Golden Question");
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		Font font = Font
				.createFont(
						Font.TRUETYPE_FONT,
						new File(
								"/home/chaasof/laboratoireDev/labEsprit/TheGoldenQuestion/src/com/golden/gui/englandolddbnormal.ttf"));
		font = font.deriveFont(60.0f);
		// Font font = new Font(Font.createFont(Font.TRUETYPE_FONT,
		// new FileInputStream(
		// new
		// File("/home/chaasof/laboratoireDev/labEsprit/TheGoldenQuestion/src/com/golden/gui/imitationtwo.ttf"))).getFamily(),
		// Font.BOLD, 38);
		//
		JPanel labelPanel = new JPanel();
		JTextArea test = new JTextArea("sofien chaabouni");
	
//		JLabel ouverture = new JLabel("jahea");
		// JLabel ouverture1 = new JLabel("dans le jeu");
		// JLabel ouverture2 = new JLabel("The Golden Question");
		test.setFont(font);
		// ouverture1.setFont(font);
		// ouverture2.setFont(font);
		// ouverture.setAlignmentX(CENTER_ALIGNMENT);
		// labelPanel.setMinimumSize(new Dimension(600,150));
		// labelPanel.setPreferredSize(new Dimension(600,150));
		// labelPanel.setMaximumSize(new Dimension(600,150));
		// labelPanel.setSize(new Dimension(200,200));
		labelPanel.add(test);

		// labelPanel1.add(ouverture1);
		// labelPanel2.add(ouverture2);
		labelPanel.setBackground(Color.gray);
		// labelPanel2.setBackground(Color.gray);

		JPanel buttonPanel = new JPanel();
		JButton jouerButton = new JButton("Jouer");
		jouerButton.setAlignmentY(CENTER_ALIGNMENT);
		buttonPanel.add(jouerButton);
		buttonPanel.setBackground(Color.CYAN);

		// this.add(labelPanel, BorderLayout.BEFORE_FIRST_LINE);
		this.add(labelPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) throws FileNotFoundException,
			FontFormatException, IOException {
		JFrame window = new Bienvenue();
	}
}
