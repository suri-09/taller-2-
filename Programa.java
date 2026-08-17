import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        
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
