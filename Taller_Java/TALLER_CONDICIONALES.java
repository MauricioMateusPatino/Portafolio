//************************************************************************************************
//PUNTO 1.  Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor o 
//			igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad. */
//***********************************************************************************************  */

import java.io.*;

public class taller_condicionales_punto1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		System.out.println("Digite su edad:");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad>=18) {
			System.out.println("Usted es mayor de edad.");
		}
	}


}

//************************************************************************************************
//PUNTO 2.  Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor 
//          a 18 años, deberá mostrar en pantalla: Usted aún es un niño(a).
//***********************************************************************************************  */

import java.io.*;

public class taller_condicionales_punto2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		System.out.println("Digite su edad:");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad<=18) {
			System.out.println("Usted a�n es un ni�o(a).");
		}
	}


}

//************************************************************************************************
//PUNTO 3. Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. 
//         Si la persona es mayor o igual a 18 años, entonce se deberá imprimir en pantalla 
//         [Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta. 
//		   Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje: 
//         [Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
//***********************************************************************************************  */

import java.io.*;

public class taller_condicionales_punto3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		int edad;
		String nombre;
		System.out.println("Por favor digite su Nombre (Oprima Enter para continuar): ");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor digite sus Apellidos (Oprima Enter para continuar): ");
		apellidos = bufEntrada.readLine();
		System.out.println("Por favor digite su edad (Oprima Enter para continuar): ");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad>=18) {
			System.out.println(nombre+" "+apellidos+" "+" Usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
		} else {
			System.out.println(nombre+" "+apellidos+" "+" Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devu�lvase a su casa.");
		}
	}


}

//************************************************************************************************
//PUNTO 4.  La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, 
//          requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. 
//          Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles
//          y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a 
//          presentar daños u otra novedad sobre la película.
//***********************************************************************************************  */

import java.io.*;

public class taller_condicionales_punto4 {

	// VIDEO TIENDA BARRIO PORVENIR
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cedulausuario;
		int codigopelicula;
		String nombreusuario;
		String observaciones;
		int opcion;
		boolean opciondano;
		int telefonousuario;
		opciondano = false;
		System.out.println("Consulte alquiler de pel�culas en la videotienda");
		System.out.println("Elija una Opci�n:");
		System.out.println("1. Alquilar Pel�culas");
		System.out.println("2. Consultar Pel�culas Disponibles");
		System.out.println("3. Devoluci�n Pel�culas");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Digite su Nombre Completo:");
			nombreusuario = bufEntrada.readLine();
			System.out.println("Digite su N�mero de C�dula:");
			cedulausuario = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Digite su N�mero de Tel�fono:");
			telefonousuario = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Digite C�digo de la Pel�cula:");
			codigopelicula = Integer.parseInt(bufEntrada.readLine());
			break;
		case 2:
			System.out.println("Pel�culas Disponibles");
			System.out.println("01-AAAA");
			System.out.println("02-BBBB");
			System.out.println("03-CCCC");
			System.out.println("04-DDDD");
			System.out.println("05-EEEE");
			System.out.println(".......");
			System.out.println(".......");
			break;
		case 3:
			System.out.println("Devoluci�n de Pel�cula");
			System.out.println("Presenta observaciones la devoluci�n (Verdadero/Falso):");
			opciondano = Boolean.parseBoolean(bufEntrada.readLine());
			if (opciondano==true) {
				System.out.println("Observaciones:");
				observaciones = bufEntrada.readLine();
			}
			break;
		default:
			System.out.println("La opci�n elegida no existe");
		}
	}


}


//************************************************************************************************
//PUNTO 5.  La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación 
//          para poder facturar los productos que vende a sus clientes y para ello, los productos tienen 
//          unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. 
//          Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y 
//          devoluciones en caso de que se presenten.
//***********************************************************************************************  */

import java.io.*;

public class taller_condicionales_punto5 {

