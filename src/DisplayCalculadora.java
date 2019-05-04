import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DisplayCalculadora extends JPanel {


	/**
	 * Create the panel.
	 */
	public DisplayCalculadora() {



		setBackground(Color.DARK_GRAY);
		setBounds(new Rectangle(609, 0, 382, 295));
		setLayout(null);
		
		JButton button = new JButton("0");
		button.setBounds(0, 243, 191, 52);
		add(button);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(0, 194, 95, 52);
		add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(96, 194, 95, 52);
		add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(188, 194, 95, 52);
		add(button_3);
		
		JButton button_4 = new JButton(".");
		button_4.setBounds(188, 243, 95, 52);
		add(button_4);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(281, 194, 95, 52);
		add(btnC);
		
		JButton button_5 = new JButton("<-");
		button_5.setBounds(281, 243, 95, 52);
		add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.setBounds(0, 143, 95, 52);
		add(button_6);
		
		JButton btnPrecio = new JButton("Precio");
		btnPrecio.setBounds(281, 143, 95, 52);
		add(btnPrecio);
		
		JButton button_8 = new JButton("6");
		button_8.setBounds(188, 143, 95, 52);
		add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setBounds(96, 143, 95, 52);
		add(button_9);
		
		JButton button_10 = new JButton("7");
		button_10.setBounds(0, 92, 95, 52);
		add(button_10);
		
		JButton btnCantidad = new JButton("Cantidad");
		btnCantidad.setBounds(281, 92, 95, 52);
		add(btnCantidad);
		
		JButton button_12 = new JButton("9");
		button_12.setBounds(188, 92, 95, 52);
		add(button_12);
		
		JButton button_13 = new JButton("8");
		button_13.setBounds(96, 92, 95, 52);
		add(button_13);
		
		JLabel lblDisplay = new JLabel("");
		lblDisplay.setBounds(0, 0, 376, 91);
		add(lblDisplay);

	}
}
