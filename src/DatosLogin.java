import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class DatosLogin extends JFrame {

	private JPanel contentPane;
	private int x;
    private int y;
    private JTextField textField;
    private JPasswordField textField_1;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosLogin frame = new DatosLogin();
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
	public DatosLogin() {
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
		
		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.DARK_GRAY);
		textField.setBounds(105, 77, 236, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblUsuario.setBounds(163, 42, 120, 23);
		panel.add(lblUsuario);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setForeground(Color.WHITE);
		lblPass.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblPass.setBounds(193, 138, 64, 23);
		panel.add(lblPass);
		
		textField_1 = new JPasswordField();
		textField_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textField_1.setToolTipText("");
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField_1.setBorder(null);
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setBackground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBounds(105, 173, 236, 38);
		panel.add(textField_1);
		
		JLabel lblStart = new JLabel("START");
		lblStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Manager();
				dispose();
			}
		});
		lblStart.setForeground(Color.WHITE);
		lblStart.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblStart.setBounds(179, 236, 90, 23);
		panel.add(lblStart);
	}
	
	protected void Manager()
	{
		Manager manager = new Manager();
		manager.setVisible(true);
	}
}
