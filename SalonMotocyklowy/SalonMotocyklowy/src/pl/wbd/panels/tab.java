package pl.wbd.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

public class tab extends JPanel {
	private JTable table;
	private DefaultTableModel model;
	private final String[] columnNames = { "Imię", "Drugię imię", "Nazwisko",
			"Oddział", "Stanowisko", "Karta pracownika" };
	Object[][] data = { { "", "", "", "", "", "" },

	};

	/**
	 * Create the panel.
	 */
	public tab() {
		setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][][][]"));
		setSize(MainPanel.panelSize);
		setPreferredSize(MainPanel.panelSize);

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
										table.setEnabled(false);
										table.setRowSelectionAllowed(false);
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
												table.getColumnModel().getColumn(5).setPreferredWidth(35);
												
												add(scrollPane, "cell 1 2 34 12,grow");
												
												JLabel lblNewLabel = new JLabel("New label");
												add(lblNewLabel, "cell 35 7");
												
												JLabel lblNewLabel_1 = new JLabel("New label");
												add(lblNewLabel_1, "cell 0 8");
	}

}
