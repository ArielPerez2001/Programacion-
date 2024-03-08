package Window;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
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

		this.setSize(900,750);
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
		g2d.setColor(Color.decode("#0665C0"));
		g2d.fillRect(0, 0, 1920, 720);
		
		 //Nube
		g2d.setColor(Color.white.darker());
	    g2d.fillRoundRect(700,308, 170, 40, 120, 120);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(700,300, 170, 40, 120, 120);
	    
	    //Nube
	    g2d.setColor(Color.white.darker());
	    g2d.fillRoundRect(80,558, 300, 40, 120, 120);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(80,550, 300, 40, 120, 120);
	    
	    //Nube
	    g2d.setColor(Color.white.darker());
	    g2d.fillRoundRect(300,513, 250, 40, 120, 120);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(300,505, 250, 40, 120, 120);
	    
	    //Nube
	    g2d.setColor(Color.white.darker());
	    g2d.fillRoundRect(330,608, 200, 40, 120, 120);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(330,600, 200, 40, 120, 120);
		
	    //Sombra del primer pilar de fondo
	    g2d.setColor(Color.decode("#C6E3E7").darker());
	    g2d.fillRoundRect(44, 300, 175, 1000,200,200);
	    
		//Primer pilar del fondo    
	    g2d.setColor(Color.decode("#C6E3E7"));
	    g2d.fillRoundRect(20, 300, 175, 1000,200,200);
	    
	    //Ovalos del primer pilar
	    g2d.setColor(Color.white);
	    g2d.fillOval(100, 330, 20, 40);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(100, 430, 20, 40);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(50, 460, 20, 40);
	    
	    //Sombra del segundo pilar del fondo
	    g2d.setColor(Color.decode("#C6E3E7").darker());
	    g2d.fillRoundRect(424, 300, 175, 1000,200,200);
		
		//Segundo pilar del fondo
		g2d.setColor(Color.decode("#C6E3E7"));
	    g2d.fillRoundRect(400, 300, 175, 1000,200,200);
	    
	    //Ovalos del segundo pilar
	    g2d.setColor(Color.white);
	    g2d.fillOval(430, 460, 20, 40);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(430, 350, 20, 40);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(500, 330, 20, 40);
	     
	    //Sombra del pilar de fondo
	    g2d.setColor(Color.decode("#C6E3E7").darker());
	    g2d.fillRoundRect(600, 150, 175, 1000,200,200);
	    
	    //Tercer pilar del fondo
	    g2d.setColor(Color.decode("#C6E3E7"));
	    g2d.fillRoundRect(576, 150, 175, 1000,200,200);
	    
	    //Ovalos del tercer pilar
	    g2d.setColor(Color.white);
	    g2d.fillOval(600, 330, 20, 40);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(670, 220, 20, 40);
	    
	    //Sombra del primer pilar del frente
	    g2d.setColor(Color.decode("#71c2ff").darker().darker());
	    g2d.fillRoundRect(-46, 500, 200, 700,250,200);
	    
	    //Primer pilar del frente
	    g2d.setColor(Color.decode("#71c2ff"));
	    g2d.fillRoundRect(-70, 500, 200, 700,250,200);
	    
	    //Sombra del segundo pilar del frente
	    g2d.setColor(Color.decode("#71c2ff").darker().darker());
	    g2d.fillRoundRect(424, 500, 200, 700,200,200);
	    
	    //Segundo pilar del frente  
	    g2d.setColor(Color.decode("#71c2ff"));
	    g2d.fillRoundRect(400, 500, 200, 700,200,200);
	    
	    //Primer tubo
        g2d.setColor(Color.black);
        g2d.fillRoundRect(497, 500, 80, 150,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(500, 500, 75, 150,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(492, 500, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(494, 500, 85, 25,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(897, 500, 80, 150,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(900, 500, 75, 150,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(892, 500, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(894, 500, 85, 25,10,10);
        
        
        
        //Segundo tubo
        g2d.setColor(Color.black);
        g2d.fillRoundRect(820, 603, 80, 145,10,10);
        g2d.setPaint(new GradientPaint(800, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(820, 605, 75, 140,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(820, 575, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(800, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(820, 577, 85, 25,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(820, 693, 80, 145,10,10);
        g2d.setPaint(new GradientPaint(800, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(820, 695, 75, 140,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(820, 665, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(800, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(820, 667, 85, 25,10,10);
        
	    //Nube
	    g2d.setColor(Color.white.darker());
        g2d.fillRoundRect(500,458, 170, 40, 120, 120);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(500,450, 170, 40, 120, 120);
	    
	    //Sombra del terce pilar del frente
	    g2d.setColor(Color.decode("#71c2ff").darker().darker());
	    g2d.fillRoundRect(644, 350, 200, 700,200,200);
	    
	    //Tercer pilar del frente   
	    g2d.setColor(Color.decode("#71c2ff"));
	    g2d.fillRoundRect(620, 350, 200, 700,200,200);
	    
	    //Ovalos del pilar 
	    g2d.setColor(Color.white);
	    g2d.fillOval(630, 400, 30, 50);
	    
	    g2d.setColor(Color.white);
	    g2d.fillOval(700, 550, 20, 40);
	       
		//Bloque1
	    g2d.setColor(Color.gray.brighter());
		g2d.fillRect(751, 451, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(750, 450, 50, 50, 10, 10);
		
		//Bloque2
		g2d.setColor(Color.gray.brighter());
		g2d.fillRect(751, 501, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(750, 500, 50, 50, 10, 10);
		
		//Bloque3
		g2d.setColor(Color.gray.brighter());
		g2d.fillRect(751, 551, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(750, 550, 50, 50, 10, 10);
		
		//Bloque4
		g2d.setColor(Color.gray.brighter());
		g2d.fillRect(751, 601, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(750, 600, 50, 50, 10, 10);
		
		//Bloque con ojos1
		g2d.setColor(Color.yellow);
		g2d.fillRect(801, 451, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(800, 450, 50, 50, 10, 10);
		
		g2d.setBackground(Color.black);
		g2d.fillRect(815, 460, 5, 12);
		
		g2d.setBackground(Color.black);
		g2d.fillRect(830, 460, 5, 12);
		
		//Bloque amarillo
		g2d.setColor(Color.yellow);
		g2d.fillRect(851, 451, 48, 48);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(850, 450, 50, 50, 10, 10);
		
	
		// Nubes
		g2d.setColor(Color.white.darker());
		g2d.fillRoundRect(-80, 385, 200, 40, 100, 100);
        g2d.setColor(Color.white);
        g2d.fillRoundRect(-80, 380, 200, 40, 100, 100);
        
        g2d.setColor(Color.white.darker());
        g2d.fillRoundRect(190, 408, 280, 50, 100, 100);
        g2d.setColor(Color.white);
        g2d.fillRoundRect(190, 400, 280, 50, 100, 100);
        
        g2d.setColor(Color.white.darker());
        g2d.fillRoundRect(750, 258, 170, 40, 120, 120);
        g2d.setColor(Color.white);
        g2d.fillRoundRect(750, 250, 170, 40, 120, 120);

		//Suelo verde
		g2d.setColor(Color.green.darker());
		g2d.fillRect(0, 650, 1520, 20);
				
		//Suelo cafe
		g2d.setColor(Color.decode("#BB9866"));
		g2d.fillRect(0, 670, 1520, 130);
		
		//Imagen mario
		try {
			BufferedImage Image = ImageIO.read(new File("src/MaritoBrosito.png"));
			
			g2d.drawImage(Image, 300, 550, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Imagen planta
		try {
			BufferedImage Image = ImageIO.read(new File("src/Plantilla.png"));
			
			g2d.drawImage(Image, 490, 400, null);
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
