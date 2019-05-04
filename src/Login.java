

import java.awt.EventQueue;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Cursor;

public class Login extends JFrame {

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
					Login frame = new Login( );
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
	public Login() {
		//QUITAMOS BOTONES Y BARRA
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		panel.setBounds(0, 0, 450, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSupervisor = new JLabel("SUPERVISOR");
		lblSupervisor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosLogin();
				dispose();
			}
		});
		lblSupervisor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSupervisor.setForeground(Color.WHITE);
		lblSupervisor.setBounds(66, 217, 84, 16);
		panel.add(lblSupervisor);
		
		JLabel lblCamarero = new JLabel("CAMARERO");
		lblCamarero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosLogin();
				dispose();
			}
		});
		lblCamarero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCamarero.setForeground(Color.WHITE);
		lblCamarero.setBounds(300, 217, 84, 16);
		panel.add(lblCamarero);
		
		JLabel labeImgSupervisor = new JLabel("");
		labeImgSupervisor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosLogin();
				dispose();
			}
		});

		labeImgSupervisor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labeImgSupervisor.setIcon(new ImageIcon(Login.class.getResource("/img/supervisor-128.png")));
		labeImgSupervisor.setBounds(39, 58, 128, 122);
		panel.add(labeImgSupervisor);
		
		JLabel labelImgCamarero = new JLabel("");
		labelImgCamarero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosLogin();
				dispose();
			}
		});
		labelImgCamarero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelImgCamarero.setIcon(new ImageIcon(Login.class.getResource("/img/camarero-128.png")));
		labelImgCamarero.setBounds(267, 58, 128, 122);
		panel.add(labelImgCamarero);
		
		JLabel label = new JLabel("X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setForeground(Color.WHITE);
		label.setBounds(436, 6, 8, 16);
		panel.add(label);
	}

	protected void DatosLogin() {
		// TODO Apéndice de método generado automáticamente
		DatosLogin  datoslogin = new DatosLogin();
		datoslogin.setVisible(true);
		
	}

	

	
}
