//**************************************************************************************
//PUNTO 1.  Realizar la siguiente figura por medio del ciclo Para */
//************************************************************************************** */

import java.io.*;

public class taller_ciclos_punto1 {

	// CICLO REPETITIVO POSITIVO
	// ####################################################################
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int asterisco;
		int fila;
		int n;
		System.out.println(" ingrese un numero");
		n = Integer.parseInt(bufEntrada.readLine());
		for (fila=1;fila<=n;fila++) {
			for (asterisco=1;asterisco<=fila;asterisco++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}


}

//**************************************************************************************
//PUNTO 2.  Realizar la siguiente figura por medio del ciclo Mientras - Hacer
//**************************************************************************************
import java.io.*;

public class taller_ciclos_punto2 {

	// CICLO REPETITIVO NEGATIVO
	// ####################################################################
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int asterisco;
		int espacios;
		int fila;
		int vacio;
		System.out.println(" ingrese un numero");
		espacios = Integer.parseInt(bufEntrada.readLine());
		for (fila=1;fila<=espacios;fila++) {
			for (vacio=1;vacio<=espacios;vacio++) {
				System.out.print(" ");
			}
			espacios = espacios-1;
			for (asterisco=1;asterisco<=fila;asterisco++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}


}

//**************************************************************************************
//PUNTO 3.  Realizar la siguiente figura por medio del ciclo Repetir - Hasta Que
//**************************************************************************************
import java.io.*;

public class taller_ciclos_punto3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int contadordos;
		int espacios;
		int fila;
		int n;
		int vacio;
		System.out.println("Escribir un n�mero");
		n = Integer.parseInt(bufEntrada.readLine());
		for (fila=n;fila>=1;fila--) {
			for (espacios=1;espacios<=fila;espacios++) {
				System.out.print(" ");
			}
			for (vacio=fila;vacio<=n;vacio++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// ################################################
		contador = 1;
		for (fila=(n/2)+1;fila>=2;fila--) {
			if (contador==1 || contador==2) {
				// Escribir redon(n/2);
				for (espacios=1;espacios<=n-2;espacios++) {
					System.out.print(" ");
				}
				for (vacio=fila;vacio<=(n/2)+1;vacio+=2) {
					System.out.print("* * *");
				}
				System.out.println("");
			}
			contador = contador+1;
		}
		// #################################################
		contadordos = 1;
		for (fila=n;fila>=1;fila--) {
			if (contadordos==1 || contadordos==2) {
				// Escribir redon(n/2);
				for (espacios=1;espacios<=fila-4;espacios++) {
					System.out.print(" ");
				}
				for (vacio=fila;vacio<=n+4;vacio++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			contadordos = contadordos+1;
		}
	}


}

//**************************************************************************************
//PUNTO 4. Se requiere un programa que pueda crear la tabla de multiplicar del 
//         número que el usuario indique por medio del ciclo Para; esta debe ser impresa del 1 al 10. 
//         Ejemplo, si el usuario indica que desea crear la tabla del 5, 
//         entonces el resultado debería ser el siguiente:
//**************************************************************************************

import java.io.*;

public class taller_ciclos_punto4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int numeroentrada;
		System.out.println("Digite el n�mero para crear la tabla de multiplicar : ");
		numeroentrada = Integer.parseInt(bufEntrada.readLine());
		for (i=0;i<=10;i++) {
			System.out.println(numeroentrada+" x "+i+" = "+(numeroentrada*i));
		}
	}


}

//**************************************************************************************
//PUNTO 5.  Utilizando el ciclo que usted desee, crear un menú de ejecución infinita 
//          hasta que el usuario desee terminar dicho ciclo.
//**************************************************************************************


import java.io.*;

public class taller_condicionales_punto5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		String nombrem;
		int opcion;
		boolean salir;
		String saludar;
		do {
			System.out.println("Men� de Usuario");
			System.out.println("1. Capturar nombre : ");
			System.out.println("2. Saludar persona : ");
			System.out.println("3. Salir del sistema : ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Digite el Nombre : ");
				nombre = bufEntrada.readLine();
				break;
			case 2:
				System.out.println("Hola! "+nombre);
				break;
			case 3:
				System.out.println("Salir");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=3);
	}


}