	// DROGUERIA MI SALUD LOCALIDAD SUBA
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String caracteristicas1;
		String caracteristicas2;
		String caracteristicas3;
		String caracteristicas4;
		String caracteristicas5;
		int codigoproducto1;
		int codigoproducto2;
		int codigoproducto3;
		int codigoproducto4;
		int codigoproducto5;
		String continualistado;
		String observaciones;
		int opcion;
		boolean opciondano;
		int opcionpro;
		String producto1;
		String producto2;
		String producto3;
		String producto4;
		String producto5;
		int valorproducto1;
		int valorproducto2;
		int valorproducto3;
		int valorproducto4;
		int valorproducto5;
		producto1 = "AAAAAA";
		producto2 = "BBBBBB";
		producto3 = "CCCCCC";
		producto4 = "DDDDDD";
		producto5 = "EEEEEE";
		continualistado = "-----Contin�a Listado------";
		codigoproducto1 = 0001;
		codigoproducto2 = 0002;
		codigoproducto3 = 0003;
		codigoproducto4 = 0004;
		codigoproducto5 = 0005;
		caracteristicas1 = "xxxxx---xxxxxx---xxxx";
		caracteristicas2 = "++++++----++++---++++";
		caracteristicas3 = "$4$$$$$****----------";
		caracteristicas4 = "!!!&/8))0----)=?=----";
		caracteristicas5 = "+���}}�{l�-----------";
		valorproducto1 = 1000;
		valorproducto2 = 2000;
		valorproducto3 = 3000;
		valorproducto4 = 4000;
		valorproducto5 = 5000;
		opciondano = false;
		System.out.println("Consulte productos de la Drogueria MI SALUD");
		System.out.println("Elija una Opci�n:");
		System.out.println("1. Consultar Productos Existentes");
		System.out.println("2. Consultar Valor Producto");
		System.out.println("3. Comprar Producto");
		System.out.println("4. Devoluci�n ");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Productos");
			System.out.println("C�DIGO : "+codigoproducto1+" "+producto1+" CARACTERISTICAS : "+caracteristicas1+" VALOR ; ($)"+valorproducto1);
			System.out.println("C�DIGO : "+codigoproducto2+" "+producto2+" CARACTERISTICAS : "+caracteristicas2+" VALOR ; ($)"+valorproducto2);
			System.out.println("C�DIGO : "+codigoproducto3+" "+producto3+" CARACTERISTICAS : "+caracteristicas3+" VALOR ; ($)"+valorproducto3);
			System.out.println("C�DIGO : "+codigoproducto4+" "+producto4+" CARACTERISTICAS : "+caracteristicas4+" VALOR ; ($)"+valorproducto4);
			System.out.println("C�DIGO : "+codigoproducto5+" "+producto5+" CARACTERISTICAS : "+caracteristicas5+" VALOR ; ($)"+valorproducto5);
			System.out.println(continualistado);
			break;
		case 2:
			System.out.println("Digite el C�gico del Producto que desea Consultar:");
			opcionpro = Integer.parseInt(bufEntrada.readLine());
			if (opcionpro==0001) {
				System.out.println(producto1+" Valor :"+valorproducto1);
			} else {
				if (opcionpro==0002) {
					System.out.println(producto2+" Valor :"+valorproducto2);
				} else {
					if (opcionpro==0003) {
						System.out.println(producto3+" Valor :"+valorproducto3);
					} else {
						if (opcionpro==0004) {
							System.out.println(producto4+" Valor :"+valorproducto4);
						} else {
							if (opcionpro==0005) {
								System.out.println(producto5+" Valor :"+valorproducto5);
							} else {
								System.out.println("La opci�n elegida no existe");
							}
						}
					}
				}
			}
			break;
		case 3:
			System.out.println("Digite el c�digo del Producto que desea Comprar :");
			opcionpro = Integer.parseInt(bufEntrada.readLine());
			if (opcionpro==0001) {
				System.out.println(producto1+" Valor :"+valorproducto1);
			} else {
				if (opcionpro==0002) {
					System.out.println(producto2+" Valor :"+valorproducto2);
				} else {
					if (opcionpro==0003) {
						System.out.println(producto3+" Valor :"+valorproducto3);
					} else {
						if (opcionpro==0004) {
							System.out.println(producto4+" Valor :"+valorproducto4);
						} else {
							if (opcionpro==0005) {
								System.out.println(producto5+" Valor :"+valorproducto5);
							} else {
								System.out.println("La opci�n elegida no existe");
							}
						}
					}
				}
			}
			break;
		case 4:
			System.out.println("Devoluci�n ");
			System.out.println("Presenta observaciones de la devoluci�n (Verdadero/Falso):");
			opciondano = Boolean.parseBoolean(bufEntrada.readLine());
			if (opciondano==true) {
				System.out.println("Escriba las Observaciones:");
				observaciones = bufEntrada.readLine();
			}
			break;
		default:
			System.out.println("La opci�n elegida no existe");
		}
	}


}

//************************************************************************************************
//PUNTO 6.  La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación 
//          para poder facturar los productos que vende a sus clientes y para ello, los productos tienen 
//          unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. 
//          Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y 
//          devoluciones en caso de que se presenten.
//***********************************************************************************************  */

import java.io.*;

public class taller_conidicionales_punto6 {

