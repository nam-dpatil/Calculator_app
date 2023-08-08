package com.jspider.Calculator.module1;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Calculator implements ActionListener{
	double num1=0, num2=0, result=0;
	int calculation=0;
	JFrame frame=new JFrame("Calculator");
	JLabel label=new JLabel();
	JTextField textField = new JTextField();
	JRadioButton onRadioButton =new JRadioButton("on");
	JRadioButton offRadioButton =new JRadioButton("off");
	JButton bottonZero =new JButton("0");
	JButton bottonOne =new JButton("1");
	JButton bottonTwo =new JButton("2");
	JButton bottonThree =new JButton("3");
	JButton bottonFour =new JButton("4");
	JButton bottonFive =new JButton("5");
	JButton bottonSix =new JButton("6");
	JButton bottonSeven =new JButton("7");
	JButton bottonEight =new JButton("8");
	JButton bottonNine =new JButton("9");
	JButton bottonDot =new JButton(".");
	JButton bottonClear =new JButton("C");
	JButton bottonDelete =new JButton("DEL");
	JButton bottonEqual =new JButton("=");
	JButton bottonMul =new JButton("*");
	JButton bottonDiv =new JButton("/");
	JButton bottonPlus =new JButton("+");
	JButton bottonMinus =new JButton("-");
	JButton bottonSquare =new JButton("x\u00B2");
	JButton bottonReciprocal =new JButton("1/x");
	JButton bottonSqrt =new JButton("\u221A");
	
	public void addComponents()
	{
	 	label.setBounds(250, 0, 50, 50);
	 	label.setForeground(Color.white);
	 	frame.add(label);
	 	
	 	textField.setBounds(10,40,270,40);
	 	textField.setFont(new Font("Arial",Font.BOLD,20));
	 	textField.setEditable(false);
	 	textField.setHorizontalAlignment(SwingConstants.RIGHT);
	 	frame.add(textField);
	 	
	 	
	 	onRadioButton.setBounds(10, 95, 60, 40);
	 	onRadioButton.setSelected(true);
	 	onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
	 	onRadioButton.setBackground(Color.black);
	 	onRadioButton.setForeground(Color.white);
	 	onRadioButton.setFocusable(false);
	 	frame.add(onRadioButton);
	 	
	 	offRadioButton.setBounds(10, 120, 60, 40);
	 	offRadioButton.setSelected(false);
	 	offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
	 	offRadioButton.setBackground(Color.black);
	 	offRadioButton.setForeground(Color.white);
	 	offRadioButton.setFocusable(false);
	 	frame.add(offRadioButton);
	 	
	 	ButtonGroup buttonGroup = new ButtonGroup();
	 	buttonGroup.add(onRadioButton);
	 	buttonGroup.add(offRadioButton);
	 	
	 	bottonSeven.setBounds(10, 230, 60, 40);
	 	bottonSeven.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonSeven.setFocusable(false);
	 	frame.add(bottonSeven);
	 	
	 	bottonEight.setBounds(80, 230, 60, 40);
	 	bottonEight.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonEight.setFocusable(false);
	 	frame.add(bottonEight);	 
	 	
	 	bottonNine.setBounds(150, 230, 60, 40);
	 	bottonNine.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonNine.setFocusable(false);
	 	frame.add(bottonNine);
	 	
	 	
	 	
	 	bottonFour.setBounds(10, 290, 60, 40);
	 	bottonFour.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonFour.setFocusable(false);
	 	frame.add(bottonFour);
	 	
	 	bottonFive.setBounds(80, 290, 60, 40);
	 	bottonFive.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonFive.setFocusable(false);
	 	frame.add(bottonFive);
	 	
	 	bottonSix.setBounds(150, 290, 60, 40);
	 	bottonSix.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonSix.setFocusable(false);
	 	frame.add(bottonSix);
	 	
	 	
	 	
	 	bottonOne.setBounds(10, 350, 60, 40);
	 	bottonOne.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonOne.setFocusable(false);
	 	frame.add(bottonOne);
	 	
	 	bottonTwo.setBounds(80, 350, 60, 40);
	 	bottonTwo.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonTwo.setFocusable(false);
	 	frame.add(bottonTwo);
	 	
	 	bottonThree.setBounds(150, 350, 60, 40);
	 	bottonThree.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonThree.setFocusable(false);
	 	frame.add(bottonThree);
	 	
	 	
	 	
	 	bottonDot.setBounds(150, 410, 60, 40);
	 	bottonDot.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonDot.setFocusable(false);
	 	frame.add(bottonDot);
	 	
	 	bottonZero.setBounds(10, 410,130, 40);
	 	bottonZero.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonZero.setFocusable(false);
	 	frame.add(bottonZero);
	 	
	 	bottonEqual.setBounds(220, 350, 60, 100);
	 	bottonEqual.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonEqual.setBackground(Color.yellow);
	 	bottonEqual.setFocusable(false);
	 	frame.add(bottonEqual);
	 	
	 	bottonDiv.setBounds(220, 110, 60, 40);
	 	bottonDiv.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonDiv.setFocusable(false);
	 	bottonDiv.setBackground(Color.YELLOW);
	 	frame.add(bottonDiv);
	 	
	 	bottonSqrt.setBounds(10, 170, 60, 40);
	 	bottonSqrt.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonSqrt.setFocusable(false);
	 	frame.add(bottonSqrt);
	 	
	 	bottonMul.setBounds(220, 230, 60, 40);
	 	bottonMul.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonMul.setBackground(Color.YELLOW);
	 	bottonMul.setFocusable(false);
	 	frame.add(bottonMul);
	 	
	 	bottonMinus.setBounds(220, 170, 60, 40);
	 	bottonMinus.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonMinus.setBackground(Color.YELLOW);
	 	bottonMinus.setFocusable(false);
	 	frame.add(bottonMinus);
	 	
	 	bottonPlus.setBounds(220, 290, 60, 40);
	 	bottonPlus.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonPlus.setBackground(Color.YELLOW);
	 	bottonPlus.setFocusable(false);
	 	frame.add(bottonPlus);
	 	
	 	bottonSquare.setBounds(80, 170, 60, 40);
	 	bottonSquare.setFont(new Font("Arial",Font.BOLD,20)); 	
	 	bottonSquare.setFocusable(false);
	 	frame.add(bottonSquare );
	 	
	 	bottonReciprocal.setBounds(150, 170, 60, 40);
	 	bottonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
	 	bottonReciprocal.setFocusable(false);
	 	frame.add(bottonReciprocal);
	 	
	 	bottonDelete.setBounds(150, 110, 60, 40);
	 	bottonDelete.setFont(new Font("Arial",Font.BOLD,12));
	 	bottonDelete.setBackground(Color.red);
	 	bottonDelete.setForeground(Color.white);
	 	bottonDelete.setFocusable(false); 
	 	frame.add(bottonDelete);
	 	
	 	bottonClear.setBounds(80, 110, 60, 40);
	 	bottonClear.setFont(new Font("Arial",Font.BOLD,20));
	 	bottonClear.setBackground(Color.red);
	 	bottonClear.setForeground(Color.white);
	 	bottonClear.setFocusable(false);
	 	frame.add(bottonClear);
	 	
	 	
	 	
	}
	
	public void addActionEvent()
	{
		onRadioButton.addActionListener(this);
		offRadioButton.addActionListener(this);
		bottonClear.addActionListener(this);
		bottonDelete.addActionListener(this);
		bottonReciprocal.addActionListener(this);
		bottonSquare.addActionListener(this);
		bottonSqrt.addActionListener(this);
		bottonPlus.addActionListener(this);
		bottonMinus.addActionListener(this);
		bottonMul.addActionListener(this);
		bottonDiv.addActionListener(this);
		bottonEqual.addActionListener(this);
		bottonDot.addActionListener(this);
		bottonOne.addActionListener(this);
		bottonTwo.addActionListener(this);
		bottonThree.addActionListener(this);
		bottonFour.addActionListener(this);
		bottonFive.addActionListener(this);
		bottonSix.addActionListener(this);
		bottonSeven.addActionListener(this);
		bottonEight.addActionListener(this);
		bottonNine.addActionListener(this);
		bottonZero.addActionListener(this);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		
		if(source==onRadioButton)
		{
			enable();
		}
		else if(source==offRadioButton)
		{
			disable();
		}
		else if(source==bottonClear)
		{
			label.setText("");
			textField.setText("");
		}
		
		else if(source==bottonDelete)
		{
			int length= textField.getText().length();
			int number=length-1;
			if(length>0)
			{
				StringBuilder back=new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				textField.setText(back.toString());
			}
			if(textField.getText().endsWith(""));
			
				label.setText("");
			

			
		}
		else if(source==bottonZero)
		{
			if(textField.getText().equals("0"))
			{
				return;
			}
			else
			{
				textField.setText(textField.getText()+"0");
			}
		}
		
		
		else if(source==bottonOne)
		{
			textField.setText(textField.getText()+"1");
		}
		else if(source==bottonTwo)
		{
			textField.setText(textField.getText()+"2");
		}
		else if(source==bottonThree)
		{
			textField.setText(textField.getText()+"3");
		}
		else if(source==bottonFour)
		{
			textField.setText(textField.getText()+"4");
		}
		else if(source==bottonFive)
		{
			textField.setText(textField.getText()+"5");
		}
		
		else if(source==bottonSix)
		{
			textField.setText(textField.getText()+"6");
		}
		else if(source==bottonSeven)
		{
			textField.setText(textField.getText()+"7");
		}
		else if(source==bottonEight)
		{
			textField.setText(textField.getText()+"8");
		}
		else if(source==bottonNine)
		{
			textField.setText(textField.getText()+"9");
		}
		else if(source==bottonDot)
		{
			if(textField.getText().contains("."))
			{
				return ;
			}
			else
			{
				textField.setText(textField.getText()+".");
			}
		}
		else if(source==bottonPlus)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=1;
			textField.setText("");
			label.setText(str+"+");
			
		}
		else if(source==bottonMinus)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=2;
			textField.setText("");
			label.setText(str+"-");
		}
		
		else if(source==bottonMul)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=3;
			textField.setText("");
			label.setText(str+"X");
		}
		else if(source==bottonDiv)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=4;
			textField.setText("");
			label.setText(str+"/");
		}
		
		
		else if(source==bottonSquare)
		{
			num1=Double.parseDouble(textField.getText());
			double square = Math.pow(num1, 2);
			String string=Double.toString(square);
			if(string.endsWith(".0"))
			{
				textField.setText(string.replace(".0", ""));
			}
			else
			{
				textField.setText(string);
			}
		}
		
		else if(source==bottonSqrt)
		{
			num1=Double.parseDouble(textField.getText());
			double sqrt = Math.sqrt(num1);
			textField.setText(Double.toString(sqrt));
		}
		
		else if(source==bottonReciprocal)
		{
			num1=Double.parseDouble(textField.getText());
			double Reciprocal = 1/num1;
			String string=Double.toString(Reciprocal);
			
			if(string.endsWith(".0"))
			{
				textField.setText(string.replace(".0", ""));
			}
			else
			{
				textField.setText(string);
			}
		}
		
		else if(source==bottonEqual)
		{
			num2=Double.parseDouble(textField.getText());
			switch(calculation)
			{
			case 1:
				result=num1+num2;
				break;
				
			case 2:
				result=num1-num2;
				break;
			
			case 3:
				result=num1*num2;
				break;
				
			case 4:
				result=num1/num2;
				break;
			}
			if(Double.toString(result).endsWith(".0"))
			{
				textField.setText(Double.toString(result).replace(".0", ""));
			}
			else
			{
				textField.setText(Double.toString(result));
			}
			label.setText("");
			num1=result;
		}
		
		
	}
	
	public void enable()
	{
		onRadioButton.setEnabled(false);
		offRadioButton.setEnabled(true);
		textField.setEnabled(true);
		label.setEnabled(true);
		bottonClear.setEnabled(true);
		bottonDelete.setEnabled(true);
		bottonDiv.setEnabled(true);
		bottonSqrt.setEnabled(true);
		bottonSquare.setEnabled(true);
		bottonReciprocal.setEnabled(true);
		bottonMinus.setEnabled(true);
		bottonMul.setEnabled(true);
		bottonPlus.setEnabled(true);
		bottonEqual.setEnabled(true);
		bottonDot.setEnabled(true);
		bottonOne.setEnabled(true);
		bottonTwo.setEnabled(true);
		bottonThree.setEnabled(true);
		bottonFour.setEnabled(true);
		bottonFive.setEnabled(true);
		bottonSix.setEnabled(true);
		bottonSeven.setEnabled(true);
		bottonEight.setEnabled(true);
		bottonNine.setEnabled(true);
		bottonZero.setEnabled(true);

	}
	
	public void disable()
	{
		onRadioButton.setEnabled(true);
		offRadioButton.setEnabled(false);
		textField.setEnabled(false);
		label.setEnabled(false);
		bottonClear.setEnabled(false);
		bottonDelete.setEnabled(false);
		bottonDiv.setEnabled(false);
		bottonSqrt.setEnabled(false);
		bottonSquare.setEnabled(false);
		bottonReciprocal.setEnabled(false);
		bottonMinus.setEnabled(false);
		bottonMul.setEnabled(false);
		bottonPlus.setEnabled(false);
		bottonEqual.setEnabled(false);
		bottonDot.setEnabled(false);
		bottonOne.setEnabled(false);
		bottonTwo.setEnabled(false);
		bottonThree.setEnabled(false);
		bottonFour.setEnabled(false);
		bottonFive.setEnabled(false);
		bottonSix.setEnabled(false);
		bottonSeven.setEnabled(false);
		bottonEight.setEnabled(false);
		bottonNine.setEnabled(false);
		bottonZero.setEnabled(false);
	}
	
	
 	Calculator()
	{
		prpareGui();
		addComponents();
		addActionEvent();
		
	}
	
 	
 	
	public void prpareGui()
	{
		frame.setSize(305, 510);
		frame.getContentPane() .setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator=new Calculator();
		
		
	}




	

}
