package grupal10;

import java.util.Scanner;


public class grupal10 {
	
	 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);

	
	int diaCap = 0, mesCap = 0, anoCap = 0, contador = 0, cantidadAsistentes =0;
	String validador = null, horaCap = null, lugarCap = null, duracionCap = null, fechaCap = null; 
	float promedioNotas = 0, sumaNotas = 0 , varTemp = 0;

		
	
	while (contador < 1) {
	
		while (contador < 1) {
			System.out.println("Ingrese el día de la capacitación: (en número)");
			diaCap = scanner.nextInt();
			scanner.nextLine();
			
			if (diaCap >= 1 && diaCap <= 31) {
				contador++;
			}else {
				System.out.println("## Error ## Por favor ingrese un valor entre 1 y 31");
			}
		}
		
		contador=0;
		while (contador < 1) {
			System.out.println("Ingrese el mes de la capacitación: (en número)");
			mesCap = scanner.nextInt();
			scanner.nextLine();
			
			if (mesCap >= 1 && mesCap <= 12) {
				contador++;
			}else {
				System.out.println("## Error ## Por favor ingrese un valor entre 1 y 12");
			}
		}

		contador=0;
		while (contador < 1) {
			System.out.println("Ingrese el año de la capacitación: ");
			anoCap = scanner.nextInt();
			scanner.nextLine();
			
			if (anoCap >= 2023 && anoCap <= 2100) {
				contador++;
			}else {
				System.out.println("## Error ## Por favor ingrese un valor entre 2023 y 2100");
			}
		}
		
		fechaCap = diaCap + "/" + mesCap + "/" + anoCap;
		
		System.out.println("La fecha de la capacitación es: " + fechaCap);
		
		System.out.println("¿Es correcta la fecha?");
		validador = scanner.nextLine();
		
		if (validador.equalsIgnoreCase("si")) {
			contador++;
		} else {
			System.out.println("Por favor ingrese una fecha válida");
			contador = 0;
		}
		
		System.out.println("Ingrese la hora de realización de la capacitación: (hh:mm)");
		horaCap = scanner.nextLine();
		
		System.out.println("Ingrese el lugar de realización de la capacitación: ");
		lugarCap = scanner.nextLine();
		
		
		System.out.println("Ingrese la duración de la capacitación: ");
		duracionCap = scanner.nextLine();
		
		
		contador=0;
		while(contador < 1) {
			
			System.out.println("Ingrese los asistentes de la capacitación: ");
			cantidadAsistentes = scanner.nextInt();
			scanner.nextLine();
			
			if (cantidadAsistentes > 0) {
				contador++;
			} else {
				System.out.println("## Error ## Por favor ingrese una cantidad correcta de asistentes.");
			}
		}
		
		
		String[] nombres = new String[cantidadAsistentes];
		float [] notas = new float[cantidadAsistentes];
		
		for (int i=0 ; i < cantidadAsistentes ; i++) {
			
			System.out.println("Ingrese el Nombre del asistente N°" + (i+1) + ": ");
			nombres[i] = scanner.nextLine();
			System.out.println("Ingrese la Calificación del asistente N°" + (i+1) + ": ");
			notas[i] = scanner.nextFloat();
			scanner.nextLine();
			
			sumaNotas = sumaNotas + notas[i];
			
			promedioNotas = (float) sumaNotas/cantidadAsistentes;
			
			
		}
		
		promedioNotas = Math.round(promedioNotas * 100) / 100f;
		
		String varTemp2 = null;
		
		for (int i = 0 ; i < cantidadAsistentes - 1 ; i++) {
			if(notas[i] > notas[i+1]) {
				varTemp = notas[i];
				notas[i] = notas[i+1];
				notas[i+1] = varTemp;
				
				varTemp2 = nombres[i];
				nombres[i] = nombres[i+1];
				nombres[i+1] = varTemp2;
				
			}
		}
		

		System.out.println("--------- Información de la capacitación ---------\n");
		System.out.println("La fecha de la capacitación será: " + fechaCap);
		System.out.println("La capacitación se realizará a las: " + horaCap);
		System.out.println("La capacitación se realizará en: " + lugarCap);
		System.out.println("La duración de la capacitación será de: " + duracionCap);
		System.out.println("A la capcitación asistirán: " + cantidadAsistentes + " personas");
		
		System.out.println("El promedio de las notas es: " + promedioNotas);
		System.out.println("La nota menor corresponde a: " + nombres[0] + " y obtuvo una nota de: " + notas[0]);
		System.out.println("La nota mayor corresponde a: " + nombres[cantidadAsistentes-1] + " y obtuvo una nota de: " + notas[cantidadAsistentes-1]);
		
		
	}
	
	
	scanner.close(); 
 }
}
