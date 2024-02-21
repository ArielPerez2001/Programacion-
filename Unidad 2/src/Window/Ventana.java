package Window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
	
		this.setSize(1000,500);
		
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
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		this.add(login);
		
		
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
		
		
	}
	
	
	
}
