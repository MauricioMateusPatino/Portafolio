//********************************************************************************************************* */
//PUNTO 1. Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario. 
//         Después de recoger toda la información, se requiere imprimir el índice de cada posición en el 
//         arreglo con su valor de la siguiente manera:
//********************************************************************************************************** */
import java.io.*;

public class taller_matriz_punto1 {

	// LLENAR ARREGLO
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int indice;
		int num;
		int posicion;
		int vector[];
		vector = new int[5];
		for (indice=0;indice<=4;indice++) {
			System.out.println("Digite el valor de la posici�n "+indice+" del vector: ");
			num = Integer.parseInt(bufEntrada.readLine());
			vector[indice] = num;
		}
		for (posicion=0;posicion<=4;posicion++) {
			System.out.println("["+posicion+"]"+" = "+vector[posicion]);
		}
	}


}

//********************************************************************************************************* */
//PUNTO 2. Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; 
//         después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para 
//         llenarse e imprimir los números pares e impares. Ejemplo.
//********************************************************************************************************** */

import java.io.*;
import java.math.*;

public class taller_matriz_punto2 {

	// LLENAR ARREGLO CON N�MEROS AL AZAR
	public static void main(String args[]) {
		int i;
		int impares[];
		int m;
		int p;
		int pares[];
		int vector[];
		vector = new int[20];
		pares = new int[20];
		impares = new int[20];
		i = 0;
		p = 0;
		m = 0;
		System.out.println("El Vector de N�meros al azar es: ");
		for (i=0;i<=19;i++) {
			vector[i] = (Math.floor(Math.random()*100)+1);
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		for (i=0;i<=19;i++) {
			if ((vector[i]%2==0)) {
				pares[p] = vector[i];
				p = p+1;
			} else {
				impares[m] = vector[i];
				m = m+1;
			}
		}
		System.out.println("El vector de N�meros Pares es: ");
		if (p>0) {
			for (i=0;i<=p-1;i++) {
				System.out.print(pares[i]+" ");
			}
		} else {
			System.out.println("El vector de N�meros pares sin elementos: ");
		}
		System.out.println("");
		if (m>0) {
			System.out.println("El vector de N�meros Impares es: ");
			for (i=0;i<=m-1;i++) {
				System.out.print(impares[i]+" ");
			}
		} else {
			System.out.println("El vector de N�meros impares sin elementos: ");
		}
		System.out.println("");
	}


}

//********************************************************************************************************* */
//PUNTO 3. Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.
//********************************************************************************************************** */

import java.io.*;

public class taller_matriz_punto3 {

	// N�meros Primos del 1 al 1000
	// #################################
	public static void main(String args[]) {
		int contador;
		int i;
		int num;
		System.out.println("N�meros Primos de 1 al 1000");
		for (num=1;num<=1000;num++) {
			i = 1;
			contador = 0;
			while (i<=num) {
				// Mod determina si el residuo de la divisi�n entre dos n�meros es 0
				if (num%i==0) {
					contador = contador+1;
				}
				i = i+1;
			}
			if (contador==2) {
				System.out.print(num+" ");
			}
		}
		System.out.println("");
	}


}

//********************************************************************************************************* */
//PUNTO 4. Dada la siguiente matriz bidimensional, el cual debe de quemar en el código.
//         Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima la siguiente matriz bidimensional.
//********************************************************************************************************** */

import java.io.*;

public class taller_matriz_punto4 {

