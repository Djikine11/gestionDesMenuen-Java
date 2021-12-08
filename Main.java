import java.util.Scanner;
import java.util.InputMismatchException;

import java.lang.Exception;

import javax.swing.*;

public class Main {
	JOptionPane panne = new JOptionPane();
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
			
Scanner scanner = new Scanner(System.in);


try
{
	JOptionPane.showMessageDialog(null,"1-Burger\r2-Fataya\r3-coumpa\r4-Omelette\r" );
	
	//System.out.print("1-Burger\r2-Fataya\r3-coumpa\r4-Omelette\r");
	
	//System.out.println("choose a number for your menu ");
	
int menu = Integer.parseInt((JOptionPane.showInputDialog(null,"choose a menu please  1-Burger\r2-Fataya\r3-coumpa\r4-Omelette")));
	
	
	
	
	
	
	switch(menu)
	
	{
	case (1): 
		JOptionPane.showMessageDialog(null, "vous avez choisi Burger");
	break;
	
	case(2):
		JOptionPane.showMessageDialog(null, "you choosed fataya");
	break;
	
	case(3):
		JOptionPane.showMessageDialog(null,"you choosed coumpa");
	break;
	
	case(4):
		JOptionPane.showMessageDialog(null, "you choosed omelette");
	
	break;
	
	
}
	
}
	
catch(InputMismatchException e) {
	System.out.println("please a number ");
}

catch(Exception e) {
	System.out.println("incorrecte ");
	
}

finally {
	
	scanner.close();
	
	
}
	



	
			
			
			
		
			
		
			
			
		}
		
			
}
			
		
	

		
		
			
		
		
		
		
		
		

	


