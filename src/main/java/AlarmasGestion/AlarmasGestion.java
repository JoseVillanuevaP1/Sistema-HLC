package AlarmasGestion;

import igu.Principal;
import logica.Controlador;

public class AlarmasGestion {

    public static void main(String[] args) {

        //creamos la persistencia de datos
        Controlador controler = new Controlador();
        
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

    }
}
