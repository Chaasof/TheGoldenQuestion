package com.golden.gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.SQLException;
import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;

public class Authentif extends javax.swing.JFrame {
	private Authentif auth;
	String username;
	String password;
	// creation
	public Authentif() {
		// /*
		// *
		// UIManager.installLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel",
		// * "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
		// *UIManager.put("Synthetica.dialog.icon.enabled", true);
		// */
		/*
                try {
			// UIManager.setLookAndFeel("SyntheticaBlackEyeLookAndFeel");
/*			UIManager
			        .setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			pack();
		}
		catch (UnsupportedLookAndFeelException ex) {
			/*Logger.getLogger(Authentif.class.getName()).log(Level.SEVERE, null,
			        ex);
			ex.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 */
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		panel = new javax.swing.JPanel();
		valider = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		login = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		mdp = new javax.swing.JPasswordField();
		erreur = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("MyMusic");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setResizable(false);

		jLabel1.setText("Login : ");

		erreur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		erreur.setForeground(new java.awt.Color(255, 0, 0));

		jLabel3.setText("S'inscrire");

		javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
		panel.setLayout(panelLayout);
		panelLayout
		        .setHorizontalGroup(panelLayout
		                .createParallelGroup(
		                        javax.swing.GroupLayout.Alignment.LEADING)
		                .addGroup(
		                        panelLayout
		                                .createSequentialGroup()
		                                .addGroup(
		                                        panelLayout
		                                                .createParallelGroup(
		                                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                                .addGroup(
		                                                        javax.swing.GroupLayout.Alignment.TRAILING,
		                                                        panelLayout
		                                                                .createSequentialGroup()
		                                                                .addContainerGap(
		                                                                        390,
		                                                                        Short.MAX_VALUE)
		                                                                .addComponent(
		                                                                        erreur,
		                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                        242,
		                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                .addGroup(
		                                                        panelLayout
		                                                                .createSequentialGroup()
		                                                                .addGap(127,
		                                                                        127,
		                                                                        127)
		                                                                .addGroup(
		                                                                        panelLayout
		                                                                                .createParallelGroup(
		                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                                .addComponent(
		                                                                                        jLabel2)
		                                                                                .addComponent(
		                                                                                        jLabel1))
		                                                                .addGap(38,
		                                                                        38,
		                                                                        38)
		                                                                .addGroup(
		                                                                        panelLayout
		                                                                                .createParallelGroup(
		                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                                                                .addComponent(
		                                                                                        mdp,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                                        147,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                .addComponent(
		                                                                                        login,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                                        147,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                .addComponent(
		                                                                                        valider,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                                        72,
		                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                                .addGap(0,
		                                                                        0,
		                                                                        Short.MAX_VALUE)))
		                                .addContainerGap())
		                .addGroup(
		                        panelLayout
		                                .createSequentialGroup()
		                                .addGap(255, 255, 255)
		                                .addComponent(jLabel3)
		                                .addContainerGap(
		                                        javax.swing.GroupLayout.DEFAULT_SIZE,
		                                        Short.MAX_VALUE)));
		panelLayout
		        .setVerticalGroup(panelLayout
		                .createParallelGroup(
		                        javax.swing.GroupLayout.Alignment.LEADING)
		                .addGroup(
		                        panelLayout
		                                .createSequentialGroup()
		                                .addGroup(
		                                        panelLayout
		                                                .createParallelGroup(
		                                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                                .addGroup(
		                                                        panelLayout
		                                                                .createSequentialGroup()
		                                                                .addGap(86,
		                                                                        86,
		                                                                        86)
		                                                                .addComponent(
		                                                                        login,
		                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                        20,
		                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                .addGroup(
		                                                        javax.swing.GroupLayout.Alignment.TRAILING,
		                                                        panelLayout
		                                                                .createSequentialGroup()
		                                                                .addContainerGap()
		                                                                .addComponent(
		                                                                        jLabel1)))
		                                .addGap(18, 18, 18)
		                                .addGroup(
		                                        panelLayout
		                                                .createParallelGroup(
		                                                        javax.swing.GroupLayout.Alignment.TRAILING)
		                                                .addComponent(
		                                                        mdp,
		                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
		                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                .addComponent(jLabel2))
		                                .addGap(35, 35, 35)
		                                .addComponent(
		                                        valider,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                        29,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jLabel3)
		                                .addGap(166, 166, 166)
		                                .addComponent(
		                                        erreur,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE,
		                                        36,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addContainerGap(
		                                        javax.swing.GroupLayout.DEFAULT_SIZE,
		                                        Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
		        getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
		        javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel,
		        javax.swing.GroupLayout.DEFAULT_SIZE,
		        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
		        javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel,
		        javax.swing.GroupLayout.PREFERRED_SIZE, 278, Short.MAX_VALUE));

		pack();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				new Authentif().setVisible(true);

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel erreur;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField login;
	private javax.swing.JPasswordField mdp;
	private javax.swing.JPanel panel;
	private javax.swing.JButton valider;
	// End of variables declaration//GEN-END:variables
}
