package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CalcGUI
{
	public static void main(String args[])
	{
		GUI obj = new GUI();
	}
}
class GUI extends JFrame implements ActionListener
{
	JTextField t1;
	JLabel li,lt,lp,ll,l,lti;
	JButton b;
	JRadioButton b1,b2,b3,b4,b5,b6,b_1,b_2,b_3,b_4,b_5,b_6,b7,b8,b9,b10,b11,b12;
	JPanel panel=new JPanel();
	public GUI()
	{
		t1 =new JTextField(20);
		
		li=new JLabel("This calculator is to string expression");
		lt=new JLabel("Trigonometric calculations :");
		lti=new JLabel("Inverse Trigonometric calculations:"); 
		lp=new JLabel("Root calculations:");
		ll=new JLabel("Logarithmic calculations:");
		l= new JLabel("Result will be displayed here");
		
		
		b= new JButton("COMPUTE ");
		
		b1=new JRadioButton("sin");
		b2=new JRadioButton("cos");
		b3=new JRadioButton("tan");
		b4=new JRadioButton("cosec");
		b5=new JRadioButton("sec");
		b6=new JRadioButton("cot");
		
		b_1=new JRadioButton("sin -1");
		b_2=new JRadioButton("cos -1");
		b_3=new JRadioButton("tan -1");
		b_4=new JRadioButton("cosec -1");
		b_5=new JRadioButton("sec -1");
		b_6=new JRadioButton("cot -1");
		
		b7=new JRadioButton("Square root");
		b8=new JRadioButton("Square");
		b9=new JRadioButton("Cube root");
		b10=new JRadioButton("Cube");
		
		b11=new JRadioButton("log");
		b12=new JRadioButton("ln");
		
		JPanel introp=new JPanel();
		introp.setLayout(new FlowLayout(FlowLayout.CENTER,90,5));
		this.add(introp);
		
		JPanel panel=new JPanel(new GridLayout());
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		this.add(panel,BorderLayout.CENTER);
		panel.setBackground(Color.GRAY);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		this.add(p);
		
		JPanel p_0 = new JPanel();
		p_0.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		this.add(p_0);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		this.add(p1);
		
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		this.add(p2);
		
		JPanel pn = new JPanel();
		pn.setLayout(new FlowLayout(FlowLayout.CENTER,200,5));
		this.add(pn);
		pn.setBackground(Color.ORANGE);
		
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		bg.add(b4);
		bg.add(b5);
		bg.add(b6);
		bg.add(b_1);
		bg.add(b_2);
		bg.add(b_3);
		bg.add(b_4);
		bg.add(b_5);
		bg.add(b_6);
		bg.add(b7);
		bg.add(b8);
		bg.add(b9);
		bg.add(b10);
		bg.add(b11);
		bg.add(b12);
		
		introp.add(li);
		
		panel.add(t1);
		panel.add(b);
		
		p.add(lt);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		
		p_0.add(lti);
		p_0.add(b_1);
		p_0.add(b_2);
		p_0.add(b_3);
		p_0.add(b_4);
		p_0.add(b_5);
		p_0.add(b_6);
		
		p1.add(lp);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(b10);
		
		p2.add(ll);
		p2.add(b11);
		p2.add(b12);
		
		pn.add(l);
		

		
		b.addActionListener(this);//interface
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		b_1.addActionListener(this);
		b_2.addActionListener(this);
		b_3.addActionListener(this);
		b_4.addActionListener(this);
		b_5.addActionListener(this);
		b_6.addActionListener(this);
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		b11.addActionListener(this);
		b12.addActionListener(this);

		setTitle("CALCULATOR");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(650,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = t1.getText();
		double result;
		//String str = t1.getText();
		//String[] ch = str.split("+\\-\\*\\/");
		int res = this.evaluate(str);
		
		if(b1.isSelected())
		{
			double rad =Math.toRadians(res);
			result=Math.sin(rad);
			l.setText(result+"");
		}
		else if(b2.isSelected())
		{
			double rad =Math.toRadians(res);
			result=Math.cos(rad);
			l.setText(result+"");
		}
		else if(b3.isSelected())	
		{
			double rad =Math.toRadians(res);
			result=Math.tan(rad);
			l.setText(result+"");
		}
		else if(b4.isSelected())
		{
			double rad =Math.toRadians(res);
			result=(1/Math.sin(rad));
			l.setText(result+"");
		}
		else if(b5.isSelected())
		{
			double rad =Math.toRadians(res);
			result=(1/Math.cos(rad));
			l.setText(result+"");
		}
		else if(b6.isSelected())
		{
			double rad =Math.toRadians(res);
			result=(1/Math.tan(rad));
			l.setText(result+"");
		}
		
		else if(b_1.isSelected())
		{
			//double rad =Math.toRadians(res);
			result=Math.asin(res);
			l.setText(result+"");
		}
		else if(b_2.isSelected())
		{
			//double rad =Math.toRadians(res);
			result=Math.acos(res);
			l.setText(result+"");
		}
		else if(b_3.isSelected())	
		{
			//double rad =Math.toRadians(res);
			result=Math.atan(res);
			l.setText(result+"");
		}
		else if(b_4.isSelected())
		{
			//double rad =Math.toRadians(res);
			result=(Math.asin((double)1/res));
			l.setText(result+"");
		}
		else if(b_5.isSelected())
		{
			//double rad =Math.toRadians(res);
			result=(Math.acos((double)1/res));
			l.setText(result+"");
		}
		else if(b_6.isSelected())
		{
			//double rad =Math.toRadians(res);
			result=(Math.atan((double)1/res));
			l.setText(result+"");
		}
//		
		else if(b7.isSelected())
		{
//			JTextField t=new JTextField();
//			add (t);
//			String root_str=t.getText();
//			int root = Integer.parseInt(root_str);
//			result=res^root;
//			l.setText(result+"");
			result=Math.sqrt(res);
			l.setText(result+"");
			
		}
		else if(b8.isSelected())
		{
//			JTextField t=new JTextField();
//			add(t);
//			String root_str=t.getText();
//			int root = Integer.parseInt(root_str);
//			result=res^(1/root);
//			l.setText(result+"");
			result=res*res;
			l.setText(result+"");
		}
		else if(b9.isSelected())
		{
			result=Math.cbrt(res);
			l.setText(result+"");
		}
		else if(b10.isSelected())
		{
			result=res*res*res;
			l.setText(result+"");
		}
		else if(b11.isSelected())
		{
			result=Math.log10(res);
			l.setText(result+"");			
		}
		else if(b12.isSelected())
		{
			result=Math.log(res);
			l.setText(result+"");	
		}
		else
		{
			l.setText(res+"");
		}
		
		//l.setText(result+"");
		
	}
	public static int evaluate(String expression)
	{
		char[] tokens = expression.toCharArray();

		// Stack for numbers: 'values'
		Stack<Integer> values = new
							Stack<Integer>();

		// Stack for Operators: 'ops'
		Stack<Character> ops = new
							Stack<Character>();

		for (int i = 0; i < tokens.length; i++)
		{
			if (tokens[i] == ' ')
				continue;

			
			if (tokens[i] >= '0' &&
				tokens[i] <= '9')
			{
				StringBuffer sbuf = new
							StringBuffer();
				
				
				while (i < tokens.length &&
						tokens[i] >= '0' &&
						tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.
									toString()));
				i--;
			}

			
			else if (tokens[i] == '(')
				ops.push(tokens[i]);

			
			else if (tokens[i] == ')')
			{
				while (ops.peek() != '(')
				values.push(applyOp(ops.pop(),
								values.pop(),
								values.pop()));
				ops.pop();
			}

			else if (tokens[i] == '+' ||
					tokens[i] == '-' ||
					tokens[i] == '*' ||
						tokens[i] == '/')
			{
				while (!ops.empty() &&
					hasPrecedence(tokens[i],
									ops.peek()))
				values.push(applyOp(ops.pop(),
								values.pop(),
								values.pop()));

				ops.push(tokens[i]);
			}
		}

		
		while (!ops.empty())
			values.push(applyOp(ops.pop(),
							values.pop(),
						values.pop()));

		
		return values.pop();
	}

	public static boolean hasPrecedence(
						char op1, char op2)
	{
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') &&
			(op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}


	public static int applyOp(char op,
						int b, int a)
	{
		switch (op)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		}
		return 0;
	}

}
