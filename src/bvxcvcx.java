import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class bvxcvcx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bvxcvcx frame = new bvxcvcx();
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
	public bvxcvcx() {
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnTiket = new JButton("");
		btnTiket.setIcon(new ImageIcon(bvxcvcx.class.getResource("/img/pago.png")));
		panelBotones.add(btnTiket);
		
		JButton btnPreTiket = new JButton("PRE TIKET");
		panelBotones.add(btnPreTiket);
		
		JButton btnGuardarTiket = new JButton("GUARDAR TIKET");
		panelBotones.add(btnGuardarTiket);
		
		JButton btnRecuperarTiket = new JButton("RECUPERAR TIKET");
		panelBotones.add(btnRecuperarTiket);
		
		JButton btnBorrarLinea = new JButton("BORRAR LINEA");
		panelBotones.add(btnBorrarLinea);
		
		JButton btnBorrarTodo = new JButton("BORRAR TODO");
		panelBotones.add(btnBorrarTodo);
		
		JButton btnCambiarDetalle = new JButton("CAMBIAR DETALLE");
		panelBotones.add(btnCambiarDetalle);
		
		JButton btnMenuDia = new JButton("MENU DIA");
		panelBotones.add(btnMenuDia);
		
		JButton btnCaja = new JButton("CAJA");
		panelBotones.add(btnCaja);
		
		JButton btnSalir = new JButton("SALIR");
		panelBotones.add(btnSalir);
	}
}