	// TALLER DE MOTOS EL MAQUINISTA
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String arreglosejecutados;
		int cedulausuario;
		String fechaing;
		String fechasal;
		String mecanico;
		String nombreusuario;
		String novedadessalida;
		String observaciones;
		String observacionesingreso;
		int opcion;
		boolean opcioninventario;
		String placamoto;
		double telefonousuario;
		nombreusuario = "Mauricio Mateus";
		cedulausuario = 548545554;
		telefonousuario = 3102796437;
		placamoto = "AAA111";
		observacionesingreso = "Reparaci�n sistema el�ctrico, cambio de cadena. Regular estado de pintura.";
		fechaing = "22/05/2022";
		mecanico = "Jorge Toro";
		novedadessalida = "Manntenimiento de sistema el�ctrico, Cambio de kit de arrastre, sincronizaci�n, ajuste de frenos.";
		arreglosejecutados = "Instalaci�n de 2 Bombillos, Cambio fusible, Cambio Kit Arrastre.";
		fechasal = "28/05/2022";
		opcioninventario = false;
		System.out.println("Servicios Taller");
		System.out.println("Elija una Opci�n:");
		System.out.println("1. Registro de Ingreso Veh�culo");
		System.out.println("2. Registro de salida Veh�culo");
		System.out.println("3. Mantenimiento Realizado");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Digite Nombre Due�o Vehiculo:");
			nombreusuario = bufEntrada.readLine();
			System.out.println("Digite su N�mero de C�dula:");
			cedulausuario = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Digite su N�mero de Tel�fono:");
			telefonousuario = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Digite Placa Veh�culo:");
			placamoto = bufEntrada.readLine();
			System.out.println("REGISTRO DE INGRESO VEHICULO;");
			System.out.println("Digite la fecha de ingreso del veh�culo (dd/mm/aaaa);");
			fechaing = bufEntrada.readLine();
			System.out.println("Digite el nombre completo del Mec�nico que recibe el veh�culo:");
			mecanico = bufEntrada.readLine();
			System.out.println("Digite las observaciones que presenta el veh�culo en el ingreso al taller : ");
			observacionesingreso = bufEntrada.readLine();
			System.out.println("**************************************************************************");
			System.out.println("El registro de ingreso del veh�culo es el siguiente");
			System.out.println("Veh�culo Motocileta de Placas : "+placamoto+" propietario "+nombreusuario+" CC "+cedulausuario);
			System.out.println("Fecha de Ingreso "+fechaing+" "+observacionesingreso+" motocicleta recibida por : "+mecanico+".");
			break;
		case 2:
			System.out.println("Digite la placa del Veh�culo : ");
			placamoto = bufEntrada.readLine();
			if (placamoto.equals("AAA111")) {
				System.out.println("El registro de salida del veh�culo es el siguiente");
				System.out.println("Veh�culo Motocileta de Placas : "+placamoto+" propietario "+nombreusuario+" CC "+cedulausuario);
				System.out.println("Fecha de Ingreso "+fechaing+" Con Observaciones de Ingreso de : "+observacionesingreso+" motocicleta recibida por : "+mecanico+".");
				System.out.println("Con el siguiente reporte:");
				System.out.println(novedadessalida+" con fecha de salida de :"+fechasal);
			} else {
				System.out.println("Veh�culo motocicleta no se encuentra en el taller");
			}
			break;
		case 3:
			System.out.println("Inventario/Cambios Repuestos");
			System.out.println("Requiere Inventario de arreglos y respuestos? (Verdadero/Falso):");
			opcioninventario = Boolean.parseBoolean(bufEntrada.readLine());
			if (opcioninventario==true) {
				System.out.println("Digite la placa del Veh�culo : ");
				placamoto = bufEntrada.readLine();
				if (placamoto.equals("AAA111")) {
					System.out.println("Veh�culo Motocileta de Placas : "+placamoto+" propietario "+nombreusuario+" CC "+cedulausuario);
					System.out.println("Observaciones Motocilceta : "+arreglosejecutados);
				} else {
					System.out.println("Veh�culo motocicleta no se encuentra en el taller");
				}
			}
			break;
		default:
			System.out.println("La opci�n elegida no existe");
		}
	}


}


//************************************************************************************************************************ 
//PUNTO 7.  La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal)
//          y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados,
//          debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
//************************************************************************************************************************ */

import java.io.*;
import java.math.*;

public class taller_condicionales_punto7 {

