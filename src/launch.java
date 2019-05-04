
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.Cursor;

public class launch extends JFrame {

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
					launch frame = new launch();
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
	public launch() {
		//QUITAMOS BOTONES Y BARRA
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
                y = e.getY();
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point = MouseInfo.getPointerInfo().getLocation();
                setLocation(point.x - x, point.y - y);
			}
		});
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 450, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(launch.class.getResource("/img/camarero-2.png")));
		label.setBounds(6, 32, 236, 263);
		panel.add(label);
		
		JLabel lblStart = new JLabel("START");
		lblStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		lblStart.setFont(new Font("Lucida Grande", Font.BOLD, 32));
		lblStart.setForeground(Color.WHITE);
		lblStart.setBounds(295, 133, 108, 56);
		panel.add(lblStart);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(436, 6, 8, 16);
		panel.add(lblX);
	}
}