	// NUMEROS CONSECUTIVOS
	// ###############################################################
	public static void main(String args[]) {
		int c;
		int co;
		int columna;
		int contador;
		int contador2;
		int diez;
		int f;
		int fila;
		int matriz[][];
		int matriz2[][];
		double num;
		int vector;
		// Definir diez Como Caracter;
		// Dimension vector[5*5];
		matriz = new int[4][5];
		matriz2 = new int[4][5];
		f = 0;
		co = 0;
		c = 1;
		contador = 1;
		num = 0;
		// diez<-10;
		// matriz2[4,4]<-0;
		// vector[5]<-0;
		// mientras contador <20 Hacer
		for (fila=0;fila<=3;fila++) {
			for (columna=0;columna<=4;columna++) {
				matriz[fila][columna] = contador;
				contador = contador+1;
			}
		}
		// FinMientras
		diez = 10;
		for (fila=0;fila<=1;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print("0"+matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
		for (fila=2;fila<=3;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		// escribir matriz(1,4);
		// ##########################################################
		// mientras contador <20 Hacer
		for (f=0;f<=3;f++) {
			for (co=0;co<=4;co++) {
				// matriz2(f,co) <- azar(10);
				matriz2[f][co] = c;
				c = c+1;
				// contador<-contador+1;
				// Escribir matriz2(f,co);
			}
		}
		// FinMientras
		for (f=0;f<=0;f++) {
			for (co=0;co<=4;co++) {
				System.out.print("0"+matriz2[f][co]+" ");
			}
			System.out.println("");
		}
		for (f=1;f>=1;f--) {
			for (co=4;co>=0;co--) {
				System.out.print("0"+matriz2[f][co]+" ");
				// Escribir matriz2[1,0] sin saltar;
			}
			System.out.println("");
		}
		for (f=2;f<=2;f++) {
			for (co=0;co<=4;co++) {
				System.out.print(matriz2[f][co]+" ");
			}
			System.out.println("");
		}
		for (f=3;f>=3;f--) {
			for (co=4;co>=0;co--) {
				System.out.print(matriz2[f][co]+" ");
			}
			System.out.println("");
		}
	}


}

//********************************************************************************************************* */
//PUNTO 5. Se debe de imprimir el siguiente cuadro:
//         El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda 
//         debe estar previamente calculado en una matriz bidimensional La cual cada resultado obedecerá a la fila y 
//         columna insertada por el usuario..
//********************************************************************************************************** */

import java.io.*;

public class taller_matriz_punto5 {

	// TABLAS DE MULTIPLICACI�N 
	// ###########################################################
	public static void main(String args[]) {
		int columnas;
		int filas;
		int i;
		int j;
		int opcion;
		int tabla_columna[];
		int tabla_multiplicar[][];
		int vector_fila[];
		opcion = 0;
		filas = 10;
		columnas = 10;
		tabla_multiplicar = new int[11][11];
		tabla_columna = new int[10];
		vector_fila = new int[10];
		llenartabla(tabla_multiplicar,filas);
		calculartabla(tabla_multiplicar,filas,columnas);
		imprimirtabla(tabla_multiplicar,10,10,tabla_columna,vector_fila);
		// definir contador2,z Como Entero;
		// contador2<-1;
		// Para z <- 0 Hasta 9 Con Paso 1 Hacer
		// //para j <- 0 hasta 9 Con Paso 1 Hacer
		// tabla_columna(z) <- contador2;
		// contador2<-contador2+1;
		// finpara
	}

	public static void calculartabla(double tabla_multiplicar[][], double filas, double columnas) {
		int i;
		int j;
		for (j=1;j<=filas;j++) {
			for (i=1;i<=columnas;i++) {
				tabla_multiplicar[i][j] = tabla_multiplicar[i][1]*tabla_multiplicar[1][j];
				// tabla_multiplicar[i,j]<-i*j;
			}
		}
	}

	public static void llenartabla(int tabla_multiplicar[][], double filas) {
		int contador;
		int i;
		contador = 1;
		for (i=1;i<=filas;i++) {
			tabla_multiplicar[i][1] = contador;
			tabla_multiplicar[1][i] = contador;
			contador = contador+1;
		}
	}

	public static void imprimirtabla(String tabla_multiplicar[][], double filas, SIN_TIPO columnas, SIN_TIPO tabla_columna, int vector_fila[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador2;
		int i;
		int j;
		int opcion;
		String textofilas;
		int z;
		// definir contador,z Como Entero;
		// contador<-1;
		// Para z <- 0 Hasta 8 Con Paso 1 Hacer
		// //para j <- 0 hasta 4 Con Paso 1 Hacer
		// tabla_columna(z) <- contador;
		// contador<-contador+1;
		// finpara
		System.out.println(" * * *  Tablas de Multilplicar * * *");
		System.out.println("");
		System.out.println("                             C O L U M N A S ");
		textofilas = "   FILAS   ";
		contador2 = 1;
		for (z=0;z<=9;z++) {
			vector_fila[z] = contador2;
			contador2 = contador2+1;
			System.out.print("      "+vector_fila[z]);
		}
		System.out.println("");
		System.out.println("");
		// para FILAS<-0 Hasta  8 Hacer
		// Escribir Subcadena(textoFilas,filas,filas) Sin Saltar;
		// para j<- 0 Hasta COLUMNAS-1 con paso 1 Hacer
		// Escribir Subcadena(textoFilas,filas,filas) Sin Saltar;
		// FinPara
		for (j=1;j<=9;j++) {
			// escribir " "Sin Saltar;
			System.out.print(""+textofilas.substring(j,j+1)+" "+j);
			for (i=1;i<=filas;i++) {
				System.out.print("   "+i+"x"+j+" ");
			}
			System.out.println("");
		}
		System.out.print(" 10");
		for (j=1;j<=10;j++) {
			for (i=10;i<=10;i++) {
				System.out.print("  "+j+"x"+i+" ");
			}
		}
		System.out.println("");
		// FinPara
		// finpara
		// ###################################################################################
		System.out.println("");
		System.out.println("");
		do {
			System.out.println("************************************************************************************");
			System.out.println("Se�or Usuario");
			System.out.println("");
			System.out.println("1. Consultar Resultado : ");
			System.out.println("2. Salir del sistema : ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Digite el N�mero de la COLUMNA de la Tabla de Multiplicaci�n que desea consultar: ");
				j = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Digite el N�mero de la FILA de la Tabla de Multiplicaci�n que desea consultar: ");
				i = Integer.parseInt(bufEntrada.readLine());
				System.out.println("El Resultado de su consulta es: "+tabla_multiplicar[j][i]);
				break;
			case 2:
				System.out.println("Salir");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=2);
		// Escribir "0000",tabla_multiplicar[1,2];
		System.out.println("");
	}


}

