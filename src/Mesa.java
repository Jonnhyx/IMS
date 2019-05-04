import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mesa extends JPanel {

	/**
	 * Create the panel.
	 */
	public Mesa(String name) {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectmesa();
			}
		});
		setName(name);
		setBackground(Color.GRAY);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Mesa.class.getResource("/img/mesa.png")));
		label.setText(name);
		add(label);

	}
	
	public void selectmesa() {
		Salon frame = (Salon) SwingUtilities.getWindowAncestor(this);
		frame.dispose();
	}
}
