import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		this.setSize(600,750);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(200,200);
				
		this.setResizable(false);
		
		this.setTitle("Calculadora");
		
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(1000,750));
		
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
		this.setLayout(null);//Conserva los tamaños asignados
		
		this.setVisible(true);
	}
	
	public void iniciarComponentes() {
		
		this.botones();
		this.repaint();
	}
	
	public void botones() {
		
		JPanel calcPanel = new JPanel();
		calcPanel.setSize(this.getWidth(),this.getHeight());	
		calcPanel.setLocation(0, 0);		
		calcPanel.setOpaque(true);		
		calcPanel.setBackground(Color.black);		
		calcPanel.setLayout(null);
		
		//Display
		Color color = Color.white;
		JLabel display = new JLabel("0.",4);		
		display.setSize(500, 60);		
		display.setFont(new Font ("Arial",Font.BOLD,50));		
		display.setForeground(color.brighter().brighter());		
		display.setLocation(45, 35);		
		display.setOpaque(true);//Fondo a la etiqueta		
		display.setBackground(Color.green.darker().darker().darker());		
		calcPanel.add(display);
		
		//C button
		JButton acButton = new JButton("C");		
		acButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		acButton.setForeground(Color.white);	
		acButton.setBounds(45, 120, 100, 80);	
		acButton.setBackground(Color.red);	
		calcPanel.add(acButton);
		
		//percentButton
		JButton percentButton = new JButton("%");		
		percentButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		percentButton.setForeground(Color.white);	
		percentButton.setBounds(180, 120, 100, 80);	
		percentButton.setBackground(Color.ORANGE);	
		calcPanel.add(percentButton);
		
		//timesButton
		JButton timesButton = new JButton("X");		
		timesButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		timesButton.setForeground(Color.white);	
		timesButton.setBounds(315, 120, 100, 80);	
		timesButton.setBackground(Color.ORANGE);	
		calcPanel.add(timesButton);
		
		//divisionButton
		JButton divisionButton = new JButton("/");		
		divisionButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		divisionButton.setForeground(Color.white);	
		divisionButton.setBounds(445, 120, 100, 80);	
		divisionButton.setBackground(Color.ORANGE);	
		calcPanel.add(divisionButton);
		this.add(calcPanel);
		
		//minusButton
		JButton minusButton = new JButton("-");		
		minusButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		minusButton.setForeground(Color.white);	
		minusButton.setBounds(445, 240, 100, 80);	
		minusButton.setBackground(Color.ORANGE);	
		calcPanel.add(minusButton);
		this.add(calcPanel);
		
		//plusButton
		JButton plusButton = new JButton("+");		
		plusButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		plusButton.setForeground(Color.white);	
		plusButton.setBounds(445, 360, 100, 80);	
		plusButton.setBackground(Color.ORANGE);	
		calcPanel.add(plusButton);
		
		//resultButton
		JButton resultButton = new JButton("=");		
		resultButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		resultButton.setForeground(Color.white);	
		resultButton.setBounds(445, 480, 100, 200);	
		resultButton.setBackground(Color.ORANGE);	
		calcPanel.add(resultButton);
		
		//sevenButton
		JButton sevenButton = new JButton("7");		
		sevenButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		sevenButton.setForeground(Color.white);	
		sevenButton.setBounds(45, 240, 100, 80);	
		sevenButton.setBackground(Color.gray);	
		calcPanel.add(sevenButton);
		
		//eightButton
		JButton eightButton = new JButton("8");		
		eightButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		eightButton.setForeground(Color.white);	
		eightButton.setBounds(180, 240, 100, 80);	
		eightButton.setBackground(Color.gray);	
		calcPanel.add(eightButton);
		
		//nineButton
		JButton nineButton = new JButton("9");		
		nineButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		nineButton.setForeground(Color.white);	
		nineButton.setBounds(315, 240, 100, 80);	
		nineButton.setBackground(Color.gray);	
		calcPanel.add(nineButton);
		
		//fourButton
		JButton fourButton = new JButton("4");		
		fourButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		fourButton.setForeground(Color.white);	
		fourButton.setBounds(45, 360, 100, 80);	
		fourButton.setBackground(Color.gray);	
		calcPanel.add(fourButton);
				
		//fiveButton
		JButton fiveButton = new JButton("5");		
		fiveButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		fiveButton.setForeground(Color.white);	
		fiveButton.setBounds(180, 360, 100, 80);	
		fiveButton.setBackground(Color.gray);	
		calcPanel.add(fiveButton);
				
		//sixButton
		JButton sixButton = new JButton("6");		
		sixButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		sixButton.setForeground(Color.white);	
		sixButton.setBounds(315, 360, 100, 80);	
		sixButton.setBackground(Color.gray);	
		calcPanel.add(sixButton);
		
		//threeButton
		JButton threeButton = new JButton("3");		
		threeButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		threeButton.setForeground(Color.white);	
		threeButton.setBounds(45, 480, 100, 80);	
		threeButton.setBackground(Color.gray);	
		calcPanel.add(threeButton);
						
		//twoButton
		JButton twoButton = new JButton("2");		
		twoButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		twoButton.setForeground(Color.white);	
		twoButton.setBounds(180, 480, 100, 80);	
		twoButton.setBackground(Color.gray);	
		calcPanel.add(twoButton);
						
		//oneButton
		JButton oneButton = new JButton("1");		
		oneButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		oneButton.setForeground(Color.white);	
		oneButton.setBounds(315, 480, 100, 80);	
		oneButton.setBackground(Color.gray);	
		calcPanel.add(oneButton);
		
		//ceroButton
		JButton ceroButton = new JButton("0");		
		ceroButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		ceroButton.setForeground(Color.white);	
		ceroButton.setBounds(45, 600, 235, 80);	
		ceroButton.setBackground(Color.gray);	
		calcPanel.add(ceroButton);
		
		//comaButton
		JButton comaButton = new JButton(",");		
		comaButton.setFont(new Font("Agency FB",Font.BOLD,40));		
		comaButton.setForeground(Color.white);	
		comaButton.setBounds(315, 600, 100, 80);	
		comaButton.setBackground(Color.gray);	
		calcPanel.add(comaButton);
	}
}
