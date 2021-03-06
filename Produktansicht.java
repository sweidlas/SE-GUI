import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Produktansicht extends JFrame {

	//Text
	private JLabel labelProduktname;
	private JLabel labelGewicht;
	private JLabel labelStueckpreis;
	private JLabel labelKategorie;
	private JLabel labelLagernummer;
	private JLabel labelAnzahl; 
	private JLabel labelArtikelHinzufuegen;
	private JLabel labelArtikelEntnehmen;
	
	// Textfelder
	private JTextField fieldProduktname;
	private JTextField fieldGewicht;
	private JTextField fieldStueckpreis;
	private JTextField fieldKategorie;
	private JTextField fieldLagernummer;
	private JTextField fieldArtikelHinzufuegen;
	private JTextField fieldArtikelEntnehmen;
	
	//Button
	private JButton buttonOk;
	private JButton buttonProduktLoeschen;
	
	private int anzahl;
	
	// Ansicht des Fensters
	public Produktansicht(String titel, int anzahl){
		
		this.anzahl = anzahl;
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // Fenster wird mit Klick auf X geschlossen
		setLayout (new FlowLayout());
		
		setSize(500,500);
		setResizable (false);
		
		initComponents();
		
		// Ansicht in der Grafik
		add(labelProduktname);
		add(fieldProduktname);
		add(labelGewicht);
		add(fieldGewicht);
		add(labelStueckpreis);
		add(fieldStueckpreis);
		add(labelKategorie);
		add(fieldKategorie);
		add(labelLagernummer);
		add(fieldLagernummer);
		add(labelAnzahl);
		add(labelArtikelHinzufuegen);
		add(fieldArtikelHinzufuegen);
		add(labelArtikelEntnehmen);
		add(fieldArtikelEntnehmen);
		add(buttonOk);
		add(buttonProduktLoeschen);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	} // public Produktansicht

	private void initComponents() {
	
		labelProduktname = new JLabel ("Produktname: ");
		labelGewicht = new JLabel ("Gewicht (in kg): ");
		labelStueckpreis = new JLabel ("Stückpreis ( in €) : ");
		labelKategorie = new JLabel ("Kategorie: ");
		labelLagernummer = new JLabel ("Lagernummer: ");
		labelAnzahl = new JLabel ("Anzahl: " + anzahl);	
		labelArtikelHinzufuegen = new JLabel ("Artikel hinzufügen:");
		labelArtikelEntnehmen = new JLabel ("Artikel entnehmen:");
		
		fieldProduktname = new JTextField (50); // Groesse aenderbar
		fieldGewicht = new JTextField (5);
		fieldStueckpreis= new JTextField (50);
		fieldKategorie = new JTextField (50);
		fieldLagernummer = new JTextField (6);
		fieldArtikelHinzufuegen = new JTextField (3);
		fieldArtikelEntnehmen = new JTextField (3);
		
		buttonOk = new JButton ("Ok");
		buttonProduktLoeschen = new JButton ("Produkt löschen");
		
		buttonOk.addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent arg0) { // gibt es nicht was zurueck
				// TODO Auto-generated method stub
				
				String artikelHinzufuegenString = fieldArtikelHinzufuegen.getText();
				System.out.println(artikelHinzufuegenString);
				if (artikelHinzufuegenString != "") { // enthaelt einen Eintrag
					 // darf nur eine Zahl eingeben! int artikelHinzufuegenInt = Integer.parseInt(artikelHinzufuegenString);
				
				
				} //
				int neueAnzahl;
				// int artikelHinzufuegen = Integer.parseInt(fieldArtikelHinzufuegen.getText());
				
				
			}// public void actionPerformed(ActionEvent arg0)
			
			
			
		}); // buttonOk.addActionListener (new ActionListener () 
		
		
	 } //private void initComponents()
	
} // public class Produktansicht
