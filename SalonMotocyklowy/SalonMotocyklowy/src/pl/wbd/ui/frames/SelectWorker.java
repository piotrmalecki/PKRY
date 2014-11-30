package pl.wbd.ui.frames;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class SelectWorker extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final Dimension dim = new Dimension(380, 330);
	/**
	 * Create the panel.
	 */
	public SelectWorker() {
		setResizable(false);
		setAlwaysOnTop(true);
		setSize(dim);
		setPreferredSize(dim);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		setVisible(true);
		JLabel lblDodajNowegoPracownika = new JLabel("Wyszukaj pracowników");
		lblDodajNowegoPracownika.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblDodajNowegoPracownika = new GridBagConstraints();
		gbc_lblDodajNowegoPracownika.gridwidth = 5;
		gbc_lblDodajNowegoPracownika.insets = new Insets(0, 0, 5, 5);
		gbc_lblDodajNowegoPracownika.gridx = 1;
		gbc_lblDodajNowegoPracownika.gridy = 1;
		panel.add(lblDodajNowegoPracownika, gbc_lblDodajNowegoPracownika);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Imie");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 2;
		panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Nazwisko");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 1;
		gbc_chckbxNewCheckBox_1.gridy = 3;
		panel.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 5;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxOddzia = new JCheckBox("Oddział");
		GridBagConstraints gbc_chckbxOddzia = new GridBagConstraints();
		gbc_chckbxOddzia.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOddzia.gridx = 1;
		gbc_chckbxOddzia.gridy = 4;
		panel.add(chckbxOddzia, gbc_chckbxOddzia);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 5;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		panel.add(comboBox, gbc_comboBox);
		
		JCheckBox chckbxPrzedziaPensji = new JCheckBox("Przedział pensji");
		GridBagConstraints gbc_chckbxPrzedziaPensji = new GridBagConstraints();
		gbc_chckbxPrzedziaPensji.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPrzedziaPensji.gridx = 1;
		gbc_chckbxPrzedziaPensji.gridy = 5;
		panel.add(chckbxPrzedziaPensji, gbc_chckbxPrzedziaPensji);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 3;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 5;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxNrTelefonu = new JCheckBox("Nr telefonu");
		GridBagConstraints gbc_chckbxNrTelefonu = new GridBagConstraints();
		gbc_chckbxNrTelefonu.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNrTelefonu.gridx = 1;
		gbc_chckbxNrTelefonu.gridy = 6;
		panel.add(chckbxNrTelefonu, gbc_chckbxNrTelefonu);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 6;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxDataZatrudnienia = new JCheckBox("Data zatrudnienia");
		GridBagConstraints gbc_chckbxDataZatrudnienia = new GridBagConstraints();
		gbc_chckbxDataZatrudnienia.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDataZatrudnienia.gridx = 1;
		gbc_chckbxDataZatrudnienia.gridy = 7;
		panel.add(chckbxDataZatrudnienia, gbc_chckbxDataZatrudnienia);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridwidth = 5;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 7;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Wyszukaj");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 8;
		panel.add(btnNewButton, gbc_btnNewButton);
		

	}

}
