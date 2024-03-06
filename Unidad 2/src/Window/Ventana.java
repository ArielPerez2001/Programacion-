package Window;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {

		this.setSize(1520,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setResizable(false);
		this.setTitle("Mario Bros");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setLocationRelativeTo(null);
		this.iniciarComponentes();
		this.setLayout(null);
		this.setVisible(true);
	}
	
	//Metodo iniciar los componentes del panel
	public void iniciarComponentes() {
		
		//this.calculoInteres();
		//this.calculadora();
		this.repaint();
	}
	
	//Graficos
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//Fondo
		g2d.setColor(Color.decode("#2CE7E4"));
		g2d.fillRect(0, 0, 1920, 720);
		
		//Pilar azul
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(350, 275, 200, 300, 10, 10);
		g2d.setColor(Color.decode("#82D0E1"));
		g2d.fillRect(351, 278, 197, 295);
		
		//Ovalos en pilar azul
		g2d.setColor(Color.black);
		g2d.fillOval(360, 285, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(363, 287, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(500, 285, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(503, 287, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(500, 530, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(503, 532, 25, 25);
		
		//Sombran del pilar azul
		g2d.setColor(Color.black);
		g2d.fillRect(551, 330, 30, 250);
		
		//Pilar rosa
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(200, 375, 200, 200, 10, 10);
		g2d.setColor(Color.decode("#FFA07A"));
		g2d.fillRect(203, 377, 195, 197);
		
		//Ovalos en pilar rosa
		g2d.setColor(Color.black);
		g2d.fillOval(210, 385, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(213, 387, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(355, 385, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(357, 387, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(210, 535, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(213, 537, 25, 25);
	
		g2d.setColor(Color.black);
		g2d.fillOval(355, 535, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(357, 537, 25, 25);
		//Sombra del pilar rosa
		g2d.setColor(Color.black);
		g2d.fillRect(400, 390, 30, 230);
		
		//Bloque flotando 1
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(100, 100, 80, 80, 10, 10);
		g2d.setColor(Color.decode("#E6AF68"));
		g2d.fillRect(103, 103, 75, 75);
		
		//Ovalos en bloques flotantes
		g2d.setColor(Color.black);
		  for (int y = 110; y <= 180; y += 55) {
	            for (int x = 110; x <= 200; x +=55) {
	                g2d.fillOval(x, y, 5, 5); 
	            }
	        }
				
		//Bloque flotando 2
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(180, 100, 80, 80, 10, 10);
		g2d.setColor(Color.decode("#E6AF68"));
		g2d.fillRect(183, 103, 75, 75);
		
		//Ovalos en bloques flotantes
		g2d.setColor(Color.black);
		  for (int y = 110; y <= 180; y += 55) {
	            for (int x = 191; x <= 300; x +=55) {
	                g2d.fillOval(x, y, 5, 5); 
	            }
	        }
				
		//Bloque flotando 3
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(50, 270, 80, 80, 10, 10);
		g2d.setColor(Color.decode("#E6AF68"));
		g2d.fillRect(53, 273, 75, 75);
		
		//Ovalos en bloques flotantes
		g2d.setColor(Color.black);
		  for (int y = 280; y <= 360; y += 55) {
	            for (int x = 60; x <= 150; x +=55) {
	                g2d.fillOval(x, y, 5, 5); 
	            }
	        }
		
		//Pilar verde de la derecha
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(1350, 375, 200, 200, 10, 10);
		g2d.setColor(Color.decode("#68CA1B"));
		g2d.fillRect(1353, 377, 195, 197);
		
		//Ovalos en pilar verde
		g2d.setColor(Color.black);
		g2d.fillOval(1360, 385, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(1363, 387, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(1360, 530, 30, 30);
		g2d.setColor(Color.gray);
		g2d.fillOval(1363, 533, 25, 25);
		//Bloque flotando sobre pilar verde
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(1350, 200, 80, 80, 10, 10);
		g2d.setColor(Color.decode("#E6AF68"));
		g2d.fillRect(1353, 203, 75, 75);
		
		//Ovalos en bloques flotantes
		g2d.setColor(Color.black);
		  for (int y = 210; y <= 290; y += 55) {
	            for (int x = 1360; x <= 1430; x +=55) {
	                g2d.fillOval(x, y, 5, 5); 
	            }
	        }
		
		//Primera parte del tubo
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(820, 375, 180, 60, 10, 10);
		g2d.setColor(Color.decode("#5CB213"));
		g2d.fillRect(823, 378, 30, 55);
		g2d.setColor(Color.decode("#356A0A"));
		g2d.fillRect(938, 378, 60, 55);
		g2d.setColor(Color.decode("#4A8915"));
		g2d.fillRect(900, 378, 40, 55);
		g2d.setColor(Color.decode("#539F17"));
		g2d.fillRect(850, 378, 50, 55);
		
		//Segunda parte del tubo
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(835, 435, 150, 150, 10, 10);
		g2d.setColor(Color.decode("#5CB213"));
		g2d.fillRect(838, 437, 15, 150);
		g2d.setColor(Color.decode("#539F17"));
		g2d.fillRect(850, 437, 50, 150);
		g2d.setColor(Color.decode("#4A8915"));
		g2d.fillRect(900, 437, 40, 150);
		g2d.setColor(Color.decode("#356A0A"));
		g2d.fillRect(940, 437, 43, 150);
		
		//Suelo beige
		g2d.setColor(Color.decode("#ffc9bd"));
		g2d.fillRect(0, 570, 1520, 20);
				
		//Suelo cafe
		g2d.setColor(Color.decode("#ff9766"));
		g2d.fillRect(0, 590, 1520, 130);
		
		//Imagen mario
		try {
			BufferedImage Image = ImageIO.read(new File("src/MaritoBrosito.png"));
			
			g2d.drawImage(Image, 650, 450, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Imagen planta
		try {
			BufferedImage Image = ImageIO.read(new File("src/Plantilla.png"));
			
			g2d.drawImage(Image, 850, 280, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void calculadora() {
		this.setSize(500,650);

		//Panel
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.decode("#E16080"));
		panel.setLayout( new BorderLayout() );

		//Display
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font ("calibri",Font.BOLD,30));
		panel.add(text, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setBackground(Color.decode("#E16DD8"));
		center.setLayout(new GridLayout(4,3,5,5));//(Filas,columnas,separacion,separacion)
		panel.add(center, BorderLayout.CENTER);

		String buttons [] = {"7","8","9","6","5","4","3","2","1","0",".","/"};
		for(int i = 0; i < 12; i++) {
			JButton button = new JButton(buttons[i]);;
			center.add(button);
		}

		JPanel east = new JPanel();
		east.setBackground(Color.decode("#D9976A"));
		east.setLayout(new GridLayout(3,1,2,2));
		panel.add(east, BorderLayout.EAST);

		String buttons2 [] = {"+","-","="};
		for(int i = 0; i < 3; i++) {
			JButton button = new JButton(buttons2[i]);
			east.add(button);
		}

		JPanel west = new JPanel();
		west.setBackground(Color.DARK_GRAY);
		west.setLayout( new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);

		String buttons3 [] = {"MC","M+","*"};
		for(int i = 0; i < 3; i++) {
			JButton button = new JButton(buttons3[i]);
			west.add(button);
		}
		this.add(panel);
	}
	
	public void calculoInteres() {
		
		//Panel del fondo del frame
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setSize(this.getWidth(),this.getHeight());
		pnlPrincipal.setBackground(Color.white);
		pnlPrincipal.setLayout( new BorderLayout());
		
		//Panel donde se ingresan los datos
		JLabel pnlDatos = new JLabel();
		pnlDatos.setOpaque(true);
		pnlDatos.setPreferredSize(new Dimension(200,300));
		pnlDatos.setBackground(Color.GREEN);
		pnlDatos.setFont(new Font ("calibri",Font.BOLD,30));
		pnlDatos.setBorder(BorderFactory.createLineBorder(Color.white,35));
		pnlPrincipal.add(pnlDatos, BorderLayout.CENTER);
		
		
		//Label del titulo
		JLabel lblInteres = new JLabel("Calcular interés: ");
		lblInteres.setBounds(50,25,180,40);
		lblInteres.setFont(new Font ("Arial", Font.BOLD, 15));
		pnlDatos.add(lblInteres);
		
		//Label de la capital
		JLabel lblCapital = new JLabel("Capital: ");
		lblCapital.setBounds(50,80,180,40);
		lblCapital.setFont(new Font ("Agency FB", Font.BOLD, 20));
		lblCapital.setForeground(Color.black);
		pnlDatos.add(lblCapital);
		
		//Texto para ingresar capital
		JTextField txtCapital = new JTextField();
		txtCapital.setBounds(170,90,200,25);
		txtCapital.setOpaque(true);
		txtCapital.setBackground(Color.white);
		pnlDatos.add(txtCapital);
		
		//Label para el tiempo
		JLabel lblTiempo = new JLabel("Tiempo: ");
		lblTiempo.setBounds(50,140,180,40);
		lblTiempo.setFont(new Font ("Agency FB", Font.BOLD, 20));
		lblTiempo.setForeground(Color.black);
		pnlDatos.add(lblTiempo);
		
		//TypeTime Field
		JTextField txtTiempo = new JTextField();
		txtTiempo.setBounds(170,150,200,25);
		txtTiempo.setOpaque(true);
		txtTiempo.setBackground(Color.white);
		pnlDatos.add(txtTiempo);
		
		//Label para la tasa de interes
		JLabel txtTasa = new JLabel("Tasa de interés: ");
		txtTasa.setBounds(50,200,180,40);
		txtTasa.setFont(new Font ("Agency FB", Font.BOLD, 20));
		txtTasa.setForeground(Color.black);
		pnlDatos.add(txtTasa);
		
		//Texto para interes
		JTextField txtInteres = new JTextField();
		txtInteres.setBounds(170,210,200,25);
		txtInteres.setOpaque(true);
		txtInteres.setBackground(Color.white);
		pnlDatos.add(txtInteres);
		
		//Label para el interes
		JLabel interestText = new JLabel("Interés",2);
		interestText.setFont(new Font ("calibri",Font.BOLD,30));
		interestText.setForeground(Color.red);
		pnlPrincipal.add(interestText, BorderLayout.NORTH);
		
		//boton para cancelar
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 300, 150, 40);
		pnlDatos.add(btnCalcular);
		
		//Boton para cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setOpaque(true);
		btnCancelar.setBounds(280, 300, 150, 40);
		pnlDatos.add(btnCancelar);
		
		
		//Panel donde se muestra la informacion
		JLabel pnlResultados = new JLabel();
		pnlResultados.setOpaque(true);
		pnlResultados.setPreferredSize(new Dimension(200,300));
		pnlResultados.setBackground(Color.PINK);
		pnlResultados.setBorder(BorderFactory.createLineBorder(Color.white,35));
		pnlPrincipal.add(pnlResultados, BorderLayout.SOUTH);
				
		//Label del interes 
		JLabel interest = new JLabel("Interés: ");
		interest.setBounds(50,80,180,40);
		interest.setFont(new Font ("Agency FB", Font.BOLD, 20));
		interest.setForeground(Color.black);
		pnlResultados.add(interest);
		
		//Texto ingresar interes 
		JTextField txtInteres2 = new JTextField();
		txtInteres2.setBounds(170,90,200,25);
		txtInteres2.setOpaque(true);
		txtInteres2.setBackground(Color.white);
		pnlResultados.add(txtInteres2);
		
		//Label para el monto
		JLabel lblMonto = new JLabel("Monto: ");
		lblMonto.setBounds(50,140,180,40);
		lblMonto.setFont(new Font ("Agency FB", Font.BOLD, 20));
		lblMonto.setForeground(Color.black);
		pnlResultados.add(lblMonto);
		
		//Texto del monto
		JTextField txtMonto = new JTextField();
		txtMonto.setBounds(170,150,200,25);
		txtMonto.setOpaque(true);
		txtMonto.setBackground(Color.white);
		pnlResultados.add(txtMonto);
		
		this.add(pnlPrincipal);
	}
}
