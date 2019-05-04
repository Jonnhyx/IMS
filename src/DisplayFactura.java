import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayFactura extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DisplayFactura() {
		setBackground(Color.DARK_GRAY);
		setBounds(0, 0, 609, 295);
		
		table = new JTable();
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		modelo.addColumn("etiqueta columna 1");
		modelo.addColumn("etiqueta columna 2");
		//modelo.addRow(tck);
		add(table);

	}

}
