package calculadora;

import java.util.*;

public class hexadecimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese A");
		double A=variable.nextDouble();
		System.out.println("Ingrese B");
		double B=variable.nextDouble();
		double suma = A+B;
		System.out.println("La suma numerica es "+suma);
		
		int hex=(int)(suma);	
		
		System.out.println("La suma hexadecimal es "+hex);
		
		


	}

}
