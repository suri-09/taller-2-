import javax.swing.JOptionPane;


public class Variable {
    public static void main(String[] args) {
  
        //Declaracion de variables
        int a;
        float b;
        byte c;
        double d;
        int e;
        float f;
        byte g;
        double h;
        int j;
        float k;
        byte l;
        double m;
        int n;
        float o;
        byte p;
        double q;
        int r;
        float s;
        byte t;
        double u;

        //Asignacion de valores a las variables
        a = 1;//
        b = 2f;//
        c = 30;//
        d = 4.01;//
        e = 5;//
        f = 6f;//
        g = 78;//
        h = 8.01;//
        j = 9;
        k = 10f;
        l = 120;
        m = 12.01;
        n = 13;//
        o = 14f;
        p = -15;
        q = 16.01;
        r = 17;//
        s = 18f;
        t = 109;
        u = 20.01;

        //Reasignacion de valores a las variables
        a = e;
        b = f;
        c = g;
        d = h;
        n = r;

        //Reasignacion de valores a otros datos hardcoded
        j = 17;
        k = 25.4f;
        l = -27;
        m = 49.2;
        o = 50.3f;
        p = -38;
        q = 60.4;
        s = 70.5f;
        t = 80;
        u = 90.6;
 
        //Creación de variable char


        

        //Programa 
        int opcion;
        Double x; 
        Double y;
        Double z; 


        JOptionPane.showMessageDialog(null, "Bienvenido a nuestra calculadora de ecuaciones");
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Solución de ecuación 1 \n 2) Solución de ecuación 2 \n 3) Salida"));
                switch (opcion) {
                    case 1:
                    x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor de x"));
                    z  = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor de z"));
                    y = (3*x)/((1+(3*x)/(3*(z*z)+2))/(1/((1/(1+z))+(3*(x*x))+(2*z)+3)));
                    JOptionPane.showMessageDialog(null, "Este es el valor de y: " + y);
                    break;
            
                    case 2:

                    break;

                    case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestra calculadora de ecuaciones");

                 default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, digíte una opción válida");

                    break;
                }
        }
        while (opcion != 1 && opcion != 2 && opcion != 3);
    }
}