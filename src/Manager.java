import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;

public class Manager extends JFrame {

	private JPanel contentPane;
	private int x;
    private int y;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		//QUITAMOS BOTONES Y BARRA
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point = MouseInfo.getPointerInfo().getLocation();
                setLocation(point.x - x, point.y - y);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
                y = e.getY();
			}
		});
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1388, 768);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setBounds(1357, 6, 8, 16);
		label.setForeground(Color.WHITE);
		panel.add(label);
		
		DisplayFactura displayFactura = new DisplayFactura();
		panel.add(displayFactura);
		
		DisplayCalculadora calculadora = new DisplayCalculadora();
		panel.add(calculadora);
		calculadora.setLayout(null);
		
		DisplayBotonera botonera = new DisplayBotonera();
		botonera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		panel.add(botonera);
		
		DisplayArticulosGeneral articulosGeneral = new DisplayArticulosGeneral();
		panel.add(articulosGeneral);
		
		JPanel panel_Articulos = new JPanel();
		panel_Articulos.setBounds(473, 295, 518, 473);
		panel.add(panel_Articulos);
		panel_Articulos.setLayout(null);
		
		JLabel lblArticulos = new JLabel("Articulos");
		lblArticulos.setBounds(273, 247, 61, 16);
		panel_Articulos.add(lblArticulos);
		//pack();
	}

}
