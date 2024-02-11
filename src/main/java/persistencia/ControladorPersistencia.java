/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alerta;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jose
 */
public class ControladorPersistencia {

    AlertaJpaController ajc = new AlertaJpaController();
    UsuarioJpaController ujc = new UsuarioJpaController();

    public void crearAlerta(Alerta alerta) {
        ajc.create(alerta);
    }

    public void crearUsuario(Usuario usuario) {
        ujc.create(usuario);
    }

    public List<Alerta> traerAlertas() {
        return ajc.findAlertaEntities();
    }

    public List<Usuario> traerUsuarios() {
        return ujc.findUsuarioEntities();
    }

    public Alerta findAlertaById(Long id) {
        return ajc.findAlerta(id);
    }

    public void editarAlerta(Alerta alerta) {
        try {
            ajc.edit(alerta);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAlerta(long id_alerta) {
        try {
            ajc.destroy(id_alerta);
        } catch (NonexistentEntityException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario findUsuarioById(Long id) {
        return ujc.findUsuario(id);
    }

    public void eliminarUsuario(long id) {
        try {
            ujc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario usuario) {
        try {
            ujc.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