	// MINISTERIO DE SALUD - MASA CORPORAL -
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double estatura;
		double imc;
		double peso;
		System.out.println("Digite el n�mero de su peso en Kg: ");
		peso = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Digite el n�mero de su estatura en metros:");
		estatura = Double.parseDouble(bufEntrada.readLine());
		imc = peso/(Math.pow(estatura,2));
		System.out.println("Su imc (Indice de Masa Corporal) es de : "+imc);
		if (imc<18.5) {
			System.out.println("La persona se encuentra bajo de peso");
		}
		if (imc>=18.5 && imc<25) {
			System.out.println("La persona se encuentra en su peso normal");
		}
		if (imc>=25 && imc<30) {
			System.out.println("La persona se encuentra con sobrepeso");
		}
		if (imc>30) {
			System.out.println("La persona se encuntra con obesidad");
		}
	}


}

//************************************************************************************************************************ 
//PUNTO 8.  El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita registrar 
//          los pedidos de los clientes en cuanto a las tortas que realiza. Cada torta tiene unas características propias como sabor,
//          cantidad (porciones) y decoraciones). Se requiere que la aplicación permita registrar los pedidos, las tortas 
//          disponibles y las ventas que se registren diariamente.
//************************************************************************************************************************ */

import java.io.*;

public class taller_condicionales_punto8 {

	// PASTELERO DON CARLOS
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String caracteristicastorta;
		int opcion;
		int pedido;
		int pedidototal;
		String tordisponible;
		pedidototal = 0;
		do {
			System.out.println("Consulta producto  de TORTA en la panaderia");
			System.out.println("Elija una Opci�n:");
			System.out.println("1. Registrar Pedido");
			System.out.println("2. Consultar Tortas Disponibles");
			System.out.println("3. Consultar ventas dia");
			System.out.println("4. salir");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Digite numero de tortas para llevar:");
				pedido = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Digite las caracteristicas de la torta");
				caracteristicastorta = bufEntrada.readLine();
				System.out.println("PEDIDO REGISTRADO");
				pedidototal = pedido+pedidototal;
				break;
			case 2:
				System.out.println("-----TORTAS DISPONIBLES-----");
				System.out.println("Torta de Chocolate");
				System.out.println("Torta de vainilla");
				System.out.println("Torta Frutos Rojos");
				System.out.println("Torta de Frutas");
				break;
			case 3:
				System.out.println("El total del TORTAS DEL D�A FUERON : "+pedidototal);
				break;
			case 4:
				System.out.println("GRACIAS POR SU PEDIDO ***** SALIR");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=4);
	}


}

//************************************************************************************************************************ 
//PUNTO 9.  El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes 
//          figuras geométricas, para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores 
//          al estudiante. La aplicación debe permitir que el estudiante seleccione si desea calcular el área de un rectángulo, 
//          triángulo o trapecio. No olvide solicitar los datos necesarios para realizar cada cálculo y mostrar su respectivo resultado.
//************************************************************************************************************************ */

import java.io.*;

public class taller_condicionales_punto9 {

	// PROFESOR MATEM�TICAS BUSQUEDA AREAS DE FIGURAS GEOMETRICAS
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double alturarect;
		double alturatrap;
		double alturatrian;
		double arearect;
		double areatrap;
		double areatrian;
		double basemayor;
		double basemenor;
		double baserect;
		double basetrian;
		int opcion;
		do {
			System.out.println("**************************************************************");
			System.out.println("Consulta �reas de figura geom�trica");
			System.out.println("Elija una Opci�n:");
			System.out.println("1. �rea del Rect�ngulo");
			System.out.println("2. �rea del Tri�ngulo");
			System.out.println("3. �rea del Trapecio");
			System.out.println("4. Salir Consulta");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("�REA DEL RECTANGULO:");
				System.out.println("Digite la medida de la Base : ");
				baserect = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Digite la medida de la �ltura : ");
				alturarect = Double.parseDouble(bufEntrada.readLine());
				arearect = baserect*alturarect;
				System.out.println("El �rea de la figura geom�trica del Rectangulo es : "+arearect);
				break;
			case 2:
				System.out.println("�REA DEL TRIANGULO:");
				System.out.println("Digite la medida de la Base : ");
				basetrian = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Digite la medida de la �ltura : ");
				alturatrian = Double.parseDouble(bufEntrada.readLine());
				areatrian = (basetrian*alturatrian)/2;
				System.out.println("El �rea de la figura geom�trica del Triangulo es : "+areatrian);
				break;
			case 3:
				System.out.println("�REA DEL TRAPECIO:");
				System.out.println("Digite la medida de la Base Mayor : ");
				basemayor = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Digite la medida de la Base Menor : ");
				basemenor = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Digite la medida de la Altura");
				alturatrap = Double.parseDouble(bufEntrada.readLine());
				areatrap = ((basemayor+basemenor)*alturatrap)/2;
				System.out.println("El �rea de la figura geom�trica del trapecio es : "+areatrap);
				break;
			case 4:
				System.out.println("---SALIR---");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=4);
	}


}

