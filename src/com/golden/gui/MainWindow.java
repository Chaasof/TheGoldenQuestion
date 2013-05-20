package com.golden.gui;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import java.util.Timer;
import java.util.TimerTask;


public class MainWindow extends JFrame implements ActionListener{

        String but;
        private JMenuBar barre_menu;
        private JButton Jouer, Inscription,Quitter,jouerBouton,questionButton,propositionButton,propositionButton1,propositionButton2,propositionButton3,Av1,Av2,Av3;
        private JTextField loginText;
        private JPasswordField passwordField ;
        JFrame frame = new JFrame("application");
        JTextArea jTextArea1;
        private JFrame controllingFrame;
        Container c;
        JPanel panel, panel2, panel3;

	public MainWindow()

                 {

                 this.setTitle("Question Pour Un Champion");
		         this.setBounds(350,0,630,650);

                 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                 c=getContentPane();
                 c.setLayout(null);
                 c.setBackground(new Color(1,147,221));
 
                 String arg = "/com/golden/img/finalLogo.png";
                 panel = new JPanel(); 
                 panel.setBounds(0,0,630,375);
                 panel.setBackground(Color.DARK_GRAY); 
                 ImageIcon icon = new ImageIcon(getClass().getResource(arg)); 
                 JLabel label = new JLabel(); 
                 label.setIcon(icon); 
                 panel.add(label);
                 this.getContentPane().add(panel); 
               
                 panel2 = new JPanel(); 
                 panel2.setLayout(null);
                 panel2.setBounds(100,380,430,200);
                 panel2.setBackground(Color.DARK_GRAY); 
                 
                 JLabel label2 = new JLabel(); 
                 label2.setText("Vous etes déja inscrit?");
                 label2.setFont(new Font("Serif", Font.BOLD, 14));
                 label2.setForeground(Color.white);
                 label2.setBounds(135,0,300,25);
                 panel2.add(label2);
                
                 
                 JLabel login = new JLabel();
                 login.setText("Username");
                 login.setFont(new Font("Serif", Font.BOLD, 12));
                 login.setForeground(Color.white);
                 login.setBounds(40,40,80,25);
                 panel2.add(login);
                 
                 
                 loginText = new JTextField();
                 loginText.setBounds(160,40,150,25);
                 panel2.add(loginText);
                 loginText.setEnabled (true);
                 loginText.addActionListener(this);
                 
                 JLabel mdp = new JLabel();
                 mdp.setText("Mot de passe");
                 mdp.setFont(new Font("Serif", Font.BOLD, 12));
                 mdp.setForeground(Color.white);
                 mdp.setBounds(40,70,140,25);
                 panel2.add(mdp);
                 
                 
                 passwordField = new JPasswordField(10);
                 passwordField.setBounds(160,70,150,25);
                 panel2.add(passwordField);
                 passwordField.setEnabled (true);
                 passwordField.addActionListener(this);
                 
                 Jouer = new JButton("Jouer");
                 Jouer.setBounds(320,57,90,25);
                 panel2.add(Jouer);
                 Jouer.setEnabled (true);
                 Jouer.addActionListener(this);
                 
                 
//                 JLabel inscription = new JLabel();
//                 inscription.setText("Pas encore inscrit?");
//                 inscription.setFont(new Font("Serif", Font.BOLD, 12));
//                 inscription.setForeground(Color.YELLOW);
//                 inscription.setBounds(150,110,300,25);
//                 panel2.add(inscription);
                 
                 Inscription = new JButton("Pas encore inscrit?");
                 Inscription.setFont(new Font("Serif", Font.BOLD, 11));
                 Inscription.setForeground(Color.YELLOW);
                 Inscription.setBounds(162,95,170,25);
                 Inscription.setEnabled (true);
                 Inscription.setContentAreaFilled(false);
                 Inscription.setBorderPainted(false);
                 Inscription.addActionListener(this);
                 panel2.add(Inscription);
                 
                 Quitter = new JButton("Quitter");
                 Quitter.setBounds(150,145,130,25);
                 Quitter.setEnabled (true);
                 Quitter.addActionListener(this);
                 panel2.add(Quitter);
                 
                 this.add(panel2); 
               

       }




public void actionPerformed(ActionEvent ae)
{
	
    Object source = ae.getActionCommand();
    if(ae.getSource()==Jouer){
    	
    	char[] input = passwordField.getPassword();
    	Authentication authentif = new Authentication(loginText.getText(),input);
    	String resultat = authentif.ValidationAuthentification();
    	
    	if(resultat.equals("Nom utilisateur erroné")){
    	JOptionPane.showMessageDialog(frame,resultat+"Veuillez vous ré-authentifier","Inane error",JOptionPane.ERROR_MESSAGE);
    	}
    	
    	if(resultat.equals("Mot de passe erroné")){
        	JOptionPane.showMessageDialog(frame,resultat+"Veuillez vous ré-authentifier","Inane error",JOptionPane.ERROR_MESSAGE);
        }
    	
    	if(resultat.equals("true")){
        	this.remove(panel);
    		this.remove(panel2);
    		this.repaint();
    		
    		panel3 = new JPanel(); 
            panel3.setLayout(null);
            panel3.setBounds(50,20,700,700);
            panel3.setBackground(new Color(1,147,221)); 
            
            JLabel label3 = new JLabel(); 
            label3.setText("Bienvenu Joueur " + loginText.getText());
            label3.setFont(new Font("Serif", Font.BOLD, 16));
            label3.setForeground(Color.yellow);
            label3.setBounds(135,0,300,25);
            panel3.add(label3);
            
            jouerBouton = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/jouer.png")));
            panel3.add(jouerBouton);
            jouerBouton.setBounds(150,430,225,85);
            jouerBouton.setEnabled (true);
            jouerBouton.addActionListener(this);
            jouerBouton.setBackground(new Color(1,147,221));
            
            Av1 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/avatar1.png")));
            panel3.add(Av1);
            Av1.setBounds(10,150,118,156);
            Av1.setEnabled (true);
            Av1.addActionListener(this);
            Av1.setBackground(new Color(1,147,221));
            
            Av2 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/avatar2.png")));
            panel3.add(Av2);
            Av2.setBounds(170,150,118,156);
            Av2.setEnabled (true);
            Av2.addActionListener(this);
            Av2.setBackground(new Color(1,147,221));
            
            Av3 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/avatar3.png")));
            panel3.add(Av3);
            Av3.setBounds(330,150,118,156);
            Av3.setEnabled (true);
            Av3.addActionListener(this);
            Av3.setBackground(new Color(1,147,221));
            
            JLabel label4 = new JLabel(); 
            label4.setText("Choisir votre avatar");
            label4.setFont(new Font("Serif", Font.BOLD, 13));
            label4.setForeground(Color.white);
            label4.setBounds(175,340,300,25);
            panel3.add(label4);
            
            this.add(panel3);
    	}
    }

    if(ae.getSource()==Inscription){

        Subscribtion i = new Subscribtion();
    }

    if(ae.getSource()== jouerBouton){
    	this.remove(panel3);
		this.repaint();
	
		JPanel panel4 = new JPanel(); 
        panel4.setLayout(null);
        panel4.setBounds(10,100,610,400);
        panel4.setBackground(new Color(1,147,221));
        
            propositionButton = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/proposition.png")));
            panel4.add(propositionButton);
            propositionButton.setBounds(30,80,250,58);
            propositionButton.setEnabled (true);
            propositionButton.setBorderPainted(false);
            propositionButton.addActionListener(this);
            propositionButton.setBackground(new Color(1,147,221));
            
            propositionButton1 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/proposition.png")));
            panel4.add(propositionButton1);
            propositionButton1.setBounds(30,145,250,58);
            propositionButton1.setEnabled (true);
            propositionButton1.setBorderPainted(false);
            propositionButton1.addActionListener(this);
            propositionButton1.setBackground(new Color(1,147,221));
            
            propositionButton2 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/proposition.png")));
            panel4.add(propositionButton2);
            propositionButton2.setBounds(30,210,250,58);
            propositionButton2.setEnabled (true);
            propositionButton2.setBorderPainted(false);
            propositionButton2.addActionListener(this);
            propositionButton2.setBackground(new Color(1,147,221));
            
            propositionButton3 = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/proposition.png")));
            panel4.add(propositionButton3);
            propositionButton3.setBounds(30,275,250,58);
            propositionButton3.setEnabled (true);
            propositionButton3.setBorderPainted(false);
            propositionButton3.addActionListener(this);
            propositionButton3.setBackground(new Color(1,147,221));

            questionButton = new JButton("", new ImageIcon(getClass().getResource("/com/golden/img/question.png")));
            panel4.add(questionButton);
            questionButton.setBounds(300,60,300,300);
            questionButton.setEnabled (true);
            questionButton.setBorderPainted(false);
            questionButton.addActionListener(this);
            questionButton.setBackground(new Color(1,147,221));
            
        String textQuestion="";
        String repQuestion [] = {"","","",""};
        

        for(int i=0 ; i<10 ;i++){
        	
        	Timer timer=  new Timer();
        	int startingTime=10000; //millisecond 1 seconds=1000
        	int delayTime=20000; // millisecond 20 second
        
        	timer.schedule(new TimerTask()
        		{
        		public void run(){
 
        	        
        	        
        	        Question question = new Question();
        	        String	textQuestion = question.getQuestion(0);
        	        String []	repQuestion = question.getReponseQuestion(0);
        
        	        JPanel panel4 = new JPanel(); 
        	        panel4.setLayout(null);
        	        panel4.setBounds(10,100,610,200);
        	        panel4.setBackground(Color.DARK_GRAY);
        			
        	        
        	        		JLabel ques = new JLabel(); 
        	        		ques.setText(textQuestion);
        	        		ques.setFont(new Font("Serif", Font.BOLD, 16));
        	        		ques.setForeground(Color.yellow);
        	        		ques.setBounds(50,90,610,25);
        	        		panel4.add(ques);
        	        		
        	        		JPanel panel5 = new JPanel(); 
        	                panel5.setLayout(null);
        	                panel5.setBounds(4500,130,70,70);
        	                panel5.setBackground(Color.white);
        	                panel4.add(panel5);
        	                
        	                JLabel compteur = new JLabel(); 
        	        	    compteur.setText(String.valueOf(2));
        	        		compteur.setFont(new Font("Serif", Font.BOLD, 19));
        	        		compteur.setForeground(Color.red);
        	        		compteur.setBounds(660,130,70,70);
        	        		panel5.add(compteur);
        	          
        		
        	       
        		}
        	
             },startingTime,delayTime);
        	
        }
        
        
        
      
        
        this.add(panel4);
	}
    
    if(ae.getSource()==Quitter){
       System.exit(0);
    }


            

}

}





