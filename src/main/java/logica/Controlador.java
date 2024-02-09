/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladorPersistencia;
/**
 *
 * @author jose
 */
public class Controlador {

    ControladorPersistencia cp = new ControladorPersistencia();

    public void crearAlerta(Alerta alerta) {
        cp.crearAlerta(alerta);
    }
    
    public void crearUsuario(Usuario usuario){
        cp.crearUsuario(usuario);
    }

    public List<Alerta> traerAlertas() {
        return cp.traerAlertas();
    }
}