//**************************************************************************************
//PUNTO 6.  Se está creando una aplicación que va a estar conectada con un prototipo que 
//          permita almacenar contactos telefónicos en el dispositivo. Para ello cada contacto 
//          debe contener nombre completo, teléfono y organización. Se requiere que la aplicación 
//          permita añadir 3 contactos verificando que el número no esté almacenado, 
//          buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
//          Recuerde que el sistema debe terminar cuando el usuario así lo indique.
//**************************************************************************************

import java.io.*;

public class agenda_telefonica {

	// AGENDA TELEF�NICA
	// ########################################################################
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int espacio;
		int i;
		int j;
		int k;
		String listanombre[];
		String listaorganizacion[];
		String listatelefono[];
		String num;
		int opcion;
		int post;
		boolean respuesta;
		boolean respuesta2;
		int val;
		listanombre = new String[3];
		listatelefono = new String[3];
		listaorganizacion = new String[3];
		j = 0;
		opcion = 0;
		i = 0;
		contador = 0;
		k = 0;
		val = 0;
		post = 0;
		respuesta2 = false;
		respuesta = false;
		inicializar(listanombre,listatelefono,listaorganizacion);
		do {
			System.out.println("AGENDA TEL�FONICA");
			System.out.println("");
			System.out.println("Elija la Opci�n: ");
			System.out.println("");
			System.out.println("1. Crear Contacto: ");
			System.out.println("2. Buscar Contacto: ");
			System.out.println("3. Eliminar Contacto: ");
			System.out.println("4. Salir: ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Espacio Agenda : "+3-i);
				if (i==0 || i==1 || i==2) {
					for (j=0;j<=2;j++) {
						if (listatelefono[j].equals("0")) {
							contador = contador+1;
							k = j;
							j = 3;
							System.out.println("Contactos = "+k+" Capacidad Agenda  = "+j);
							// escribir "valor i inicio ",i;
						}
					}
					// ###########################################################################
					contador = i;
					val = 0;
					// vall<-0;
					if (i<=2) {
						espacio = i;
						i = k;
						System.out.println("Posici�n = "+i+1);
						System.out.println("");
						System.out.println("Nombre Completo : ");
						listanombre[i] = bufEntrada.readLine();
						System.out.println("Organizaci�n: ");
						listaorganizacion[i] = bufEntrada.readLine();
						while (val==0) {
							// vall<-0;
							System.out.println("Numero de Contacto: ");
							num = bufEntrada.readLine();
							if (num.length()==10) {
								respuesta = contactonuevo(listanombre,listatelefono,listaorganizacion,i,j,num,contador,respuesta,respuesta2);
								if (respuesta==true) {
									System.out.println("Tel�fono ya existente");
									// i<-i-1;
									// Escribir "val",i;
									val = 1;
								} else {
									listatelefono[i] = num;
									System.out.println("Telefono nuevo");
									// Escribir "val",i;
									i = i+1;
									val = 1;
								}
							} else {
								System.out.println("N�mero No V�lido. El N�mero debe ser de 10 digitos ");
								val = 0;
								contador = 0;
							}
							// i<-i-1; 
						}
					}
				}
				System.out.println(i);
				System.out.println("Espacio Agenda = "+3-i);
				break;
			case 2:
				System.out.println("Espacio Agenda = "+3-i);
				buscarcontacto(listanombre,listatelefono,listaorganizacion,i,j);
				break;
			case 3:
				j = 0;
				System.out.println("N�mero de Contactos en Agenda : "+i);
				if (i==1 || i==2 || i==3) {
					System.out.println("Digite el N�mero Contacto a Eliminar :");
					num = bufEntrada.readLine();
					// Escribir "Espacio Agenda : ", i;
					// si i<>0 Entonces
					for (j=0;j<=2;j++) {
						if ((listatelefono[j].equals(num))) {
							System.out.println("Contacto con n�mero "+listatelefono[j]+" eliminado.");
							listanombre[j] = "0";
							listatelefono[j] = "0";
							listaorganizacion[j] = "0";
							if (i==1 || i==2 || i==3) {
								for (j=post;j<=i-1;j++) {
									listanombre[j] = listanombre[j+1];
									listatelefono[j] = listatelefono[j+1];
									listaorganizacion[j] = listaorganizacion[j+1];
								}
								i = i-1;
							}
						} else {
							System.out.println("Numero no encontrado en posici�n: "+j);
						}
					}
				} else {
					System.out.println("No hay contactos en la agenda");
				}
				break;
			case 4:
				System.out.println("Salir de la Agenda");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=4);
	}

	// ################################################################################
	public static void inicializar(String listanombre[], String listatelefono[], String listaorganizacion[]) {
		int inic;
		for (inic=0;inic<=2;inic++) {
			listanombre[inic] = "0";
			listatelefono[inic] = "0";
			listaorganizacion[inic] = "0";
		}
	}

	// ###############################################################################
	// #############################################################################
	public static void buscarcontacto(String listanombre[], String listatelefono[], String listaorganizacion[], SIN_TIPO i, int j) {
		// Definir j Como Entero;
		// j <- 0;
		for (j=0;j<=2;j++) {
			if (!listatelefono[j].equals("0")) {
				System.out.println(listanombre[j]);
				System.out.println(listatelefono[j]);
				System.out.println(listaorganizacion[j]);
			} else {
				System.out.println("No hay Contactos en la Agenda en la posici�n: "+j);
			}
		}
	}

	// ##########################################################################
	// #############################################################################
	public static boolean contactonuevo(SIN_TIPO listanombre, String listatelefono[], SIN_TIPO listaorganizacion, SIN_TIPO i, double j, String num, SIN_TIPO contador, boolean respuesta, SIN_TIPO respuesta2) {
		respuesta = false;
		for (j=0;j<=2;j++) {
			if ((listatelefono[j]==num)) {
				respuesta = true;
			}
		}
		return respuesta;
	}


}

