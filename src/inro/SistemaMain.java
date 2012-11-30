/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro;

/**
 *
 * @author Alejandro
 */
public class SistemaMain extends javax.swing.JFrame {

    /**
     * Creates new form SistemaMain
     */
    public SistemaMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPContenedorEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMCatalogos = new javax.swing.JMenu();
        jMIRopa = new javax.swing.JMenuItem();
        jMIPersonalHospital = new javax.swing.JMenuItem();
        jMIUsuarios = new javax.swing.JMenuItem();
        jMIDepartamentos = new javax.swing.JMenuItem();
        jMSurtimentos = new javax.swing.JMenu();
        jMIInventario = new javax.swing.JMenuItem();
        jMISurtirDeparamento = new javax.swing.JMenuItem();
        jMIRecoleccion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMCatalogos.setText("Catálogos");

        jMIRopa.setText("Ropa");
        jMIRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRopaActionPerformed(evt);
            }
        });
        jMCatalogos.add(jMIRopa);

        jMIPersonalHospital.setText("Personal de Hospital");
        jMIPersonalHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPersonalHospitalActionPerformed(evt);
            }
        });
        jMCatalogos.add(jMIPersonalHospital);

        jMIUsuarios.setText("Usuarios");
        jMIUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUsuariosActionPerformed(evt);
            }
        });
        jMCatalogos.add(jMIUsuarios);

        jMIDepartamentos.setText("Departamentos");
        jMIDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDepartamentosActionPerformed(evt);
            }
        });
        jMCatalogos.add(jMIDepartamentos);

        jMenuBar1.add(jMCatalogos);

        jMSurtimentos.setText("Surtimentos");

        jMIInventario.setText("Inventario");
        jMIInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInventarioActionPerformed(evt);
            }
        });
        jMSurtimentos.add(jMIInventario);

        jMISurtirDeparamento.setText("Surtir deparamento");
        jMISurtirDeparamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISurtirDeparamentoActionPerformed(evt);
            }
        });
        jMSurtimentos.add(jMISurtirDeparamento);

        jMIRecoleccion.setText("Recolección de ropa sucia");
        jMIRecoleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRecoleccionActionPerformed(evt);
            }
        });
        jMSurtimentos.add(jMIRecoleccion);

        jMenuBar1.add(jMSurtimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDPContenedorEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDPContenedorEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jMIRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRopaActionPerformed
        CatalogoRopa c = new CatalogoRopa();
        jDPContenedorEscritorio.add(c);
        c.show();
    }//GEN-LAST:event_jMIRopaActionPerformed

    private void jMIUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUsuariosActionPerformed
        CatalogoUsuarios c = new CatalogoUsuarios();
        jDPContenedorEscritorio.add(c);
        c.show();
    }//GEN-LAST:event_jMIUsuariosActionPerformed

    private void jMIPersonalHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPersonalHospitalActionPerformed
        CatalogoPersonalHospital c = new CatalogoPersonalHospital();
        jDPContenedorEscritorio.add(c);
        c.show();
    }//GEN-LAST:event_jMIPersonalHospitalActionPerformed

    private void jMISurtirDeparamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISurtirDeparamentoActionPerformed
        SurtirDeparamento s = new SurtirDeparamento();
        jDPContenedorEscritorio.add(s);
        s.show();
    }//GEN-LAST:event_jMISurtirDeparamentoActionPerformed

    private void jMIInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInventarioActionPerformed
        CatalogoInventario c = new CatalogoInventario();
        jDPContenedorEscritorio.add(c);
        c.show();
    }//GEN-LAST:event_jMIInventarioActionPerformed

    private void jMIDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDepartamentosActionPerformed
        CatalogoDepartamentos c = new CatalogoDepartamentos();
        jDPContenedorEscritorio.add(c);
        c.show();
    }//GEN-LAST:event_jMIDepartamentosActionPerformed

    private void jMIRecoleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRecoleccionActionPerformed
        RecolectarRopa r = new RecolectarRopa();
        jDPContenedorEscritorio.add(r);
        r.show();
    }//GEN-LAST:event_jMIRecoleccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SistemaMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPContenedorEscritorio;
    private javax.swing.JMenu jMCatalogos;
    private javax.swing.JMenuItem jMIDepartamentos;
    private javax.swing.JMenuItem jMIInventario;
    private javax.swing.JMenuItem jMIPersonalHospital;
    private javax.swing.JMenuItem jMIRecoleccion;
    private javax.swing.JMenuItem jMIRopa;
    private javax.swing.JMenuItem jMISurtirDeparamento;
    private javax.swing.JMenuItem jMIUsuarios;
    private javax.swing.JMenu jMSurtimentos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
