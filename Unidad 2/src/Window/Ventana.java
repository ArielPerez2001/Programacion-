package Window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
	
		this.setSize(1000,750);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(200,200);
				
		this.setResizable(true);
		
		this.setTitle("Mi ventana");
		
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(1000,750));
		
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
		this.setLayout(null);//Conserva los tamaños asignados
		
		this.setVisible(true);
	}
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		this.login();
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth(),this.getHeight());
		registro.setBackground(Color.cyan);
		registro.setLayout(null);
		
		JLabel register_tag = new JLabel("Registro",0);
		register_tag.setSize(300, 80);
		register_tag.setFont(new Font ("Arial",Font.BOLD,24));
		register_tag.setForeground(Color.black);
		register_tag.setLocation(600, 20);
		register_tag.setOpaque(true);//Fondo a la etiqueta
		register_tag.setBackground(Color.orange);
		registro.add(register_tag);
		
		//Registro de usuario
		JLabel userName = new JLabel(" Nombre de usuario:");
		userName.setBounds(660,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(userName);
		
		JTextField userField = new JTextField();
		userField.setBounds(650, 159, 180, 40);
		userField.setFont(new Font("Arial",Font.BOLD,20));
		userField.setOpaque(true);
		userField.setBackground(Color.white);
		registro.add(userField);
		
		JLabel bioTag = new JLabel("Biografia",0);
		bioTag.setBounds(540, 209, 400, 40);
		bioTag.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(bioTag);
		
		JTextArea bioText = new JTextArea();
		bioText.setBounds(540, 250, 400, 80);
		bioText.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(bioText);
		
		JLabel pref = new JLabel("Preferencias",0);
		pref.setBounds(540, 330, 400, 40);
		pref.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(pref);
		
		JCheckBox itemBox = new JCheckBox("Papas");
		itemBox.setBounds(530, 360, 90, 40);
		itemBox.setFont(new Font("Arial",Font.BOLD,18));
		itemBox.setOpaque(false);
		itemBox.setBackground(Color.magenta);
		registro.add(itemBox);
		
		JCheckBox itemBox2 = new JCheckBox("Dulces");
		itemBox2.setBounds(690, 360, 100, 40);
		itemBox2.setFont(new Font("Arial",Font.BOLD,18));
		itemBox2.setOpaque(false);
		registro.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Refresco");
		itemBox3.setBounds(850, 360, 130, 40);
		itemBox3.setFont(new Font("Arial",Font.BOLD,18));
		itemBox3.setOpaque(false);
		registro.add(itemBox3);
		
		JLabel termsTag = new JLabel("Terminos",0);
		termsTag.setBounds(690, 410, 100, 40);
		termsTag.setFont(new Font("Arial",Font.BOLD,20));
		termsTag.setOpaque(false);
		termsTag.setBackground(Color.red);
		registro.add(termsTag);
		
		JRadioButton acceptRadio = new JRadioButton("Acepto los terminos");
		acceptRadio.setBounds(530, 450, 220, 40);
		acceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		acceptRadio.setOpaque(false);
		acceptRadio.setBackground(Color.red);
		registro.add(acceptRadio);
		
		JRadioButton noAcceptRadio = new JRadioButton("No acepto los terminos");
		noAcceptRadio.setBounds(780, 450, 220, 40);
		noAcceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		noAcceptRadio.setOpaque(false);
		noAcceptRadio.setBackground(Color.red);
		registro.add(noAcceptRadio);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(acceptRadio);
		terms.add(noAcceptRadio);
		
		String colony[] = {"Centro","Camino real","Ayuntamiento"};
		
		JComboBox locations = new JComboBox(colony);
		locations.setBounds(560, 500, 350, 40);
		locations.setFont(new Font("Arial",Font.BOLD,19));
		registro.add(locations);
		
		JButton registerButton = new JButton("Crear cuenta");
		registerButton.setBounds(650, 620, 200, 40);
		registerButton.setFont(new Font("Arial",Font.BOLD,19));
		registro.add(registerButton);
		this.add(registro);
		
		this.repaint();
	}
	
	//Mover todo el login aqui
	public void login() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		
		//Reglas generales de cada componente
		
		//Size
		//location
		//background
		//string constructor
		
		
		//Componente para agregar string
		JLabel login_tag = new JLabel("Acceder",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font ("Arial",Font.BOLD,24));
		login_tag.setForeground(Color.white);
		login_tag.setLocation(100, 20);
		login_tag.setOpaque(true);//Fondo a la etiqueta
		login_tag.setBackground(Color.red);
		login.add(login_tag);
		
		
		//Titulo
		JLabel userName = new JLabel(" Nombre de usuario:");
		userName.setBounds(170,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(userName);
		
		//Textbox del username
		
		JTextField typeUser = new JTextField();
		typeUser.setBounds(100,170,300,35);
		typeUser.setOpaque(true);
		typeUser.setBackground(Color.white);
		login.add(typeUser);
		
		//Contraseña
		JLabel pwd = new JLabel("Contraseña:");
		pwd.setBounds(200,220,180,40);
		pwd.setFont(new Font("Agency FB",Font.BOLD,25));
		login.add(pwd);
		
		//Campo para la contraseña
		JPasswordField typePwd = new JPasswordField();
		typePwd.setBounds(100,260,300,35);
		typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(typePwd);
		
		//Checkbox 
		JCheckBox remindMe = new JCheckBox("Recordarme");
		remindMe.setBounds(100,320,110,30);
		remindMe.setFont(new Font ("Agency FB", Font.BOLD, 20));
		remindMe.setOpaque(false);
		login.add(remindMe);
		
		//Olvido de contraseña
		JLabel fogotPwd = new JLabel("¿Olvidó su contraseña?");
		fogotPwd.setBounds(260,315,180,40);
		fogotPwd.setFont(new Font ("Agency FB", Font.BOLD, 20));
		login.add(fogotPwd);
		
		//Boton de acceso
		JButton accessButton = new JButton("Acceder");
		accessButton.setBounds(160,370,170,50);
		accessButton.setFont(new Font("Agency FB",Font.BOLD,30));
		login.add(accessButton);
		
		this.add(login);
	}
	
	
	
}