//**************************************************************************************
//PUNTO 7.  El parqueadero "El guardián" presta sus servicios de parqueadero nocturno 
//          para los usuarios del barrio y requiere una aplicación que permita registrar 
//          los vehículos que se cuidan en estas instalaciones. Se sugiere que el parqueadero 
//          tenga los atributos del vehículo como son, placa y marca, y los datos del cliente 
//          como son nombre completo y número de teléfono. Para cada vehículo se debe permitir la 
//          opción de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo 
//          se encuentra en el parqueadero. Recuerde que el sistema debe terminar cuando el usuario 
//          así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
//**************************************************************************************

import java.io.*;

public class parqueadero {

	// PARQUEADERO ELGUARDIAN------->SERVICIO NOCTURNO
	// ########################################################################
	// ################################################################################
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int espacio;
		int i;
		int j;
		int k;
		String listamarca[];
		String listanombre[];
		String listaplaca[];
		String listatelefono[];
		int opcion;
		String placa;
		int post;
		boolean respuesta;
		int val;
		listaplaca = new String[5];
		listamarca = new String[5];
		listanombre = new String[5];
		listatelefono = new String[5];
		j = 0;
		opcion = 0;
		i = 0;
		contador = 0;
		k = 0;
		val = 0;
		post = 0;
		respuesta = false;
		inicializar(listanombre,listatelefono,listamarca,listaplaca);
		do {
			System.out.println("*************************************************");
			System.out.println("");
			System.out.println("SERVICIO PARQUEADERO NOCTURNO");
			System.out.println("");
			System.out.println("Elija la Opci�n: ");
			System.out.println("");
			System.out.println("1. Ingresar Veh�culo: ");
			System.out.println("2. Retirar Veh�culo: ");
			System.out.println("3. Consultar Veh�culo: ");
			System.out.println("4. Salir: ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Espacio Parqueadero : "+5-i);
				if (i==0 || i==1 || i==2 || i==3 || i==4) {
					for (j=0;j<=4;j++) {
						if (listaplaca[j].equals("0")) {
							contador = contador+1;
							k = j;
							j = 5;
							System.out.println("Veh�culos en parqueadero = "+k+" Capacidad Parqueadero  = "+j);
						}
					}
					// ###########################################################################
					contador = i;
					val = 0;
					if (i<=4) {
						espacio = i;
						i = k;
						System.out.println("Posici�n parqueadero = "+i+1);
						System.out.println("");
						System.out.println("Nombre Completo : ");
						listanombre[i] = bufEntrada.readLine();
						System.out.println("Tel�fono: ");
						listatelefono[i] = bufEntrada.readLine();
						System.out.println("Marca Veh�culo: ");
						listamarca[i] = bufEntrada.readLine();
						while (val==0) {
							System.out.println("Placa Veh�culo: ");
							placa = bufEntrada.readLine();
							if (placa.length()==6) {
								respuesta = placanueva(listanombre,listatelefono,listamarca,listaplaca,i,j,placa,contador,respuesta);
								if (respuesta==true) {
									System.out.println("Placa Veh�culo existente en el parqueadero");
									val = 1;
								} else {
									listaplaca[i] = placa;
									i = i+1;
									val = 1;
								}
							} else {
								System.out.println("Placa No V�lida. Verifique los d�gitos y debe ser de 6 digitos ");
								val = 0;
								contador = 0;
							}
						}
					}
				}
				System.out.println(i);
				System.out.println("Espacio Parqueadero = "+5-i);
				break;
			case 2:
				j = 0;
				System.out.println("N�mero de veh�culos en el parqueadero : "+i);
				if (i==0 || i==1 || i==2 || i==3 || i==4) {
					System.out.println("Digite el N�mero Placa a Eliminar :");
					placa = bufEntrada.readLine();
					for (j=0;j<=4;j++) {
						if ((listaplaca[j].equals(placa))) {
							System.out.println("Veh�culo con n�mero n�mero de placa "+listaplaca[j]+" eliminado.");
							listanombre[j] = "0";
							listatelefono[j] = "0";
							listamarca[j] = "0";
							listaplaca[j] = "0";
							if (i==0 || i==1 || i==2 || i==3 || i==4) {
								for (j=post;j<=i-1;j++) {
									listanombre[j] = listanombre[j+1];
									listatelefono[j] = listatelefono[j+1];
									listamarca[j] = listamarca[j+1];
									listaplaca[j] = listaplaca[j+1];
								}
								// j<-j+1;
								i = i-1;
							}
						} else {
							System.out.println("Numero placa no encontrada en la posici�n: "+j);
						}
					}
				} else {
					System.out.println("No hay veh�culos en el parqueadero");
				}
				break;
			case 3:
				System.out.println("Espacio Parqueadero = "+5-i);
				consultarplaca(listanombre,listatelefono,listamarca,listaplaca,i,j);
				break;
			case 4:
				System.out.println("Salir control Parqueadero");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=4);
	}

	// ################################################################################
	public static void inicializar(String listanombre[], String listatelefono[], String listamarca[], String listaplaca[]) {
		int inic;
		for (inic=0;inic<=4;inic++) {
			listanombre[inic] = "0";
			listatelefono[inic] = "0";
			listamarca[inic] = "0";
			listaplaca[inic] = "0";
		}
	}

	// ###############################################################################
	// #############################################################################
	public static void consultarplaca(String listanombre[], String listatelefono[], String listamarca[], String listaplaca[], SIN_TIPO i, int j) {
		for (j=0;j<=4;j++) {
			if (!listaplaca[j].equals("0")) {
				System.out.println(listanombre[j]);
				System.out.println(listatelefono[j]);
				System.out.println(listamarca[j]);
				System.out.println(listaplaca[j]);
			} else {
				System.out.println("No hay Veh�culos en el parqueadero en la posici�n :"+j);
			}
		}
	}

	// ##########################################################################
	// #############################################################################
	public static boolean placanueva(SIN_TIPO listanombre, SIN_TIPO listatelefono, SIN_TIPO listamarca, String listaplaca[], SIN_TIPO i, double j, String placa, SIN_TIPO contador, boolean respuesta) {
		respuesta = false;
		for (j=0;j<=4;j++) {
			if ((listaplaca[j]==placa)) {
				respuesta = true;
			}
		}
		return respuesta;
	}


}

