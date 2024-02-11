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

    public List<Usuario> traerUsuarios() {
        return cp.traerUsuarios();
    }
    
    public Usuario findUsuario(Long id){
        return cp.findUsuarioById(id);
    }
    
    public void eliminarUsuario(long id){
        cp.eliminarUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario){
        cp.editarUsuario(usuario);
    }
    
    public Alerta findAlerta(Long id){
        return cp.findAlertaById(id);
    }
    
    public void eliminarAlerta(long id){
        cp.eliminarAlerta(id);
    }
    
    public void editarAlerta(Alerta alerta){
        cp.editarAlerta(alerta);
    }
    
}
