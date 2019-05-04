import javax.swing.JPanel;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class DisplayBotonera extends JPanel {


	/**
	 * Create the panel.
	 */
	public DisplayBotonera() {

		setBackground(Color.DARK_GRAY);
		setBounds(991, 0, 374, 768);
		setLayout(null);
		
		JButton btnCobrar = new JButton("");
		btnCobrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCobrar.setBorder(null);
		btnCobrar.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/pago.png")));
		btnCobrar.setBackground(Color.DARK_GRAY);
		btnCobrar.setForeground(Color.DARK_GRAY);
		btnCobrar.setBounds(0, 6, 180, 85);
		add(btnCobrar);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImprimir.setBorder(null);
		btnImprimir.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/impresora.png")));
		btnImprimir.setBackground(Color.DARK_GRAY);
		btnImprimir.setBounds(0, 331, 180, 85);
		add(btnImprimir);
		
		JButton button_mesas = new JButton("");
		button_mesas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Salon salon = new Salon(4);
				salon.setVisible(true);
			}
		});
		button_mesas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_mesas.setBorder(null);
		button_mesas.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/mesas.png")));
		button_mesas.setBackground(Color.DARK_GRAY);
		button_mesas.setBounds(0, 88, 180, 85);
		add(button_mesas);
		
		JButton button_aplazar = new JButton("");
		button_aplazar.setBackground(Color.DARK_GRAY);
		button_aplazar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_aplazar.setBorder(null);
		button_aplazar.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/aplazar.png")));
		button_aplazar.setBounds(177, 6, 180, 85);
		add(button_aplazar);
		
		JButton btnCamarero = new JButton("");
		btnCamarero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCamarero.setBorder(null);
		btnCamarero.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/camarero-64.png")));
		btnCamarero.setBackground(Color.DARK_GRAY);
		btnCamarero.setBounds(0, 170, 180, 85);
		add(btnCamarero);
		
		JButton btnSupervisor = new JButton("");
		btnSupervisor.setBackground(Color.DARK_GRAY);
		btnSupervisor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSupervisor.setBorder(null);
		btnSupervisor.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/supervisor-64.png")));
		btnSupervisor.setBounds(177, 170, 180, 85);
		add(btnSupervisor);
		
		JButton btnBorrarLinea = new JButton("");
		btnBorrarLinea.setBackground(Color.DARK_GRAY);
		btnBorrarLinea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrarLinea.setBorder(null);
		btnBorrarLinea.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/borrarLinea.png")));
		btnBorrarLinea.setBounds(0, 253, 180, 85);
		add(btnBorrarLinea);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.DARK_GRAY);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setBorder(null);
		button_6.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/eliminar.png")));
		button_6.setBounds(177, 253, 180, 85);
		add(button_6);
		
		JButton btnImprimir2 = new JButton("");
		btnImprimir2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImprimir2.setBorder(null);
		btnImprimir2.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/impresora-2.png")));
		btnImprimir2.setBackground(Color.DARK_GRAY);
		btnImprimir2.setBounds(177, 331, 180, 85);
		add(btnImprimir2);
		
		JButton btnBarra = new JButton("");
		btnBarra.setBackground(Color.WHITE);
		btnBarra.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/barra.png")));
		btnBarra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBarra.setBorder(null);
		btnBarra.setBounds(177, 88, 180, 85);
		add(btnBarra);
		
		JButton button_9 = new JButton("New button");
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setBorder(null);
		button_9.setBounds(0, 420, 180, 85);
		add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_10.setBorder(null);
		button_10.setBounds(177, 420, 180, 85);
		add(button_10);
		
		JButton btnCalculadora = new JButton("");
		btnCalculadora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculadora.setBorder(null);
		btnCalculadora.setBackground(Color.DARK_GRAY);
		btnCalculadora.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/calculadora.png")));
		btnCalculadora.setBounds(0, 504, 180, 85);
		add(btnCalculadora);
		
		JButton button_12 = new JButton("New button");
		button_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_12.setBorder(null);
		button_12.setBounds(177, 504, 180, 85);
		add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_13.setBorder(null);
		button_13.setBounds(0, 589, 180, 85);
		add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_14.setBorder(null);
		button_14.setBounds(177, 589, 180, 85);
		add(button_14);
		
		JButton btnCaja = new JButton("");
		btnCaja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCaja.setBorder(null);
		btnCaja.setBackground(Color.DARK_GRAY);
		btnCaja.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/caja-registradora.png")));
		btnCaja.setBounds(0, 677, 180, 85);
		add(btnCaja);
		
		JButton btnSalir = new JButton("");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.DARK_GRAY);
		btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalir.setBorder(null);
		btnSalir.setIcon(new ImageIcon(DisplayBotonera.class.getResource("/img/salir.png")));
		btnSalir.setBounds(177, 677, 180, 85);
		add(btnSalir);

	}

}
