import javax.swing.JPanel;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DisplayArticulosGeneral extends JPanel {

    
	/**
	 * Create the panel.
	 */
	public DisplayArticulosGeneral() {

		setBounds(0, 295, 474, 473);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JButton btndesayunos = new JButton("DESAYUNOS");
		btndesayunos.setForeground(Color.WHITE);
		btndesayunos.setBorder(null);
		btndesayunos.setBackground(Color.DARK_GRAY);
		btndesayunos.setBounds(0, 0, 118, 118);
		add(btndesayunos);
		
		JButton btnBebidas = new JButton("BEBIDAS");
		btnBebidas.setForeground(Color.WHITE);
		btnBebidas.setBorder(null);
		btnBebidas.setBackground(Color.DARK_GRAY);
		btnBebidas.setBounds(119, 0, 118, 118);
		add(btnBebidas);
		
		JButton btnEntrantes = new JButton("ENTRANTES");
		btnEntrantes.setForeground(Color.WHITE);
		btnEntrantes.setBorder(null);
		btnEntrantes.setBackground(Color.DARK_GRAY);
		btnEntrantes.setBounds(238, 0, 118, 118);
		add(btnEntrantes);
		
		JButton btnCarnes = new JButton("CARNES");
		btnCarnes.setForeground(Color.WHITE);
		btnCarnes.setBorder(null);
		btnCarnes.setBackground(Color.DARK_GRAY);
		btnCarnes.setBounds(356, 0, 118, 118);
		add(btnCarnes);
		
		JButton btnPescados = new JButton("PESCADOS");
		btnPescados.setForeground(Color.WHITE);
		btnPescados.setBorder(null);
		btnPescados.setBackground(Color.DARK_GRAY);
		btnPescados.setBounds(0, 117, 118, 118);
		add(btnPescados);
		
		JButton btnVinosBotellas = new JButton("VINOS BOTELLAS");
		btnVinosBotellas.setForeground(Color.WHITE);
		btnVinosBotellas.setBorder(null);
		btnVinosBotellas.setBackground(Color.DARK_GRAY);
		btnVinosBotellas.setBounds(119, 117, 118, 118);
		add(btnVinosBotellas);
		
		JButton btnVinosCopas = new JButton("VINOS COPAS");
		btnVinosCopas.setForeground(Color.WHITE);
		btnVinosCopas.setBorder(null);
		btnVinosCopas.setBackground(Color.DARK_GRAY);
		btnVinosCopas.setBounds(238, 117, 118, 118);
		add(btnVinosCopas);
		
		JButton btnCombinados = new JButton("COMBINADOS");
		btnCombinados.setForeground(Color.WHITE);
		btnCombinados.setBorder(null);
		btnCombinados.setBackground(Color.DARK_GRAY);
		btnCombinados.setBounds(356, 117, 118, 118);
		add(btnCombinados);
		
		JButton btnLicores = new JButton("LICORES");
		btnLicores.setForeground(Color.WHITE);
		btnLicores.setBorder(null);
		btnLicores.setBackground(Color.DARK_GRAY);
		btnLicores.setBounds(0, 238, 118, 118);
		add(btnLicores);
		
		JButton btnHelados = new JButton("HELADOS");
		btnHelados.setForeground(Color.WHITE);
		btnHelados.setBorder(null);
		btnHelados.setBackground(Color.DARK_GRAY);
		btnHelados.setBounds(119, 238, 118, 118);
		add(btnHelados);
		
		JButton btnTapas = new JButton("TAPAS");
		btnTapas.setForeground(Color.WHITE);
		btnTapas.setBorder(null);
		btnTapas.setBackground(Color.DARK_GRAY);
		btnTapas.setBounds(238, 238, 118, 118);
		add(btnTapas);
		
		JButton btnNuevosProductos = new JButton("NUEVOS PRODUCTOS");
		btnNuevosProductos.setForeground(Color.WHITE);
		btnNuevosProductos.setBorder(null);
		btnNuevosProductos.setBackground(Color.DARK_GRAY);
		btnNuevosProductos.setBounds(356, 238, 118, 118);
		add(btnNuevosProductos);
		
		JButton btnPvpBarra = new JButton("PVP BARRA");
		btnPvpBarra.setForeground(Color.WHITE);
		btnPvpBarra.setBorder(null);
		btnPvpBarra.setBackground(Color.DARK_GRAY);
		btnPvpBarra.setBounds(0, 355, 158, 118);
		add(btnPvpBarra);
		
		JButton btnSala = new JButton("SALA");
		btnSala.setForeground(Color.WHITE);
		btnSala.setBorder(null);
		btnSala.setBackground(Color.DARK_GRAY);
		btnSala.setBounds(159, 355, 158, 118);
		add(btnSala);
		
		JButton btnBarra = new JButton("BARRA");
		btnBarra.setForeground(Color.WHITE);
		btnBarra.setBorder(null);
		btnBarra.setBackground(Color.DARK_GRAY);
		btnBarra.setBounds(316, 355, 158, 118);
		add(btnBarra);

	}
}
