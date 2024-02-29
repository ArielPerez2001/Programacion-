package Window;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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
		
	
		this.setSize(520,720);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(200,200);
				
		this.setResizable(true);
		
		this.setTitle("Calculando el interes");
		
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(1000,750));
		
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
		this.setLayout(null);//Conserva los tamaños asignados
		
		this.setVisible(true);
	}
	
	//Reglas generales de cada componente
	
			//Size
			//location
			//background
			//string constructor
	
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		//this.login();
		//this.registro();
		
		//this.admin()
		
		//this.calculadora();
		this.interestRate();
;		this.repaint();
	}
	
	public void interestRate() {
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.white);
		panel.setLayout( new BorderLayout());
		
		//GreenPanel
		JLabel greenPanel = new JLabel();
		greenPanel.setOpaque(true);
		greenPanel.setPreferredSize(new Dimension(200,300));
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setFont(new Font ("calibri",Font.BOLD,30));
		greenPanel.setBorder(BorderFactory.createLineBorder(Color.white,35));
		panel.add(greenPanel, BorderLayout.CENTER);
		
		//PinkPanel
		JLabel pinkPanel = new JLabel();
		pinkPanel.setOpaque(true);
		pinkPanel.setPreferredSize(new Dimension(200,300));
		pinkPanel.setBackground(Color.PINK);
		pinkPanel.setBorder(BorderFactory.createLineBorder(Color.white,35));
		panel.add(pinkPanel, BorderLayout.SOUTH);
		
		//CalculateInterest Label
		JLabel calculateInterest = new JLabel("Calcular interés: ");
		calculateInterest.setBounds(50,25,180,40);
		calculateInterest.setFont(new Font ("Arial", Font.BOLD, 15));
		greenPanel.add(calculateInterest);
		
		//Capital Label
		JLabel capital = new JLabel("Capital: ");
		capital.setBounds(50,80,180,40);
		capital.setFont(new Font ("Agency FB", Font.BOLD, 20));
		capital.setForeground(Color.black);
		greenPanel.add(capital);
		
		//TypeCapital Field
		JTextField typeCapital = new JTextField();
		typeCapital.setBounds(170,90,200,25);
		typeCapital.setOpaque(true);
		typeCapital.setBackground(Color.white);
		greenPanel.add(typeCapital);
		
		//Time Field
		JLabel time = new JLabel("Tiempo: ");
		time.setBounds(50,140,180,40);
		time.setFont(new Font ("Agency FB", Font.BOLD, 20));
		time.setForeground(Color.black);
		greenPanel.add(time);
		
		//TypeTime Field
		JTextField typeTime = new JTextField();
		typeTime.setBounds(170,150,200,25);
		typeTime.setOpaque(true);
		typeTime.setBackground(Color.white);
		greenPanel.add(typeTime);
		
		//InterestRate Label
		JLabel interestRate = new JLabel("Tasa de interés: ");
		interestRate.setBounds(50,200,180,40);
		interestRate.setFont(new Font ("Agency FB", Font.BOLD, 20));
		interestRate.setForeground(Color.black);
		greenPanel.add(interestRate);
		
		//TypeInterest Field
		JTextField typeInterest = new JTextField();
		typeInterest.setBounds(170,210,200,25);
		typeInterest.setOpaque(true);
		typeInterest.setBackground(Color.white);
		greenPanel.add(typeInterest);
		
		//InterestText Label
		JLabel interestText = new JLabel("Interés",2);
		interestText.setFont(new Font ("calibri",Font.BOLD,30));
		interestText.setForeground(Color.red);
		panel.add(interestText, BorderLayout.NORTH);
		
		//Calculate Button
		JButton calculate = new JButton("Calcular");
		calculate.setBounds(100, 300, 150, 40);
		greenPanel.add(calculate);
		
		//Cancell Button
		JButton cancell = new JButton("Cancelar");
		cancell.setOpaque(true);
		cancell.setBounds(280, 300, 150, 40);
		greenPanel.add(cancell);
		
		//Interest Label
		JLabel interest = new JLabel("Interés: ");
		interest.setBounds(50,80,180,40);
		interest.setFont(new Font ("Agency FB", Font.BOLD, 20));
		interest.setForeground(Color.black);
		pinkPanel.add(interest);
		
		//TypeInterest2 Field
		JTextField typeInterest2 = new JTextField();
		typeInterest2.setBounds(170,90,200,25);
		typeInterest2.setOpaque(true);
		typeInterest2.setBackground(Color.white);
		pinkPanel.add(typeInterest2);
		
		//Amount Label
		JLabel Monto = new JLabel("Monto: ");
		Monto.setBounds(50,140,180,40);
		Monto.setFont(new Font ("Agency FB", Font.BOLD, 20));
		Monto.setForeground(Color.black);
		pinkPanel.add(Monto);
		
		//TypeAmount Field
		JTextField typeAmount = new JTextField();
		typeAmount.setBounds(170,150,200,25);
		typeAmount.setOpaque(true);
		typeAmount.setBackground(Color.white);
		pinkPanel.add(typeAmount);
		
		this.add(panel);
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
	
	public void admin() {
		
		//Añadir un panel
		JPanel adminPanel = new JPanel();
		adminPanel.setSize(this.getWidth(),this.getHeight());
		adminPanel.setLocation(0, 0);
		adminPanel.setOpaque(true);
		adminPanel.setBackground(Color.cyan);
		adminPanel.setLayout(null);
		
		//Añadir una barra
		JMenuBar menuBar = new JMenuBar();
		
		//Añadir una opcion
		JMenu menuFile = new JMenu("Archivo");
		
		//Añadir un item
		JMenuItem openItem = new JMenuItem("Abrir archivo...");
		JMenuItem createItem = new JMenuItem("Crear archivo...");
		
		menuBar.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(createItem);
		
		//Usuarios
		JLabel userTag = new JLabel("Usuarios",0);
		userTag.setSize(300, 80);
		userTag.setFont(new Font ("Arial",Font.BOLD,24));
		userTag.setForeground(Color.white);
		userTag.setLocation(345, 20);
		userTag.setOpaque(true);//Fondo a la etiqueta
		userTag.setBackground(Color.black);
		adminPanel.add(userTag);
		
		//Titulo total de usuarios
		JLabel tittleWidget = new JLabel("Total de usuarios",0);
		tittleWidget.setFont(new Font ("Arial",Font.BOLD,24));
		tittleWidget.setBounds(40, 120, 300, 40);
		tittleWidget.setForeground(Color.white);
		adminPanel.add(tittleWidget);
		
		//Cantidad de usuarios
		JLabel contentWidget = new JLabel("100",0);
		contentWidget.setFont(new Font ("Arial",Font.BOLD,22));
		contentWidget.setBounds(40, 160, 300, 40);
		contentWidget.setForeground(Color.white);
		adminPanel.add(contentWidget);
		
		//Background del total de usuarios
		JLabel widget = new JLabel("");
		widget.setBounds(40, 120, 300, 100);
		widget.setOpaque(true);
		widget.setBackground(Color.BLACK);
		adminPanel.add(widget);
		
		//Botones
		JButton download = new JButton("Exportar");
		download.setBounds(730, 230, 100, 40);
		adminPanel.add(download);
		
		JButton addUser = new JButton("Añadir");
		addUser.setBounds(840, 230, 100, 40);
		adminPanel.add(addUser);
		
		//Tabla
		/*JLabel table = new JLabel();
		table.setBounds(40, 300, 900, 300);
		table.setOpaque(true);
		table.setBackground(Color.BLACK);
		adminPanel.add(table);
		/*/
		
		String tableTittles[] = {"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"};
		
		String tableData[][]= {
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control", "Nombre","Apellidos","Semestre","Promedio","Acciones"}
		};
		
		JTable tableUsers = new JTable(tableData,tableTittles);
		//tableUsers.setBounds(40, 400, 920, 40);
		JScrollPane tableScroll = new JScrollPane(tableUsers);
		tableScroll.setBounds(40, 300, 900, 100);
		adminPanel.add(tableScroll);
		
		this.setJMenuBar(menuBar);
		this.add(adminPanel);
	}
	
	//Metodo del registro
	public void registro() {
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
	}
	
	//Mover todo el login aqui
	public void login() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.decode("#30508f"));
		login.setLayout(null);
		
		//User Login
		JLabel login_tag = new JLabel("User Login",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
		login_tag.setForeground(Color.white);
		login_tag.setLocation(105, 12);
		login.add(login_tag);
		
		//MyAccount
		JLabel myAccount = new JLabel("My Account",0);
		myAccount.setBounds(150,120,220,40);
		myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
		myAccount.setForeground(Color.decode("#D9C943"));
		login.add(myAccount);
		
		//Titulo
		JLabel userName = new JLabel("Enter Your Username");
		userName.setBounds(100,170,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
		userName.setForeground(Color.white);
		login.add(userName);
		
		//Textbox del username
		
		JTextField typeUser = new JTextField();
		typeUser.setBounds(100,210,300,35);
		typeUser.setOpaque(true);
		typeUser.setBackground(Color.white);
		login.add(typeUser);
	
		//Icono persona
		JLabel person = new JLabel();
		person.setIcon(new ImageIcon(getClass().getResource("persona.png")));
		person.setBounds(60, 218, 20, 20);
		login.add(person);
		
		//personFrame
		JLabel iconFrame = new JLabel();
		iconFrame.setBounds(55,212,30,30);
		iconFrame.setOpaque(true);
		iconFrame.setBackground(Color.decode("#D9C943"));
		login.add(iconFrame);
		
		//Contraseña
		JLabel pwd = new JLabel("Enter Your Password:");
		pwd.setBounds(100,260,180,40);
		pwd.setFont(new Font("Agency FB",Font.BOLD,20));
		pwd.setForeground(Color.white);
		login.add(pwd);
		
		//Campo para la contraseña
		JPasswordField typePwd = new JPasswordField();
		typePwd.setBounds(100,300,300,35);
		typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(typePwd);
		
		//Locker icon
		JLabel locker = new JLabel();
		locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		locker.setBounds(60, 305, 20, 20);
		login.add(locker);
		
		//lockerFrame
		JLabel lockerFrame = new JLabel();
		lockerFrame.setBounds(55,300,30,30);
		lockerFrame.setOpaque(true);
		lockerFrame.setBackground(Color.decode("#D9C943"));
		login.add(lockerFrame);
		
		//Boton de acceso
		JButton accessButton = new JButton("Login");
		accessButton.setBounds(160,370,170,50);
		accessButton.setBackground(Color.decode("#D9C943"));
		accessButton.setFont(new Font("Segoe UI Black",Font.BOLD,25));
		login.add(accessButton);
		
		
		//Don´t have an account?
		JLabel questionAcc = new JLabel("Don´t have an account?",0);
		questionAcc.setBounds(155,450,180,40);
		questionAcc.setFont(new Font("Agency FB",Font.BOLD,20));
		questionAcc.setForeground(Color.white);
		login.add(questionAcc);
		
		//Sign Up
		JButton signUp = new JButton("Sign Up");
		signUp.setBounds(165,495,160,40);
		signUp.setBackground(Color.decode("#D9C943"));
		signUp.setFont(new Font("Segoe UI Black",Font.BOLD,20));
		login.add(signUp);
		
		//Recuadro
		JLabel frame = new JLabel();
		frame.setSize(450,350 );
		frame.setOpaque(true);
		frame.setBackground(Color.decode("#22396c"));
		frame.setLocation(25,100);
		login.add(frame);
		
		this.add(login);
	}
	
	
	
}
