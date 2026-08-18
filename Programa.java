// Surisaddai Pulgarin Torres
// Emanuel Zuluaga 
import java.util.Scanner; // Se importó el Scanner 

public class Programa {
    public static void main(String[] args) {

        Scanner inicio = new Scanner(System.in);
        // Aun no se inicializan las variables 
        // Pero si se declaran las variables 
        int opcion = 0;
        double y; 
        double x; 
        double z; 

        while (opcion != 3) {
            //Inicio del programa, se usa while para 
            //que el programa no pare a menos de que le des a la 
            //opción de salida
            System.out.println("_______________________________");
            System.out.println("\n---- BIENVENIDO AL PROGRAMA ----" );
            System.out.println(" Por favor ingrese una opción: ");
            System.out.println("_______________________________");
            System.out.println("\n[1] Ejercicio 1");
            System.out.println("[2] Ejercicio 2");
            System.out.println("[3] Salir");

            opcion = inicio.nextInt();

            if (opcion == 1) {
                //Primer caso, no hay problema si alguna de las dos 
                //variables es cero 
                System.out.print("Elige que número quieres que tenga la variable [x]: ");
                x = inicio.nextDouble();
                System.out.print("Elige que número quieres que tenga la variable [z]: ");
                z = inicio.nextDouble();

                y = ((3*x/(1 + (3*x/(((3*(z*z)) + 2)/(1/((1/(1 + z))+(3*(x*x))+(2*z)+3)))))));

                System.out.println("El resultado de la operación es igual a :" + y);
            }

            else if (opcion == 2) {
                //Segundo caso, [z] no puede ser igual a cero
                System.out.print("Elige que número quieres que tenga la variable [x]: ");
                x = inicio.nextDouble();
                System.out.print("Elige que número quieres que tenga la variable [z]: ");
                z = inicio.nextDouble();

                //Se usa While para que el usuario ingrese un 
                //número distinto a 0 en [z] 
                //Se va a repetir siempre y cuando [z] sea distinto a 0
                while (z == 0){

                System.out.println("El valor de [z] debe ser distinto de 0 ");
                System.out.print("Intenta de nuevo. Ingrese el valor para [z]: ");
                z = inicio.nextDouble();   
                
                }
                 
                y = ((((x*x) + (3*z) + 2)/(2+(1/(1+(2*z)))))+(2/((1+(3*(x*x*x)+(3*z)+2))/1/(1/((1+(3*x))+((3*x)+1/((2*z)+3/(1 + (5/z)))))))));
                System.out.println("El resultado es : "+ y);                
            }

            else if (opcion == 3){
                //Tercer caso, solo sale del programa 
                System.out.print("Saliendo del programa...¡Gracias por su visita!");
            }

            else {
                //Cuarto caso, se va a repetir el programa hasta que 
                //el usuario elija una opción válida 
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
              
        }
        


    }

}
