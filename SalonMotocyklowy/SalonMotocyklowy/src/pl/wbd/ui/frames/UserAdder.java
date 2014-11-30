package pl.wbd.ui.frames;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class UserAdder extends JFrame {

	private final Dimension dim = new Dimension(280, 330);
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the frame.
	 */
	public UserAdder() {
		setAlwaysOnTop(true);
		setTitle("Salon motocyklowy - Nowy pracownik");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 417);
		setLocationRelativeTo(null);
		setSize(dim);
		setPreferredSize(dim);
		setResizable(false);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblDodajNowegoPracownika = new JLabel("Dodaj nowego pracownika");
		lblDodajNowegoPracownika.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblDodajNowegoPracownika = new GridBagConstraints();
		gbc_lblDodajNowegoPracownika.gridwidth = 5;
		gbc_lblDodajNowegoPracownika.insets = new Insets(0, 0, 5, 5);
		gbc_lblDodajNowegoPracownika.gridx = 0;
		gbc_lblDodajNowegoPracownika.gridy = 0;
		contentPane.add(lblDodajNowegoPracownika, gbc_lblDodajNowegoPracownika);
		
		JLabel lblImi = new JLabel("Imię:");
		GridBagConstraints gbc_lblImi = new GridBagConstraints();
		gbc_lblImi.anchor = GridBagConstraints.EAST;
		gbc_lblImi.insets = new Insets(0, 0, 5, 5);
		gbc_lblImi.gridx = 0;
		gbc_lblImi.gridy = 2;
		contentPane.add(lblImi, gbc_lblImi);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDrugieImi = new JLabel("Drugie imię:");
		GridBagConstraints gbc_lblDrugieImi = new GridBagConstraints();
		gbc_lblDrugieImi.anchor = GridBagConstraints.EAST;
		gbc_lblDrugieImi.insets = new Insets(0, 0, 5, 5);
		gbc_lblDrugieImi.gridx = 0;
		gbc_lblDrugieImi.gridy = 3;
		contentPane.add(lblDrugieImi, gbc_lblDrugieImi);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
		gbc_lblNazwisko.anchor = GridBagConstraints.EAST;
		gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwisko.gridx = 0;
		gbc_lblNazwisko.gridy = 4;
		contentPane.add(lblNazwisko, gbc_lblNazwisko);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDataUrodzenia = new JLabel("Data urodzenia:");
		GridBagConstraints gbc_lblDataUrodzenia = new GridBagConstraints();
		gbc_lblDataUrodzenia.anchor = GridBagConstraints.EAST;
		gbc_lblDataUrodzenia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataUrodzenia.gridx = 0;
		gbc_lblDataUrodzenia.gridy = 5;
		contentPane.add(lblDataUrodzenia, gbc_lblDataUrodzenia);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 4;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 5;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNumerTelefonu = new JLabel("Numer Telefonu:");
		GridBagConstraints gbc_lblNumerTelefonu = new GridBagConstraints();
		gbc_lblNumerTelefonu.anchor = GridBagConstraints.EAST;
		gbc_lblNumerTelefonu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumerTelefonu.gridx = 0;
		gbc_lblNumerTelefonu.gridy = 6;
		contentPane.add(lblNumerTelefonu, gbc_lblNumerTelefonu);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 4;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 6;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Stanowisko");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 8;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 8;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblPensja = new JLabel("Pensja");
		GridBagConstraints gbc_lblPensja = new GridBagConstraints();
		gbc_lblPensja.anchor = GridBagConstraints.EAST;
		gbc_lblPensja.insets = new Insets(0, 0, 5, 5);
		gbc_lblPensja.gridx = 0;
		gbc_lblPensja.gridy = 9;
		contentPane.add(lblPensja, gbc_lblPensja);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 4;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 9;
		contentPane.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblOddzia = new JLabel("Oddział");
		GridBagConstraints gbc_lblOddzia = new GridBagConstraints();
		gbc_lblOddzia.anchor = GridBagConstraints.EAST;
		gbc_lblOddzia.insets = new Insets(0, 0, 5, 5);
		gbc_lblOddzia.gridx = 0;
		gbc_lblOddzia.gridy = 10;
		contentPane.add(lblOddzia, gbc_lblOddzia);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 4;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 10;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblDataZatrudnienia = new JLabel("Data zatrudnienia:");
		GridBagConstraints gbc_lblDataZatrudnienia = new GridBagConstraints();
		gbc_lblDataZatrudnienia.anchor = GridBagConstraints.EAST;
		gbc_lblDataZatrudnienia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataZatrudnienia.gridx = 0;
		gbc_lblDataZatrudnienia.gridy = 11;
		contentPane.add(lblDataZatrudnienia, gbc_lblDataZatrudnienia);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 4;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 11;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Dodaj");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 13;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnAnuluj = new JButton("Anuluj");
		GridBagConstraints gbc_btnAnuluj = new GridBagConstraints();
		gbc_btnAnuluj.gridwidth = 2;
		gbc_btnAnuluj.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnuluj.gridx = 2;
		gbc_btnAnuluj.gridy = 13;
		contentPane.add(btnAnuluj, gbc_btnAnuluj);
	}

}
