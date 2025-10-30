
import java.util.Scanner;

public class OperacionesAlgebraicas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, respt;
        int num2;
        System.out.print("Deme el numero para calcular de Raiz cuadrada: ");
        num1 = tcl.nextDouble();
        respt = Math.sqrt(num1);
        //OPCION1 (con ln => line del println)
        //System.out.println("La raiz cuadrada de: ["+num1+"] es: " + respt);
        
        //OPCION2 (sin ln => line del print)
        //System.out.print("La raiz cuadrada de: ["+num1+"] es: ");
        //System.out.println(respt);
        
        //OPCION3 => con pritf("formatoValores", valor1, {valor2}, {valorN})
        System.out.printf("%s %.2f %s %.2f \n", 
                             "La raiz de:", 
                             num1, 
                             "es", 
                             respt);
        
        System.out.print("Deme el numero ENTERO para calcular su potencia: ");
        num2 = tcl.nextInt();
        respt = Math.pow(num1, num2);
        System.out.println(num1+" elevado a "+num2+" es: "+respt);
        
    }
}
