package prueba1;

import javax.swing.JOptionPane;

public class suma {


public static void main(String[] args) {
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero"));
	
	System.out.println("La suma es :" +(num1+num2));

	}
}