//**************************************************************************************
//PUNTO 8.  La escuela automovilística "El Maestro" requiere una aplicación que permita
//          registrar a sus clientes en los cursos de enseñanza automovilística y establecer 
//          quienes lo han aprobado para continuar con el trámite de adquirir la licencia de conducción. 
//          Para cada usuario se debe permitir registrar su ingreso al curso, consultar usuarios que 
//          hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
//          Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga presente que 
//          la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.
//**************************************************************************************

import java.io.*;

public class escuela_automovilistica {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	// ESCUELA AUTOMOVIL�STICA "EL MAESTRO"
	// ########################################################################
	// ################################################################################
	public static void main(String args[]) throws IOException {
		String aprobado;
		String cedula;
		int contador;
		int espacio;
		int i;
		int j;
		int k;
		String listacedula[];
		String listanombre[];
		String listaresultado[];
		String listatelefono[];
		String noaprobado;
		int opcion;
		int post;
		boolean respuesta;
		boolean resulprueba;
		boolean resultadosuma;
		int suma;
		int val;
		int val2;
		// Definir resulPrueba Como Logico;
		listanombre = new String[8];
		listacedula = new String[8];
		listatelefono = new String[8];
		listaresultado = new String[8];
		j = 0;
		opcion = 0;
		i = 0;
		contador = 0;
		k = 0;
		val = 0;
		val2 = 0;
		post = 0;
		noaprobado = "";
		respuesta = false;
		resulprueba = false;
		resultadosuma = false;
		inicializar(listanombre,listacedula,listatelefono,listaresultado);
		do {
			System.out.println("*************************************************");
			System.out.println("");
			System.out.println("ESCUELA AUTOMOVIL�STICA");
			System.out.println("");
			System.out.println("Elija la Opci�n: ");
			System.out.println("");
			System.out.println("1. Registrar Usuario Ingreso al Curso: ");
			System.out.println("2. Consultar Usuarios en el Curso: ");
			System.out.println("3. Presentar Prueba: ");
			System.out.println("4. Consultar Resultado de Usuario: ");
			System.out.println("5. Eliminar Usuario: ");
			System.out.println("6. Salir: ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("*************************************************");
				System.out.println("Registrar Usuario Ingreso al Curso : "+8-i);
				if (i==0 || i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7) {
					for (j=0;j<=7;j++) {
						if (listacedula[j].equals("0")) {
							contador = contador+1;
							k = j;
							j = 8;
							System.out.println("Usuarios en Curso = "+k+" Capacidad del Curso  = "+j);
						}
					}
					// ###########################################################################
					contador = i;
					val = 0;
					if (i<=7) {
						espacio = i;
						i = k;
						System.out.println("Posici�n en el Curso = "+i+1);
						System.out.println("");
						System.out.println("Nombre Completo Usuario : ");
						listanombre[i] = bufEntrada.readLine();
						System.out.println("Tel�fono Usuario: ");
						listatelefono[i] = bufEntrada.readLine();
						// Escribir "Curso Aprobado: ",noAprobado;
						// Leer listaResultado[i];
						listaresultado[i] = "No Aprobado";
						while (val==0) {
							System.out.println("C�dula Usuario: ");
							cedula = bufEntrada.readLine();
							if (cedula.length()==3) {
								respuesta = cedulanueva(listanombre,listatelefono,listaresultado,listacedula,i,j,cedula,contador,respuesta);
								if (respuesta==true) {
									System.out.println("Usuario con N�mero de C�dula "+cedula+"  ya est� inscrito en el Curso. ");
									val = 1;
								} else {
									listacedula[i] = cedula;
									i = i+1;
									val = 1;
								}
							} else {
								System.out.println("C�dula No V�lida. Verifique los d�gitos.  ");
								val = 0;
								contador = 0;
							}
						}
					}
				}
				System.out.println(i);
				System.out.println("Espacio en el Curso = "+8-i);
				break;
			case 2:
				System.out.println("*************************************************");
				System.out.println("Consultar Usuarios en el Curso : ");
				System.out.println("Disponibilidad de espacio en el curso = "+8-i);
				consultarcedula(listanombre,listatelefono,listaresultado,listacedula,i,j);
				break;
			case 3:
				System.out.println("*************************************************");
				System.out.println("Presentar Prueba");
				val2 = 0;
				j = 0;
				System.out.println("Usuarios en el curso : "+i);
				if (i==0 || i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7) {
					// Mientras val2 = 0 Hacer
					System.out.println("Digite el N�mero de C�dula del Usuario a Realizar la Prueba :");
					cedula = bufEntrada.readLine();
					for (j=0;j<=7;j++) {
						if ((listacedula[j].equals(cedula))) {
							resultadosuma = prueba(listanombre,listatelefono,listaresultado,listacedula,i,j,cedula,contador,resultadosuma);
							if (resultadosuma==true) {
								System.out.println("Curso Aprobado por el Usuario identificado con c�dula n�mero "+cedula);
								listanombre[j] = listanombre[j];
								listatelefono[j] = listatelefono[j];
								listaresultado[j] = "Aprobado";
								listacedula[j] = listacedula[j];
								// val2 <- 1;
							}
						} else {
							respuesta = cedulanueva(listanombre,listatelefono,listaresultado,listacedula,i,j,cedula,contador,respuesta);
							if (respuesta==false) {
								System.out.println("Usuario con N�mero de C�dula "+cedula+" no est� inscrito en el Curso. ");
								// Escribir "C�dula No V�lida. Verifique los d�gitos.  ";
								// val2 <- 1;
								// contador <- 0; 
							}
						}
					}
					// FinMientras
				}
				// respuesta <- cedulaNueva[listaNombre,listaTelefono,listaResultado,listaCedula,i,j,cedula,contador,respuesta];
				// si respuesta = Verdadero Entonces
				// Escribir "Usuario con N�mero de C�dula ", cedula, "  presentar la siguiente Prueba. ";
				// resultadoSuma<- prueba(listaNombre,listaTelefono,listaResultado,listaCedula,i,j,cedula,contador,resultadoSuma);
				// si resultadoSuma = Verdadero Entonces
				// Escribir "Curso Aprobado por el Usuario identificado con c�dula n�mero ", cedula;
				// listaNombre(j)<-listaNombre(j);
				// listaTelefono(j)<-listaTelefono(j);
				// listaResultado(j)<-"Aprobado";
				// listaCedula(j)<-listaCedula(j);
				// val2 <- 1;
				// FinSi 
				// resulPrueba <- cedulaPrueba(listaNombre,listaTelefono,listaResultado,listaCedula,i,j,cedula,contador,respuesta, resulPrueba);
				// si resulPrueba = verdadero Entonces
				// Escribir "Usuario con N�mero de C�dula ", cedula, "  presentar la siguiente Prueba. ";
				// resultadoSuma<- prueba(resultadoSuma);
				// si resultadoSuma = Verdadero Entonces
				// Escribir "Curso Aprobado por el Usuario identificado con c�dula n�mero ", cedula;
				// listaResultado(j)<-"Aprobado";
				// val2 <- 1;
				// FinSi
				break;
			case 4:
				System.out.println("*************************************************");
				System.out.println("Consultar Resultados de Usuario : ");
				j = 0;
				System.out.println("Usuarios en el curso : "+i);
				if (i==0 || i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7) {
					System.out.println("Digite el N�mero de C�dula del Usuario a Consultar :");
					cedula = bufEntrada.readLine();
					for (j=0;j<=7;j++) {
						if ((listacedula[j].equals(cedula))) {
							System.out.println("Usuario con N�mero de C�dula "+listacedula[j]+" Curso "+listaresultado[j]);
						} else {
							System.out.println("Numero de c�dula no encontrada en la posici�n: "+j);
						}
					}
				} else {
					System.out.println("No hay Usuarios Inscritos en el Curso Automovil�stico");
				}
				break;
			case 5:
				System.out.println("*************************************************");
				System.out.println("Eliminar Usuario del Curso : ");
				j = 0;
				System.out.println("Usuarios en el curso : "+i);
				if (i==0 || i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7) {
					System.out.println("Digite el N�mero de C�dula del Usuario a Eliminar :");
					cedula = bufEntrada.readLine();
					for (j=0;j<=7;j++) {
						if ((listacedula[j].equals(cedula))) {
							System.out.println("Usuario con n�mero de c�dula "+listacedula[j]+" eliminado.");
							listanombre[j] = "0";
							listatelefono[j] = "0";
							listaresultado[j] = "0";
							listacedula[j] = "0";
							if (i==0 || i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7) {
								for (j=post;j<=i-1;j++) {
									listanombre[j] = listanombre[j+1];
									listatelefono[j] = listatelefono[j+1];
									listaresultado[j] = listaresultado[j+1];
									listacedula[j] = listacedula[j+1];
								}
								// j<-j+1;
								i = i-1;
							}
						} else {
							System.out.println("Numero de c�dula no encontrada en la posici�n: "+j);
						}
					}
				} else {
					System.out.println("No hay Usuarios Inscritos en el Curso Automovil�stico");
				}
				break;
			case 6:
				System.out.println("*************************************************");
				System.out.println("Salir control Curso");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=6);
	}

	// ################################################################################
	public static void inicializar(String listanombre[], String listatelefono[], String listaresultado[], String listacedula[]) {
		int inic;
		for (inic=0;inic<=7;inic++) {
			listanombre[inic] = "0";
			listatelefono[inic] = "0";
			listaresultado[inic] = "0";
			listacedula[inic] = "0";
		}
	}

	// ###############################################################################
	// #############################################################################
	public static void consultarcedula(String listanombre[], String listatelefono[], String listaresultado[], String listacedula[], SIN_TIPO i, int j) {
		for (j=0;j<=7;j++) {
			if (!listacedula[j].equals("0")) {
				System.out.println("Usario: "+listanombre[j]);
				System.out.println("Tel�fono: "+listatelefono[j]);
				System.out.println("Resultado Curso: "+listaresultado[j]);
				System.out.println("C�dula: "+listacedula[j]);
			} else {
				System.out.println("No hay Usuarios en el curso en la posici�n :"+j);
			}
		}
	}

	// ##########################################################################
	// #############################################################################
	public static boolean cedulanueva(SIN_TIPO listanombre, SIN_TIPO listatelefono, SIN_TIPO listaresultado, String listacedula[], SIN_TIPO i, double j, String cedula, SIN_TIPO contador, boolean respuesta) {
		respuesta = false;
		for (j=0;j<=7;j++) {
			if ((listacedula[j]==cedula)) {
				respuesta = true;
			}
		}
		return respuesta;
	}

	// ##############################################################################################################################
	public static boolean prueba(SIN_TIPO listanombre, SIN_TIPO listatelefono, SIN_TIPO listaresultado, SIN_TIPO listacedula, SIN_TIPO i, SIN_TIPO j, SIN_TIPO cedula, SIN_TIPO contador, boolean resultadosuma) throws IOException {
		int suma;
		resultadosuma = false;
		System.out.println("Digite el RESULTADO de la SUMA de 10 + 10; ");
		suma = Integer.parseInt(bufEntrada.readLine());
		if (suma==20) {
			resultadosuma = true;
		} else {
			System.out.println("Prueba No Aprobada");
		}
		return resultadosuma;
	}

	// ###############################################################################
	public static boolean cedulaprueba(SIN_TIPO listanombre, SIN_TIPO listatelefono, SIN_TIPO listaresultado, String listacedula[], SIN_TIPO i, double j, String cedula, SIN_TIPO contador, SIN_TIPO respuesta, boolean resulprueba) {
		resulprueba = false;
		for (j=0;j<=7;j++) {
			if ((listacedula[j]==cedula)) {
				resulprueba = true;
			}
		}
		return resulprueba;
	}


}

