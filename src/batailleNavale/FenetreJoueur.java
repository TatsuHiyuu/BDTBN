package batailleNavale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class FenetreJoueur extends JFrame {

		private JPanel contentPane;
		private GrilleGraphique grilleTirs;
		private GrilleNavaleGraphique grilleDefense;

		public FenetreJoueur() {
			this("Nom du joueur", 10);
		}
		public FenetreJoueur(String nom, int taille) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		

			setTitle(nom);
			getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
			
			GrilleGraphique panel = new GrilleGraphique();
			getContentPane().add(panel);
			
			GrilleGraphique panel_1 = new GrilleGraphique();
			getContentPane().add(panel_1);
		}

		public GrilleGraphique getGrilleTirs() {
			return (this.grilleTirs);
		}

		public GrilleNavaleGraphique getGrilleDefense() {
			return (this.grilleDefense);
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreJoueur frame = new FenetreJoueur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */


}
