package pl.wbd.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pl.wbd.database.connection.DBConnection;
import pl.wbd.ui.frames.UserAdder;
import pl.wbd.ui.frames.SelectWorker;

@SuppressWarnings("serial")
public class StaffPanel extends JPanel {

	private ArrayList<String> imie;
	private ArrayList<String> dimie;
	private ArrayList<String> nazwiska;
	private ArrayList<String> oddzialy;
	private ArrayList<String> stanowiska;
	private String orderType = "p.nazwisko";
	private boolean showHired = false;
	private DBConnection con;
	private final String[] columnNames = { "Imię", "Drugię imię", "Nazwisko",
			"Oddział", "Stanowisko", "Karta pracownika" };
	Object[][] data = { { "", "", "", "", "", "" },

	};

	private enum StanowiskaSort {
		wszystkie, sprzedawca, kierownik, dyrektor
	};

	private enum TableSort {
		nazwiska, oddzialy, stanowiska
	};

	private JTable table;
	private DefaultTableModel model;

	/**
	 * Create the panel.
	 */
	public StaffPanel(DBConnection con) {
		System.out.println("KONSTRUKTOR STAFF PANEL");
		this.con = con;
		imie = new ArrayList<String>();
		dimie = new ArrayList<String>();
		nazwiska = new ArrayList<String>();
		oddzialy = new ArrayList<String>();
		stanowiska = new ArrayList<String>();

		setSize(MainPanel.panelSize);
		setPreferredSize(MainPanel.panelSize);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 209, 34, 0, 0, 30, 21, 0, 33,
				16, 26, 0, 30, 8, 30, 30, 22, 30, 0, 30, 30, 0, 30, 24, 29, 179 };
		gridBagLayout.rowHeights = new int[] { 30, 19, 442, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		model = new DefaultTableModel(new Object[][] {}, new String[] {
				"Imi\u0119", "Drugi\u0119 imi\u0119", "Nazwisko",
				"Oddzia\u0142", "Stanowisko", "Karta prac." }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		
		table = new JTable(data, columnNames);
		table.setBackground(SystemColor.menu);
		table.setEnabled(false);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setMinWidth(55);
		table.getColumnModel().getColumn(1).setMinWidth(55);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMinWidth(65);
		table.getColumnModel().getColumn(3).setPreferredWidth(145);
		table.getColumnModel().getColumn(3).setMinWidth(125);
		table.getColumnModel().getColumn(4).setMinWidth(55);
		table.getColumnModel().getColumn(5).setPreferredWidth(64);
		table.getColumnModel().getColumn(5).setMinWidth(16);
		table.getColumnModel().getColumn(5).setMaxWidth(64);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 25;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);

		final JCheckBox chckbxPokaTylkoAktualnie = new JCheckBox(
				"Pokaż zatrudnionych");
		GridBagConstraints gbc_chckbxPokaTylkoAktualnie = new GridBagConstraints();
		gbc_chckbxPokaTylkoAktualnie.gridwidth = 5;
		gbc_chckbxPokaTylkoAktualnie.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPokaTylkoAktualnie.gridx = 1;
		gbc_chckbxPokaTylkoAktualnie.gridy = 4;
		add(chckbxPokaTylkoAktualnie, gbc_chckbxPokaTylkoAktualnie);

		JLabel lblSzukajWedugStanowisk = new JLabel("Szukaj według stanowisk:");
		GridBagConstraints gbc_lblSzukajWedugStanowisk = new GridBagConstraints();
		gbc_lblSzukajWedugStanowisk.gridwidth = 5;
		gbc_lblSzukajWedugStanowisk.insets = new Insets(0, 0, 5, 5);
		gbc_lblSzukajWedugStanowisk.gridx = 7;
		gbc_lblSzukajWedugStanowisk.gridy = 4;
		add(lblSzukajWedugStanowisk, gbc_lblSzukajWedugStanowisk);

		JComboBox<StanowiskaSort> comboBox = new JComboBox<StanowiskaSort>();
		comboBox.setModel(new DefaultComboBoxModel<StanowiskaSort>(StanowiskaSort.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 12;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);

		JLabel lblNewLabel = new JLabel("Sortuj rosnąco według:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 16;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);

		final JComboBox<TableSort> comboBox_1 = new JComboBox<TableSort>();
		comboBox_1.setModel(new DefaultComboBoxModel<TableSort>(TableSort.values()));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 21;
		gbc_comboBox_1.gridy = 4;
		add(comboBox_1, gbc_comboBox_1);
		table.setRowSelectionAllowed(true);

		chckbxPokaTylkoAktualnie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxPokaTylkoAktualnie.isSelected())
					showHired = true;
				else
					showHired = false;
				removeAllRows();
				loadAllData(orderType, showHired);
				
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TableSort sorttype = (TableSort) comboBox_1.getSelectedItem();
				removeAllRows();
				
				switch (sorttype) {
				case nazwiska:
					orderType = "p.nazwisko";
					break;
				case oddzialy:
					orderType = "o.miasto || ', ' || o.ulica || ' '|| o.nrBudynku ,p.nazwisko";
					break;
				case stanowiska:
					orderType = "z.funkcja, p.nazwisko";
					break;
				}
				loadAllData(orderType, showHired);
			}
		});
		
		JButton btnNowyPracownik = new JButton("Nowy pracownik");
		GridBagConstraints gbc_btnNowyPracownik = new GridBagConstraints();
		gbc_btnNowyPracownik.gridwidth = 6;
		gbc_btnNowyPracownik.insets = new Insets(0, 0, 5, 5);
		gbc_btnNowyPracownik.gridx = 11;
		gbc_btnNowyPracownik.gridy = 6;
		add(btnNowyPracownik, gbc_btnNowyPracownik);
		
		btnNowyPracownik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserAdder();
				
			}
		});

		JButton btnSzukajPracownika = new JButton("Szukaj pracownika");
		GridBagConstraints gbc_btnSzukajPracownika = new GridBagConstraints();
		gbc_btnSzukajPracownika.gridwidth = 7;
		gbc_btnSzukajPracownika.insets = new Insets(0, 0, 5, 5);
		gbc_btnSzukajPracownika.gridx = 10;
		gbc_btnSzukajPracownika.gridy = 7;
		add(btnSzukajPracownika, gbc_btnSzukajPracownika);

		btnSzukajPracownika.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SelectWorker();
				System.out.println(" PR RRacownicy");
				
			}
		});

		JButton btnUsuZaznaczonegoPracownika = new JButton(
				"Usuń zaznaczonego pracownika");
		GridBagConstraints gbc_btnUsuZaznaczonegoPracownika = new GridBagConstraints();
		gbc_btnUsuZaznaczonegoPracownika.gridwidth = 13;
		gbc_btnUsuZaznaczonegoPracownika.insets = new Insets(0, 0, 5, 5);
		gbc_btnUsuZaznaczonegoPracownika.gridx = 7;
		gbc_btnUsuZaznaczonegoPracownika.gridy = 8;
		add(btnUsuZaznaczonegoPracownika, gbc_btnUsuZaznaczonegoPracownika);

		loadAllData("p.nazwisko", showHired);
	}

	private void loadAllData(String orderTable, Boolean showHired) {
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select p.imie, p.drugieImie, p.nazwisko, o.miasto || ', ' || o.ulica || ' '|| o.nrBudynku, z.funkcja from personel p, zatrudnienia z, oddzialy o where p.idPracownika = z.idPracownika AND z.idOddzialu = o.idOddzialu ORDER BY "
				+ orderTable + " ASC" ;
		if (showHired)
			query = "select p.imie, p.drugieImie, p.nazwisko, o.miasto || ', ' || o.ulica || ' '|| o.nrBudynku, z.funkcja from personel p, zatrudnienia z, oddzialy o where p.idPracownika = z.idPracownika AND z.idOddzialu = o.idOddzialu AND z.zatrudnionyDo IS NULL ORDER BY "
				+ orderTable + " ASC" ;
		
		try {
			stmt = con.getConnection().createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				imie.add(rs.getString(1));
				dimie.add(rs.getString(2));
				nazwiska.add(rs.getString(3));
				oddzialy.add(rs.getString(4));
				stanowiska.add(rs.getString(5));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < imie.size(); i++)
			model.addRow(new Object[] { imie.get(i), dimie.get(i),
					nazwiska.get(i), oddzialy.get(i), stanowiska.get(i) });
		
		
		
		imie.clear();
		dimie.clear();
		nazwiska.clear();
		oddzialy.clear();
		stanowiska.clear();
	}
	
	private void removeAllRows() {
		int rowNumber = model.getRowCount();
		for (int i = 0; i<rowNumber; i++) {
			model.removeRow(0);
		}
	}
}
