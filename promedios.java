package calculadora;

import java.util.Scanner;

public class promedios {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		Scanner sed =  new Scanner(System.in);
		int alumnos;
		int n=0;
        double notas;
        double nota;
        double suma;
        double prom=0; 
        System.out.println("Ingrese cantidad de alumnos: ");
        alumnos=sed.nextInt();
        
		int[][] integer=null;
		int[]curso=integer [alumnos];
		for (int h=0;h<=alumnos;h++){
        System.out.print("ingrese cantidad de notas alumno 1 :");//rango entre 10 y 70
        notas = sed.nextInt();
        
        
        	for(int i=1; i<= notas; i++){
        		System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");

        		nota = sed.nextInt();  
            
        		suma = 0;
                 
        		suma = suma + nota;
        		prom= prom + suma /notas;
        		if (nota>70){System.out.println("error");          
        		}
        		else{System.out.println("promedio:"+prom );}
            	}
        
		}           
  }     

}

