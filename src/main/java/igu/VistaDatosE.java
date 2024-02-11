package igu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Alerta;
import logica.Controlador;
import logica.Rol;
import logica.Usuario;

public class VistaDatosE extends javax.swing.JFrame {

    private long id_usuario = 0;
    private final Controlador controlador = new Controlador();
    private List<Usuario> usuarios;
    private List<Alerta> alertas;

    public VistaDatosE() {
        initComponents();
        cargarEmpleados();
        cargarAlertas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_ip = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jbox_rol = new javax.swing.JComboBox<>();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_alerts = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 184, 20));
        jLabel1.setText("VER DATOS EMPLEADOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hlc.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("DNI:");

        jLabel4.setText("IP:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Rol:");

        jbox_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USUARIO", "ADMINISTRADOR" }));

        btn_actualizar.setBackground(new java.awt.Color(0, 64, 129));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(0, 64, 129));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(list_alerts);

        jLabel8.setText("Alertas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_dni)
                            .addComponent(txt_ip)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono)
                            .addComponent(jbox_rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbox_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (id_usuario != 0) {

            //validar dni
            String dni = txt_dni.getText().trim();
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo DNI esta vacio.");
                return;
            }

            //validar nombre
            String nombre = txt_nombre.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo nombre esta vacio.");
                return;
            }

            //validar telefono
            String telefono = txt_telefono.getText().trim();
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo telefono esta vacio.");
                return;
            }

            //validar ip
            String ip = txt_ip.getText().trim();
            if (ip.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo IP esta vacio.");
                return;
            }

            //crear instancia Alerta
            Usuario usuario = new Usuario();
            usuario.setId_usuario(id_usuario);
            usuario.setDni(dni);
            usuario.setIp(ip);
            usuario.setNombre(nombre);
            usuario.setTelefono(telefono);

            //Mapear el rol seleccionado
            String op_seleccionada = (String) jbox_rol.getSelectedItem();
            Rol rol;
            switch (op_seleccionada) {
                case "ADMINISTRADOR":
                    rol = Rol.ADMINISTRADOR;
                    break;
                case "USUARIO":
                    rol = Rol.USUARIO;
                    break;
                default:
                    rol = null;
            }

            usuario.setRol(rol);

            //obtenemos la lista de alertas que se asignaran y seran registradas en la tabla alertas_usuarios
            int[] list_select = list_alerts.getSelectedIndices();
            List<Alerta> alertas_usuario = new ArrayList<>();

            for (int i : list_select) {
                alertas_usuario.add(alertas.get(i));
            }

            //asignamos la lista
            usuario.setAlertas(alertas_usuario);

            //altualizamos la alerta en la base de datos
            controlador.editarUsuario(usuario);
            cargarEmpleados();
            limpiar();
            id_usuario = 0;
            JOptionPane.showMessageDialog(null, "Actualizado Exitosamente!");
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado.");
        }

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (id_usuario != 0) {

            int op = JOptionPane.showConfirmDialog(null, "Seguro deseas eliminar esta empleado?");

            if (op == 0) {
                controlador.eliminarUsuario(id_usuario);
                cargarEmpleados();
                limpiar();
                id_usuario = 0;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una empleado.");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jbox_rol;
    private javax.swing.JList<String> list_alerts;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void cargarEmpleados() {
        usuarios = controlador.traerUsuarios();

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("DNI");
            model.addColumn("IP");
            model.addColumn("Nombre");
            model.addColumn("Rol");
            model.addColumn("Telefono");

            for (Usuario usuario : usuarios) {
                Object fila[] = new Object[6];
                fila[0] = usuario.getId_usuario();
                fila[1] = usuario.getDni();
                fila[2] = usuario.getIp();
                fila[3] = usuario.getNombre();
                fila[4] = usuario.getRol(); // Asegúrate de tener un método toString() adecuado en la clase Rol
                fila[5] = usuario.getTelefono();

                model.addRow(fila);
            }

            jTable1.setModel(model);
            jTable1.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila_point = jTable1.rowAtPoint(e.getPoint());
                    int columna_point = 0;

                    if (fila_point > -1) {
                        id_usuario = (long) model.getValueAt(fila_point, columna_point);
                        EnviarDatos(id_usuario);
                    }
                }

            });
        }
    }

    /* Método que envía datos seleccionados */
    private void EnviarDatos(long id) {
        Usuario usuario = controlador.findUsuario(id);

        // Imprimir
        txt_dni.setText(usuario.getDni());
        txt_ip.setText(usuario.getIp());
        txt_nombre.setText(usuario.getNombre());
        txt_telefono.setText(usuario.getTelefono());
        jbox_rol.setSelectedItem(usuario.getRol().toString());

        List<Integer> list_select = new ArrayList<>();

        for (int i = 0; i < alertas.size(); i++) {
            for (Alerta alert : usuario.getAlertas()) {
                if (Objects.equals(alert.getId_alerta(), alertas.get(i).getId_alerta())) {
                    list_select.add(i);
                }
            }
        }

        list_alerts.setSelectedIndices(list_select.stream().mapToInt(Integer::intValue).toArray());

    }

    private void limpiar() {
        txt_dni.setText("");
        txt_ip.setText("");
        txt_nombre.setText("");
        txt_telefono.setText("");
        jbox_rol.setSelectedItem("USUARIO");
        list_alerts.clearSelection();
    }

    public void cargarAlertas() {

        alertas = controlador.traerAlertas();

        //ordenar las alertas por hora
        Collections.sort(alertas, (a2, a1) -> Integer.compare(a1.getHour(), a2.getHour()));
        Collections.sort(alertas, (a2, a1) -> Integer.compare(a1.getMinute(), a2.getMinute()));

        if (alertas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay alertas registradas.");
        } else {

            DefaultListModel<String> listModel = new DefaultListModel<>();

            for (Alerta alerta : alertas) {
                StringBuilder sb = new StringBuilder();
                listModel.add(0,
                        sb.append(alerta.getHour())
                                .append(":")
                                .append(String.format("%02d", alerta.getMinute()))
                                .append("  ")
                                .append(alerta.getTitle())
                                .toString()
                );

            }

            list_alerts.setModel(listModel);
        }

        //ordenamos nuevamente xd 
        Collections.reverse(alertas);
    }

}
