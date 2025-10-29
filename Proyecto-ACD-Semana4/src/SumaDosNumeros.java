
import java.util.Scanner;

/**
 * Ejercicio01: Dada la lectura de dos numero ingresados por teclado, presentar
 * las suma del los mismo
 * @author Daniel Irene
 * @version 1.0
 */

public class SumaDosNumeros {
    public static void main(String[] args) {
        //Sentencias para lectura de datos
        //[Nombre-Clase-API-JDK: Scanner] 
        //[nombre-variable] [=] [Nombre-Clase-API-JDK(tipo-Entrada-Datos: System.in)]
        Scanner teclado = new Scanner(System.in);
        int num1, num2, respuesta;
        System.out.println("Dame el PRIMER numero: "); //Carpinteria = TUNEAR
        num1 = teclado.nextInt(); //INGRESO DE DATOS DE ENTRADA
        System.out.println("Dame el SEGUNDO numero: ");  //Carpinteria = TUNEAR
        num2 = teclado.nextInt(); //INGRESO DE DATOS DE ENTRADA
        respuesta = num1 + num2;
        //Sentencias para escritura de resultados: sout ->
        System.out.println("La respesta es: ");
        System.out.println(respuesta);
    }
}

/**
 * RUN:
 * run:
Dame el PRIMER numero: 
3
Dame el SEGUNDO numero: 
-90
La respesta es: 
-87
BUILD SUCCESSFUL (total time: 9 seconds)
 */