//************************************************************************************************************************ 
//PUNTO 10. El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para 
//          llevar las cuentas de sus usuarios; por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad. 
//          Para cada cliente las cuentas permitirán realizar ingresos, retiros o consultas de valor. En los ingresos no se pueden 
//          insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
//************************************************************************************************************************ */

import java.io.*;

public class taller_condicionales_punto10 {

	// SU BANCO FIEL
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cantidad;
		int consulta;
		String cuenta;
		int ingreso;
		int numerocuenta;
		int numerocuentanueva;
		int numerocuentaretiro;
		int opcion;
		int retiro;
		int saldo;
		String titular;
		saldo = 0;
		numerocuentanueva = 0;
		do {
			System.out.println("*******************************************************************");
			System.out.println("Digite la opci�n de la transcci�n que desea realizar");
			System.out.println("Elija una Opci�n:");
			System.out.println("1. Ingresar Dinero");
			System.out.println("2. Retirar Dinero");
			System.out.println("3. Consultar Saldo");
			System.out.println("4. salir");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("INGRESAR DINERO");
				System.out.println("Desea Ingresar Dinero a una Cuenta Nueva (Digite SI / NO) : ");
				cuenta = bufEntrada.readLine();
				if (cuenta.equals("SI")) {
					numerocuentanueva = 0;
					numerocuenta = 0;
					System.out.println("Digite Nombre Titular de la Cuenta :");
					titular = bufEntrada.readLine();
					System.out.println("Digite el N�mero de la Cuenta : ");
					numerocuentanueva = Integer.parseInt(bufEntrada.readLine());
					saldo = 0;
					System.out.println("Digite Cantidad de Dinero a Ingresar (Recuerde el valor debe ser mayor de 0)");
					cantidad = Integer.parseInt(bufEntrada.readLine());
					if (cantidad>=0) {
						saldo = saldo+cantidad;
						System.out.println("INGRESO DE DINERO EXITOSO");
					} else {
						System.out.println("Digite la cantidad de dinero correcta");
					}
				} else {
					if (cuenta.equals("NO")) {
						System.out.println("Digite el N�mero de la Cuenta existente : ");
						numerocuenta = Integer.parseInt(bufEntrada.readLine());
						if (numerocuenta==numerocuentanueva) {
							System.out.println("Digite Cantidad de Dinero a Ingresar (Recuerde el valor debe ser mayor de 0)");
							cantidad = Integer.parseInt(bufEntrada.readLine());
							if (cantidad>=0) {
								saldo = saldo+cantidad;
								System.out.println("INGRESO DE DINERO EXITOSO");
							} else {
								System.out.println("Digite la cantidad de dinero correcta");
							}
						} else {
							System.out.println("N�mero de Cuenta no V�lida");
						}
					}
				}
				System.out.println("La opci�n elegida no existe (Verifique las letras may�sculas)");
				break;
			case 2:
				System.out.println("RETIRAR DINERO");
				System.out.println("Digite el N�mero de Cuenta : ");
				numerocuentaretiro = Integer.parseInt(bufEntrada.readLine());
				if (numerocuentaretiro==numerocuentanueva) {
					System.out.println("Digite la Cantidad de Dinero a Retirar :");
					retiro = Integer.parseInt(bufEntrada.readLine());
					if (retiro<=saldo) {
						saldo = saldo-retiro;
						System.out.println("RETIRO EXITOSO");
					} else {
						System.out.println("No hay fondos suficientes en la cuenta");
					}
				} else {
					System.out.println("N�mero de Cuenta no V�lida");
				}
				break;
			case 3:
				System.out.println("CONSULTAR DINERO");
				System.out.println("Digite el N�mero de Cuenta : ");
				numerocuentaretiro = Integer.parseInt(bufEntrada.readLine());
				if (numerocuentaretiro==numerocuentanueva) {
					System.out.println(titular+" "+"con n�mero de cuenta "+numerocuentaretiro+" el saldo es : "+saldo+".");
				} else {
					System.out.println("N�mero de Cuenta no V�lida");
				}
				break;
			case 4:
				System.out.println("GRACIAS POR UTILIZAR NUESTRO BANCO --- SALIR---");
				break;
			default:
				System.out.println("La opci�n elegida no existe");
			}
		} while (opcion!=4);
	}


}

