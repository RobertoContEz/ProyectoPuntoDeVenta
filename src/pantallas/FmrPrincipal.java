
package pantallas;

import dao.DAOSFactory;
import java.awt.Image;
import java.awt.Toolkit;

public class FmrPrincipal extends javax.swing.JFrame {

    public FmrPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConsultarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eventos Sociales");
        setIconImage(getIconImage());

        btnClientes.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64x64/users.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de...");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jLabel2.setText("PUNTO DE VENTA");

        btnProductos.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64x64/note.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btnRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64x64/shopping_cart.png"))); // NOI18N
        btnRegistrarVenta.setText("Registrar Ventas");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel3.setText("Powered by MySQL and Java");

        jLabel4.setText("Created by Roberto Contreras Martínez");

        btnConsultarVenta.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btnConsultarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64x64/chart.png"))); // NOI18N
        btnConsultarVenta.setText("Consultar Ventas");
        btnConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(347, 347, 347))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(400, 400, 400))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnConsultarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnClientes)
                .addGap(18, 18, 18)
                .addComponent(btnProductos)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        abrir(new FmrClientes(DAOSFactory.crearPersistenciaCliente()));
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        abrir(new FmrProductos(DAOSFactory.crearPersistenciaProducto()));
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        abrir(new FmrRegistroVenta(DAOSFactory.crearPersistenciaVenta(),DAOSFactory.crearPersistenciaProducto(),DAOSFactory.crearPersistenciaCliente()));
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVentaActionPerformed
        abrir(new FmrConsultaVenta(DAOSFactory.crearPersistenciaVenta(),DAOSFactory.crearPersistenciaCliente(),DAOSFactory.crearPersistenciaProducto()));
    }//GEN-LAST:event_btnConsultarVentaActionPerformed

    private void abrir(javax.swing.JFrame frame) {
        frame.setVisible(true);
        dispose();
    }
    
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("iconos/64x64/database_server.png"));


       return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultarVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
