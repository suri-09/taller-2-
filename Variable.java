import javax.swing.JOptionPane;//


public class Variable {
    public static void main(String[] args) {
  
// Declaracion de variables
        int int1;
        float float1;
        byte byte1;
        double double1;
        int int2;
        float float2;
        byte byte2;
        double double2;
        int int3;
        float float3;
        byte byte3;
        double double3;
        int int4;
        float float4;
        byte byte4;
        double double4;
        int int5;
        float float5;
        byte byte5;
        double double5;

        // Asignacion de valores a las variables
        int1 = 1;
        float1 = 2f;
        byte1 = 30;
        double1 = 4.01;
        int2 = 5;
        float2 = 6f;
        byte2 = 78;
        double2 = 8.01;
        int3 = 9;
        float3 = 10f;
        byte3 = 120;
        double3 = 12.01;
        int4 = 13;
        float4 = 14f;
        byte4 = -15;
        double4 = 16.01;
        int5 = 17;
        float5 = 18f;
        byte5 = 109;
        double5 = 20.01;

        // Reasignacion de valores a las variables
        int1 = int2;
        float1 = float2;
        byte1 = byte2;
        double1 = double2;
        int4 = int5;

        // Reasignacion de valores a otros datos hardcoded
        int3 = 17;
        float3 = 25.4f;
        byte3 = -27;
        double3 = 49.2;
        float4 = 50.3f;
        byte4 = -38;
        double4 = 60.4;
        float5 = 70.5f;
        byte5 = 80;
        double5 = 90.6;

        // Creación de variable char
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'C';
        char char4 = 'D';
        char char5 = '1';
        char char6 = '2';
        char char7 = '3';
        char char8 = '4';

        System.out.println(" "+ char1 + " " + char2 + " " + char3 + " " + char4 +" " + char5 + " " + char6 + " " + char7 + " " + char8);

        // Programa
        int opcion = 0;
        int pregunta = 0;
        Double x = 0.0;
        Double y = 0.0;
        Double z = 0.0;
        boolean entradaValida = false;

        JOptionPane.showMessageDialog(null, "Bienvenido a nuestra calculadora de ecuaciones");

        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1) Solución de ecuación 1 \n 2) Solución de ecuación 2 \n 3) Salida"));
                    entradaValida = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar una opción válida. \n Tipo de error: " + e);
                }
            } while (!entradaValida);
            entradaValida = false;

            switch (opcion) {
                case 1:
                    do {
                        try {
                            x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor de x"));
                            entradaValida = true;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,
                                    "Debe ingresar una opción válida. \n Tipo de error: " + e);
                        }
                    } while (!entradaValida);
                    entradaValida = false;
                    do {
                        try {
                            z = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor de z"));
                            entradaValida = true;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,
                                    "Debe ingresar una opción válida. \n Tipo de error: " + e);
                        }
                    } while (!entradaValida);
                    entradaValida = false;
                    do {
                        try {
                            y = (3 * x) / ((1 + (3 * x) / (3 * (z * z) + 2))
                                    / (1 / ((1 / (1 + z)) + (3 * (x * x)) + (2 * z) + 3)));
                            entradaValida = true;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,
                                    "Debe ingresar una opción válida. \n Tipo de error: " + e);
                        }
                    } while (!entradaValida);
                    entradaValida = false;
                    JOptionPane.showMessageDialog(null, "Este es el valor de y: " + y);

                    do {
                        do {
                            try {
                                pregunta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "¿Desea volver hacer una ecuación? \n 1) SI \n 2) NO"));
                                entradaValida = true;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null,
                                        "Debe ingresar una opción válida. \n Tipo de error: " + e);
                            }
                        } while (!entradaValida);
                        entradaValida = false;

                        if (pregunta != 1 && pregunta != 2) {
                            JOptionPane.showMessageDialog(null, "Opción no válida. Ingrese 1 para SI o 2 para NO.");
                        }
                    } while (pregunta != 1 && pregunta != 2);

                    if (pregunta == 1) {
                        opcion = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestra calculadora de ecuaciones");
                        opcion = 3;
                    }
                    break;

                case 2:
                    // Ecuacion 2 poner
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestra calculadora de ecuaciones");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, digíte una opción válida");
                    break;
            }
        } while (opcion != 3);
    }
}