//import java.util.Scanner;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Bmi.java" width=600 height=580></applet> */
public class Bmi extends Applet implements ActionListener{

	Image I;
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	TextField t3=new TextField(10);
	Label l1=new Label("Weight (in kgs)");
	Label l2=new Label("Height (in metres)");
	Label l3=new Label("BMI");
	Button b1=new Button("Calculate");

public void init()
{
	I=getImage(getCodeBase(),"hea.jpg");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	add(l3);
	add(t3);
	b1.addActionListener(this);
	Font fo=new Font("Serif",Font.BOLD,20);
	l1.setFont(fo);
	l2.setFont(fo);
	l3.setFont(fo);
	b1.setFont(fo);
	

}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
	float n1=Float.parseFloat(t1.getText());
	float n2=Float.parseFloat(t2.getText());
	float n3=n2*n2;
	t3.setText(" "+(n1/n3));
	}
}

public void paint(Graphics g)
{
		{
		g.drawImage(I,10,1,this);
		g.drawRect(30,100,290,100);
		Font f=new Font("Serif",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.orange);
		g.drawString("If BMI < 18.5 ~~  Underweight",40,130);
		g.setColor(Color.pink);
		g.drawString("If 18.5 < BMI < 25 ~~  Normal",40,150);
		g.setColor(Color.blue);
		g.drawString("If 25 < BMI < 30 ~~  Overweight",40,170);
		g.setColor(Color.green);
		g.drawString("If BMI > 30 ~~  Obese",40,190);
		}
    
}
}





