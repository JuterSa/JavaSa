/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clientes;

import Data.AutogenerarBD;
import com.sun.jdi.connect.Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juter Sa
 */
public class FormCliente extends javax.swing.JFrame {
        DefaultTableModel modelo=new DefaultTableModel();
        AutogenerarBD baseTabla = new AutogenerarBD();
         Connection conn = null;
        //PreparedStatement pstmt;
         
 protected void cargaTabla(){
          try{
          //  Class.forName("org.gjt.mm.mysql.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://localhost/todo_repuestos","root", "");
            if(conn!=null){
                System.out.println("Tabla cargada correctamente");
            }
        } catch (SQLException sqlEx) {
            System.out.println("Hay un error en la conexion: "+ sqlEx.getMessage());
             System.out.println("Hay un error en la conexion: "+ sqlEx.getSQLState());
              System.out.println("Hay un error en la conexion: "+ sqlEx.getLocalizedMessage());
        } 
          String[] fila = new String[7];
        modelo.addColumn("Nombre");
        modelo.addColumn("T. Documento");
        modelo.addColumn("N. Documento");
        modelo.addColumn("Telefono");
        modelo.addColumn("Genero");
        modelo.addColumn("Direccion");
        modelo.addColumn("Estado");
        modelo.setRowCount(0);
        String datos[]=new String[7];
          String query = "SELECT `tod_c_nombre`, `tod_t_documento`, `tod_n_documento`, `tod_n_telefonico`, `tod_sexo`, `tod_d_cliente`, `tod_estado` FROM `tod_clientes`";
        ResultSet result;
        try {
         Statement   pstmt =  conn.createStatement();
            pstmt.setQueryTimeout(20);
            result = pstmt.executeQuery(query);
            while(result.next()==true){
                datos[0]=result.getString("tod_c_nombre");
                datos[1]=result.getString("tod_t_documento");
                datos[2]= String.valueOf(result.getLong("tod_n_documento"));
                datos[3]=String.valueOf(result.getLong("tod_n_telefonico"));
                 datos[4]=result.getString("tod_sexo");
                  datos[5]=result.getString("tod_d_cliente");
                  if(result.getString("tod_estado").equals("A")){
                       datos[6]= "Activo";
                  }else{
                      datos[6]= "Inactivo";
                  }
                  // datos[6]=result.getString("tod_estado");
                modelo.addRow(datos);
            }
            tblDatos.setModel(modelo);
            
        } catch (Exception e) {
            System.out.println("Excepcion: " + e);
        }
         
        
        
        
    }
  public void conectar(){
          baseTabla.Conexion();
          System.out.println(" Se ejecuto esta accion");
          }

    public FormCliente() {
        initComponents();
       cargaTabla();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        llenarTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        numeroDocumento = new javax.swing.JTextField();
        TipoDocumento = new javax.swing.JComboBox<>();
        numeroTelefono = new javax.swing.JTextField();
        DireccionCliente = new javax.swing.JTextField();
        estadoCliente = new javax.swing.JComboBox<>();
        GuardarClientes = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sexoCombo = new javax.swing.JComboBox<>();
        Limpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administracion de clientes");

        jLabel2.setText("Lista de clientes:");

        tblDatos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDatosPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);

        llenarTabla.setText("Refrescar");
        llenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(llenarTabla)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(llenarTabla)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administracion", jPanel1);

        jLabel3.setText("Registrar cliente:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("T. Documento:");

        jLabel6.setText("N. Documento:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Direccion:");

        jLabel9.setText("Estado:");

        numeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDocumentoActionPerformed(evt);
            }
        });

        TipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "PA" }));

        estadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        estadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoClienteActionPerformed(evt);
            }
        });

        GuardarClientes.setText("Guardar");
        GuardarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarClientesActionPerformed(evt);
            }
        });

        jLabel10.setText("Sexo:");

        sexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        Limpiar.setText("Limpiar campos");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuardarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpiar)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreCliente)
                                        .addComponent(TipoDocumento, 0, 170, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sexoCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 167, Short.MAX_VALUE)
                                        .addComponent(numeroDocumento, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(numeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarClientes)
                    .addComponent(Limpiar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nuevo", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jLabel1)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDocumentoActionPerformed

    private void estadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoClienteActionPerformed

    private void GuardarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarClientesActionPerformed
           AutogenerarBD DataBase = new AutogenerarBD();   
           DataBase.Conexion();
          String tod_c_nombre = NombreCliente.getText();
          String tod_t_documento = TipoDocumento.getSelectedItem().toString();
          String nDocumento = numeroDocumento.getText();
          String nTelefono = numeroTelefono.getText();
          long tod_n_documento = Long.parseLong(nDocumento) ;
          long tod_n_telefonico = Long.parseLong(nTelefono) ;
          String tod_d_cliente = DireccionCliente.getText();   //Direccion
          String tod_sexo;
          if(sexoCombo.getSelectedItem().equals("Masculino")){
              tod_sexo = "M";
          }else if(sexoCombo.getSelectedItem().equals("Femenino")){
              tod_sexo= "F";
          } else {
              tod_sexo = "O";
          }
           
           String tod_estado;
           if(estadoCliente.getSelectedItem().equals("Activo")){
               tod_estado = "A";
           }else{
                tod_estado = "I";
           }
          DataBase.InsertarCliente(tod_c_nombre, tod_t_documento, tod_n_documento, tod_n_telefonico, tod_sexo, tod_d_cliente, tod_estado);
          //Actualizar tabla con el nuevo registro
          tblDatos.setVisible(false);
    }//GEN-LAST:event_GuardarClientesActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        NombreCliente.setText(null);
        numeroDocumento.setText(null);
        numeroTelefono.setText(null);
        DireccionCliente.setText(null);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void tblDatosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDatosPropertyChange
      tblDatos.setVisible(true);
    }//GEN-LAST:event_tblDatosPropertyChange

    private void llenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarTablaActionPerformed
         
          tblDatos.setVisible(true);
    }//GEN-LAST:event_llenarTablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DireccionCliente;
    private javax.swing.JButton GuardarClientes;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JComboBox<String> TipoDocumento;
    private javax.swing.JComboBox<String> estadoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton llenarTabla;
    private javax.swing.JTextField numeroDocumento;
    private javax.swing.JTextField numeroTelefono;
    private javax.swing.JComboBox<String> sexoCombo;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
    
   
}
