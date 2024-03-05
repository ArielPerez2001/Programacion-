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

		this.setSize(920,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setResizable(true);
		this.setTitle("Calculando el interes");
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
		
		//Asignamos un color
		g2d.setColor(Color.blue);
		//Creamos un rectangulo
		g2d.fillRect(50, 50, 200, 100);
		//Se crea una zona "limpia"
		g2d.clearRect(100, 100, 100, 100);
		//Se pinta un arco como en marco
		g2d.fillArc(300, 300, 100, 100, 45, 180);
		//Pintar linea
		g2d.drawLine(0, 0, 500, 500);
		//Pintar un ovalo
		g2d.drawOval(400, 400, 50, 80);
		//Pintar un ovalo relleno
		g2d.fillOval(350, 400, 50, 80);
		
		//Asignamos los puntos en X y Y
		int xPoints[] = {100,250,300};
		int yPoints[] = {100,200,300};
		
		g2d.fillPolygon(xPoints,yPoints,3);
		
		g2d.setStroke(new BasicStroke(10));
		
		g2d.drawRoundRect(400, 600, 200, 100, 10, 10);
		
		try {
			BufferedImage image = ImageIO.read(new File("src/Minimi.png"));
			
			g2d.drawImage(image, 0, 0, null);
			
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
