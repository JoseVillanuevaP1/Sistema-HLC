/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import logica.Alerta;
import logica.Usuario;


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
    

}
