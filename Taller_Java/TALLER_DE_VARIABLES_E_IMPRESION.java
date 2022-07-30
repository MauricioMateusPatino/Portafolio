//******************************************************************* */
//PUNTO 1.	Realizar un programa el cual solicite su nombre y apellidos.
//******************************************************************* */

import java.io.*;

public class taller_de_variables_e_impresion_punto1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		String nombre;
		System.out.println("Por favor digite su Nombre (Oprima Enter para continuar): ");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor digite sus Apellidos (Oprima Enter para continuar): ");
		apellidos = bufEntrada.readLine();
	}


}

//***************************************************************************** */
//PUNTO 2.	Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.
//***************************************************************************** */

import java.io.*;

public class taller_de_variables_e_impresion_punto2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		int edad;
		double estatura;
		String nombre;
		System.out.println("Por favor digite su Nombre (Oprima Enter para continuar) : ");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor digite sus Apellidos (Oprima Enter para continuar) : ");
		apellidos = bufEntrada.readLine();
		System.out.println("Por favor digite su edad (Oprima Enter para continuar): ");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Por favor digite su estatura (Oprima Enter para continuar) :");
		estatura = Double.parseDouble(bufEntrada.readLine());
	}


}

//********************************************************************************************** */
//PUNTO 3.  Realizar un programa el cual solicite su nombre y apellidos, también debe 
//          capturar nombre y apellidos de su padre y madre. Al finalizar debe imprimir
//          en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre]
//          y [Nombre del Padre].
//********************************************************************************************* */

import java.io.*;

public class taller_de_variables_e_impresion_punto3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		String apellidosmadre;
		String apellidospadre;
		String nombre;
		String nombremadre;
		String nombrepadre;
		System.out.println("Por favor digite su Nombre (Oprima Enter para continuar): ");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor digite sus Apellidos (Oprima Enter para continuar): ");
		apellidos = bufEntrada.readLine();
		System.out.println("Por favor digite el Nombre de su Progenitora (Oprima Enter para continuar): ");
		nombremadre = bufEntrada.readLine();
		System.out.println("Por favor digite los Apellidos de su Progenitora (Oprima Enter para continuar): ");
		apellidosmadre = bufEntrada.readLine();
		System.out.println("Por favor digite el Nombre de su Progenitor (Oprima Enter para continuar): ");
		nombrepadre = bufEntrada.readLine();
		System.out.println("Por favor digite el Apellidos de su Progenitor (Oprima Enter para continuar): ");
		apellidospadre = bufEntrada.readLine();
		System.out.println("Yo "+nombre+" "+apellidos+" soy hijo de "+nombremadre+" "+apellidosmadre+" y "+nombrepadre+" "+apellidospadre+".");
	}


}
//*************************************************************************************************** */
//PUNTO 4.  Realizar un programa el cual solicite el nombre de una ciudad capital y el país. 
//          Al finalizar debe imprimir en pantalla el siguiente mensaje "La ciudad [Nombre de la Ciudad], 
//          es la capital del país [Nombre del País].
//************************************************************************************************** */
import java.io.*;

public class taller_de_variables_e_impresion_punto4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String capital;
		String pais;
		System.out.println("Por favor digite Nombre del Pais (Oprima Enter para continuar) : ");
		pais = bufEntrada.readLine();
		System.out.println("Por favor digite su Capital (Oprima Enter para continuar) : ");
		capital = bufEntrada.readLine();
		System.out.println("La ciudad "+capital+" es la Capital del Pa�s "+pais+".");
	}


}

//******************************************************************************************************** */
//PUNTO 5.  Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota
//          y su nombre completo. Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: 
//          [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y 
//          [Nombre Completo] es actualmente su dueño(a).
//******************************************************************************************************** */

import java.io.*;

public class taller_de_variables_e_impresiones_punto5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edadmascota;
		String nombrecompleto;
		String nombremascota;
		String tipomascota;
		System.out.println("Por favor digite el Nombre Completo del due�o de la mascota (Oprima Enter para continuar): ");
		nombrecompleto = bufEntrada.readLine();
		System.out.println("Por favor digite el tipo de mascota (Oprima Enter para continuar): ");
		tipomascota = bufEntrada.readLine();
		System.out.println("Por favor digite la edad de la mascota (Oprima Enter para continuar): ");
		edadmascota = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Por favor digite el nombre de la mascota (Oprima Enter para continuar): ");
		nombremascota = bufEntrada.readLine();
		System.out.println(nombremascota+" es un(a) "+tipomascota+", el cual, tiene "+edadmascota+" a�os de edad "+" y "+nombrecompleto+" es actalmente su due�o(a).");
	}


}
