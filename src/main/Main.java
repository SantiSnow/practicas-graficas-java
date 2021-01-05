package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		//valores mas basicos de las vistas
		frame.setTitle("Practicas en Swing");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//cambio de los iconos
		ImageIcon isotipo = new ImageIcon("res/logo.png");
		frame.setIconImage(isotipo.getImage());
		
		//colores
		//frame.getContentPane().setBackground(Color.DARK_GRAY);
		//frame.getContentPane().setBackground(new Color(0x6b6b6b));
		frame.getContentPane().setBackground(new Color(0xFFFFFF));
		
	}

}
